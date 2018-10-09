package dao;

import java.util.ArrayList;

import bean.DienThoaiBean;

public class DienThoaiDao {
	public ArrayList<DienThoaiBean> getDienThoai(){
		ArrayList<DienThoaiBean> ls = new ArrayList<>();
		
		DienThoaiBean dienThoaiBean = new DienThoaiBean("IPX", "IPhone X 64GB", 27000000, 100, "anh1.png", "IP");
		ls.add(dienThoaiBean);
		dienThoaiBean = new DienThoaiBean("IPX256", "IPhone X 256GB", 31000000, 100, "anh2.png", "IP");
		ls.add(dienThoaiBean);
		
		dienThoaiBean = new DienThoaiBean("SGN9", "Samsung Galaxy Note 9 512GB", 28000000, 100, "anh3.png", "SAMSUNG");
		ls.add(dienThoaiBean);
		dienThoaiBean = new DienThoaiBean("SGA6", "Samsung Galaxy A6", 5500000, 10, "anh4.png", "SAMSUNG");
		ls.add(dienThoaiBean);
		
		dienThoaiBean = new DienThoaiBean("NKA8", "Nokia 8", 10000000, 210, "anh5.png", "NKA");
		ls.add(dienThoaiBean);
		dienThoaiBean = new DienThoaiBean("NKA5", "Nokia 5", 3300000, 300, "anh6.png", "NKA");
		ls.add(dienThoaiBean);
		
		dienThoaiBean = new DienThoaiBean("OFX", "OPPO Find X", 20000000, 32, "anh7.png", "OPPO");
		ls.add(dienThoaiBean);
		dienThoaiBean = new DienThoaiBean("OF7", "OPPO F7", 9000000, 36, "anh8.png", "OPPO");
		ls.add(dienThoaiBean);
		
		dienThoaiBean = new DienThoaiBean("SN1", "Sony XZ1", 9000000, 36, "anh9.png", "SN");
		ls.add(dienThoaiBean);
		dienThoaiBean = new DienThoaiBean("SN2", "Sony L2", 3000000, 36, "anh10.png", "SN");
		ls.add(dienThoaiBean);
		
		dienThoaiBean = new DienThoaiBean("VV1", "Vivo V9", 3000000, 36, "anh11.png", "VV");
		ls.add(dienThoaiBean);
		dienThoaiBean = new DienThoaiBean("VV2", "Vivo V7", 3000000, 36, "anh12.png", "VV");
		ls.add(dienThoaiBean);
		
		return ls;
		
	}
}
