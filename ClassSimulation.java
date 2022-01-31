import javax.swing.*;
public class ClassSimulation {
     // Lines 4 to 19 sets the image code and information
    JFrame frame;
    JLabel displayField;
    ImageIcon image;
    public ClassSimulation() {
        frame = new JFrame("o p e n  y o u r  g r a d e s  i n  a  s i m p l e  j a v a  s i m u l a t i o n");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            image = new ImageIcon(getClass().getResource("e.png"));
            displayField = new JLabel(image);
            frame.add(displayField);
        } catch(Exception e){
            System.out.println("the image didnt load so you have nothing else to see bye");
        }
        frame.setSize(1800, 750);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Lines 23 to 44 print the grades
        
        ScienceGrade studentScience1 = new ScienceGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Mihir");
        MathGrade studentMath1 = new MathGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Mihir");
        SocialStudiesGrade studentSS1 = new SocialStudiesGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Mihir");
        EnglishGrade studentELA1 = new EnglishGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Mihir");
        InstrumentPlayed studentBand1 = new InstrumentPlayed((int)Math.round(Math.random()*8), "Mihir");

        System.out.println();
        System.out.println();
        System.out.println();

        ScienceGrade studentScience2 = new ScienceGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Om");
        MathGrade studentMath2 = new MathGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Om");
        SocialStudiesGrade studentSS2 = new SocialStudiesGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Om");
        EnglishGrade studentELA2 = new EnglishGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Om");
        InstrumentPlayed studentBand2 = new InstrumentPlayed((int)Math.round(Math.random()*8), "Om");

        System.out.println();
        System.out.println();
        System.out.println();

        ScienceGrade studentScience3 = new ScienceGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Advay");
        MathGrade studentMath3 = new MathGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Advay");
        SocialStudiesGrade studentSS3 = new SocialStudiesGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Advay");
        EnglishGrade studentELA3 = new EnglishGrade((int)(Math.round(Math.random()*85)+15), (int)(Math.round(Math.random()*60)+40), "Advay");
        InstrumentPlayed studentBand3 = new InstrumentPlayed((int)Math.round(Math.random()*8), "Advay");
        
        //The line below shows the image

        ClassSimulation i = new ClassSimulation();
    }
}
