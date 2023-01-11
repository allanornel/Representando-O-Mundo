public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question();
        question.description = "Qual a cor do céu?";
        Answer answer1 = new Answer();
        answer1.content = "Azul";
        answer1.isCorrect = true;
        answer1.id = "a";
        Answer answer2 = new Answer();
        answer2.content = "Vermelho";
        answer2.isCorrect = false;
        answer2.id = "b";
        question.answers = new Answer[] {answer1, answer2};
        System.out.println(question.description);
        System.out.println(question.answers[0].id + ") " + question.answers[0].content);
        System.out.println(question.answers[1].id + ") " +question.answers[1].content);
        System.out.println(question.answerTheQuestion("a") ? "Acertou a questão!!!": "Errou a questão");
    }
}