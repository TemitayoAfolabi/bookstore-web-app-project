package com.ab.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.daos.BasketDAO;
import com.ab.daos.BookDao;
import com.ab.models.Basket;
import com.ab.models.Book;
import com.ab.services.BasketService;
import com.ab.services.BookService;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DataValidation;

/**
 * Servlet implementation class BasketAddServlet
 */
@WebServlet("/BasketAdd")
public class BasketAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasketAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BasketDAO dao = BSFactory.getBasketDAO();        
		BasketService basketService = BSFactory.getBasketService(dao);
		            
		String bTitle = request.getParameter("books"); //retrieve book obj in hidden text box 
				
		Basket addBook = basketService.basketAdd(bTitle);
				
	    DataValidation.decreaseQty(bTitle);
										
		//created a session
		HttpSession session =request.getSession(true);
		session.setAttribute("addBook", addBook);
		response.sendRedirect("view_basket.jsp");
	}

}
