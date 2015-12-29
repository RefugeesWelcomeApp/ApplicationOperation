<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jspf"/>

<h1>Sub-Produktkategorien</h1>

<div class="row">
<form action="getSubCat" method="get">
    <%
        List<String> img = (List<String>) request.getAttribute("img");
        List<Integer> id = (List<Integer>) request.getAttribute("id");

        int i = img.size();

        for (int j = 0; j<i;j++){
    %>
    <td><img src="<%= img.get(j)%>" id="<%= id.get(j)%>" width="150" height="150" border="0" alt="<%= id.get(j)%>"></td>
    <%
        }
    %>
</form>
</div>
<jsp:include page="WEB-INF/fragments/footer.jspf"/>