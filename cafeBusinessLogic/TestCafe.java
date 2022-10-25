import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe{
    public static void main(String[] args){
        CafeUtil appTest = new CafeUtil();
        
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
        System.out.printf("Purchases needed by week 15: %s \n\n", appTest.getStreakGoal(15));
        
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);
    
        ArrayList<String> customers = new ArrayList<String>();
        System.out.println("\n----- Add Customer Test-----");
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPlease enter your name:");
            String userName = System.console().readLine();
            System.out.println(String.format("Hello, %s!", userName));
            int peopleAhead = customers.size();
            System.out.println(String.format("There are %d people in front of you", peopleAhead));
            appTest.addCustomer(customers, userName);
            System.out.println("\n");
        }
    }
}