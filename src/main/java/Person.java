public class Person {

    int credit_score;
    String state;
    String name;

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


}
