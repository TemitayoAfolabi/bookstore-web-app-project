package com.ab.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.daos.BasketDAO;
import com.ab.models.Basket;
import com.ab.services.BasketService;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DataValidation;

/**
 * Servlet implementation class BasketDeleteServlet
 */
@WebServlet("/BasketDelete")
public class BasketDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasketDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BasketDAO dao = BSFactory.getBasketDAO();
		
		BasketService basketService = BSFactory.getBasketService(dao);
		
		String bTitle = request.getParameter("bookTitle");
		
		DataValidation.restoreQty(bTitle);
		
		basketService.modifyBasket(bTitle);
				
		List<Basket> bList = basketService.viewBasket();
		
		//created a session
		HttpSession session =request.getSession(true);
		session.setAttribute("bList", bList);
		response.sendRedirect("display_basket.jsp");
		
		
	}

}
