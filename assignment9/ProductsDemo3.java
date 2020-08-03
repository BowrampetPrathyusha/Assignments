package assignment9;
import java.sql.SQLException;
import java.util.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input;
		String proCode;
		String proName;
		String proPrice;
		String proCat;
		ArrayList<ProductsDemo> product = new ArrayList<>();

		/*while (true) {
			System.out.println("Press any key to input values, -1 to exit");

			input = sc.nextLine();

			if (input.equals("-1")) {
				break;
			} else {*/
				System.out.println("Enter no.of products");
				input=sc.next();
				System.out.println("Enter Product Code");
				proCode = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Name");
				proName = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Price");
				proPrice = sc.next();
				sc.nextLine();
				System.out.println("Enter Product Category");
				proCat = sc.next();
				sc.nextLine();
				product.add(new ProductsDemo(proCode, proName, proPrice, proCat));

			//}
		//}

		try {
			JdbcRowSet row = RowSetProvider.newFactory().createJdbcRowSet();
			row.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			row.setUsername("DXC");
			row.setPassword("oracle");
			row.setCommand("select PROD_CODE,PROD_NAME,PROD_PRICE,PROD_CATALOG from PRODUCTS");
			row.execute();
			// Update

			for (int i = 0; i < product.size(); i++) {
				ProductsDemo data = product.get(i);

				String pCode1 = data.getproCode();
				String pName1 = data.getproName();
				String pPrice1 = data.getproPrice();
				String pCat1 = data.getproCat();
				row.afterLast();
				row.moveToInsertRow();
				row.updateString("PROD_CODE", pCode1);
				row.updateString("PROD_NAME", pName1);
				row.updateString("PROD_PRICE", pPrice1);
				row.updateString("PROD_CATALOG", pCat1);
				row.insertRow();
			}

			row.beforeFirst();
			while (row.next()) {
				System.out.println(row.getString("PROD_CODE") + ":" + row.getString("PROD_NAME") + ":"+ row.getString("PROD_PRICE") + ":" + row.getString("PROD_CATALOG"));
			}
		}

		catch (SQLException e) {
			System.out.println(e);;
		}
sc.close();
	}
}