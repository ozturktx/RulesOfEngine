import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Rules {

    public static List<Map<String, String>> RulesData;

    public static void LoadRules() {
        String filePath = "./src/main/resources/RulesData.xlsx";
        ExcelUtils excelUtil = new ExcelUtils(filePath, "Sheet1");
        RulesData = excelUtil.getDataList();
    }


    //This is for Rule1 execution
    // Here is the details for Rule 1
   /* All products start at 5.0 interest_rate.
    If the person lives in Florida (condition), we do not offer the product to them and the product is
    to be disqualified (action).
    If the person has a credit score greater than or equal to 720(condition) then we reduce the
    interest_rate on the product by .3 (action that has an input of “.3”, remember the business may
    decide in the future they want to reduce it by .5).
    If the person has a credit score lower than 720 we increase the interest_rate on the product by .5.
    If the name of the product is “7-1 ARM” then we need to add .5 to the interest_rate of the
    product.*/
    public void Rule1(Person p, Product pr) {
        double Rate = 5.0;
        if (p.getState().equals("Florida")) {
            pr.setDisqualified(true);
            System.out.println(p.getName() + " is not qualified for a loan");
            return;
        } else if (p.getCredit_score() >= 720) {
            Rate -= pr.getDecInterest_rate();
        } else if (p.getCredit_score() < 720) {
            Rate += .5;
        }
        if (pr.getName().equals("7-1 ARM")) {
            Rate += .5;
        }
        System.out.println("Interest Rate for " + p.getName() + " is " + Rate);
    }

    //This is for Rule2 execution
    // Here is the details for Rule 2
   /* All products start at 3.0 interest_rate.
   If person has less than 600 credit score and lives anywhere but in texas we do not offer any loan
   If name of the product is TX and state is TX then offer .5 discount
   If the person has a credit score lower than 720 we increase the interest_rate on the product by .5.
   If the person has a credit score greater than or equal to 780 we decrease the rate by .2 but this is controlled by loan officer.   */
    public void Rule2(Person p, Product pr) {
        double Rate = 3.0;
        if (!p.getState().equals("Texas") && p.getCredit_score() < 600) {
            pr.setDisqualified(true);
            System.out.println(p.getName() + " is not qualified for a loan");
            return;
        } else if (p.getState().equals("Texas") && pr.getName().equals("TX")) {
            Rate -= .5;
        } else if (p.getCredit_score() < 720) {
            Rate += .5;
        } else if (p.getCredit_score() >= 780) {
            Rate -= pr.getDecInterest_rate();
        }
        System.out.println("Interest Rate for " + p.getName() + " is " + Rate);
    }

}


