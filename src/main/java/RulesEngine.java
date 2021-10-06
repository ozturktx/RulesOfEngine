import javax.xml.bind.SchemaOutputResolver;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RulesEngine {
    public static void runRules(Person p, Product pr, Rules rules) {
        int RuleCount = Rules.RulesData.size();
        for (int i = 0; i < RuleCount; i++) {
            String ruleName = Rules.RulesData.get(i).get("RuleName");
            p.setCredit_score((int) (Double.parseDouble(Rules.RulesData.get(i).get("CreditScore"))));
            p.setState(Rules.RulesData.get(i).get("State"));
            p.setName(Rules.RulesData.get(i).get("Name"));
            pr.setDecInterest_rate(Double.parseDouble(Rules.RulesData.get(i).get("Decrease_Interest_rate")));
            pr.setName(Rules.RulesData.get(i).get("ProductName"));
            switch (ruleName) {
                case "Rule1":
                    rules.Rule1(p, pr);
                    break;
                case "Rule2":
                    rules.Rule2(p, pr);
                    break;
                default:
                    System.out.println("Specify a valid Rule to get your rate");
            }
        }








     /*   Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        String str = sc.nextLine(); //reads string.
p.getCredit_score()=Integer.parseInt(Rules.RulesData.get(i).get("CreditScore"));
        Rules r = new Rules();
        int RuleCount = Rules.rules.length;

        for (int i = 0; i < RuleCount; i++) {
            switch (rules.rules[i]) {
                case "Rule1":
                    r.Rule1(p[i], pr[i]);
                    break;
                case "Rule2":
                    r.Rule2(p[i], pr[i]);
                    break;


            }
        }*/

    }
}