<%@page import="bo.GioHangBo"%>
<%@page import="bean.GioHangBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Giỏ hàng</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
	<script type="text/javascript" src="assets/jquery.min.js"></script>
	<script type="text/javascript" src="assets/popper.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="assets/main.css">
	<style type="text/css">
		.container {
			width: 768px;
		}
		@media(max-width: 768px){
			.container {
				width: 100%;
			}
		}
	</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="cuahang">Quay lại Cửa hàng</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    </ul>
  </div>
</nav>
<div class="container mt-3" style="width: 768px;">
	<a class="btn btn-success" href="cuahang">Tiếp tục mua hàng</a>
	<div class="card mt-2 mb-2">
		<div class="card-header">
			<h3>Giỏ hàng của bạn</h3>
		</div>
		<div class="card-body" id="giohang">
		<%	

			GioHangBo gh = new GioHangBo();
			if(request.getAttribute("dshang") != null){
				gh = (GioHangBo) request.getAttribute("dshang");
				int i = 0;
				for(GioHangBean x : gh.lst){ 
				%>
					<table class="itembook" width="100%" data-madienthoai="<%=x.getMaDienThoai() %>">
						<tbody>
							<tr>
								<td width="120">
									<img alt="" src="assets/img/<%=x.getImg() %>" width="120" height="130">
								</td>
								<td valign="top" style="padding-left: 10px; font-size: 12px;">
									<h3 style="color: #000; font-size: 14px; text-transform: uppercase; font-weight: bold;"><%=x.getTenDienThoai() %></h3>
									<b class="text-muted">MÃ ĐIỆN THOẠI: <%=x.getMaDienThoai() %></b><br>
									<b class="text-muted">GIÁ BÁN: <%=x.getGia() %></b><br>
								</td>
								<td width="100" align="right">
									  <ul class="pagination mb-0">
									    <li class="page-item"><a class="page-link removeitem" href="javascript:void(0)" data-madienthoai="<%=x.getMaDienThoai() %>">-</a></li>
									    <li class="page-item "><span class="page-link" data-madienthoai="<%=x.getMaDienThoai() %>"><%=x.getSoluong() %></span></li>
									    <li class="page-item"><a class="page-link additem" href="javascript:void(0)" data-madienthoai="<%=x.getMaDienThoai() %>">+</a></li>
									  </ul>
								</td>
								<td align="right" width="60">
									<button class="btn btn-danger delitem" data-madienthoai="<%=x.getMaDienThoai() %>">Xóa</button>
								</td>
							</tr>
						</tbody>
					</table>
				<%}
			}
		%>
		</div>
		<div class="card-footer text-muted">
		   	<h3>Thành tiền: <span id="tien"><%=gh.thanhToan() %></span></h3>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(".delitem").click(function(e){
		e.preventDefault();
		var madienthoai = $(this).attr("data-madienthoai");
		$.get("xoahangtronggio",
		{
			madienthoai: madienthoai
		}, function(data){
			$("table[data-madienthoai="+madienthoai+"]").remove();
			$("#tien").html(data);
		});
	});
	
	$(".additem").click(function(){
		var madienthoai = $(this).attr("data-madienthoai");
		$.get("themhang",
		{
			madienthoai: madienthoai
		}, function(data){
			var s = $("span[data-madienthoai="+madienthoai+"]").text();
			s  = parseInt(s);
			s++;
			$("span[data-madienthoai="+madienthoai+"]").html(s);
			$("#tien").html(data);
		});
	});
	
	$(".removeitem").click(function(){
		var madienthoai = $(this).attr("data-madienthoai");
		$.get("xoahang",
		{
			madienthoai: madienthoai
		}, function(data){
			var s = $("span[data-madienthoai="+madienthoai+"]").text();
			s  = parseInt(s);
			if(s == 1){
				$("table[data-madienthoai="+madienthoai+"]").remove();
				$("#tien").html(data);
			}
			else {
				s--;
				$("span[data-madienthoai="+madienthoai+"]").html(s);
				$("#tien").html(data);
			}
			
		});
	});
</script>
</body>
</html>