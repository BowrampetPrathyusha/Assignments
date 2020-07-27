package assignment4;

public class EngineerBook extends Book{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public static void main(String[] args) {
		EngineerBook eb=new EngineerBook();
		eb.setCategory("ECE");
		eb.setAuthor("priyanka");
		eb.setBookNo(01);
		eb.setPrice(100);
		eb.setTitle("Analog Electronics");
		System.out.println(eb.getAuthor()+"\n"+eb.getCategory()+"\n"+eb.getBookNo()+"\n"+eb.getPrice()+"\n"+eb.getTitle());
	}

}
