package JDBCProject.HandsOn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
    	RunningScripts rs = new RunningScripts();
    	rs.runDbScript();
    	DbOperations DbO = new DbOperations();
		
		  DbO.insertSubject("Math"); 
		  DbO.insertSubject("English");
		 
    	System.out.println(DbO.getSubjectById(2).toString());
    	System.out.println(DbO.getAllSubjects());
    	DbO.insertStudent("Rahul", 90, "Math");
    	DbO.insertStudent("Priya", 80, "English");
    	System.out.println(DbO.getStudentyId(2).toString());
    	System.out.println(DbO.getAllStudents());
  
    }
}
