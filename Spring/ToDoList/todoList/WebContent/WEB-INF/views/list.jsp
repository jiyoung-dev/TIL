<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.todo.dto.Todo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do List</title>
</head>
<body>
<h2>To Do List</h2>
<form action="todos" method="post">
	<input type="text" name="content" placeholder="할일을 입력 해주세요">
	<input type="submit" value="추가"><br><br>
</form>
	
	<table>
		<tr>
			<th><p style="text-align:left;">할일 목록</p></th>
			<th>    진행 상태</th>
		</tr>
		<c:forEach var="todo" items="${list }">
			<tr>
				<td>${todo.content}</td> <!-- 내용 및 삭제버튼(delete) -->
				<td>
					<select name="status">
						<option value="">진행상태</option>
						<option value="진행중">진행중</option>
						<option value="완료">완료</option>
					</select>
				</td>
				<td><button onclick="location.href='todos/deleteTodo?id=${todo.id}'">삭제</button></td>
				<!-- <td><button onClick="deleteTodo(${todo.id})">삭제</button></td> -->
			</tr>
		</c:forEach>
		
	</table>

<script type="text/javascript">
	function updateTodo(id, done){
		let updateTodo = {"id":id, "done":done};
		let xhr = new XMLHttpRequest();
		xhr.open('PUT', 'http://localhost/todoList/api/todos');
		xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
		xhr.send(JSON.stringify(updateTodo));
	}
	
	function deleteTodo(id){
		let deleteTodo = {"id":id};
		let xhr = new XMLHttpRequest();
		xhr.open('DELETE', 'http://localhost/todoList/api/todos');
		xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
		xhr.send(JSON.stringify(deleteTodo));
	}
</script>

</body>
</html>