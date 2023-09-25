import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCredit = 0.0;
        double totalGrade = 0.0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] tokens = line.split(" ");
            double credit = Double.parseDouble(tokens[1]);
            String grade = tokens[2];

            if (!grade.equals("P")) { // P 등급 과목은 제외
                totalCredit += credit;
                totalGrade += calculateGradePoint(grade) * credit;
            }
        }

        double GPA = totalGrade / totalCredit;
        System.out.printf("%.6f\n", GPA);
    }

    private static double calculateGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }
}
