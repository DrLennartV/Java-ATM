public class CustomerFactory {

    public Customer GetCustomer(int UID, String name, String userName, String password){
        return new Customer(UID, name, userName, password);
    }
}
