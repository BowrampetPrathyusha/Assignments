package assignment9;

public class ProductsDemo {

	private String proCode;
	private String proName;
	private String proPrice;
	private String proCat;
	public ProductsDemo(String proCode, String proName, String proPrice, String proCat) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proCat = proCat;
	}
	public String getproCode() {
		return proCode;
	}
	public void setproCode(String proCode) {
		this.proCode = proCode;
	}
	public String getproName() {
		return proName;
	}
	public void setproName(String proName) {
		this.proName = proName;
	}
	public String getproPrice() {
		return proPrice;
	}
	public void setproPrice(String proPrice) {
		this.proPrice = proPrice;
	}
	public String getproCat() {
		return proCat;
	}
	public void setpCat(String proCat) {
		this.proCat = proCat;
	}

	}
