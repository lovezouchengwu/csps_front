<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<html>
<head>
    <title>物流团购管理后台</title>
</head>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
<form action="<%=request.getContextPath() %>/msg/government/list" method="post">
	<input type="text" name="title" value="${params.title}" />
	<input type="submit" value="搜索" />
</form>
<table border="1">
		<tr>
    		<th>标题</th>
    		<th>信息类型</th>
    		<th>发布时间</th>
    		<th>发布人</th>
    		<th>状态</th>
    		<th>浏览量</th>
    	</tr>
		<c:forEach var="item" items="${pager.datas}">
            <tr>
                <td><a href="<%=request.getContextPath()%>/msg/government/view?id=${item.id}">${item.title}</a></td>
                <td>${item.type.name}</td>
                <td><fmt:formatDate value="${item.releaseTime}" pattern="yyyy-MM-dd"/></td>
                <td>${item.username}</td>
                <td>${item.status==1?"已发布":(item.status==2?"待发布":"已撤销")}</td>
                <td>${item.viewCount}</td>
            </tr>
        </c:forEach>
</table>

<%@ include file="/WEB-INF/view/common/pager.jsp" %>

<%@ include file="/WEB-INF/view/common/footer.jsp" %>
</body>
</html>