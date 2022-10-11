package com.sias.Object.JDBC;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Edgar
 * @create 2022-10-08 16:37
 * @faction:
 */
public class MySQLConnection {
    public static void main(String[] args) throws SQLException {

        /*1.注册驱动
        *   每一个数据库用的驱动都是
        *   不一样的，因此驱动也是不一样的*/
        Driver driver = new Driver();

        String url="jdbc:mysql://localhost:3306/test";
        Properties properties = new Properties();
        properties.put("user","root");
        properties.put("password","root");


        /*2.获取连接
        *   然后是驱动，可以用驱动方式去连接*/
        Connection connect = driver.connect(url, properties);

        /*3.执行SQL
             statement用于执行SQL语句
        *    然后把得到的结果也是通过这个statement对象
        *    返回过来的，既然是操作表里面的数据，那么
        *    这里面的方法也是有多种的，因为操作数据的方式有多种
        *    删除，修改，等方法，因此statement里面也有这些方法*/
        String sql="insert into t1 values(1,'张三','01')";
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println("操作数据成功："+i);

        /*4.关闭连接*/
        statement.close();
        connect.close();
    }
}
