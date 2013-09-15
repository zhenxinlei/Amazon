package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.dao.BookDao;
import com.amazon.entity.Book;
@Service
@Transactional
public class BookService {

	@Autowired
	private BookDao bookDao;
	
	public void addBook(Book book){
		bookDao.addBook(book);
	}
	public void deletBook(Book book){
		bookDao.deletUser(book);
	}
	
	public void updateBook(Book book){
		bookDao.updateUser(book);
	}
	
	public void findBook(Book book){
		bookDao.findUser(book);
	}

}
