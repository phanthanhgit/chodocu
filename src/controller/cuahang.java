package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DienThoaiBean;
import bean.HangBean;
import bo.DienThoaiBo;
import dao.HangDao;

/**
 * Servlet implementation class cuahang
 */
@WebServlet("/cuahang")
public class cuahang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cuahang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	ArrayList<HangBean> lshang = new ArrayList<>();
	ArrayList<DienThoaiBean> lsdt = new ArrayList<>();
	DienThoaiBo dienThoaiBo = new DienThoaiBo();
	String noti;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HangDao hangDao = new HangDao();
		lshang = hangDao.getHang();
		
		lsdt.clear();
		String cat = "";
		if(request.getParameter("cat") != null && request.getParameter("cat") != ""){
			cat = request.getParameter("cat");
		}

		String key = "";
		if(request.getParameter("key") != null) {
			key = request.getParameter("key");
			lsdt = dienThoaiBo.TimKiem(key, cat);
			noti = "Kết quả tìm kiếm cho: "+key;
			request.setAttribute("noti", noti);
		} else {
			lsdt = dienThoaiBo.dstheoCAT(cat);
		}
		
		RequestDispatcher raDispatcher = request.getRequestDispatcher("cuahang.jsp");
		request.setAttribute("lshang", lshang);
		request.setAttribute("lsdt", lsdt);
		raDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
