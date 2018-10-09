package bean;

public class LoaiBean {
	private String tenloai;
	private String maloai;
	
	
	public LoaiBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoaiBean(String tenloai, String maloai) {
		super();
		this.tenloai = tenloai;
		this.maloai = maloai;
	}
	
	public String getTenloai() {
		return tenloai;
	}
	
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	
	public String getMaloai() {
		return maloai;
	}
	
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	
	
}
