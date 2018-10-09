<%@page import="bean.DienThoaiBean"%>
<%@page import="bean.HangBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Cửa hàng</title>
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
	<script type="text/javascript" src="assets/jquery.min.js"></script>
	<script type="text/javascript" src="assets/popper.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="assets/style.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="cuahang">Cửa hàng</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    </ul>
    <form class="form-inline my-2 my-lg-0" method="post">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" name="key" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>


<%
	ArrayList<HangBean> lsh = new ArrayList<>();
	ArrayList<DienThoaiBean> lsdt = new ArrayList<>();
	lsh = (ArrayList<HangBean>) request.getAttribute("lshang");
	lsdt = (ArrayList<DienThoaiBean>) request.getAttribute("lsdt");
%>

<div class="container mt-5">
	<div class="row">
		<div class="col-md-3">
			<ul class="list-group">
				<li class="list-group-item">
					<a href="cuahang">Tất cả</a>   
				</li>
			<% for(HangBean x : lsh){ %>
				<li class="list-group-item">
					<a href="?cat=<%=x.getMaHang() %>"><%=x.getTenHang() %></a>   
				</li>
				<%} %>
			</ul>
		</div>
		<div class="col-md-9">
			<%if(request.getAttribute("noti") != null) {%>
			<h4><%=request.getAttribute("noti") %></h4>
			<%} %>
			<% int i = 1;
				for(DienThoaiBean x : lsdt) {
					if(i == 1) out.print("<div class='row'>");
			%>
					<div class="col-md-4 text-center mb-5 p-2">
						<div class="border p-2">
							<img width="100%" alt="anh" src="assets/img/<%=x.getImg() %>">
							<h5 style="font-size: 14px;"><%=x.getTenDienThoai() %></h5>
							<p>GIÁ: <%=x.getGia() %></p>
							<a href="dathang?id=<%=x.getMaDienThoai() %>&ten=<%=x.getTenDienThoai() %>&img=<%=x.getImg() %>&gia=<%=x.getGia() %>" class="btn btn-success buynow-btn">ĐẶT MUA</a>
						</div>
					</div>
			<%
					if(i == 3) {
						out.print("</div>");
						i = 1;
					} else i++;
			} %>
		</div>
	</div>
	<a href="giohang" id="btn-giohang">
		<span id="soluong"><%if(session.getAttribute("luonghang") != null) out.print(session.getAttribute("luonghang")); else out.print(0); %></span>
		<img alt="Gio hang" src="assets/img/bag.png" width="70" height="70">
	</a>
</div>
<script type="text/javascript">
		$(".buynow-btn").click(function(e){
			e.preventDefault();
			var url = $(this).attr("href");
			$.get(url, function(){
				var sl = parseInt($("#soluong").html().trim());
				sl = sl + 1;
				$("#soluong").html(sl);
			});
		});
	</script>
</body>
</html>