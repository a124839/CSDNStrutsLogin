<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<br />
	用户名：${sessionScope.name }
	密码：${sessionScope.password }
	当前在线人数：${applicationScope.count }
	<h4>
		用户名：<s:property value="#session.name"/>
		密码：
	</h4>
	<br />
	<s:property value="@java.lang.Math@PI" />
	
</body>
</html>