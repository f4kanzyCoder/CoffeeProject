public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckServer customerCheckServer;

    public StarbucksCustomerManager(CustomerCheckServer customerCheckServer) {
        this.customerCheckServer = customerCheckServer;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckServer.checkIfRealPerson(customer)) {
            System.out.println("Veritabanina kayit edildi."+customer);
            save(customer);
        } else {
            System.out.println("Girilen bilgiler hatali");
        }

    }

}
