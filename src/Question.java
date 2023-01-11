public class Question {
    private String description;
    private Answer[] answers;

    public Question(){}

    public Question(String description, Answer[] answers) {
        this.description = description;
        this.answers = answers;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public boolean answerTheQuestion(String id){
        for (int i = 0; i < answers.length; i++) {
            Answer answer = getAnswers()[i];
            if(answer.getId().equals(id)){
                return answer.getIsCorrect();
            }
        }
        return false;
    }
}
