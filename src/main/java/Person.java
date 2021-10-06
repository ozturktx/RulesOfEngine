public class Person {

    private int credit_score;
    private String state;
    private String name;

    public Person() {
        this.credit_score = 0;
        this.state = "unknown";
        this.name = "unknown";
    }

    public Person(int credit_score, String state, String name) {
        this.credit_score = credit_score;
        this.state = state;
        this.name = name;
    }

    public int getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(int credit_score) {
        this.credit_score = credit_score;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
