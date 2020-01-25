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
    <title>Insert title here</title>
    <link href="static/Css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript">
        function del()
        {
            var count = parseInt(document.getElementById("count").value);
            var price = parseInt(document.getElementById("price").value);
            var toatlprice=0
            count--;
            if (count >= 1) {
                document.getElementById("count").value = count;
                totalprice = price - ${qq.q_price}
                document.getElementById("price").value = totalprice;
            } else {
                document.getElementById("del").style.display = block;
            }

        }
        function add()
        {
            var totalprice=0;
            var count = parseInt(document.getElementById("count").value);
            var price = parseInt(document.getElementById("price").value);
            count++;
            document.getElementById("count").value = count;
            totalprice=price+${qq.q_price};
            document.getElementById("price").value =totalprice;
            document.getElementById("del").style.display = none;
        }
    </script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-bottom" style="backgroundcolor:#0000">
    <div class="navbar-header">
        <p class='navbar-brand' style="color:#FF0000">￥
            <input type=text id="price" value=${qq.q_price} size="1" style= "background-color:transparent;border:0;">
        </p>
        <input type="button" value="提交订单"  class="navbar-toggle" style="color:#FF0000" />
    </div>
</nav>


<div style="/*border-radius:5px 5px 0 0;*/border-radius: 6rpx;">
    <table width="99%" border="0" cellspacing="5" cellpadding="5" >
        <tr>
            <td>
                <div width:150;height:126;padding-left:12;padding-top:20">
                <img src="${qq.q_image}" width="150" height="150" style="border:0">
</div>
</td>
<td>
    <p class="name">${qq.q_name}</p>
    <p class="price">￥${qq.q_price}</p>
    购买数量:
    <input type=button value="+" onClick="add()">
    <input type=text id="count" value=1 size="1" style= "background-color:transparent;border:0;">
    <input type=button  id="del" value="-" onClick="del()" style="disabled:block">
</td>
</tr>
</table>
</div>
<%--<div>

    <br>
    <!-- <form action="" method="post">
    姓名:<input type="text" style= "background-color:transparent;border:0;" size="10"><br>
    手机号:<input type="text" style= "background-color:transparent;border:0;" size="20"><br>
    地址:<input type="text" style= "background-color:transparent;border:0;" size="100"><br>
    </form> -->
</div>--%>
</body>
</html>
