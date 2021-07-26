<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String adminusername="aravindh";
String adminpassword="aarvy7";
 String strname= request.getParameter("username");
String strpwd= request.getParameter("pwd");
String strsubmit= request.getParameter("submit");

if(adminusername.equals(strname)){
	if(adminpassword.equals(strpwd)){
		out.print("login succesfull");
		
	}else{
		out.print("incorrect password");
		out.print("<error>");
	}
}else{
	out.print("enter a valid username");
}


%> 
</body>
</html>