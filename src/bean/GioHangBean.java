package bean;

public class GioHangBean {
	private String maDienThoai;
	private String tenDienThoai;
	private String img;
	private int gia;
	private int soluong;
	private int thanhtien;
	
	
	public GioHangBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GioHangBean(String maDienThoai, String tenDienThoai, String img, int gia, int soluong) {
		super();
		this.maDienThoai = maDienThoai;
		this.tenDienThoai = tenDienThoai;
		this.img = img;
		this.gia = gia;
		this.soluong = soluong;
		this.thanhtien = gia*soluong;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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

	public int getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	
	
}
