package User;

public class Admin extends User {
    String staffNo = "bhu/staff/1864";
    void uploadResults(String course, float score) {
        if (!staffNo.equals("")) {
            System.out.println(course + " " + score);
        } else {
            System.out.println("Enter a staff no");
        }
    }
}
