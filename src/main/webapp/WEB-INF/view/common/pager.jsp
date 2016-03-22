<%@ page contentType="text/html;charset=UTF-8"%>

<span>第${pager.currentPage }/${pager.pageCount}页</span>
<c:choose>
	<c:when test="${pager.currentPage > 1 }">
	<a id="pager_first" href="" onclick="go(1)">首页</a>
	<a id="pager_pre" href="" onclick="go(${pager.currentPage - 1})">上一页</a>
	</c:when>
	<c:otherwise>首页  上一页</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${pager.currentPage < pager.pageCount }">
	<a id="pager_next" href="" onclick="go(${pager.currentPage + 1})">下一页</a>
	<a id="pager_last" href="" onclick="go(${pager.pageCount})">末页</a>
	</c:when>
	<c:otherwise>下一页 末页</c:otherwise>
</c:choose>

<c:if test='${"POST".equals(method) }'>
<form id="pageForm" action="${uri }" method="post">
<c:forEach var="item" items="${params }">
	<c:if test='${item.key!="currentPage" }'>
	<input type="hidden" id="${item.key }" name="${item.key }" value="${item.value }"/>
	</c:if>
</c:forEach>
	<input type="hidden" id="currentPage" name="currentPage" value="1"/>
</form>
</c:if>
<script>
	var method = '${method}';
	if (method == 'GET') {
		// 拼接参数
		var params = '?';
		<c:forEach var="item" items="${params }">
			if ('${item.key}' != 'currentPage') {
				params += '${item.key}=${item.value}&';
			}
		</c:forEach>
		$('#pager_first').attr('href', '${uri}' + params + 'currentPage=1');
		$('#pager_pre').attr('href', '${uri}' + params + 'currentPage=${pager.currentPage - 1}');
		$('#pager_next').attr('href', '${uri}' + params + 'currentPage=${pager.currentPage + 1}');
		$('#pager_last').attr('href', '${uri}' + params + 'currentPage=${pager.pageCount}');
	}
	else {
		$('#pager_first').removeAttr('href');
		$('#pager_pre').removeAttr('href');
		$('#pager_next').removeAttr('href');
		$('#pager_last').removeAttr('href');
	}

	function go(index) {
		if (method == 'POST') {
			$('#currentPage').val(index);
			$('#pageForm').submit();
		}
	}
	
</script>