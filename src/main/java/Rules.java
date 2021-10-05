import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Rules {

public static String rules[];
    public static Object LoadRules()
    {
        String filePath = "./src/main/resources/RulesData.xlsx";
        ExcelUtils excelUtil = new ExcelUtils(filePath,"Sheet1");
        List<Map<String,String>> RulesData = excelUtil.getDataList();
        for (Map<String,String> s:RulesData) {
            System.out.println(s);
        }
        int rulesDataCount=RulesData.size();
        Person person[]= new Person[]{};
        Product product[]= new Product[]{};

        for (int i=0;i<rulesDataCount;i++)
        {
            rules[i]=RulesData.get(i).get("Rules");
            person[i]= new Person(Integer.parseInt(RulesData.get(i).get("CreditScore")),RulesData.get(i).get("State"),"Name");
            product[i]= new Product(RulesData.get(i).get("ProductName"),Double.parseDouble(RulesData.get(i).get("interest_rate")));
        }
    return person;
    }


    //This is for Rule1 execution Here is the details for Rule 1
   /* All products start at 5.0 interest_rate.
    If the person lives in Florida (condition), we do not offer the product to them and the product is
    to be disqualified (action).
    If the person has a credit score greater than or equal to 720(condition) then we reduce the
    interest_rate on the product by .3 (action that has an input of “.3”, remember the business may
    decide in the future they want to reduce it by .5).
    If the person has a credit score lower than 720 we increase the interest_rate on the product by .5.
    If the name of the product is “7-1 ARM” then we need to add .5 to the interest_rate of the
    product.*/
    public String Rule1(Person p, Product pr)
    {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.

        if (p.state == "Florida") {
            return p.name + " is not qualified for a loan";
        } else if (p.credit_score >= 720) {
            pr.interest_rate -= .3;
            System.out.print("Default interest decrease rate is '.3' Please Enter a number if you like to change that: ");
            double newRate = sc.nextDouble(); //reads string.
            if (newRate != .3) {
                pr.interest_rate -= newRate;
            }
        } else if (p.credit_score < 720) {
            pr.interest_rate += .5;
        }
        if (pr.name == "7-1 ARM") {
            pr.interest_rate += .5;
        }
        return "Interest Rate for " + pr.name + " is " + pr.interest_rate;
    }
    //This is for Rule1 execution Here is the details for Rule 1
   /* All products start at 5.0 interest_rate.
    If the person lives in Florida (condition), we do not offer the product to them and the product is
    to be disqualified (action).
    If the person has a credit score greater than or equal to 720(condition) then we reduce the
    interest_rate on the product by .3 (action that has an input of “.3”, remember the business may
    decide in the future they want to reduce it by .5).
    If the person has a credit score lower than 720 we increase the interest_rate on the product by .5.
    If the name of the product is “7-1 ARM” then we need to add .5 to the interest_rate of the
    product.*/
    public String Rule2(Person p, Product pr)
    {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.

        if (p.state == "Florida") {
            return p.name + " is not qualified for a loan";
        } else if (p.credit_score >= 720) {
            pr.interest_rate -= .3;
            System.out.print("Default interest decrease rate is '.3' Please Enter a number if you like to change that: ");
            double newRate = sc.nextDouble(); //reads string.
            if (newRate != .3) {
                pr.interest_rate -= newRate;
            }
        } else if (p.credit_score < 720) {
            pr.interest_rate += .5;
        }
        if (pr.name == "7-1 ARM") {
            pr.interest_rate += .5;
        }
        return "Interest Rate for " + pr.name + " is " + pr.interest_rate;
    }

}


