import java.sql.Connection;
import java.sql.PreparedStatement;

public class Patient extends Person {

    private String phone;
    private String patientName;
    private int patientAge;

    public Patient(String name, int age, String phone) {
        super(name, age);
        this.patientName = name;
        this.patientAge = age;
        this.phone = phone;
    }

    public void register() {
        String sql = "INSERT INTO patient(name, age, phone) VALUES (?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, patientName);
            ps.setInt(2, patientAge);
            ps.setString(3, phone);

            ps.executeUpdate();
            System.out.println("Patient Registered Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}