package dayFour.productExample;

import java.sql.*;
import static dayFour.productExample.ProductGeneration.*;
import static dayFour.productExample.ProductGUI.*;

/**
 * Created by student on 30-Jun-16.
 */
public class MySqlDb {

    Connection conn;
    Statement statement;
    ResultSet rs = null;

    MySqlDb(Connection connection)
    {
        this.conn = connection;
    }

    private void createTables(Statement statement) throws SQLException
    {
        statement.executeUpdate("CREATE TABLE Blackberry (" +
            "Id INTEGER NOT NULL AUTO_INCREMENT,"
        +"model VARCHAR(30) NOT NULL,"
        +"description VARCHAR(100) NOT NULL,"
        +"price VARCHAR(20) NOT NULL,"
        +"category VARCHAR(20) NOT NULL,"
        +"PRIMARY KEY (Id))");
    }

    private void createBlackberry() throws SQLException
    {
        for (Blackberry b : bb) {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO " +
                    "Blackberry (model,description,price,category)" +
                    "VALUES (?,?,?,?)");

            statement.setString(1, b.getModel());
            statement.setString(2,b.getDescription());
            statement.setDouble(3,b.getPrice());
            statement.setString(4,b.getCategory());

            statement.executeUpdate();
            statement.close();
        }
    }

    public void createDatabaseTables() throws SQLException
    {
        Statement statement = conn.createStatement();
        createTables(statement);
        statement.close();
        createBlackberry();
    }
}
