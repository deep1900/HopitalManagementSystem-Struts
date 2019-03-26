
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="login" method="post">
	<s:textfield name="l.id" label="UserID"></s:textfield>
	<s:textfield name="l.userName" label="UserName"></s:textfield>
	<s:password name="l.password" label="Password"></s:password>
	<s:submit value="login"></s:submit>
</s:form>
