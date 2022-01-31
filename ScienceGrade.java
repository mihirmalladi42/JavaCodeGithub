

public class ScienceGrade {
    double totalGradeScience;
    public ScienceGrade(double summative, double formative, String userName) {
        totalGradeScience = (summative * 0.8 + formative * 0.2);
        if (totalGradeScience <= 70) {
            System.out.println(userName + " failed this science class. His grade was " + totalGradeScience + "%.");
            System.out.println();
        } else {
            System.out.println(userName + " passed this science class! His grade was " + totalGradeScience + "%.");
            System.out.println();
        }
    }
}
