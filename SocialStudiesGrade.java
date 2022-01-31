

public class SocialStudiesGrade {
    double totalGradeSocialStudies;
    public SocialStudiesGrade(double summative, double formative, String userName) {
        totalGradeSocialStudies = (summative * 0.8 + formative * 0.2);
        if (totalGradeSocialStudies <= 70) {
            System.out.println(userName +" failed this social studies class. His grade was " + totalGradeSocialStudies + "%.");
            System.out.println();
        } else {
            System.out.println(userName + " passed this social studies class! His grade was " + totalGradeSocialStudies + "%.");
            System.out.println();
        }
    }
}
