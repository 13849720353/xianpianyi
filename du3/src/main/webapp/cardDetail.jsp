<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no;">
    <meta charset="utf-8">
    <title>星火英语四级详情页</title>
    <link href="static/Css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="static/Css/text4.css"/>
    <%-- <script src="js/text3.js" type="text/javascript" charset="utf-8"></script>--%>
</head>
<%--<script type="text/javascript">
    window.onload=function(){
        var lik=document.getElementsByTagName("li");
        function fun(i,j){
            lik[i].style.opacity=1;
            lik[j].style.opacity=0;
        }
        fun(0,1);
        var i=0;
        setInterval(function(){
            if(++i>=5){
                i=0;
                fun(0,4);
            }
            else fun(i,i-1);
        },4000);
    }
</script>--%>
<body>

<%--<div id="max">
    <div class="re">
        <ul>
            <li><div class="image-header"><img src="http://www.dujinming.cn/image/llklbt1(1).png" class="img"></div></li>
            <li><div class="image-header"><img src="http://www.dujinming.cn/image/llklbt2(1).png" class="img"></div></li>
            <li><div class="image-header"><img src="http://www.dujinming.cn/image/llklbt3(1).png" class="img"></div></li>
            <li><div class="image-header"><img src="http://www.dujinming.cn/image/llklbt4(1).png" class="img"></div></li>
            <li><div class="image-header"><img src="http://www.dujinming.cn/image/llklbt5(1).png" class="img"></div></li>
        </ul>
    </div>
</div>--%>
<div id="1" class="image-header"><img src="http://www.dujinming.cn/image/gpydk1(1).png" class="img"></div>
<div id="2" class="image-header"><img src="http://www.dujinming.cn/image/gpydk2(1).png" class="img"></div>
<div id="3" class="image-header"><img src="http://www.dujinming.cn/image/gpydk3(1).png" class="img"></div>

<nav class="navbar navbar-default navbar-fixed-bottom" style="backgroundcolor:#0000">
    <div class="navbar-header">

        <p class='navbar-brand'o style="colr:#FF0000">￥${card.c_price}</p>
        <!--  <button class="navbar-toggle" style="color:#FF0000"  οnclick="window.location.href='fourOrder.jsp';">立即购买</button> -->
        <input type="button" value="立即购买"  class="navbar-toggle" style="color:#FF0000" onclick="window.location.href='card_findById1?card.c_id=${card.c_id}';"/>
    </div>
</nav>
</body>
</html>
