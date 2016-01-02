<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<jsp:include page="WEB-INF/fragments/htmlHead.jspf"/>
<jsp:include page="WEB-INF/fragments/header.jspf"/>
<jsp:include page="WEB-INF/fragments/menu.jsp"/>

<div class="row">
<form action="getProd" method="get">
    <h1><%=request.getAttribute("subCatName")%></h1>

    <%

        List<Integer> prodID = (List<Integer>) request.getAttribute("productID");
        List<String> prodName = (List<String>) request.getAttribute("productName");
        List<Integer> shopCatID = (List<Integer>) request.getAttribute("shopCatID");
        List<String> shopCatName = (List<String>) request.getAttribute("shopCatName");


        int languageID = Integer.parseInt(request.getAttribute("languageID").toString());
        int i = shopCatID.size();
        for (int j = 0; j<i;j++){
    %>
    <td>
        <% if (shopCatID.get(j) > (shopCatName.size()-1)) { %>
        Error: bad product id in database: <%=shopCatID.get(j)%>
        <% } else  { %>
        <%=shopCatName.get(shopCatID.get(j)-1)%>
        <% } %>
        <br>
    </td>
    <%
        };%>
    <h3>In diesen Gesch&auml;ften gibt es unter anderem folgende Produkte:</h3>
                <%
                i = prodID.size();

                for (int j = 0; j<i;j++){
            %>
            <td>
                 <%=prodName.get(j)%>
                <br>
            </td>
            <%};%>


    <style type="text/css">
        html, body, #basicMap {
            width: 100%;
            height: 100%;
            margin: 0;
        }
    </style>
    <script src="http://www.openlayers.org/api/OpenLayers.js"></script>
    <script>
        function init() {
            map = new OpenLayers.Map("basicMap");
            var mapnik = new OpenLayers.Layer.OSM();
            map.addLayer(mapnik);
            map.setCenter(new OpenLayers.LonLat(10.459,51.097) // Center of the map
                    .transform(
                            new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                            new OpenLayers.Projection("EPSG:900913") // to Spherical Mercator Projection
                    ), 6 // Zoom level
            );
            if (navigator.geolocation) {
                navigator.geolocation.getCurrentPosition(showPosition);
            }
        }
        function showPosition(position) {
            map.setCenter(new OpenLayers.LonLat(position.coords.longitude,position.coords.latitude) // Center of the map
                    .transform(
                            new OpenLayers.Projection("EPSG:4326"), // transform from WGS 1984
                            new OpenLayers.Projection("EPSG:900913") // to Spherical Mercator Projection
                    ), 12 // Zoom level
            );
        }

        init();
    </script>

    <body onload="init();">
    <div id="basicMap" style="height:500px;width:50%"></div>
    </body>
</form>
</div>

<jsp:include page="WEB-INF/fragments/footer.jspf"/>