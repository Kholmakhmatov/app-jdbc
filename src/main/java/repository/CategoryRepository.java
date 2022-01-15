package repository;

import entity.Category;
import entity.Response;
import util.DatabaseConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    public static List<Category> getCategories() throws SQLException {
        Connection connection = DatabaseConnect.connection();
        Statement statement;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select *from category");
        List<Category> categoryList = new ArrayList<>();
        while (resultSet.next()) {
            Category category = new Category();
            category.setId(resultSet.getInt(1));
            category.setName(resultSet.getString(2));
            category.setActive(resultSet.getBoolean(3));
            categoryList.add(category);
        }
        return categoryList;

    }
    public static Response addCategory(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DatabaseConnect.connection();
        CallableStatement callableStatement = connection.prepareCall("{call category_add(?," +
                "?,?)}");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);

        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMessage(callableStatement.getString(3));

        System.out.println(response);
        return response;
    }
    public static Response updateCategory(String oldName,boolean isActive,String newName) throws SQLException {
        Response response = new Response();

        Connection connection = DatabaseConnect.connection();
        CallableStatement callableStatement = connection.prepareCall("{call category_update(?,?," +
                "?,?,?)}");
        callableStatement.setString(1, oldName);
        callableStatement.setBoolean(2, isActive);
        callableStatement.setString(3, newName);
        callableStatement.registerOutParameter(4, Types.BOOLEAN);
        callableStatement.registerOutParameter(5, Types.VARCHAR);

        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(4));
        response.setMessage(callableStatement.getString(5));

        System.out.println(response);
        return response;
    }
    public static Response deleteCategory(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DatabaseConnect.connection();
        CallableStatement callableStatement = connection.prepareCall("{call category_delete(?," +
                "?,?)}");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);

        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMessage(callableStatement.getString(3));

        System.out.println(response);
        return response;
    }
}
