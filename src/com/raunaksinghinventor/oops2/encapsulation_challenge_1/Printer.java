package com.raunaksinghinventor.oops2.encapsulation_challenge_1;

public class Printer {
	private int tonerLevel, pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel < 0 && tonerLevel > 100) {
			tonerLevel = -1;
		}
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}

	public int addToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100 && tonerLevel + tonerAmount <= 100) {
			tonerLevel += tonerAmount;
			return tonerLevel;
		} else {
			return -1;
		}
	}

	public int printPages(int pages) {
		int pagesToPrint = pages;
		if (duplex == true) {
			System.out.println("Printing in duplex mode");
			pagesToPrint = pages / 2 + pages % 2;
		}
		pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
