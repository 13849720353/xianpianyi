function du()
{
    var text = "你 好 同 学，欢 迎 你 的 加 入，相 信 你 不 枉 此 行!";
    var num = text.length;
    var i =0;
    var done=setInterval("show()",35);
}
function show() {
    var shower = text.substr(0,i);
    document.getElementById("test").innerHTML = shower;
    i++;
    if(i + 1 >= num){
        clearInterval("done");
    }
}