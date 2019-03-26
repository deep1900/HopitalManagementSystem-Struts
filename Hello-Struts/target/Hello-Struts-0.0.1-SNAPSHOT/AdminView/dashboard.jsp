<%--
  Created by IntelliJ IDEA.
  User: Deep
  Date: 20-Mar-19
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>DashBoard</title>
</head>

<b>Welcome <s:property value="userName"/></b>
<b>Welcome <s:property value="userId"/></b>
<s:property value="#session.userId" />
<br>
<!-- <button name="Add Patient"><a href="addPatient.jsp">Add Patient Information</a></button>
<button name="Add Reports"></button>
<button name="Add Doctors"></button>
 -->
<a href="addPatient.jsp">Add Patient</a>
<a href="addReports.jsp">Add Reports</a>
<a href="addDoctor.jsp">Add Doctor</a>
<a href="logout.jsp">Logout</a>

</body>
</html>
