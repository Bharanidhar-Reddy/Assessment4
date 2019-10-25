package com.process;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

/**
 * Servlet implementation class Request
 */
@WebServlet("/req")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reply=request.getParameter("title");
		HttpSession session= request.getSession();
		session.setAttribute("reply", reply);
		request.getRequestDispatcher("request.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LinkedList<Details> data=new LinkedList<>();
		HttpSession session= request.getSession();
		String selected=(String) session.getAttribute("reply");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		MongoClient connection=Mongoclient.getmongo();
		MongoDatabase db=Mongoclient.getdb("dxc");
		MongoCollection<Document> docs=db.getCollection("assessment4");
		docs.updateOne(Filters.eq("title", selected),Updates.setOnInsert("requests",phone));
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
