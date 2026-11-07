import java.sql.*;

public class Medicine {

    int id;
    String name;
    double price;
    int quantity;

    public Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void register() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO medicine(name, price, quantity) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, quantity);

            ps.executeUpdate();

            System.out.println("Medicine Registered Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}