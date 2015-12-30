<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<% if (!(request.getAttribute("Sprache") == null) && request.getAttribute("Sprache").equals("en")) { %>
<jsp:include page="menu/menuen.jspf" />
<% } else if (!(request.getAttribute("Sprache") == null) && request.getAttribute("Sprache").equals("de")) { %>
<jsp:include page="menu/menude.jspf" />
<% } else  { %>
<jsp:include page="menu/menude.jspf" />
<% } %>