import java.sql.*;

class FirstJDBC {
  public static void main(String args[]) {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/youtube";
    String username = "root";
    String password = "123456"; // Replace with your MySQL password

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, username, password);

      if (con.isClosed()) {
        System.out.println("Connection is closed");
      } else {
        System.out.println("Connection created...");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}