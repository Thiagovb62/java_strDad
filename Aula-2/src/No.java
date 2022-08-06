public class No {
    private String content;
    private No nextNo;

    public No(String content) {
        this.nextNo = null;
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public No getNextNo() {
        return nextNo;
    }
    public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }

    @Override
    public String toString() {
        return "No [content=" + content + "]";
    }
}
