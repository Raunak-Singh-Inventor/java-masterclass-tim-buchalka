package com.raunaksinghinventor.list_and_arrayList;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	public void modifyGroceryItem(int pos, String newItem) {
		groceryList.set(pos, newItem);
		System.out.println("Grocery item " + (pos + 1) + " has been modified.");
	}

	public void removeGroceryitem(int pos) {
		String theItem = groceryList.get(pos);
		groceryList.remove(pos);
		System.out.println("Grocery item " + theItem + " has been removed.");
	}

	public String findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem);

		int pos = groceryList.indexOf(searchItem);
		if (pos >= 0) {
			return groceryList.get(pos);
		}

		return null;
	}
}
