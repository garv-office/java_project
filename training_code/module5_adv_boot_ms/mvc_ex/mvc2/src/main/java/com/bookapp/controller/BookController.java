package com.bookapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;

@RestController
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}

	@GetMapping(path="books")
	public List<Book> showAll() {
			return bookService.getAllBooks();
	}
}





