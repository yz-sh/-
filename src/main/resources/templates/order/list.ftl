<html>
    <head>
        <meta charset="utf-8">
        <title>卖家商品列表</title>
        <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="/sell/css/style.css">
    </head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>订单id</th>
                    <th>姓名</th>
                    <th>手机号</th>
                    <th>地址</th>
                    <th>金额</th>
                    <th>订单状态</th>
                    <th>支付状态</th>
                    <th>创建时间</th>
                    <th colspan="2">操作</th>
                </tr>
                </thead>
                <tbody>
                <#list orderDtoPage.content as orderDto>
                <tr>
                    <td>${orderDto.orderId}</td>
                    <td>${orderDto.buyerName}</td>
                    <td>${orderDto.buyerPhone}</td>
                    <td>${orderDto.buyerAddress}</td>
                    <td>${orderDto.orderAmount}</td>
                    <td>${orderDto.getOrderStatusEnum().message}</td>
                    <td>${orderDto.getPayStatusEnum().message}</td>
                    <td>${orderDto.createTime}</td>
                    <td><a href="/sell/seller/order/detail?orderId=${orderDto.orderId}">详情</a></td>
                    <td>
                        <#if orderDto.getOrderStatusEnum().message == "新订单">
                            <a href="/sell/seller/order/cancel?orderId=${orderDto.orderId}">取消</a>
                        </#if>
                    </td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>

<#--        分页-->
        <div class="col-md-12 column">
            <ul class="pagination pull-right">
                <#if  currentPage lte 1>
                    <li class="disabled"><a href="#">上一页</a> </li>
                <#else>
                    <li><a href="/sell/seller/order/list?page=${currentPage-1}&size=${size}">上一页</a></li>
                </#if>


                <#list currentPage..orderDtoPage.getTotalPages() as index>

                    <#if currentPage == index>
                        <li class="disabled"><a href="#">${index}</a></li>
                    <#else>
                        <li><a href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a></li>
                    </#if>
                </#list>

                <#if currentPage gte orderDtoPage.getTotalPages()>
                    <li class="disabled"><a href="#">下一页</a> </li>
                <#else>
                    <li><a href="/sell/seller/order/list?page=${currentPage+1}&size=${size}">下一页</a></li>
                </#if>
            </ul>
        </div>
    </div>
</div>
</body>
</html>

