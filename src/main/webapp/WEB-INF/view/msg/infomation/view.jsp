<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/view/common/header.jsp" %>

<body>
	标题：${msgInfomationMap.current.title }<br/>
	发布时间：<fmt:formatDate value="${msgInfomationMap.current.releaseTime }" pattern="yyyy-MM-dd"/><br/>
	发布人：${msgInfomationMap.current.username }<br/>
	信息来源：${msgInfomationMap.current.source }<br/>
	信息摘要：${msgInfomationMap.current.summary }<br/>
	
	<c:if test="${msgInfomationMap.pre != null	}">
		<a href="<%=request.getContextPath() %>/msg/infomation/view?id=${msgInfomationMap.pre.id }">上一篇：${msgInfomationMap.pre.title }</a><br/>
	</c:if>
	<c:if test="${msgInfomationMap.next != null}">
		<a href="<%=request.getContextPath() %>/msg/infomation/view?id=${msgInfomationMap.next.id }">下一篇：${msgInfomationMap.next.title }</a>
	</c:if>
</body>
</html>
