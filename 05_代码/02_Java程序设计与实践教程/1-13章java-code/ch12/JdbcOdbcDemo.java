import java.sql.*;
class JdbcOdbcDemo {
    public static void main (String[] args) {
        try {
            // 第一步：注册 JDBC Driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // 第二步：建立与数据库的连接
            String url = "jdbc:odbc:Store";
            Connection conn = DriverManager.getConnection(url);
			  // 第三步：声明Statement 来传送 SQL statements到database
			  Statement stmt = conn.createStatement();
		      //创建表Personnel
String createTablePersonnel = "CREATE TABLE  Personnel " +
		          "(Name VARCHAR(32), ID INTEGER, Salary FLOAT, " + "Gender String)";
			 stmt.executeUpdate(createTablePersonnel);// 执行SQL语句
           //在表中插入数据
           stmt.executeUpdate("INSERTINTO Personnel VALUES ('Tom', 12, 37000, '男' )" );
           //更新表中数据
String UPDATEString = "UPDATE Personnel " +"SET ID = 7 " +
				"WHERE Name LIKE  'Jack' ";
			stmt.executeUpdate(UPDATEString);
			String query = "SELECT   ID, Gender, Name FROM  Personnel";
			ResultSet rs = stmt.executeQuery(query);// 执行SQL语句
			while (rs.next()) {
				String name = rs.getString("Name");
				int id = rs.getInt("ID");
				String gender = rs.getString("Gender");
				System.out.println(name + "\t" + id + "\t" + gender);
			} // while
			rs.close();
			stmt.close();
			conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }  // catch
    }  // main
} // JdbcOdbcDemo
