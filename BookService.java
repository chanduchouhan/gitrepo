package com.training;
import java.util.List;

import jakarta.ws.rs.QueryParam;

public class BookService {


		
		private BookDao bookDao=new BookDao();
		
		public Book addBook(Book book)
		{
			if(bookDao.addBook(book) > 0)
				return book;
			return null;
		}

		public List<Book> bookTitleSearch(String title)
		{
			return bookDao.bookTitleSearch(title);
		}

		public List<Book> getAllBooks() {
			// TODO Auto-generated method stub
			return bookDao.getAllBooks();
		}

		public int deleteBook(long isbn) {
			// TODO Auto-generated method stub
			return bookDao.deleteBook(isbn);
		}
		
		public int updateBookStock(long isbn)
		{
			//BookDao bookDao =new BookDao();
			return bookDao.updateBookstock(isbn);
			}
		
		public int buyBook(long isbn,long cid)
		{
			//BookDao bookDao =new BookDao();
			return bookDao.buyBook(isbn,cid);
			}
		
	}
