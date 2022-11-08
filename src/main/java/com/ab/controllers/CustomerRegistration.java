package com.ab.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ab.daos.CustomerDao;
import com.ab.models.Customer;
import com.ab.services.CustomerService;
import com.ab.services.CustomerServiceImpl;
import com.ab.utilities.BSFactory;

/**
 * Servlet implementation class CustomerRegistrationServlet
 */
@WebServlet("/CustomerRegistrationServlet")
public class CustomerRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String customerEmail = request.getParameter("customerEmail");
		String customerpassword = request.getParameter("customerpassword");
		
		Customer customer = BSFactory.getCustomer(firstName, lastName, customerEmail, customerpassword);
		
		CustomerDao dao = BSFactory.getCustomerDao();
		
		CustomerService customerService = BSFactory.getCustomerService(dao);
		
		Customer registeredCustomer = customerService.registerCustomer(customer);
		
      
		if(!(firstName.isEmpty()&& lastName.isEmpty() && customerEmail.isEmpty() && customerpassword.isEmpty())&& registeredCustomer != null){
        	
			response.sendRedirect("register_success.jsp");
			
		}else {
			
			response.sendRedirect("register_failed.jsp");
		}
		
	}

}
