import java.sql.*;

public class EmplJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Emp";
        String user = "root"; // your username
        String password = "your_password"; // your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Empl");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("empno") + " | " +
                    rs.getString("ename") + " | " +
                    rs.getString("job") + " | " +
                    rs.getInt("mgr") + " | " +
                    rs.getDate("hiredate") + " | " +
                    rs.getDouble("sal") + " | " +
                    rs.getString("comm") + " | " +
                    rs.getInt("deptno")
                );
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
