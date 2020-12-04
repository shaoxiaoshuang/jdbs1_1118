<%--
  Created by IntelliJ IDEA.
  User: S
  Date: 2020/11/24
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="test.jsp" method="post">
    <table border="" cellspacing="" cellpadding="">
        <tr><th>账号 <input type="text" name="name"/></th></tr>
        <tr><th>姓名 <input type="text" name="uname"/></th></tr>
        <tr><th>密码 <input type="password" name="pwad"/></th></tr>
        <tr><th>国家 <input type="text" name="te" value="美国"/></th></tr>
        <tr><th>爱好<input type="checkbox" name="hobby" value="唱歌" />唱歌<br/>
            <input type="checkbox" name="hobby" value="跳舞" />跳舞<br/>
            <input type="checkbox" name="hobby" value="读书" />读书<br/>
            <input type="checkbox" name="hobby" value="运动" />运动<br/>
            <input type="checkbox" name="hobby" value="上网" />上网<br/>
        </th></tr>
        <tr><td><input type="submit" name="sub" value="提交" />
            <input type="submit" name="sub" value="重置" />
        </td></tr>
    </table>
</form>
</body>
</html>
