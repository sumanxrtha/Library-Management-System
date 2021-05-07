package Service;

import DBConnection.DBConnection;
import Model.Staff;
import Model.Student;
import Model.Teacher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherService {
    public Teacher getUser(String username, String password) {

        Teacher teacher = null;
        String query = "select * from teacher where teacherUsername=? and teacherPass=?";

        PreparedStatement pstm = new DBConnection().getStatement(query);

        try {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();
            System.out.println(username +" "+ password);
            while (rs.next()) {
                teacher = new Teacher();
                teacher.setTeacherId(rs.getInt("teacherId"));
                teacher.setTeacherName(rs.getString("teacherName"));
                teacher.setTeacherMob(rs.getInt("teacherMob"));
                teacher.setTeacherEmail(rs.getString("teacherEmail"));
                teacher.setTeacherUsername(rs.getString("teacherUsername"));
                teacher.setFaculty(rs.getString("faculty"));
                teacher.setTeacherPass(rs.getString("teacherPass"));
                teacher.setTotalBook(rs.getInt("totalBook"));
                teacher.setFine(rs.getInt("fine"));

                System.out.println(teacher.getTeacherUsername() + " " + teacher.getTeacherPass());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teacher;
    }
    public void insertTeacher(Teacher teacher) {
        String query = "insert into teacher (teacherName,teacherMob,teacherEmail,teacherUsername,faculty,teacherPass)" +
                "values(?,?,?,?,?,?)";
        PreparedStatement pstm = new DBConnection().getStatement(query);
        try {
            pstm.setString(1, teacher.getTeacherName());
            pstm.setInt(2, teacher.getTeacherMob());
            pstm.setString(3, teacher.getTeacherEmail());
            pstm.setString(4, teacher.getTeacherUsername());
            pstm.setString(5, teacher.getFaculty());
            pstm.setString(6, teacher.getTeacherPass());

            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
