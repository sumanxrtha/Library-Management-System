package Model;

public class Teacher {
    private int teacherId;
    private String teacherUsername;
    private String teacherName;
    private int teacherMob;
    private String teacherEmail;
    private String faculty;
    private String teacherPass;
    private int totalBook;
    private int fine;

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherPass() {
        return teacherPass;
    }

    public void setTeacherPass(String teacherPass) {
        this.teacherPass = teacherPass;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherMob() {
        return teacherMob;
    }

    public void setTeacherMob(int teacherMob) {
        this.teacherMob = teacherMob;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public String getTeacherUsername() {
        return teacherUsername;
    }

    public void setTeacherUsername(String teacherUsername) {
        this.teacherUsername = teacherUsername;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
