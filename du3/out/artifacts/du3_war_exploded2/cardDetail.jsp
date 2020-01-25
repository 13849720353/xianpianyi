<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0,maximum-scale=1.0,ser-scalable=no;">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">

    <meta charset="utf-8">
    <title>高配移动大流量卡详情页</title>
    <link href="static/Css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="static/Css/text4.css"/>
        <script type="text/javascript">

            var phoneWidth =  parseInt(window.screen.width);

            var phoneScale = phoneWidth/640;

            var ua = navigator.userAgent;

            if (/Android (d+.d+)/.test(ua)){var version = parseFloat(RegExp.$1);

                if(version>2.3){ document.write(‘<meta name="viewport" content="width=640, minimum-scale = ‘+phoneScale+‘, maximum-scale = ‘+phoneScale+‘, target-densitydpi=device-dpi">‘); }

                else{document.write(‘<meta name="viewport" content="width=640, target-densitydpi=device-dpi">‘); }

            else { document.write(‘<meta name="viewport" content="width=640, user-scalable=no, target-densitydpi=device-dpi">‘); }
        </script>

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
            <li><img src="http://www.dujinming.cn/image/llklbt1(1).png"></li>
            <li><img src="http://www.dujinming.cn/image/llklbt2(1).png"></li>
            <li><img src="http://www.dujinming.cn/image/llklbt3(1).png"></li>
            <li><img src="http://www.dujinming.cn/image/llklbt4(1).png"></li>
            <li><img src="http://www.dujinming.cn/image/llklbt5(1).png"></li>
        </ul>>
    </div>
</div>
<div id="xh">
    <div class="xq">
        <div id="1"><img src="http://www.dujinming.cn/image/gpydk1(1).png" width="1000" height="1000px"></div>
        <div id="2"><img src="http://www.dujinming.cn/image/gpydk2(1).png" width="1000" height="1000px"></div>
        <div id="3"><img src="http://www.dujinming.cn/image/gpydk3(1).png" width="1000" height="1000px"></div>
    </div>
</div>
<nav class="navbar navbar-default navbar-fixed-bottom" style="backgroundcolor:#0000">
    <div class="navbar-header">

        <p class='navbar-brand'o style="colr:#FF0000">￥${card.c_price}</p>
        <!--  <button class="navbar-toggle" style="color:#FF0000"  οnclick="window.location.href='fourOrder.jsp';">立即购买</button> -->
        <input type="button" value="立即购买"  class="navbar-toggle" style="color:#FF0000" onclick="window.location.href='card_findById1?card.c_id=${card.c_id}';"/>
    </div>
</nav>
</body>
</html>
