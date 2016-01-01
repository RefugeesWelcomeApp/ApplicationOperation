<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jsp"/>

<div class="row">
    <h1>Produkte</h1>
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





<head>
    <title>OpenLayers Demo</title>
    <style type="text/css">
        html, body, #basicMap {
            width: 60%;
            height: 60%;
            margin: 0;
        }
    </style>
    <script src="http://www.openlayers.org/api/OpenLayers.js"></script>
    <script>
        function init() {
            map = new OpenLayers.Map("basicMap");
            var mapnik = new OpenLayers.Layer.OSM();
            map.addLayer(mapnik);
            map.setCenter(new OpenLayers.LonLat(13.41,52.52) // Center of the map
                   .transform(
                           new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                            new OpenLayers.Projection("EPSG:900913") // to Spherical Mercator Projection
                    ), 15 // Zoom level
           );
        }
    </script>
</head>
<body onload="init();">
<div id="basicMap"></div>
</body>

<jsp:include page="WEB-INF/fragments/footer.jspf"/>