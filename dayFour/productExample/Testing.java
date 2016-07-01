package dayFour.productExample;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.Result;
import org.junit.*;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static dayFour.awesome.generated.tables.Blackberry.BLACKBERRY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * Created by student on 01-Jul-16.
 */
public class Testing {

    Connection con;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/awesome?UseSSL=false";
    Statement statement;
    ResultSet rs;
    ResultSetMetaData metaData;
    DSLContext context;


    @Test
    public void retrieveData() throws Exception
    {
        //get the deiver
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url,username,password);

        context = DSL.using(con, SQLDialect.MYSQL);

        //<?> result =(Result) context.select().from(BLACKBERRY);
        Result<?> result =  context.select().from(BLACKBERRY).where((BLACKBERRY.MODEL).eq("Passport")).fetch();



        /**

        //WHEN
        statement = con.createStatement();
        rs = statement.executeQuery("Select * from Blackberry where model='Passport'");

        //THEN
        metaData = rs.getMetaData();
        int rowCount = 0;
        List<String> result = new ArrayList<>();
        int colCount = metaData.getColumnCount();

        while (rs.next())
        {
            for (int i =1; i <=colCount ; i++)
            {
                String st = rs.getString(i);
                result.add(st);
            }
            rowCount ++;
        }
            */
        String test = (String) result.get(0).getValue(3);
        System.out.println(test);
        Assert.assertEquals("Does not match","399.99",test);
    }
}
