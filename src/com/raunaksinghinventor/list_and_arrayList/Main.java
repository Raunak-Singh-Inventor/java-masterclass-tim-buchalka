package com.raunaksinghinventor.list_and_arrayList;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			default:
				System.out.println("Input is not valid");
			}
		}
	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addItem() {
		System.out.print("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.print("Enter item: ");
		String item = scanner.nextLine();
		int itemNo = groceryList.findItem(item);
		System.out.print("Enter replacement item: ");
		String newItem = scanner.nextLine();
		if(itemNo>=0) {
			groceryList.modifyGroceryItem(itemNo, newItem);
		}
	}

	public static void removeItem() {
		System.out.print("Enter item: ");
		String item = scanner.nextLine();
		int itemNo = groceryList.findItem(item);
		if(itemNo>=0) {
			groceryList.removeGroceryItem(itemNo);
		}
	}

	public static void searchForItem() {
		System.out.print("Item to search for: ");
		String searchItem = scanner.nextLine();
		if (groceryList.findItem(searchItem) != -1) {
			System.out.println("Found " + searchItem + " in  our grocery list");
		} else {
			System.out.println(searchItem + " is not in the grocery list");
		}
	}
}
