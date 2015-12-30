<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jsp"/>
<%-- <jsp:include page="WEB-INF/fragments/slider.jspf"/> --%>
<form action="getMediaWikiArticle" method="get">
    <div class="row">
        <h2><c:out value="${requestScope.title}"/></h2>
    <c:out value="${requestScope.text}" escapeXml="false"/>
    <!--<div><img src="resources/img/flag_germany.jpg"></div>-->
    </div>
</form>
<jsp:include page="WEB-INF/fragments/footer.jspf"/>