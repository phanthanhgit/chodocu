package bean;

public class DienThoaiBean {
	private String maDienThoai;
	private String tenDienThoai;
	private int gia;
	private int soluong;
	private String img;
	private String maHang;
	public DienThoaiBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DienThoaiBean(String maDienThoai, String tenDienThoai, int gia, int soluong, String img, String maHang) {
		super();
		this.maDienThoai = maDienThoai;
		this.tenDienThoai = tenDienThoai;
		this.gia = gia;
		this.soluong = soluong;
		this.img = img;
		this.maHang = maHang;
	}
	public String getMaDienThoai() {
		return maDienThoai;
	}
	public void setMaDienThoai(String maDienThoai) {
		this.maDienThoai = maDienThoai;
	}
	public String getTenDienThoai() {
		return tenDienThoai;
	}
	public void setTenDienThoai(String tenDienThoai) {
		this.tenDienThoai = tenDienThoai;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
