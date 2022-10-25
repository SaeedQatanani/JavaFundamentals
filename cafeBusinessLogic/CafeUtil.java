import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10 ; i++){
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int numweeks) {
        int sum = 0;
        for (int i = 0; i <= numweeks ; i++){
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices) {
        double sum=0.0;
        for (double price : prices){
            sum += price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i+" "+menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers, String userName) {
        customers.add(userName);
    }
}