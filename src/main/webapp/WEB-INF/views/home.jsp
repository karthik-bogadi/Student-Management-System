<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	    <title>Students</title>
	</head>
	
	<body>
	
		<h2>Student Details</h2>
		
		<table border="1" width="50%" " cellpadding="5" cellspacing="1" style="background-color: yellow;">
		
			<tr>
			    <th>Roll No</th>
			    <th>Name</th>
			    <th>Branch</th>
			    <th>Actions</th>
			</tr>
			
			<c:forEach var="s" items="${students}">
			
				<tr>
				
					<td>${s.rollNo}</td>
					<td>${s.name}</td>
					<td>${s.branch}</td>
					
					<td>
					
					<a href="/update/${s.rollNo}">
					    Update  
					</a> | 
					
					<a href="/delete/${s.rollNo}">
					     Delete
					</a>
					
					</td>
					
				</tr>
			
			</c:forEach>
		
		</table>
		
		<br>
		
		<a href="/add" class="add-btn">
		    <h2>Add New Student</h2>
		</a>
		
	</body>
</html>