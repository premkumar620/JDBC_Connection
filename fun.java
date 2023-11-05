import java.sql.*;
import java.io.*;

class fun {
    public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/youtube";
        String username = "root";
        String password = "123456"; // Replace with your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            String q = "insert into table1(tName, tCity) values(?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Name:");
                String name = br.readLine();

                System.out.println("Enter City:");
                String city = br.readLine();

                pstmt.setString(1, name);
                pstmt.setString(2, city);
                pstmt.executeUpdate();

                System.out.println("Inserted...");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                con.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
