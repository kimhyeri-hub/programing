<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>모아봄 수요조사</title>
</head>
<body>
<h2>
   프로젝트를 위한 수요조사 입니다.<br>
   협조 부탁드립니다.
</h2>

<form action="register_process.jsp" method="post">
    <label>닉네임: <input type="text" name="nickname" required></label><br>

    <label>성별:
        <input type="radio" name="gender" value="남자" required>남자
        <input type="radio" name="gender" value="여자" required>여자
    </label><br>

    <label>아이디: <input type="text" name="id" required></label><br>

    <label>비밀번호: <input type="password" name="password" required></label><br>

    <input type="submit" value="회원가입">
</form>
</body>
</html>
