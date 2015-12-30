<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jsp"/>
<h1>Sub-Produktkategorien</h1>

<div class="row">
<form action="getSubCat" method="get">
    <%
        List<String> img = (List<String>) request.getAttribute("img");
        List<Integer> id = (List<Integer>) request.getAttribute("id");
        List<String> name = (List<String>) request.getAttribute("name");
        int languageID = (int) request.getAttribute("language");

        int i = img.size();

        for (int j = 0; j<i;j++){
    %>
    <td>
        <a href="/getProd?subCatID=<%= id.get(j)%>&languageID=<%=languageID%>">
            <img src="<%= img.get(j)%>" id="<%= id.get(j)%>" width="200" height="200" border="0" alt="<%= name.get(id.get(j)-1)%>">
        </a>
    </td>
    <%
        }
    %>
</form>
</div>
<jsp:include page="WEB-INF/fragments/footer.jspf"/>