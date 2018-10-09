package dao;

import java.util.ArrayList;

import bean.GioHangBean;

public class GioHangDao {

	public ArrayList<GioHangBean> lst = new ArrayList<>();
	
	public void Them(String id, String ten, String img, int soluong, int gia) {
		for (GioHangBean x: lst) {
			if (x.getMaDienThoai().toUpperCase().equals(id.toUpperCase())) {
				x.setSoluong(x.getSoluong() + soluong);
				x.setThanhtien(x.getGia() * x.getSoluong());
				return;
			}
		}
		GioHangBean h = new GioHangBean(id, ten, img, gia, soluong);
		lst.add(h);
	}
}
