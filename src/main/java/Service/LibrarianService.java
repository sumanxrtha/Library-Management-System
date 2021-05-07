package Service;

import DBConnection.DBConnection;
import Model.Librarian;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibrarianService {
    public Librarian getUser(String username, String password) {

        Librarian librarian = null;
        String query = "select * from librarian where librarianUsername=? and librarianPass=?";

        PreparedStatement pstm = new DBConnection().getStatement(query);

        try {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();
            System.out.println(username +" "+ password);
            while (rs.next()) {
                librarian = new Librarian();
                librarian.setLibrarianId(rs.getInt(" librarianId"));
                librarian.setLibrarianName(rs.getString(" librarianName"));
                librarian.setLibrarianMob(rs.getInt(" librarianMob"));
                librarian.setLibrarianEmail(rs.getString(" librarianEmail"));
                librarian.setLibrarianUsername(rs.getString(" librarianUsername"));
                librarian.setLibrarianPass(rs.getString(" librarianPass"));

                System.out.println(librarian.getLibrarianName() + " " + librarian.getLibrarianPass());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return librarian;
    }

}
