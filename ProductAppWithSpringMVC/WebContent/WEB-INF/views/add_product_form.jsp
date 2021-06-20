<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill The Product Details</h1>
				<form action="handle-product" method="post">

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="name"
							aria-describedby="emailhelp" required="required"
							placeholder="Enter the product name here">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Product Description</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
						placeholder="Enter the product description" name="description"
						required="required"	rows="5"></textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							name="price" class="form-control" id="price" required="required"
							placeholder="Enter product price">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add Product</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>