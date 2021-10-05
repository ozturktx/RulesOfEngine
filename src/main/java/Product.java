public class Product {
    String name;

    public boolean isDisqualified() {
        return disqualified;
    }

    public void setDisqualified(boolean disqualified) {
        this.disqualified = disqualified;
    }

    private boolean disqualified;
    double interest_rate;

    public Product(String name, double interest_rate) {
        this.name = name;
        this.disqualified = disqualified;
        this.interest_rate = interest_rate;
    }
}
