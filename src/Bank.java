public class Bank {
    private String name;
    private DBSystem db;

    public Bank(String name) {
        this.name = name;
        this.db = new DBSystem();
    }
}
