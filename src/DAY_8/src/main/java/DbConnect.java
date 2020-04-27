import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbConnect {

    public static Properties properties = getProperties();

    public static void main(String[] args) throws SQLException {
        String query = "show tables";
        String queryCategory = "SELECT * FROM Categories WHERE CategoryID=?";
        //execStatement(query);
        //execPreparedStatement(queryCategory, 2);
        loadCategories();
    }

    public static void loadCategories() {
        String query = "select * from Categories";
        List<Category> categories = new ArrayList<>();
        try {
            Connection connection = getDataSource(properties).getConnection();
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    categories.add(new Category(rs.getInt(1), rs.getString(2), rs.getString(3)));
                }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        categories.forEach(category -> System.out.println(category.toString()));
    }

    private static Properties getProperties() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/DAY_8/src/main/resources/db.properties")) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    private static MysqlDataSource getDataSource(Properties prop) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(prop.getProperty("HOST"));
        dataSource.setPort(Integer.parseInt(prop.getProperty("PORT")));
        dataSource.setUser(prop.getProperty("USER"));
        dataSource.setPassword(prop.getProperty("PWD"));
        dataSource.setDatabaseName(prop.getProperty("DBNAME"));
        return dataSource;
    }

   private static void execStatement(String query) throws SQLException {
        try {
            Connection connection = getDataSource(properties).getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void execPreparedStatement(String query, int id) throws SQLException {
        try {
            Connection connection = getDataSource(properties).getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    System.out.println(rs.getString(2));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
