import java.sql.*;
public class JDBCTest 
{
	//主函数main()
	public static void main(String[] args) throws Exception 
	{
   
   	String kongge=new String("     ");
   	//为后面的结果集输出好看点
   
   	Class.forName("com.mysql.jdbc.Driver");
   	//驱动
  	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest?user=root&password=root");
   
   	/*连接数据库,jdbc:mysql://localhost:3306/greatwqs 数据库为greatwqs数据库
	 * 端口为3306
    	* 
    	* 用户名user=root
    	* 
    	* 用户密码password=greatwqs  
    	*/
   
   	Statement stmt=conn.createStatement();
   	//创建SQL语句,实现对数据库的操作功能
   
   	ResultSet rs=stmt.executeQuery("SELECT   * FROM  person");
   	//返回查询的结果

        while(rs.next())
   	{
	 System.out.print(rs.getString("id")+kongge);	
	 System.out.print(rs.getString("name")+kongge);
	 System.out.print(rs.getString("gender")+kongge);	
	 System.out.print(rs.getString("major")+kongge);	
	 System.out.print(rs.getString("phone")+kongge);
	 System.out.println();
   	}//输出结果集的内容
       rs.close();
       stmt.close();
   	conn.close();
   	//关闭语句,结果集,数据库的连接. }
}
}