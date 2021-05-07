package Service;

import DBConnection.DBConnection;
import Model.Staff;
import Model.Staff;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffService {
    public Staff getUser(String username, String password) {

        Staff staff = null;
        String query = "select * from staff where staffUsername=? and staffPass=?";

        PreparedStatement pstm = new DBConnection().getStatement(query);

        try {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();
            System.out.println(username +" "+ password);
            while (rs.next()) {
                staff = new Staff();
                staff.setStaffId(rs.getInt("staffId"));
                staff.setStaffName(rs.getString("staffName"));
                staff.setStaffMob(rs.getInt("staffMob"));
                staff.setStaffEmail(rs.getString("staffEmail"));
                staff.setStaffUsername(rs.getString("staffUsername"));
                staff.setStaffPass(rs.getString("staffPass"));
                staff.setTotalBook(rs.getInt("totalBook"));


                System.out.println(staff.getStaffUsername() + " " + staff.getStaffPass());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return staff;
    }
    public void insertStaff(Staff staff) {
        String query = "insert into staff (staffName,staffMob,staffEmail,staffUsername,staffPass)" +
                "values(?,?,?,?,?)";
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            pstm.setString(1, staff.getStaffName());
            pstm.setInt(2, staff.getStaffMob());
            pstm.setString(3, staff.getStaffEmail());
            pstm.setString(4, staff.getStaffUsername());
            pstm.setString(5, staff.getStaffPass());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
