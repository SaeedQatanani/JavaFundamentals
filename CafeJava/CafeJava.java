public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 5.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String costomer3 = "Jimmy";
        String costomer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage);
        System.out.println(costomer4 + (isReadyOrder4 ? readyMessage : pendingMessage));
        System.out.println(isReadyOrder4 ? displayTotalMessage + cappuccinoPrice : pendingMessage);
        System.out.println(customer2 + displayTotalMessage + (2*lattePrice));
        System.out.println(customer2 + (isReadyOrder2 ? readyMessage : pendingMessage));
        System.out.println(costomer3 + displayTotalMessage + (lattePrice - mochaPrice));

        // ** Your customer interaction print statements will go here ** //
    }
}
