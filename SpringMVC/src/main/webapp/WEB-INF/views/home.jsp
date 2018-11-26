<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link href="<c:url value='/resources/css/bootstrap.min.css'/>"
	rel="stylesheet"></link>
<link rel="stylesheet" type="text/css"
	href=${pageContext.request.contextPath}/resources/static/css/animate.css>
<script
	src=${pageContext.request.contextPath}/resources/static/js/jquery-3.3.1.min.js
	type="text/javascript"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/static/vendor/bootstrap.css">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/static/vendor/bootstrap.js"></script>
<script
	src=${pageContext.request.contextPath}/resources/static/js/wow.js
	type="text/javascript"></script>
<script
	src=${pageContext.request.contextPath}/resources/static/js/wow.min.js
	type="text/javascript"></script>
<link href="<c:url value='/resources/css/home.css'/>" rel="stylesheet"></link>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/static/css/home.css">
<script>
	new WOW().init();
</script>
</head>
<body>
	<div id="header">
		<div>
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<a class="navbar-brand" href="#"><img
					src=${pageContext.request.contextPath}/resources/image/home/logo.png
					id="navbar-brand-img" alt="">DadaShop</a>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto" id="itemHeaderNav">
						<li class="nav-item"><a class="nav-link" href="#">Home <span
								class="sr-only">(current)</span></a></li>
						<li class="nav-item"><a class="nav-link" href="#">Service</a>
						</li>
						<div class="btn-group">
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">Sony</button>
							<div class="dropdown-menu">
								<a class="dropdown-item" href="#">Tablet</a> <a
									class="dropdown-item" href="#">Smartphone</a>
							</div>
						</div>
						<li class="nav-item"><a class="nav-link" href="#">Contract</a>
						</li>
					</ul>

					<ul class="nav navbar-nav nav-rigth" id="itemHeaderNavxxx">
						<a name="a1" value="aaa"></a>
						<li class="nav-item active alogin"><a class="nav-link" href="login">Login</a>
						</li>						
					</ul>
					</ul>
				</div>
			</nav>
		</div>
		<div id="header-content" class="wow bounce">
			<span>Day 17/10 - 23/10/2018</span><br> <span>Buy 1 KM 1</span><br>
			<button class="btn btn-dangers" type="submit">SEEN NOW</button>
		</div>
	</div>

	<div id="container">

		<div id="container-header" class="container">
			<div class="row">
				<div class="col-md-4">
					<img
						src=${pageContext.request.contextPath}/resources/image/home/research.png
						alt="" class="icon"><br> <span>CHAT LUONG</span><br>
					<span>Chung toi cam ket se mang den cho cac ban chat luong
						san pham tot nhat</span>
				</div>
				<div class="col-md-4">
					<img
						src=${pageContext.request.contextPath}/resources/image/home/research.png
						alt="" class="icon"><br> <span>CHAT LUONG</span><br>
					<span>Chung toi cam ket se mang den cho cac ban chat luong
						san pham tot nhat</span>
				</div>
				<div class="col-md-4">
					<img
						src=${pageContext.request.contextPath}/resources/image/home/research.png
						alt="" class="icon"><br> <span>CHAT LUONG</span><br>
					<span>Chung toi cam ket se mang den cho cac ban chat luong
						san pham tot nhat</span>
				</div>
			</div>
		</div>

		<div id="thongtinsanpham">
			<span>SAN PHAM HOT</span>
		</div>

		<div id="container-container" class="container">

			<div class="row">
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>

				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>

				</div>
				<div class="col-md-3 ">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>

				</div>
				<div class="col-md-3 ">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="sanpham wow zoomIn">
						<img
							src=${pageContext.request.contextPath}/resources/image/home/sanpham.jpg
							alt=""><br> <span>Ao so mi</span><br>
						<div class="gia">
							<span>Gia: 150.000d</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-md-4">
				<span>THONG TIN SHOP</span><br> <span>Chung toi cam ket
					se mang den cho cac ban chat luong san pham tot nhat Chung toi cam
					ket se mang den cho cac ban chat luong san pham tot nhat</span>
			</div>
			<div class="col-md-4">
				<span>LIEN HE</span><br> <span>Chung toi cam ket se mang
					den cho cac ban chat luong san pham tot nhat Chung toi cam ket se
					mang den cho cac ban chat luong san pham tot nhat</span>
			</div>
			<div class="col-md-4">
				<span>GOP Y</span><br>
				<div id="footer-content-sugget">
					<input type="text" name="" placeholder="Email"><br>
					<textarea name="" rows="3" cols="50" placeholder="Content"></textarea>
					<br>
					<button class="btn btn-danger" type="submit">GUI</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
