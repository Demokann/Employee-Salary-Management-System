import java.sql.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employee";
        String username = "root";
        String password = "narut2324";

        String selectSQL = "SELECT * FROM employeedb";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                Date dateOfBirth = resultSet.getDate("dateOfBirth");
                int baseSalary = resultSet.getInt("baseSalary");
                double comissionRate = resultSet.getDouble("comissionRate");
                String role = resultSet.getString("role");

                Employee employee;

                // Create appropriate employee type (Engineer or Finance)
                if (role.equalsIgnoreCase("Engineer")) {
                    employee = new Engineer(id, name, surname, dateOfBirth, baseSalary, comissionRate);
                } else if (role.equalsIgnoreCase("Finance")) {
                    employee = new Finance(id, name, surname, dateOfBirth, baseSalary, comissionRate);
                } else {
                    employee = new Employee(id, name, surname, dateOfBirth, baseSalary);
                }


                double calculatedSalary = 0;
                if (employee instanceof Engineer) {
                    calculatedSalary = ((Engineer) employee).setSalary();
                } else if (employee instanceof Finance) {
                    calculatedSalary = ((Finance) employee).setSalary();
                }

                // Update salary in database
                String updateSQL = "UPDATE employeedb SET salary = ? WHERE ID = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                    preparedStatement.setDouble(1, calculatedSalary);
                    preparedStatement.setInt(2, id);

                    int rowsUpdated = preparedStatement.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("Updated salary for employee ID: " + id + " salary: " + calculatedSalary);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
