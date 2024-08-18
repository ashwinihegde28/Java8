package org.example.Operators.DecisionMaking;

public class GradingSystem {
    public static void main(String[] args) {
        int score = 110;
        if(score < 0 || score > 100){
            System.out.println("Please enter positive score less than 100");
            return;
        }
        calculateGrade(score);
    }

    public static void calculateGrade(int score){
        switch (score/10){
            case 10:
            case 9:
                System.out.println("Grade A+");
                break;
            case 8:
                System.out.println("Grade A");
                break;

            case 7:
                System.out.println("Grade B");
                break;

            case 6:
                System.out.println("Grade B+");
                break;

            case 5:
                System.out.println("Grade C+ ");
                break;

            case 4:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Failed");
                break;



        }

    }
}
