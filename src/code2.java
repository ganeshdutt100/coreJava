import java.util.*;

public class code2 {

   static String[] questions ={
            "What is the size of int in java?",
            "Which keyword is used to create a class?",
            "Which loop is used when we know number of iterations?"
    };
   static String[][] options= {
            {"A. 2byte " , "B. 4byte","C. 8byte","D. 16byte "},
            {"A. void " , "B.  public","C. class","D. static "},
            {"A. while " , "B. do-while","C. for","D. forEach "},
    };

   static char [] answers = {'B','C','C'};

    public static void playQuiz(){
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for(int i = 0; i <questions.length; i++){
            System.out.println("\nQ"+(i+1)+ " : " + questions[i]);

            for(String opt : options[i]){
                System.out.println(opt);
            }

            System.out.println("Your Answer (A/B/C/D)");
           char userAnswer = Character.toUpperCase(sc.next().charAt(0));

           if(userAnswer == answers[i]){
               System.out.println("Correct");
               score++;
           }
           else{
               System.out.println("Wrong");
            }
        }
        System.out.println("\n Your Score : " + score + "\n"+ questions.length);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to java QuizGame!");
      playQuiz();
    }
}

//1 -  quesiotn
// AFLDKL