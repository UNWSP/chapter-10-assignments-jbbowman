import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> labDepartments = new ArrayList<>(List.of("BIO", "CHM", "CIS", "PHY"));

        System.out.print("Enter the department: ");
        String department = scanner.nextLine();
        System.out.print("Enter the course number: ");
        int courseNumber = scanner.nextInt();
        System.out.print("Enter the number of credits: ");
        int credits = scanner.nextInt();

        CollegeCourse course1 = (labDepartments.contains(department))?
                new LabCourse(department, courseNumber, credits) : new CollegeCourse(department, courseNumber, credits);
        course1.displayCollegeCourse();
    }
}
