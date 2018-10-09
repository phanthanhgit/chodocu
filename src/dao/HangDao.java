package dao;

import java.util.ArrayList;

import bean.HangBean;

public class HangDao {
	public ArrayList<HangBean> getHang(){
		ArrayList<HangBean> ls = new ArrayList<>();
		HangBean hbBean = new HangBean("SAMSUNG", "SamSung");
		ls.add(hbBean);
		hbBean = new HangBean("IP", "IPhone");
		ls.add(hbBean);
		hbBean = new HangBean("NKA", "NOKIA");
		ls.add(hbBean);
		hbBean = new HangBean("OPPO", "OPPO");
		ls.add(hbBean);
		hbBean = new HangBean("SN", "Sony");
		ls.add(hbBean);
		hbBean = new HangBean("VV", "Vivo");
		ls.add(hbBean);
		return ls;
	}
}
