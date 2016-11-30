package ch10;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
 
 public class RegisterMgr {
    
 	private final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
 	private final String JDBC_URL = "jdbc:mysql://localhost:3306/mydb";
 	private final String USER = "root";
 	private final String PASS = "1111";
 
 	public RegisterMgr() {
 	 try{
 	   Class.forName(JDBC_DRIVER);
 	   }catch(Exception e){
 	      System.out.println("Error : JDBC µå¶óÀÌ¹ö ·Îµù ½ÇÆÐ");
 	   }
     }//MemberMgr()
 
    public Vector getMemberList() {
	   Connection conn = null;
	   Statement stmt = null;
       ResultSet rs = null;
       Vector vecList = new Vector();
       try {
          conn = DriverManager.getConnection(JDBC_URL,USER,PASS);
          String strQuery = "select * from tblRegister";
          stmt = conn.createStatement();
          rs = stmt.executeQuery(strQuery);
		  while (rs.next()) {
             RegisterBean regBean = new RegisterBean();
		 	 regBean.setId (rs.getString("id"));
			 regBean.setPasswd (rs.getString("passwd"));
 			 regBean.setName (rs.getString("name"));
 			 regBean.setGender (rs.getString("gender"));
 			 regBean.setEmail (rs.getString("email"));
 			 regBean.setPhone (rs.getString("phone"));
 			 regBean.setZipcode (rs.getString("zipcode"));
 			 regBean.setAddress (rs.getString("address"));
 			 regBean.setJob (rs.getString("job"));
             vecList.add(regBean);
          }
       } catch (Exception ex) {
          System.out.println("Exception" + ex);
       } finally {
          if(rs!=null)   try{rs.close();}  catch(SQLException e){}
		  if(stmt!=null) try{stmt.close();}catch(SQLException e){}
	      if(conn!=null) try{conn.close();}catch(SQLException e){}
       }
       return vecList;
    }
 }//class