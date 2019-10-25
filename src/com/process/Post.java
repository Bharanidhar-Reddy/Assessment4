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

import com.process.Mongoclient;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Servlet implementation class Post
 */
@WebServlet("/post")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
    int i=0;
    LinkedList<Details> alldetails = new LinkedList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post() {
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
		MongoClient connection=Mongoclient.getmongo();
		MongoDatabase db=Mongoclient.getdb("dxc");
		MongoCollection<Document> docs=db.getCollection("assessment4");
		MongoCursor<Document> cursor=docs.find().iterator();
		// if(i==0) {while(cursor.hasNext()) {docs.deleteOne(cursor.next());}}
		HttpSession session=request.getSession();
		String category= (String) session.getAttribute("category");
		String title = (String) request.getParameter("title");
		String city = (String) request.getParameter("city");
		String postal = (String) request.getParameter("postal");
		String desc = (String) request.getParameter("desc");
		String email = (String) request.getParameter("email");
		String phone = (String) request.getParameter("phone");
		Details d = new Details(category,title,city,postal,desc,email,phone);
		alldetails.add(d);
		Document dd=new Document(d.toMap());
		dd.append("requests", new LinkedList<String>());
		docs.insertOne(dd);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
