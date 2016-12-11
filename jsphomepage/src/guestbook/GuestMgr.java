package guestbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import ch10.DBConnectionMgr;

public class GuestMgr {

	private DBConnectionMgr pool = null;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public GuestMgr() {
		try{
			pool = DBConnectionMgr.getInstance();
 	   	}catch(Exception e){
 	   		System.out.println("Error : Ŀ�ؼ� ������ ����");
 	   	}
     }
	

    public Vector<GuestBean> getBoardList() {   
        String sql = null;
 	    Vector<GuestBean> vecList = new Vector<GuestBean>();	   
 	   
        try {
           con = pool.getConnection();
           sql = "select * from guestbook order by gb_num desc";
           pstmt = con.prepareStatement(sql);
           rs = pstmt.executeQuery();
           
 		   while (rs.next()) {
 			  GuestBean bean = new GuestBean();
 			 bean.setGb_num( rs.getInt("gb_num") );  
			 bean.setGb_name( rs.getString("gb_name") );
			 bean.setGb_date( rs.getTimestamp("gb_date") );
			 bean.setGb_passwd( rs.getString("gb_passwd") );
			 bean.setGb_content( rs.getString("gb_content") );
             vecList.add(bean);
           }
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
 	      pool.freeConnection(con, pstmt, rs);
        }
        return vecList;
     }
    
///////////////////////////////////////////////////////

    public GuestBean getBoard(int gb_num) {   
        String sql = null;
        GuestBean bean = new GuestBean();   
 	   
        try {
           con = pool.getConnection();
           sql = "select * from guestbook where gb_num = ?";
           pstmt = con.prepareStatement(sql);
           pstmt.setInt(1, gb_num);
           rs = pstmt.executeQuery();
           
 		   rs.next();

		   bean.setGb_num( rs.getInt("gb_num") );  
		   bean.setGb_name( rs.getString("gb_name") );
		   bean.setGb_date( rs.getTimestamp("gb_date") );
		   bean.setGb_passwd( rs.getString("gb_passwd") );
		   bean.setGb_content( rs.getString("gb_content") );
           
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
 	      pool.freeConnection(con, pstmt, rs);
        }
        return bean;
     }
    

//////////////////////////////////////////////////////////////////////////////
    
	public boolean insertBoard(GuestBean bean) {
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert into guestbook values(0, ?, sysdate(), ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getGb_name());
			pstmt.setString(2, bean.getGb_passwd());
			pstmt.setString(3, bean.getGb_content());
			
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	

//////////////////////////////////////////////////////////////////////////////////////////////

	public boolean updateBoard(GuestBean bean) {
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update guestbook set gb_name=?, gb_content=? where gb_num=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getGb_name());
			pstmt.setString(2, bean.getGb_content());
			pstmt.setInt(3, bean.getGb_num());
			
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean isPasswd(int num, String gb_passwd) {
		String sql = null;
		boolean flag = false;
		
		try{
			con = pool.getConnection();
			sql = "select gb_passwd from guestbook where gb_num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String orgPasswd = rs.getString(1);
			
			System.out.println("gb_passwd : "+gb_passwd + ", orgPasswd : "+orgPasswd);
			if(gb_passwd.equals(orgPasswd)){
				flag = true;
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}	
	
	public boolean deleteBoard(int gb_num) {
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from guestbook where gb_num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, gb_num);
			
			if(pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}

}//class
