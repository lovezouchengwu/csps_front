<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<html>
<head>
    <title>物流团购管理后台</title>
</head>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp" %>
    <div id="loginForm">
        <form id="theFrom" action="<%=request.getContextPath() %>/register/company" method="post" onsubmit="return validate();">
            <div class="form-item">
                <h6>城市配送注册</h6>
            </div>
            <div class="form-item">
                <span class="field-title">用户类型:</span>
                <input type="radio" name="type" value="3" checked="checked" class="field-input" />商户企业
                <input type="radio" name="type" value="4" class="field-input" />物流企业
            </div>
            <div class="form-item">
                <span class="field-title">登录名:</span>
                <input type="text" name="username" value="" class="field-input" />
            </div>
            <div class="form-item">
                <span class="field-title">登录密码:</span>
                <input type="text" name="password" id="password" value="" class="field-input" />
            </div>
            <div class="form-item">
                <span class="field-title">确认密码:</span>
                <input type="text" name="confirmPw" id="confirmPw" value="" class="field-input" />
            </div>
            <div class="form-item">
                <span class="field-title">企业名称:</span>
                <input type="text" name="companyName" value="" class="field-input" />
            </div>
            <div class="form-item">
                <span class="field-title">业务联系人:</span>
                <input type="text" name="name" value="" class="field-input" />
            </div>
            <div class="form-item">
                <span class="field-title">联系人手机:</span>
                <input type="text" name="telephone" value="" class="field-input" />
            </div>
            <div class="form-item">
                <span class="field-title">类型地址:</span>
                <select name="areaId">
                	<c:forEach var="item" items="${areas }">
                		<option value="${item.id }">${item.name }</option>
                	</c:forEach>
                </select>
            </div>
            <div class="form-item">
                <span class="field-title">详细地址:</span>
                <input type="text" name="address" value="" class="field-input" />
            </div>
            <div class="form-item">
            	<input type="checkbox" id="agree" checked="checked" onchange="change()"/>
                <input type="submit" id="submit" value="同意协议并注册码" style="height: 100px;;" />
            </div>
        </form>
    </div>
<%@ include file="/WEB-INF/view/common/footer.jsp" %>
</body>

<script>
	function validate() {
		if ($('#password').val() != $('#confirmPw').val()) {
			alert("两次密码输入不一致");
			return false;
		}
		if ($('#agree').attr('checked') == 'none') {
			return false;
		}
		return true;
	}
	
	function change() {
		var agree = $('#agree').is(':checked');
		$('#submit').attr('disabled', !agree);
	}
</script>
</html>
