public class Main {
    public static void main(String[] args) {
        //Person person =new Person(720,"Florida","OZ");
        // Product product = new Product("7-1 ARM",5.0);
        Person person = new Person();
        Product product = new Product();
        Rules rules = new Rules();
        RulesEngine rulesEngine = new RulesEngine();

        Rules.LoadRules();
        RulesEngine.runRules(person, product, rules);
    }
}
