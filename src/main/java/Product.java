public class Product {
    private String name;
    private boolean disqualified;
    private double decInterest_rate;

    public Product() {
    }

    public Product(String name, double interest_rate) {
        this.name = name;
        this.decInterest_rate = interest_rate;
    }

    public double getDecInterest_rate() {
        return decInterest_rate;
    }

    public void setDecInterest_rate(double decInterest_rate) {
        this.decInterest_rate = decInterest_rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisqualified() {
        return disqualified;
    }

    public void setDisqualified(boolean disqualified) {
        this.disqualified = disqualified;
    }
}
