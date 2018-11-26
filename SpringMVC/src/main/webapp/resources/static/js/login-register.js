$(document).ready(function() {

	$('#btn-dangnhap').click(function() {
		alert("btn-dangnhap");
		$("#btn-dangnhap").removeClass("active");
		$(this).addClass("active");
		$("#container-dangnhap").show();
		$("#container-dangky").css("display", "none");
	});

	$("#btn-dangky").click(function() {
		alert("btn-dangky");
		$("#btn-dangnhap").removeClass("active");
		$(this).addClass("active");
		$("#container-dangnhap").hide();
		$("#container-dangky").show();
	});

})