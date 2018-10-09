package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.GioHangBo;

/**
 * Servlet implementation class dathang
 */
@WebServlet("/dathang")
public class dathang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dathang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(request.getParameter("id") != null && request.getParameter("ten") != null && request.getParameter("img") != null && request.getParameter("gia") != null){
			if(session.getAttribute("giohang") != null){
				GioHangBo gh = new GioHangBo();
				String masach = request.getParameter("id");
				String tensach = request.getParameter("ten");
				int soluong = 1;
				int gia = Integer.parseInt(request.getParameter("gia"));
				String img = request.getParameter("img");
				gh = (GioHangBo)session.getAttribute("giohang");
				gh.Them(masach, tensach, img, soluong, gia);
				session.setAttribute("giohang", gh);
				session.setAttribute("luonghang", gh.luonghang);
			} else {
				GioHangBo gh = new GioHangBo();
				String masach = request.getParameter("id");
				String tensach = request.getParameter("ten");
				int soluong = 1;
				int gia = Integer.parseInt(request.getParameter("gia"));
				String img = request.getParameter("img");
				gh.Them(masach, tensach, img, soluong, gia);
				session.setAttribute("giohang", gh);
				session.setAttribute("luonghang", gh.luonghang);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
