package JDBCProject.HandsOn;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.jdbc.ScriptRunner;


public class RunningScripts {
   public void runDbScript() throws Exception {
	   try {
		      File myObj = new File("db.sql");
		      myObj.createNewFile();
		       
		      if(myObj.length()==0)
		      {
		      try {
		          FileWriter myWriter = new FileWriter("db.sql");
		          myWriter.write("DROP TABLE subject;\r\n" + 
		          		"DROP TABLE student;\r\n" + 
		          		"CREATE TABLE subject(id int PRIMARY KEY AUTO_INCREMENT, name varchar(25));\r\n" + 
		          		"CREATE TABLE student(id int PRIMARY KEY AUTO_INCREMENT, student_name varchar(20), score float, subject_id int references subject(id));");
		          myWriter.close();
		        } catch (IOException e) {
		          
		        }
		      }
		    } catch (IOException e) {
		      
		    }
     Connection con=DbUtil.getConnection();
     ScriptRunner sr= new ScriptRunner(con);
     Reader rd = new BufferedReader(new FileReader("db.sql"));
      sr.runScript(rd);
      DbUtil.closeConnection(con);
   }
}
