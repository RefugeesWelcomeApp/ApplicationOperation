<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jsp"/>

<div class="row">
    <h1>Unterproduktkategorien</h1>
    <form action="getSubCat" method="get">
        <%
            List<String> img = (List<String>) request.getAttribute("img");
            List<Integer> id = (List<Integer>) request.getAttribute("id");
            List<String> name = (List<String>) request.getAttribute("name");
            int languageID = Integer.parseInt(request.getAttribute("languageID").toString());

            int i = img.size();

            for (int j = 0; j<i;j++){
        %>
        <td>
            <a href="/getProd?subCatID=<%= id.get(j)%>&languageID=<%=languageID%>">
                <img src="<%=img.get(j)%>" id="<%= id.get(j)%>" width="200" height="200" border="0" onError='this.src="resources/img/404.png";'>
            </a>

            <a href="/getProd?subCatID=<%= id.get(j)%>&languageID=<%=languageID%>">
                <%=name.get(id.get(j)-1)%>
                <br><br>

            </a>
        </td>
        <%
            }
        %>
    </form>
</div>
<jsp:include page="WEB-INF/fragments/footer.jspf"/>