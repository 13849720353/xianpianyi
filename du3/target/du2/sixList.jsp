<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<link href="Css/css.css" rel="stylesheet">
<body>
<table width="99%" border="0" cellspacing="5" cellpadding="5">
    <c:forEach var="sixEnglish" items="${requestScope.list}">
        <tr>
            <c:if test="${!empty sixEnglish}">
                <td>
                    <div>
                        <img src="${sixEnglish.s_image}" width="150" height="150" style="border:0">
                    </div>
                </td>

                <td>
                    <p class="name">${sixEnglish.s_name}</p>
                    <a href="six_findById?sixEnglish.s_id=${sixEnglish.s_id}">购买</a>
                    <p class="price">￥${sixEnglish.s_price}</p>
                </td>

            </c:if>
        </tr>
    </c:forEach>
</table>
</body>
</html>