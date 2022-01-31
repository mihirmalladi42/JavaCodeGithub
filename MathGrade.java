

    public class MathGrade {
        double totalGradeMath;
        public MathGrade(double summative, double formative, String userName) {
            totalGradeMath = (summative * 0.8 + formative * 0.2);
            if (totalGradeMath <= 70) {
                System.out.println(userName + " failed this math class. His grade was " + totalGradeMath + "%.");
                System.out.println();
            } else {
                System.out.println(userName + " passed this math class! His grade was " + totalGradeMath + "%.");
                System.out.println();
            }
        }
    }

