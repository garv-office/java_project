package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

public class BookDaoImpl implements BookDao {
	@Override
	public List<String> getBooks() {
		log();
		return null;
	}

	public void log() {
		System.out.println("----------");
	}
}