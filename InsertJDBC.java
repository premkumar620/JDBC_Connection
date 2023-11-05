import java.sql.*;

class InsertJDBC

{
   
  public static void main(String[] args)
{
Connection con = null;
    String url = "jdbc:mysql://localhost:3306/youtube";
    String username = "root";
    String password = "123456"; // Replace with your MySQL password

  try{
  
    Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, username, password);

    String q = "create table table1(tid int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";


Statement stmt =con.createStatement();

stmt.executeUpdate(q);

System.out.println("table created in datbase ...");
con.close();



}
  catch(Exception e)
{

   e.printStackTrace();

}
 
}

}
