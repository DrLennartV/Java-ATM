public class SecurityAccount extends BankAccount {

    public SecurityAccount(int accountID, int userId, double amount, Currency currency) {
        super(accountID, userId, Constants.ACCOUNT_TYPE_SECURITY, amount, currency);
    }

    @Override
    public boolean canClose() {
        return false;
    }
}
