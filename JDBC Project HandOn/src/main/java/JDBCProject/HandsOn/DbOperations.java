package JDBCProject.HandsOn;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbOperations {
	Connection con;
	public DbOperations() {
		con = DbUtil.getConnection();
	}
	public boolean insertSubject(String name) throws SQLException {
    try
    {
    String sql="insert into subject (name) "+"VALUES(?)";
    PreparedStatement st =con.prepareStatement(sql);
    
    st.setString(1, name);
    System.out.println(st);
    st.executeUpdate();
    return true;
    }catch(SQLException e)
    {
    return false;
    }
	}
	
	
	public ArrayList getSubjectById(int id) throws SQLException {
		ArrayList AL = new ArrayList();
		try
	    {
	    String sql="Select * from subject where id=?";
	    PreparedStatement st =con.prepareStatement(sql);
	    st.setInt(1, id);
	    ResultSet rs=st.executeQuery();
	    while(rs.next())
	    {
	    	AL.add(0, rs.getInt("id"));
	    	AL.add(1, rs.getString("name"));
	    }
				
	    return AL;
	    }catch(SQLException e)
	    {
	    return null;
	    }
		
	}
	public ResultSet getAllSubjects() throws SQLException {
		try
	    {
	    String sql="Select * from subject";
	    PreparedStatement st =con.prepareStatement(sql);
	    ResultSet rs=st.executeQuery();	
	    return rs;
	    }catch(SQLException e)
	    {
	    return null;
	    }
	}
	public boolean insertStudent(String student_name, float score, String name) throws SQLException {
		try
	    {
	    String sql="insert into student (student_name,score,subject_id) "+"VALUES(?,?,(select id from subject where name=?))";
	    PreparedStatement st =con.prepareStatement(sql); 
	    st.setString(1, student_name);
	    st.setFloat(2, score);
	    st.setString(3, name);
	    st.executeUpdate();
	    return true;
	    }catch(SQLException e)
	    {
	    return false;
	    }
	}
	public ArrayList getStudentyId(int id) throws SQLException {
		ArrayList AL = new ArrayList();
		try
	    {
	    String sql="Select * from student where id=?";
	    PreparedStatement st =con.prepareStatement(sql);
	    st.setInt(1, id);
	    ResultSet rs=st.executeQuery();
	    while(rs.next())
	    {
	    	AL.add(0, rs.getInt("id"));
	    	AL.add(1, rs.getString("student_name"));
	    	AL.add(2, rs.getFloat("score"));
	    	AL.add(3, rs.getInt("subject_id"));
	    }
				
	    return AL;
	    }catch(SQLException e)
	    {
	    return null;
	    }
	}
	public ResultSet getAllStudents() throws SQLException {
		try
	    {
	    String sql="Select * from student";
	    PreparedStatement st =con.prepareStatement(sql);
	    ResultSet rs=st.executeQuery();	
	    return rs;
	    }catch(SQLException e)
	    {
	    return null;
	    }
	}

}
