package assignment6;

public class Customer {
	
	private String custNo;
	private String custName;
	private String category;




public Customer(String custNo,String custName,String category) {
	super();
	this.custNo=custNo;
	this.custName=custName;
	this.category=category;
}
public Customer() {
	// TODO Auto-generated constructor stub
}
public String getCustNo() {
	return custNo;
}


public void setCustNo(String custNo) {
	this.custNo = custNo;
}


public String getCustName() {
	return custName;
}


public void setCustName(String custName) {
	this.custName = custName;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
this.category = category;
}
}

