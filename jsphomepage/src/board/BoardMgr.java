package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import ch10.DBConnectionMgr;

public class BoardMgr {

	private DBConnectionMgr pool = null;
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public BoardMgr() {
		try{
			pool = DBConnectionMgr.getInstance();
 	   	}catch(Exception e){
 	   		System.out.println("Error : Ŀ�ؼ� ������ ����");
 	   	}
     }
	

    public Vector<BoardBean> getBoardList() {   
        String sql = null;
 	    Vector<BoardBean> vecList = new Vector<BoardBean>();	   
 	   
        try {
           con = pool.getConnection();
           sql = "select * from board order by num desc";
           pstmt = con.prepareStatement(sql);
           rs = pstmt.executeQuery();
           
 		   while (rs.next()) {
 			 BoardBean bean = new BoardBean();
 			 bean.setNum( rs.getInt("num") );  
			 bean.setName( rs.getString("name") );
			 bean.setPasswd( rs.getString("passwd") );
			 bean.setTitle( rs.getString("title") );
			 bean.setEmail( rs.getString("email") );
			 bean.setRegdate( rs.getTimestamp("regdate") );
			 bean.setContent( rs.getString("content") );
			 bean.setHit( rs.getInt("hit"));
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

    public BoardBean getBoard(int num) {   
        String sql = null;
		BoardBean bean = new BoardBean();   
 	   
        try {
           con = pool.getConnection();
           sql = "select * from board where num = ?";
           pstmt = con.prepareStatement(sql);
           pstmt.setInt(1, num);
           rs = pstmt.executeQuery();
           
 		   rs.next();

		   bean.setNum( rs.getInt("num") );  
		   bean.setName( rs.getString("name") );
		   bean.setPasswd( rs.getString("passwd") );
		   bean.setTitle( rs.getString("title") );
		   bean.setEmail( rs.getString("email") );
		   bean.setRegdate( rs.getTimestamp("regdate") );
		   bean.setContent( rs.getString("content") );
		   bean.setHit( rs.getInt("hit"));
           
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
 	      pool.freeConnection(con, pstmt, rs);
        }
        return bean;
     }
    

//////////////////////////////////////////////////////////////////////////////
    
	public boolean insertBoard(BoardBean bean) {
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert into board values(0, ?, ?, ?, ?, sysdate(), ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPasswd());
			pstmt.setString(3, bean.getTitle());
			pstmt.setString(4, bean.getEmail());
			pstmt.setString(5, bean.getContent());
			pstmt.setInt(6, bean.getHit());
			
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

	public boolean updateBoard(BoardBean bean) {
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update board set name=?, title=?, email=?, content=? where num=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getTitle());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getContent());
			pstmt.setInt(5, bean.getNum());
			
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
	
	public boolean isPasswd(int num, String passwd) {
		String sql = null;
		boolean flag = false;
		
		try{
			con = pool.getConnection();
			sql = "select passwd from board where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String orgPasswd = rs.getString(1);
			
			if(passwd.equals(orgPasswd))
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}	
	
	public boolean deleteBoard(int num) {
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from board where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			if(pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	public boolean updateHit(int num) {
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "update board set hit = hit +1 where num=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			if(pstmt.executeUpdate() ==1)
				flag = true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
}//class
