<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="patient" method="post">
	<s:textfield name= "adminModel" lable="id"></s:textfield> 
    <s:textfield name="name" label="name"></s:textfield>
    <s:submit value="patient"></s:submit>

</s:form>