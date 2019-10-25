package com.process;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Process
 */
@WebServlet("/process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Process() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		String selected=request.getParameter("button");
		if("j1".equals(selected)) {session.setAttribute("category", "jobs");request.getRequestDispatcher("post.jsp").forward(request, response);}
		else if("h1".equals(selected)) {session.setAttribute("category", "housing");request.getRequestDispatcher("post.jsp").forward(request, response);}
		else if("f1".equals(selected)) {session.setAttribute("category", "forsale");request.getRequestDispatcher("post.jsp").forward(request, response);}
		else if("c1".equals(selected)) {session.setAttribute("category", "community");request.getRequestDispatcher("post.jsp").forward(request, response);}
		else if("s1".equals(selected)) {session.setAttribute("category", "services");request.getRequestDispatcher("post.jsp").forward(request, response);}
		else if("j2".equals(selected)) {session.setAttribute("category", "jobs");request.getRequestDispatcher("/view").forward(request, response);}
		else if("h2".equals(selected)) {session.setAttribute("category", "housing");request.getRequestDispatcher("/view").forward(request, response);}
		else if("f2".equals(selected)) {session.setAttribute("category", "forsale");request.getRequestDispatcher("/view").forward(request, response);}
		else if("c2".equals(selected)) {session.setAttribute("category", "community");request.getRequestDispatcher("/view").forward(request, response);}
		else if("s2".equals(selected)) {session.setAttribute("category", "services");request.getRequestDispatcher("/view").forward(request, response);}
		
	}

}
