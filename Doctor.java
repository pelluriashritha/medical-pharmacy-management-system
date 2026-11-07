import java.sql.Connection;
import java.sql.PreparedStatement;

public class Doctor {

    int doctorId;
    String name;
    String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    void register() {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO doctor (name, specialization) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, specialization);

            ps.executeUpdate();

            System.out.println("Doctor Registered Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}