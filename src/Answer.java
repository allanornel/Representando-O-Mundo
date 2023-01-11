public class Answer {
    private String content;
    private Boolean isCorrect;
    private String id;

    public Answer(){}

    public Answer(String content, Boolean isCorrect, String id) {
        this.content = content;
        this.isCorrect = isCorrect;
        this.id = id;
    }
    
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Boolean getIsCorrect() {
        return isCorrect;
    }
    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


}
