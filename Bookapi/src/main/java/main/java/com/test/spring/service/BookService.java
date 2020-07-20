package main.java.com.test.spring.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.test.spring.model.Book;

@Component
public interface BookService {
	
	//Save record
		long save(Book book);
		
		//Get a single record
		Book get(long id);
		
		//List of books
		List <Book> list();
		
		//Update record
		void update(long id,Book book);
		
		//Deletes record
		void delete(long id);

}
