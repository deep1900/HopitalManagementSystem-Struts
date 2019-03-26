<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="admin" method="post">
    <s:textfield name="firstname" label="FirstName"></s:textfield>
    <s:textfield name="lastname" label="LastName"></s:textfield>
    <s:textfield name="email" label="Email"></s:textfield>
    <s:textfield name="userName" label="UserName"></s:textfield>
    <s:password name="password" label="Password"></s:password>
    <s:submit value="admin"></s:submit>

</s:form>
<s:label><s:a href="Login.jsp">Login</s:a> If Already have an account!</s:label>