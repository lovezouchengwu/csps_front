<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<html>
<head>
    <title>物流团购管理后台</title>
</head>
<body>
<table border="1">
		<tr>
    		<th>标题</th>
    		<th>发布时间</th>
    		<th>发布人</th>
    		<th>状态</th>
    		<th>浏览量</th>
    	</tr>
		<c:forEach var="item" items="${pager.datas}">
            <tr>
                <td><a href="<%=request.getContextPath()%>/msg/infomation/view?id=${item.id}">${item.title}</a></td>
                <td><fmt:formatDate value="${item.releaseTime}" pattern="yyyy-MM-dd"/></td>
                <td>${item.username}</td>
                <td>${item.status==0?"已发布":(item.status==1?"待发布":"已撤销")}</td>
                <td>${item.viewCount}</td>
            </tr>
        </c:forEach>
</table>

<%@ include file="/WEB-INF/view/common/pager.jsp" %>

</body>
</html>