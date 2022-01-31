

public class EnglishGrade {
    double totalGradeELA;
    public EnglishGrade(double summative, double formative, String userName) {
        totalGradeELA = (summative * 0.8 + formative * 0.2);
        if (totalGradeELA <= 70) {
            System.out.println(userName + " failed this english class. His grade was " + totalGradeELA + "%.");
            System.out.println();
        } else {
            System.out.println(userName + " passed this english class! His grade was " + totalGradeELA + "%.");
            System.out.println();
        }
    }
}
