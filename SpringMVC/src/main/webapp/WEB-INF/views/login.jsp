<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/static/vendor/bootstrap.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/static/vendor/bootstrap.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/static/js/jquery.3.2.1.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/static/js/login-register.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/static/css/login.css">
<title>Login</title>
</head>
<body>
	<div class="register">
		<div class="from-login col-md-6 col-md-push-2">
			<div class="container ">
				<div class="row">
					<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
						<a type="submit" href="login" class="btn btn-info" id="btn-dangnhap">Đăng nhập</a> 
						<a href="" class="btn btn-info"  id="btn-dangky">Đăng Ký</a>
							<div id="container-dangnhap">
									<div class="form-group">
										<label >Tên đăng nhập</label> <input
											type="email" class="form-control"
											placeholder="Nhập tên đăng nhập" name="tenDangNhap">
									</div>
									<div class="form-group">
										<label>Mật khẩu</label> <input
											type="password" class="form-control"
											placeholder="Nhập password" name="matKhau">
									</div>
									<div class="form-check container">
										<input type="checkbox" class="form-check-input"> <label
											class="form-check-label">Ghi nhớ đăng nhập.</label>
									</div>
									<button type="submit" href="login" class="btn btn-primary">Đăng
										nhập</button>
							</div><!--  end class="container-dangnhap" -->
							
							<div id="container-dangky">
									<div class="form-group">
										<label>Tên đăng nhập</label> <input
											type="email" class="form-control"
											placeholder="Nhập tên đăng nhập">
									</div>
									<div class="form-group">
										<label >Mật khẩu</label> <input
											type="password" class="form-control"
											placeholder="Nhập password">
									</div>
									<div class="form-group">
										<label >Nhập lại mật khẩu</label> <input
											type="password" class="form-control"
											placeholder="Nhập password">
									</div>								
									<button type="submit" class="btn btn-primary">Đăng Ký</button>
							</div> <!-- class="container-dangky" -->
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