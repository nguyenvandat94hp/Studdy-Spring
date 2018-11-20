<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
<title>Login</title>
</head>
<body>
	<div class="register">
		<div class="from-login col-md-6 col-md-push-2">
			<div class="container ">
				<div class="row">
					<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
						<form>
							<div class="form-group">
								<label for="exampleInputEmail1">Tên đăng nhập</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Nhập tên đăng nhập">
								<small id="emailHelp" class="form-text text-muted">Chúng
									tôi sẽ không bao giờ chia sẻ tên đăng nhập với bất kì ai khác.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Mật khẩu</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									placeholder="Nhập password">
							</div>
							<div class="form-check container">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Ghi nhớ đăng nhập.</label>
							</div>
							<button type="submit" class="btn btn-primary">Đăng nhập</button>
						</form>
					</div>
				</div>
				<!-- end-row 1-register -->
			</div>
			<!-- end-container-1 -->
		</div>
		<!-- end-from-login -->

		<div class="footer"></div>
		<!-- end-from-login -->
	</div>
	<!-- end-register -->
</body>
</html>