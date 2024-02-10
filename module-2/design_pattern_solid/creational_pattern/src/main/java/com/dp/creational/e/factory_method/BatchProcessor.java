package com.dp.creational.e.factory_method;

import java.io.File;
import java.util.List;

public class BatchProcessor {

	public void processBatch(String fileName) {
		File file = openFile();
		TextParser parser = new TextParser(file);
		List<Record> records = parser.parse();
		processorRecords(records);
		writeSummray();
		closeFile();
	}

	private void processorRecords(List<Record> records) {
		System.out.println("processing each record to db");
	}

	private void writeSummray() {
		System.out.println("writing summery report");
	}

	private void closeFile() {
		System.out.println("closing the file...");
	}

	private File openFile() {
		System.out.println("open the file...");
		return null;
	}
}