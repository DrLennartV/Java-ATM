public class SavingAccount extends BankAccount {

    public SavingAccount(int accountID, int userId, double amount, Currency currency) {
        super(accountID, userId, Constants.ACCOUNT_TYPE_SAVING, amount, currency);
    }

    @Override
    public boolean canClose() {
        return false;
    }
}
