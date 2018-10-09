package dao;



import java.sql.ResultSet;
import java.util.ArrayList;

import bean.LoaiBean;

public class LoaiDao {
	
	public ArrayList<LoaiBean> getLoai() throws Exception{
		ResultSet rs = null;
		ArrayList<LoaiBean> lst = new ArrayList<>();
		CoSo cs = new CoSo();
		cs.KetNoi();
		rs = cs.getBang("loai");
		while(rs.next()) {
			String maloai = rs.getString("maloai");
			String tenloai = rs.getString(2);
			
			LoaiBean x = new LoaiBean();
			x.setMaloai(maloai);
			x.setTenloai(tenloai);
			
			lst.add(x);
		}
		rs.close();
		cs.DongKetNoi();
		return lst;
	}
	
}
