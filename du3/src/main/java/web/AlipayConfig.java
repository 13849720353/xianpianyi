package web;

public class AlipayConfig {
    // 商户appid
    public static String APPID = "2021001107609281";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDT7FWA56IU1Q2lqRL2OEecSEFYUJPlKDP1OvkqTvTeKbWm5oKRGaAS5lZkGXJidTDYkTdrwYUEovViTuNZDBhXyLS0WnFndZ4iIFrGGkzFQnRuPXs4HUgzyEOreUovtU2GpCgMqv2jmR+p4WDYgaDYB4d8vzdEjKXvyYMf0q5rggf1nzblNOVSkjBHgnYO30ikyD+/CVWrRlu42UKOVUaTQ88igtlqRqKE5v04aYFj+/i/bgRrO4ZpkjH+uE9El93LS1WNqM8JdVsLiraS3Oc7DroItCpZxjnS0I5b014noMTjCw96bQE6L5331GCNxnmck1Ez01vCZtLgBc7J7dizAgMBAAECggEAZUIdMLR8u1t5Y9g/WSpW/ROBNYN6xxnIibod59tGIQjo5NBrPo1x8NXiHX4TK3w3VKM+SdxzhF2gxdJPyvJ+hyM9RJeabAbFAiVXeiSC3hX8r9fskklbgHKF8t7HVbhZTKYPBM6G1q6JdJBdx9VYVyBx2mc7LyPM/Z/ZaVEvSeo+6uuX3aVj0AOqwxO7/22gwcApmHuPyJZ1uSqNbc1iDRBfLBTpsHbn1gwI21qLCh66oNmG/ZldEflJT3iBeVmf2/rd8pNGvC5MLnlsDxeezXG6898BUv6dcIQmq6wQxudld/W+z3sTHCjmQFtS0z5yl2jlK3RzGHLG2kW11o4g0QKBgQDscfnlLbWQSd+LMSVY+mJ8nQXX7mz3e6qV2eym34bRVi8gLUqcWeSGeE8ARcLhGp0cx92idK8t+vJN/zbxS8btq6eVItXUhI9dqjoqo8qcnWPJpjJHa0lso/vvpgQYEAn9kdn3etOU5LOkFr19MLOXg2OZFUo1lWIEugJHctNVLQKBgQDlcy0333Kh2oMKzD4nPZRS6Sj6Rwtivx1uElP4ofLGDjd94uPa+3t/3H3WEkLmr741lnDPpkOpdE/HaUMQW3Moa/EKhbohpn2By/CIM6XrzpFY4lo12FVDLONf8SfwX/R2x5/+NCJrV8HF6DSSLbqGv81mGixa/z0GKCJ+4oZRXwKBgAuinDJ76lhcWkTGOVlEkP4i1/vFPtV6320aWTvo+gBpJk6GDArfnZBEcVbJGArtvVeCOlTZOxmfJLdT3MdI/FQLw2ZiXXVkxI1OaChbAQht8lAk/opnLCjNdQNY/xCUEXnJ6Jj2EV1dV722ZMK5V80X6RnKY2l5nWYwJRaQ/vdNAoGAentJIBI/dvbWDOWKKBhPHRMptLBH+6ZZZ3CRMqAAoIjmRmTfjP3BpzdkVOnanJojxydPgQkYBVT5YVFnY0vt5R35xcws19mwFaFv/MTVRVM3c2MhFK0ulnVXytdIoqAWN3HIjkH2PabS4Xpa1c1jTJsGYgKGuuyU/rxd7a2uVbECgYBEPdMF64ntvws8SP72jn9zGupwqwhExhbt2kpTd80lm1T34NkubPkMIu5cL6sahrYHHzTQ8STAsWlIX89FdOKCdu/t0LjeBLIWAbytpCNfy3N6O9oWg/GX+9J4+7LyeLcnF7O4sFwyTWHyCAuf6HSmXjyRsgAyX96loskpexc5yA==";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://商户网关地址/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
    // 请求网关地址
    public static String URL = "https://openapi.alipay.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvxi9yzlAjigbeLTPg/XiPF/5CumE+IPRFkqXOORyIOsEzjVZFbhCD6flyobD01MA0WFXJ8us/Z0BbUw63mYHWb7Xod3/GzRwoo8khFCzgZiGoOQLo9qjXvmoxh9MqlYQf6P59kofle5kt4J7sIYHELWfMr31vFK2c+D1VINZyHBZnaSB85Z8AcGerkUL090ZNjQ4OsT92uSgbq4xfF/P+SlzLn+nIdJxcNUTHfhtuYJAM8nZC+xrgVIWZYGdmNjf7xTa8f+v3Z298tar7Qkfz3HUynlHkuWv8TGKx33gay4s4ZZA78i3tYeTYwinOInNvORz2PbWJ+OitUijjYv6PwIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
