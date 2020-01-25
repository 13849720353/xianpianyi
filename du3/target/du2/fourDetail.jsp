<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="static/Css/bootstrap.min.css" rel="stylesheet">
    <title>Insert title here</title>
</head>
<body >
<nav class="navbar navbar-default navbar-fixed-bottom" style="backgroundcolor:#0000">
    <div class="navbar-header">

        <p class='navbar-brand'o style="colr:#FF0000">￥${fourEnglish.f_price}</p>
        <!--  <button class="navbar-toggle" style="color:#FF0000"  οnclick="window.location.href='fourOrder.jsp';">立即购买</button> -->
        <input type="button" value="立即购买"  class="navbar-toggle" style="color:#FF0000" onclick="window.location.href='four_findById1?fourEnglish.f_id=${fourEnglish.f_id}';"/>
    </div>
</nav>
</body>
</html>