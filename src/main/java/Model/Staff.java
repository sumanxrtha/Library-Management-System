package Model;

public class Staff {
    private int staffId;
    private String staffUsername;
    private String staffName;
    private int staffMob;
    private String staffEmail;
    private String staffPass;
    private int totalBook;
    private int fine;

    public Staff() {
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public int getStaffMob() {
        return staffMob;
    }

    public void setStaffMob(int staffMob) {
        this.staffMob = staffMob;
    }

    public String getStaffPass() {
        return staffPass;
    }

    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass;
    }
}
