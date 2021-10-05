public class Main {
    public static void main(String[] args) {
        //Person person =new Person(720,"Florida","OZ");
       // Product product = new Product("7-1 ARM",5.0);

        RulesEngine rulesEngine=new RulesEngine();
       // System.out.println("Here is the result:"+rulesEngine.runRules(new Person(720,"Florida","OZ"),new Product("7-1 ARM",5.0)));
      //  System.out.println("Here is the result:"+rulesEngine.runRules(new Person(720,"Texas","OZ1"),new Product("abc",5.0)));
       // System.out.println("Here is the result:"+rulesEngine.runRules(new Person(710,"Texas","OZ2"),new Product("abc",5.0)));
Rules.LoadRules();
RulesEngine.runRules();
    }
}
