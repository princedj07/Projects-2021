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
				<h1 class="text-center mb-3">Change Product Details</h1>
				<form action="${pageContext.request.contextPath}/handle-product" method="post">

					<div class="form-group">
						<label for="productID">Product Id</label> <input type="text"
							class="form-control" id="productID" name="id" readonly="readonly"
							value="${product.id}" aria-describedby="emailhelp"
							required="required" placeholder="Enter the product id">
					</div>
					
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="name"
							value="${product.name}" aria-describedby="emailhelp"
							required="required" placeholder="Enter the product name here">
					</div>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Product
							Description</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							placeholder="Enter the product description" name="description"
							required="required" rows="5">${product.description}</textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							name="price" class="form-control" id="price" required="required"
							value="${product.price}" placeholder="Enter product price">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update Product</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>