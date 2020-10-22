<%@page import="com.service.StudentServiceImple"%>
<%@page import="com.service.StudentService"%>
<jsp:useBean id="student" class="com.dto.Student" scope="page" ></jsp:useBean>
<jsp:setProperty property="*" name="student"/>
<%
	StudentService studentService = new StudentServiceImple();
	studentService.registerStudent(student);
	response.sendRedirect("login.jsp");
%>