<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html><head>
<title>I2P Router Console - home</title>
<link rel="stylesheet" href="default.css" type="text/css" />
</head><body>

<%@include file="nav.jsp" %>
<%@include file="summary.jsp" %>

<jsp:useBean class="net.i2p.router.web.OldConsoleHelper" id="conhelper" scope="request" />
<jsp:setProperty name="conhelper" property="contextId" value="<%=(String)session.getAttribute("i2p.contextId")%>" />
<jsp:setProperty name="conhelper" property="writer" value="<%=out%>" />

<div class="main" id="main">
 <jsp:getProperty name="conhelper" property="console" />
</div>

</body>
</html>
