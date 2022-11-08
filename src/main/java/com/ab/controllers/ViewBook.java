package com.ab.controllers;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ViewBookServlet
 */
@WebServlet("/ViewBook")
public class ViewBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BookDao dao = BSFactory.getBookDao();
		
		BookService bookService = BSFactory.getBookService(dao);
				
		List<Book> bList = bookService.viewBooks();
		
		//created a session
		HttpSession session =request.getSession(true);
		session.setAttribute("bList", bList);
		response.sendRedirect("view_books.jsp");
		

	}

}
