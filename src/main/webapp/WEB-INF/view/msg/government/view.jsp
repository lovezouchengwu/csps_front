<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/view/common/header.jsp" %>

<body>
	标题：${msgGovernmentMap.current.title }<br/>
	发布时间：<fmt:formatDate value="${msgGovernmentMap.current.releaseTime }" pattern="yyyy-MM-dd"/><br/>
	发布人：${msgGovernmentMap.current.username }<br/>
	信息来源：${msgGovernmentMap.current.source }<br/>
	信息摘要：${msgGovernmentMap.current.summary }<br/>
	
	<c:if test="${msgGovernmentMap.pre != null	}">
		<a href="<%=request.getContextPath() %>/msg/government/view?id=${msgGovernmentMap.pre.id }">上一篇：${msgGovernmentMap.pre.title }</a><br/>
	</c:if>
	<c:if test="${msgGovernmentMap.next != null}">
		<a href="<%=request.getContextPath() %>/msg/government/view?id=${msgGovernmentMap.next.id }">下一篇：${msgGovernmentMap.next.title }</a>
	</c:if>
</body>
</html>