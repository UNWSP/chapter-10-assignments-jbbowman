public class LabCourse extends CollegeCourse {
    public LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits);
        this.fee += 50;
    }

    void displayCollegeCourse() {
        System.out.printf("NOTE: This is a lab course\nDepartment: %s\nCourse Number: %d\nCredits: %d\nFee: %,.2f",
                department, courseNumber, credits, fee);
    }
}
