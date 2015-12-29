<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jspf"/>
<jsp:include page="WEB-INF/fragments/slider.jspf"/>
<h1>HALLOOOOOOO</h1>
<p><a href="<%=request.getContextPath()%>/getMainCat">TESTLINK</a></p>
<form action="getMediaWikiArticle" method="get">
    <h2>Lade MediaWiki - Content via JSON</h2>
    <h5><c:out value="${requestScope.title}"/></h5>
    <p> <c:out value="${requestScope.text}" escapeXml="false"/></p>
    <div><img src="resources/img/test/flag_germany.jpg"></div>
</form>
<jsp:include page="WEB-INF/fragments/footer.jspf"/>