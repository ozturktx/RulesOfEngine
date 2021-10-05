import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RulesEngine {
    public static void runRules(Person p[], Product pr[], Rules rules) {

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        String str = sc.nextLine(); //reads string.

        Rules r = new Rules();
        int RuleCount = rules.rules.length;

        for (int i = 0; i < RuleCount; i++) {
            switch (rules.rules[i]) {
                case "Rule1":
                    r.Rule1(p[i], pr[i]);
                    break;
                case "Rule2":
                    r.Rule2(p[i], pr[i]);
                    break;


            }
        }

    }
}