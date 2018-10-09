package bo;

import java.util.ArrayList;

import bean.LoaiBean;
import dao.LoaiDao;

public class LoaiBo {

	ArrayList<LoaiBean> lst = new ArrayList<>();
	
	public ArrayList<LoaiBean> getLoai() throws Exception{
		LoaiDao loaiDao = new LoaiDao();
		lst = loaiDao.getLoai();
		return lst;
	}
	
}
