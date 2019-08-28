<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/common/common_admin.jsp"%>
<s:form action="category_save" namespace="/admin/product">
	<s:hidden name="pid"></s:hidden>
	<s:hidden name="level"></s:hidden>
	<div id="right">
		<div id="right_top">
			<img src="${context_path}/css/images/blue.gif" width="16" height="16" />
			<span class="word01">添加商品类别</span>
		</div>
		<div id="right_mid">
			<div id="tiao">
				<div class="category_add">
					<span class="error"> <s:fielderror></s:fielderror>
					</span>
				</div>
				<div class="category_add">
					类别名称：
					<s:textfield name="name"></s:textfield>
				</div>
				<div id="right_foot">
					<s:submit type="image"
						src="%{context_path}/css/images/ht_02_18.gif"></s:submit>
				</div>
			</div>
		</div>
	</div>

</s:form>