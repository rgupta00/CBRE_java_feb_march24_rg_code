package com.dp.creational.e.factory_method.prob;

import java.io.File;
import java.util.List;

public class TextParser {

	public TextParser(File file) {
		System.out.println("creating text parser...");
	}

	public List<Record> parse() {
		System.out.println("creating record list using text parser...");
		return null;
	}

}