package com.ab.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.daos.BookDao;
import com.ab.models.Book;
import com.ab.services.BookService;
import com.ab.utilities.BSFactory;

/**
 * Servlet implementation class SerachBookServlet
 */
@WebServlet("/SerachBook")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String bookTitle = null;
		 HttpSession session = request.getSession(true);
		 session.setAttribute("bookTitle", bookTitle);
		 response.sendRedirect("search_book.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
		
    	
    	int isbn = 0;
    	
    	if(request.getParameter("search")!= "") {
		
    	  isbn = Integer.parseInt(request.getParameter("search"));
    	
    	}
		 
		 BookDao dao = BSFactory.getBookDao();
			
		 BookService bookService = BSFactory.getBookService(dao);
		 
		 Book book = BSFactory.getBooks(isbn);
			
		 Book searchBook = bookService.searchBook(book);	 
    	
		 String bookTitle = searchBook.getBookTitle();
	
		 HttpSession session = request.getSession(true);
		 session.setAttribute("bookTitle", bookTitle);
		 	 
		 
		 if(isbn != 0 && bookTitle != null){
			 
	         response.sendRedirect("search_book.jsp");
						
			}else {
		 
            doGet(request, response);
			}
    	
		 
	}

}
