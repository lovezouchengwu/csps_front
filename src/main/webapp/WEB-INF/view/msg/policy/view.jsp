<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/view/common/header.jsp" %>

<body>
	标题：${msgPolicyMap.current.title }<br/>
	发布时间：<fmt:formatDate value="${msgPolicyMap.current.releaseTime }" pattern="yyyy-MM-dd"/><br/>
	发布人：${msgPolicyMap.current.username }<br/>
	信息来源：${msgPolicyMap.current.source }<br/>
	信息摘要：${msgPolicyMap.current.summary }<br/>
	
	<c:if test="${msgPolicyMap.pre != null}">
		<a href="<%=request.getContextPath() %>/msg/policy/view?id=${msgPolicyMap.pre.id }">上一篇：${msgPolicyMap.pre.title }</a><br/>
	</c:if>
	<c:if test="${msgPolicyMap.next != null}">
		<a href="<%=request.getContextPath() %>/msg/policy/view?id=${msgPolicyMap.next.id }">下一篇：${msgPolicyMap.next.title }</a>
	</c:if>
</body>
</html>
