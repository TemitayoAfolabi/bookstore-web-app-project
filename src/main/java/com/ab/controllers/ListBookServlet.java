package com.ab.controllers;

import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.daos.BookDao;
import com.ab.daos.BookDaoImpl;
import com.ab.models.Books;
import com.ab.services.BookService;
import com.ab.services.BookServiceImpl;

/**
 * Servlet implementation class ListBookServlet
 */
@WebServlet("/ListBookServlet")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDao dao = new BookDaoImpl();
		
		BookService bookService = new BookServiceImpl(dao);
		
		List<Books> bookList = bookService.loadBooks();
		
		HttpSession session = request.getSession(true);
		
		session.setAttribute("bList", bookList);
		
		response.sendRedirect("view_books.jsp");
		
		
		
	}

}
