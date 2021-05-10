package Service;

import DBConnection.DBConnection;
import Model.Admin;
import Model.Librarian;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    public Admin getUser(String username, String password) {

        Admin admin = null;
        String query = "select * from admin where adminUsername=? and adminPass=?";

        PreparedStatement pstm = new DBConnection().getStatement(query);
        System.out.println(username + " " + password);
        try {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();
            System.out.println(username + " " + password);
            while (rs.next()) {
                admin = new Admin();
                admin.setAdminId(rs.getInt("adminId"));
                admin.setAdminName(rs.getString("adminName"));
                admin.setAdminMob(rs.getInt("adminMob"));
                admin.setAdminEmail(rs.getString("adminEmail"));
                admin.setAdminUsername(rs.getString("adminUsername"));
                admin.setAdminPass(rs.getString("adminPass"));


                System.out.println(admin.getAdminUsername() + " " + admin.getAdminPass());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return admin;
    }

    public void insertAdmin(Admin admin) {
        String query = "insert into admin (adminName,adminMob,adminEmail,adminUsername,adminPass)" +
                "values(?,?,?,?,?)";
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            pstm.setString(1, admin.getAdminName());
            pstm.setInt(2, admin.getAdminMob());
            pstm.setString(3, admin.getAdminEmail());
            pstm.setString(4, admin.getAdminUsername());
            pstm.setString(5, admin.getAdminPass());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int insertOnce() throws SQLException {
        String check = "select * from admin";
        PreparedStatement pst = new DBConnection().getStatement(check);
        ResultSet rs = pst.executeQuery();

        int id = 0;

        while(rs.next()){
            id = rs.getInt("adminId");
            System.out.println(id);

        }


        System.out.println(id);
        return id;

    }

    public void insertLibrarian(Librarian librarian) {
        String query = "insert into librarian (librarianName,librarianMob,librarianEmail,librarianUsername,librarianPass)" +
                "values(?,?,?,?,?)";
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            pstm.setString(1, librarian.getLibrarianName());
            pstm.setInt(2, librarian.getLibrarianMob());
            pstm.setString(3, librarian.getLibrarianEmail());
            pstm.setString(4, librarian.getLibrarianUsername());
            pstm.setString(5, librarian.getLibrarianPass());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
