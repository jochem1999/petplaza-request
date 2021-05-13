package fontys.fhict.request.dto;

public class Requestdto {

    private long breederIdValue;
    private String emailValue;
    private String topicValue;
    private String messageValue;
    private String nameValue;

    public Requestdto(){
        
    }

    public long getBreederIdValue() {
        return breederIdValue;
    }

    public void setBreederIdValue(long breederIdValue) {
        this.breederIdValue = breederIdValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getTopicValue() {
        return topicValue;
    }

    public void setTopicValue(String topicValue) {
        this.topicValue = topicValue;
    }

    public String getMessageValue() {
        return messageValue;
    }

    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }
}
