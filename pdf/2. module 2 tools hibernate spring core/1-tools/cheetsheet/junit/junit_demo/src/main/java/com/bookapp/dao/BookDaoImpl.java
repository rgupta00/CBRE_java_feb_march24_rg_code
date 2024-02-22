package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImpl implements BookDao{

	@Override
	public List<String> getBooks() {
		log();
		//return Arrays.asList("java","rich dad poor dad","java adv");
		return null;
	}

	public void log() {
		System.out.println("log message");
	}

}
