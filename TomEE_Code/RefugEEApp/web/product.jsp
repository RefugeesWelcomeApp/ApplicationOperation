<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jsp"/>
<h1>Produkte</h1>

<div class="row">
<form action="getProd" method="get">
    <%

        List<Integer> prodID = (List<Integer>) request.getAttribute("productID");
        List<String> prodName = (List<String>) request.getAttribute("productName");
        List<String> shopCatID = (List<String>) request.getAttribute("shopCatID");
        List<String> shopCatName = (List<String>) request.getAttribute("shopCatName");


        int languageID = Integer.parseInt(request.getAttribute("languageID").toString());
        int i = prodID.size();

        for (int j = 0; j<i;j++){
    %>
    <td>
            <%=prodName.get(prodID.get(j)-1)%>
            <br><br>

        </a>
    </td>
    <%
        }
    %>
</form>
</div>
<jsp:include page="WEB-INF/fragments/footer.jspf"/>