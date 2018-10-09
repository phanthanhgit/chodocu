package bo;

import java.util.ArrayList;

import bean.GioHangBean;

public class GioHangBo {
	public ArrayList<GioHangBean> lst = new ArrayList<>();
	public int luonghang;
	
	public void Them(String id, String ten, String img, int soluong, int gia) {
		for (GioHangBean x : lst) {
			if (x.getMaDienThoai().toUpperCase().equals(id.toUpperCase())) {
				x.setSoluong(x.getSoluong() + soluong);
				x.setThanhtien(x.getGia() * x.getSoluong());
				luonghang++;
				return;
			}
		}
		GioHangBean h = new GioHangBean(id, ten, img, gia, soluong);
		lst.add(h);
		luonghang++;
	}
	
	public void themHang(String madienthoai) {
		for(int i = 0; i < lst.size(); i++) {
			if(lst.get(i).getMaDienThoai().equals(madienthoai)) {
				GioHangBean x = new GioHangBean();
				x = lst.get(i);
				x.setSoluong(x.getSoluong() + 1);
				x.setThanhtien(x.getSoluong() * x.getGia());
				luonghang++;
				return;
			}
		}
		return;
	}
	
	public void xoaHang(String madienthoai) {
		for(int i = 0; i < lst.size(); i++) {
			if(lst.get(i).getMaDienThoai().equals(madienthoai.trim())) {
				GioHangBean x = new GioHangBean();
				x = lst.get(i);
				if(x.getSoluong() == 1) {
					lst.remove(i);
					if(luonghang - 1 > 0) luonghang--; else luonghang = 0;
					return;
				}
				x.setSoluong(x.getSoluong() - 1);
				x.setThanhtien(x.getSoluong() * x.getGia());
				if(luonghang - 1 > 0) luonghang--; else luonghang = 0;
				return;
			}
		}
	}
	
	public void xoaMotLoai(String madienthoai) {
		for(int i = 0; i < lst.size(); i++) {
			if(lst.get(i).getMaDienThoai().equals(madienthoai.trim())) {
				int x = lst.get(i).getSoluong();
				lst.remove(i);
				if(luonghang - x > 0) luonghang = luonghang - x; else luonghang = 0;
				return;
			}
		}
	}
	
	public long thanhToan() {
		long sum = 0;
		for(GioHangBean x : lst) {
			sum += x.getThanhtien();
		}
		return sum;
	}
}
