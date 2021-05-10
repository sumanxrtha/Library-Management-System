package Service;

import DBConnection.DBConnection;
import Model.*;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CommonService {
    public List<Admin> getAdminList() {
        List<Admin> userList = new ArrayList<>();
        String query = "select * from admin";
        System.out.println(query);
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Admin user = new Admin();

                user.setAdminId(rs.getInt("adminId"));
                user.setAdminName(rs.getString("adminName"));
                user.setAdminUsername(rs.getString("adminUsername"));
                user.setAdminEmail(rs.getString("adminEmail"));
                user.setAdminMob(rs.getInt("adminMob"));
                user.setAdminPass(rs.getString("adminPass"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    public List<Librarian> getLibrarianList() {
        List<Librarian> userList = new ArrayList<>();
        String query = "select * from librarian";
        System.out.println(query);
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Librarian user = new Librarian();

                user.setLibrarianId(rs.getInt("librarianId"));
                user.setLibrarianName(rs.getString("librarianName"));
                user.setLibrarianUsername(rs.getString("librarianUsername"));
                user.setLibrarianEmail(rs.getString("librarianEmail"));
                user.setLibrarianMob(rs.getInt("librarianMob"));
                user.setLibrarianPass(rs.getString("librarianPass"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    public List<Student> getStudentList() {
        List<Student> userList = new ArrayList<>();
        String query = "select * from student";
        System.out.println(query);
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Student user = new Student();

                user.setStudentId(rs.getInt("studentId"));
                user.setStudentName(rs.getString("studentName"));
                user.setStudentUsername(rs.getString("studentUsername"));
                user.setStudentEmail(rs.getString("studentEmail"));
                user.setStudentMob(rs.getInt("studentMob"));
                user.setFaculty(rs.getString("faculty"));
                user.setStudentRoll(rs.getInt("studentRoll"));
                user.setSemester(rs.getInt("semester"));
                user.setAdmissionDate(rs.getDate("AdmissionDate"));

//                Date dat = rs.getDate("AdmissionDate"));
//                String date = String.valueOf(dat);
//                user.setAdmissionDate(date);

//                System.out.println(user.getAdmissionDate());

//                java.sql.Date adDate=null;
//                try {
//                    java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(rs.getDate("AdmissionDate")));
//                    System.out.println(date);
//                    adDate = new java.sql.Date(date.getTime());
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(adDate);
//               user.setAdmissionDate(adDate);

                user.setRegularBook(rs.getInt("regularBook"));
                user.setExtraBook(rs.getInt("extraBook"));
                user.setFine(rs.getInt("fine"));
                user.setStudentPass(rs.getString("studentPass"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    public List<Staff> getStaffList() {
        List<Staff> userList = new ArrayList<>();
        String query = "select * from staff";
        System.out.println(query);
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Staff user = new Staff();

                user.setStaffId(rs.getInt("staffId"));
                user.setStaffName(rs.getString("staffName"));
                user.setStaffUsername(rs.getString("staffUsername"));
                user.setStaffEmail(rs.getString("staffEmail"));
                user.setStaffMob(rs.getInt("staffMob"));
                user.setStaffPass(rs.getString("staffPass"));
                user.setTotalBook(rs.getInt("totalBook"));
                user.setFine(rs.getInt("fine"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    public List<Teacher> getTeacherList() {
        List<Teacher> userList = new ArrayList<>();
        String query = "select * from teacher";
        System.out.println(query);
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Teacher user = new Teacher();

                user.setTeacherId(rs.getInt("teacherId"));
                user.setTeacherName(rs.getString("teacherName"));
                user.setTeacherUsername(rs.getString("teacherUsername"));
                user.setTeacherEmail(rs.getString("teacherEmail"));
                user.setTeacherMob(rs.getInt("teacherMob"));
                user.setFaculty(rs.getString("faculty"));
                user.setTeacherPass(rs.getString("teacherPass"));
                user.setTotalBook(rs.getInt("totalBook"));
                user.setFine(rs.getInt("fine"));

                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
    public List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();
        String query = "select * from book";
        System.out.println(query);
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Book book = new Book();

                book.setBookId(rs.getInt("bookId"));
                book.setBookName(rs.getString("bookName"));
                book.setEdition(rs.getInt("edition"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getInt("price"));
                book.setQuantity(rs.getInt("quantity"));



                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookList;
    }

}
