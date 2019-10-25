package com.process;
import java.util.*;
import java.io.IOException;
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

/**
 * Servlet implementation class View
 */
@WebServlet("/view")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean found=false;
		LinkedList<Details> data=new LinkedList<>();
		HttpSession session= request.getSession();
		String selected=(String) session.getAttribute("category");
		MongoClient connection=Mongoclient.getmongo();
		MongoDatabase db=Mongoclient.getdb("dxc");
		MongoCollection<Document> docs=db.getCollection("assessment4");
		MongoCursor<Document> cursor= docs.find(Filters.eq("category", selected)).iterator();
		while(cursor.hasNext()) {
			Document d=cursor.next();
			Details dd=new Details(d);
			data.add(dd);
			found=true;
		}
		request.setAttribute("input", data);
		request.setAttribute("found", found);
		request.getRequestDispatcher("view.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
