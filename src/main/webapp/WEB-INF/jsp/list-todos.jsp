<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>Todos for ${name}</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>
<div class="container">
    <table class="table table-striped">
        <caption>Your Todos are:</caption>
        <thead>
        <tr>
            <th>Description</th>
            <th>Date</th>
            <th>is it Done?</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a class="button" href="/add-todo">Add a Todo</a>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/css/bootstrap.min.css"></script>
</div>
</body>

</html>