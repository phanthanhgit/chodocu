package bo;

import java.util.ArrayList;

import bean.DienThoaiBean;
import dao.DienThoaiDao;

public class DienThoaiBo {
	
	
	public ArrayList<DienThoaiBean> getDienThoai(){
		ArrayList<DienThoaiBean> ls = new ArrayList<>();
		DienThoaiDao dienThoaiDao = new DienThoaiDao();
		ls = dienThoaiDao.getDienThoai();
		return ls;
	}
	
	public ArrayList<DienThoaiBean> TimKiem(String key, String cat){
		ArrayList<DienThoaiBean> all = new ArrayList<>();
		DienThoaiDao dienThoaiDao = new DienThoaiDao();
		all = dienThoaiDao.getDienThoai();
		
		ArrayList<DienThoaiBean> ls = new ArrayList<>();
		for(DienThoaiBean x : all) {
			if(x.getMaHang().equals(cat) || cat == "")
				if(x.getTenDienThoai().trim().toLowerCase().contains(key.trim().toLowerCase()))
					ls.add(x);
		}
		return ls;
	}
	
	public ArrayList<DienThoaiBean> dstheoCAT(String cat){
		ArrayList<DienThoaiBean> all = new ArrayList<>();
		DienThoaiDao dienThoaiDao = new DienThoaiDao();
		all = dienThoaiDao.getDienThoai();
		
		ArrayList<DienThoaiBean> ls = new ArrayList<>();
		for(DienThoaiBean x : all) {
			if(x.getMaHang().equals(cat) || cat == "")
				ls.add(x);
		}
		return ls;
	}
}
