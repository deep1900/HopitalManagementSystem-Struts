
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="login" method="post">
	<s:textfield name="userName" label="UserName"></s:textfield>
	<s:password name="password" label="Password"></s:password>
	<s:submit value="login"></s:submit>
</s:form>
