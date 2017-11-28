<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Capcha </title>
<style>
.errorMessage {
color: red;
font-size: 0.8em;
} 

.label {
color:#000000;
}
</style>
</head>
<body>
	<table>
		<tr>
		<td>
			<h1>Captcha</h1>
			<s:form action="doCaptcha" method="POST">
			<s:actionerror /> 
			<img src="Captcha.jpg" border="0">
			<s:textfield label="Code" name="j_captcha_response" size="20" maxlength="10"/>
			<s:submit value="Verify" align="center" />
			</s:form>
		</td>
		</tr>
	</table>
</body>
</html>