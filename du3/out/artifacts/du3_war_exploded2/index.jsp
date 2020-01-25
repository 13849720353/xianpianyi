<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0,maximum-scale=1.0,ser-scalable=no;">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="refresh" content="3;url='http://www.dujinming.cn/网上销售/area_area;">
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<style >
    #test{
        width: 180px;
        height: 90px;
        border:0px
        solid #ef3333;
        color: black;
        font-size:25px;
        font-style:oblique;
        position: absolute;
        position:absolute;
        margin-top:-400px;
        margin-left:210px;
    }
</style>
<body style="background-image:url(http://www.dujinming.cn/image/photo1.png);background-size:100%;">

<div id = "test"></div>
<script >
    var text = "你 好 同 学，欢 迎 你 的 加 入，相 信 你 不 枉 此 行!";
    var num = text.length;
    var i =0;
    function show() {
        var shower = text.substr(0,i);
        document.getElementById("test").innerHTML = shower;
        i++;
        if(i + 1 >= num){
            clearInterval("done");
        }
    }
    var done=setInterval("show()",35);
</script>
</body>
</html>