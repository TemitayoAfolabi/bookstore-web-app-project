package com.ab.controllers;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ab.daos.CustomerDao;
import com.ab.models.Customer;
import com.ab.services.CustomerService;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DataValidation;

/**
 * Servlet implementation class LoginCustomerServlet
 */
@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//    	
//		request.setAttribute("message", "Login Failed !!");
//		request.getRequestDispatcher("login.jsp").forward(request, response);
//    	
//	  false && false/true
//    true && false/t
//	} true && false

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerEmail = request.getParameter("customerEmail");
		String customerpassword = request.getParameter("customerpassword");
		
		CustomerDao dao = BSFactory.getCustomerDao();
		
		CustomerService customerService = BSFactory.getCustomerService(dao);
		
		Customer cus = customerService.loginCustomer(customerEmail, customerpassword);
		
		   HttpSession session = request.getSession(true);
		   session.setAttribute("email", customerEmail);  
		
		
		if(cus != null && !(customerEmail.isEmpty() || customerpassword.isEmpty())) {
		
			//if()
		   RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
		   rd.forward(request, response);
			
		}
		else {
			
			//doGet(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("login_failed.jsp");
			rd.forward(request, response);
			
		}
}
	
}


