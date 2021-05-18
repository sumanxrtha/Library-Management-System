package Model;

import java.sql.Date;

public class Student {
    private int studentId;
    private String studentName;
    private int studentMob;
    private String studentEmail;
    private String studentUsername;
    private String faculty;
    private String studentPass;
    private int studentRoll;
    private int semester;
    private Date AdmissionDate;
    private String ad;
    private int regularBook;  //making 2 tables for it where keeping book id and student id
    private int extraBook;
    private int fine;

    public Student() {
    }

    public String getAdmissionDate() {
        return String.valueOf(AdmissionDate);
    }

    public void setAdmissionDate(Date admissionDate) {
        this.AdmissionDate = admissionDate;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMob() {
        return studentMob;
    }

    public void setStudentMob(int studentMob) {
        this.studentMob = studentMob;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getRegularBook() {
        return regularBook;
    }

    public void setRegularBook(int regularBook) {
        this.regularBook = regularBook;
    }

    public int getExtraBook() {
        return extraBook;
    }

    public void setExtraBook(int extraBook) {
        this.extraBook = extraBook;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
