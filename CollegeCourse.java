public class CollegeCourse {
    protected String department;
    protected int courseNumber;
    protected int credits;
    protected float fee;

    public CollegeCourse(String department, int courseNumber, int credits) {
        final float CREDIT_COST = 120;
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = CREDIT_COST * credits;
    }

    void displayCollegeCourse() {
        System.out.printf("Department: %s\nCourse Number: %d\nCredits: %d\nFee: %,.2f",
                department, courseNumber, credits, fee);
    }
}
