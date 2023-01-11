public class Question {
    String description;
    Answer[] answers;

    public boolean answerTheQuestion(String id){
        for (int i = 0; i < answers.length; i++) {
            if(answers[i].id.equals(id)){
                return answers[i].isCorrect;
            }
        }
        return false;
    }
}
