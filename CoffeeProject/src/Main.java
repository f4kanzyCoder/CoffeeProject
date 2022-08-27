public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(1, "Muhammed", "Sengul", 1996, "19071907190"));

    }
}
