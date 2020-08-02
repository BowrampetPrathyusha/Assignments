package assignment9;
import java.sql.*; 
import java.util.*;

public class ProductsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String user = "DXC"; 
        String pass = "oracle"; 
        System.out.println("Enter product code: ");
        int proCode=sc.nextInt();
        Connection con=null; 
        String sql="select * from PRODUCTS where PROD_CODE="+proCode;
        try
        { 
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
  
           
            con = DriverManager.getConnection(url,user,pass); 
  
            Statement st = con.createStatement(); 
            ResultSet result=st.executeQuery(sql);
            
          while(result.next()) {
        	  System.out.println("Product details: "+"\n"+"Code: "+result.getString("PROD_CODE")+"\n"+"Name: "+result.getString("PROD_NAME")+"\n"+"Price: "+result.getString("PROD_PRICE")+"\n"+"Catalog: "+result.getString("PROD_CATALOG"));
          }
        	  
           
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
        finally {
        	 
        	try{
        		con.close(); 
        	}
        	catch(SQLException e) {
        		System.out.println(e);
        	}
		}
    sc.close();
	} 
} 

