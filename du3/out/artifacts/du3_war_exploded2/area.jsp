<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
   <%-- <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0,maximum-scale=1.0,ser-scalable=no;">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">--%>

    <title>商品专区</title>
    <script type="text/javascript">

        function onDevice() {
            if (/AppleWebKit.*Mobile/i.test(navigator.userAgent) || (/MIDP|SymbianOS|NOKIA|SAMSUNG|LG|NEC|TCL|Alcatel|BIRD|DBTEL|Dopod|PHILIPS|HAIER|LENOVO|MOT-|Nokia|SonyEricsson|SIE-|Amoi|ZTE/.test(navigator.userAgent))) {

                window.location.href = "http://www.xxxx.gov.cn/site/1/html/mobile/index.htm";
            } else {
                if (window.location.href.indexOf("www.xxxx.gov.cn/") < 0) {
                    window.location.href = "http://www.xxxx.gov.cn/";
                }
            }
        }
        onDevice();

        $(document).ready(function () {

            $('.flexslider').flexslider({
                directionNav: true,
                pauseOnAction: false
            });

            $('.sec1-con #banner').owlCarousel({
                items: 1,
                autoPlay: true,
                navigation: true,
                navigationText: ['', ''],
                scrollPerpage: true,
                singleItem: true
            })
            if ($("#topslider").length > 0) {
                $("#topslider").SexySlider({
                    width: 1200,
                    height: 182,
                    delay: 2000,
                    strips: 10,
                    autopause: false,
                    titleOpacity: 1,
                    effect: 'fade'
                })
            }
        });

    </script>
</head>

<body style="background-image:url(http://www.dujinming.cn/image/photo8.jpg);background-size:100%">

<div id="1">
    <a href="card_list">
        <img src="http://www.dujinming.cn/image/photo10.png" style="position:absolute;left:250px;top:80px;" width="500px" height="200px">
    </a>
</div>
<div id="2">
    <a href="yingyu.jsp">
        <img src="http://www.dujinming.cn/image/photo11.png" style="position:absolute;left:250px;top:380px;" width="500px" height="200px">
    </a>
</div>
<div id="3">
    <a href="vedio_list">
        <img src="http://www.dujinming.cn/image/photo9.png" style="position:absolute;left:250px;top:680px;" width="500px" height="200px">
    </a>
</div>
<div id="4">
    <a href="qq_list">
        <img src="http://www.dujinming.cn/image/photo12.png" style="position:absolute;left:250px;top:980px;" width="500px" height="200px">
    </a>
</div>
</body>
</html>
