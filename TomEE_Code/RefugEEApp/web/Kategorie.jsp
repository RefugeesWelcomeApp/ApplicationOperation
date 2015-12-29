<%@ page import="ra.model.RltnProductCategoryEntity" %>
<%@ page import="ra.model.TblProductCategoryEntity" %>

<%@ page import="java.util.*" %>
<%@ page import="ra.woGibtEsWas.WoIstWas" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jspf"/>
<jsp:include page="WEB-INF/fragments/slider.jspf"/>

<center>
<h1>Produktkategorien</h1>


<table >
    <tr>
        <td><div><a href="JavaScript:go(1)"><img src="resources/img/test/1.png" width="150" height="150" alt="" border="0"></a></div></td>
        <td><div><img src="resources/img/test/2.png" width="150" height="150" alt="" border="0"></div></td>
        <td><div><img src="resources/img/test/3.png" width="150" height="150" alt="" border="0"></div></td>
    </tr>
    <tr>
        <td><div><img src="resources/img/test/4.png" width="150" height="150" alt="" border="0"></div></td>
        <td><div><img src="resources/img/test/5.png" width="150" height="150" alt="" border="0"></div></td>
        <td><div><img src="resources/img/test/6.png" width="150" height="150" alt="" border="0"></div></td>

    </tr>
</table>
</center>

<head>
    <script type="text/javascript" language="JavaScript">
        function go()
        {

            window.location = 'http://localhost:8080/refugee/SubKategorie.jsp'

        }
    </script>
</head>
}

<% WoIstWas test = new WoIstWas();%>
<% test.createLanguageList();
   test.setLanguage_ID(1);%>

<%
 for (Object o : test.getMainResultList()) {
TblProductCategoryEntity e = (TblProductCategoryEntity) o;%>
<td><div><img src="<%=e.getAttachments()%>" alt="" width="200 px" height="200px"></div></td>
<%}
%>




<jsp:include page="WEB-INF/fragments/footer.jspf"/>
