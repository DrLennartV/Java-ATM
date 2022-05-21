public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountID, int userId, double amount, Currency currency) {
        super(accountID, userId, Constants.ACCOUNT_TYPE_CHECKING, amount, currency);
    }

    @Override
    public boolean canClose() {
        return false;
    }
}
