import java.util.Scanner;

public class QuestionService {
    String selection[] = new String[5];
    Question[] questions = new Question[5];
    public QuestionService(){
        questions[0] = new Question(1, "size of int", "1", "2", "4", "8", "4");
        questions[1] = new Question(2, "size of boolean", "1", "2", "8", "4", "1");
        questions[2] = new Question(3, "size of char", "1", "2", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "1", "2", "4", "8", "8");
        questions[4] = new Question(5, "size of double", "1", "2", "4", "8", "8");
    }
    public void playquiz() {
        int i=0;
    for (Question q : questions){
        System.out.println("Question no:" + q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i++;
    }
    for (String s: selection){
        System.out.println(s);
    }
    }
    public void printscore(){
        int score = 0;
        for(int i=0; i<questions.length;i++){
        Question que = questions[i];
        String actualAnswer = que.getAnswer();
        String userAnswer = selection[i];
        if(actualAnswer.equals(userAnswer)){
            score++;
        }
        }
System.out.println("Your score is : " + score);
    }
}
