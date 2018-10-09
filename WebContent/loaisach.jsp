<%@page import="bean.LoaiBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<LoaiBean> lst = new ArrayList<>();
	lst = (ArrayList<LoaiBean>) request.getAttribute("lstloai");
	for(LoaiBean x : lst){
		out.println("<h1>" + x.getTenloai() + "</h1>");
	}
%>
</body>
</html>