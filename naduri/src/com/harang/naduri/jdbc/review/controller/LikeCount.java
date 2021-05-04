package com.harang.naduri.jdbc.review.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.harang.naduri.jdbc.review.model.service.LikeCountService;
import com.harang.naduri.jdbc.review.model.service.selectOneService;
import com.harang.naduri.jdbc.review.model.vo.Review;

/**
 * Servlet implementation class LikeCount
 */
@WebServlet("/likeCount.do")
public class LikeCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LikeCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int r_no = Integer.parseInt(request.getParameter("r_no"));
		int m_no = Integer.parseInt(request.getParameter("m_no"));
		
		int re = new LikeCountService().LikeCount(r_no, m_no);
		
		response.setContentType("application/json; charset=UTF-8");
		
		new Gson().toJson(re, response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
