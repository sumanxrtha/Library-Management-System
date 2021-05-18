package Service;

import DBConnection.DBConnection;
import Model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {
    public Student getUser(String username, String password) {

        Student student = null;
        String query = "select * from student where studentUsername=? and studentPass=?";

        PreparedStatement pstm = new DBConnection().getStatement(query);

        try {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();
            System.out.println(username +" "+ password);
            while (rs.next()) {
                student = new Student();
                student.setStudentId(rs.getInt("studentId"));
                student.setStudentName(rs.getString("studentName"));
                student.setStudentMob(rs.getInt("studentMob"));
                student.setStudentEmail(rs.getString("studentEmail"));
                student.setStudentUsername(rs.getString("studentUsername"));
                student.setFaculty(rs.getString("faculty"));
                student.setStudentPass(rs.getString("studentPass"));
                student.setStudentRoll(rs.getInt("studentRoll"));
                student.setSemester(rs.getInt("semester"));
                student.setRegularBook(rs.getInt("regularBook"));
                student.setExtraBook(rs.getInt("extraBook"));
                student.setFine(rs.getInt("fine"));

                System.out.println(student.getStudentUsername() + " " + student.getStudentPass());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }
    public void insertStudent(Student student) {
        String query = "insert into student (studentName,studentMob,studentEmail,studentUsername,faculty,studentPass,studentRoll,semester,AdmissionDate)" +
                "values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            pstm.setString(1, student.getStudentName());
            pstm.setInt(2, student.getStudentMob());
            pstm.setString(3, student.getStudentEmail());
            pstm.setString(4, student.getStudentUsername());
            pstm.setString(5, student.getFaculty());
            pstm.setString(6, student.getStudentPass());
            pstm.setInt(7, student.getStudentRoll());
            pstm.setInt(8, student.getSemester());
            pstm.setString(9, student.getAdmissionDate());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
