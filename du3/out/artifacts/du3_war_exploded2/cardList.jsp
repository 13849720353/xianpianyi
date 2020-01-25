<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0,maximum-scale=1.0,ser-scalable=no;">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">

    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<link href="Css/css.css" rel="stylesheet">
<body>
<table width="99%" border="0" cellspacing="5" cellpadding="5">
    <c:forEach var="card" items="${requestScope.list}">
        <tr>
            <c:if test="${!empty card}">
                <td>
                    <div>
                        <img src="${card.c_image}" width="150" height="150" style="border:0">
                    </div>
                </td>

                <td>
                    <p class="name">${card.c_name}</p>
                    <a href="card_findById?card.c_id=${card.c_id}">购买</a>

                    <p class="price">￥${card.c_price}</p>
                </td>

            </c:if>
        </tr>
    </c:forEach>
</table>
</body>
</html>