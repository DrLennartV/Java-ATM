public class ManagerFactory {

    public Manager GetManager(int UID, String name, String userName, String password){
        return new Manager(UID, name, userName, password);
    }
}
