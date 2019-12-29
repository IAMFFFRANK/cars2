package com.wut.car.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/NewsServlet")
public class NewsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String method=request.getParameter("method");
	switch(method) {
	case"listALL":
	{
		System.out.println("显示所有的新闻方法");
		break;
	}
	case"add":
	{
		System.out.println("添加新闻的方法");

		break;
	}
	case"delete":
	{
		System.out.println("删除新闻的方法");

		break;
	}
	case"update":
	{
		System.out.println("修改新闻的方法");

		break;
	}
	}
	}

}
