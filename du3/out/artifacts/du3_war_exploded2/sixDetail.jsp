<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>星火英语六级详情页</title>
    <link href="static/Css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="static/Css/text4.css"/>
   <%-- <script src="static/js/text4.js" type="text/javacript" charset="utfs-8"></script>--%>
</head>
<script type="text/javascript">
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
    </script>
<body>
<div id="max">
    <div class="re">
        <ul>
            <li><img src="http://www.dujinming.cn/image/xh6jlbt1.png"></li>
            <li><img src="http://www.dujinming.cn/image/xh6jlbt2.png"></li>
            <li><img src="http://www.dujinming.cn/image/xh6jlbt3.png"></li>
            <li><img src="http://www.dujinming.cn/image/xh6jlbt4.png"></li>
            <li><img src="http://www.dujinming.cn/image/xh6jlbt5.png"></li>
        </ul>
    </div>
</div>
<div id="xh">
    <div class="xq">
        <div id="1"><img src="http://www.dujinming.cn/image/xhyy6j1.png" width="1000" height="1000px"></div>
        <div id="2"><img src="http://www.dujinming.cn/image/xhyy6j2.png" width="1000" height="1000px"></div>
        <div id="3"><img src="http://www.dujinming.cn/image/xhyy6j3.jpg" width="1000" height="1000px"></div>
        <div id="4"><img src="http://www.dujinming.cn/image/xhyy6j4.jpg" width="1000" height="1000px"></div>
        <div id="5"><img src="http://www.dujinming.cn/image/xhyy6j5.jpg" width="1000" height="1000px"></div>
        <div id="6"><img src="http://www.dujinming.cn/image/xhyy6j6.jpg" width="1000" height="1000px"></div>
    </div>
</div>
<nav class="navbar navbar-default navbar-fixed-bottom" style="backgroundcolor:#0000">
    <div class="navbar-header">

        <p class='navbar-brand'o style="colr:#FF0000">￥${sixEnglish.s_price}</p>
        <!--  <button class="navbar-toggle" style="color:#FF0000"  οnclick="window.location.href='fourOrder.jsp';">立即购买</button> -->
        <input type="button" value="立即购买"  class="navbar-toggle" style="color:#FF0000" onclick="window.location.href='six_findById1?sixEnglish.s_id=${sixEnglish.s_id}';"/>
    </div>
</nav>
</body>
</html>