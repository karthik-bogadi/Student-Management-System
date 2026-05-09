<html>
	<head>
	    <title>Update Student</title>
	</head>
	
	<body>
		
		<h2>Update Student</h2>
		
		<form action="/update" method="post">
		
			Roll No:
			<input type="text"
			name="rollNo"
			value="${student.rollNo}">
			
			<br><br>
			
			Name:
			<input type="text"
			name="name"
			value="${student.name}">
			
			<br><br>
			
			Branch:
			<input type="text"
			name="branch"
			value="${student.branch}">
			
			<br><br>
			
			<button type="submit">
			    Update
			</button>
		
		</form>
	
	</body>
</html>