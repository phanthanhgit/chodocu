package bo;

import java.util.ArrayList;

import bean.HangBean;
import dao.HangDao;

public class HangBo {
	public ArrayList<HangBean> getHang(){
		ArrayList<HangBean> ls = new ArrayList<>();
		HangDao hangDao = new HangDao();
		ls = hangDao.getHang();
		return ls;
	}
}
