public class App {
    public static void main(String[] args) {
        Question question = new Question("Qual a cor do céu?", new Answer[] {new Answer("Azul", true, "a"), new Answer("Vermelho", false, "b")}); 
        
        System.out.println(question.getDescription());
        System.out.println(question.getAnswers()[0].getId() + ") " + question.getAnswers()[0].getContent());
        System.out.println(question.getAnswers()[1].getId() + ") " + question.getAnswers()[1].getContent());
        System.out.println(question.answerTheQuestion("a") ? "Acertou a questão!!!": "Errou a questão");
    }
}