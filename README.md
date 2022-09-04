ATM Project

###Bonus:
1.Design Pattern - Factory Pattern

###Description of ood classes:

ATM.java: A ATM object. It serves as a bridge between Database and GUI. It handle data passed in by GUI and send it to database
for verification/action then pass the verification result/action result back to GUI.

Bank.java:A Bank object where has a Bank Database.

BankAccount.java:A BankAccount object. It is super class of CheckingAccount,SavingAccount and SecurityAccount. It stores basic
information of a bank account.

CheckingAccount.java: A CheckingAccount object. It is the subclass of BankAccount.

Constants.java:A Constants object. It keeps all the constant static variables in the program.

Currency.java:A Currency object. It keeps track of exchange rate and currency code of a single currency.

CurrencyList.java: A CurrencyList object. It keeps all the currency codes and exchange rates.

Customer.java:A Customer object. It is a subclass of User class. Customer has multiple bank accounts.

CustomerFactory.java: A CustomerFactory object. It encapsulate the creation of Customer.

Helper.java:A Helper object. It helps with the execution of the program.

Loan.java:A Loan object. It contains specific details on a single Loan.

Main.java:A Main object. It starts the whole program.

Manager.java:A Manager object. It is a subclass of User class. The Manager can apply interest on both loans and deposits.

ManagerFactory.java: A ManagerFactory object. It encapsulates the creation of Manager.

SavingAccount.java: A SavingAccount object. It is a subclass of BankAccount class.

SecurityAccount.java: A SecurityAccount object. Users can create an security account when they have enough balance in their
account.

Stock.java: A Stock object. It contains all the info about a specific stock.

Transaction.java: A Transaction object. It contains all the info about a specific transaction.

User.java: A User object. It is the super class of Manager and Customer class. It contains basic info about a user.

WindowsSetter.java: A WindowSetter object. It contains helper functions for windows setting.

###Description of GUI classes:

AccountWindow File: AccountWindow File contains AccountWindow class and form. It generates a window to create accounts.

CreateAccountDialog File: CreateAccountDialog File contains CreateAccountDialog class and form. It prompts an window for users
to choose the type of account and balance they want to setup.

CustomerWindow File:CustomerWindow File contains CustomerWindow class and form. It prompts a window for users to choose the desired
information they want. Information contains Account, Transaction, Stock, Loan.

DepositDialog File:DepositDialog File contains DepositDialog class and form. It prompts a window for users to enter the
amount of deposit.

LoansWindow File: LoansWindow File contains LoansWindow class and form. It prompts a window which has a request loan button and
the rules for requesting a loan.

LoginWindow File: LoginWindow File contains LoginWindow class nad form. It prompts a window for both customers and managers to login.

ManagerWindow File: ManagerWindow File contains ManagerWindow class and form. It prompts detailed information of all the users to
the manager.

MonitorWindow File: MonitorWindow File contains MonitorWindow class and form. It prompts detailed information of Daily report/
account/loans

PayLoanDialog File: PayLoanDialog File contains PayLoanDialog class and form. It prompts a window for users to enter the amount of
loan they pay.

RequestLoanDialog File: RequestLoanDialog File contains RequestLoanDialog class and form. It prompts a window for users to take
out loan.

SignupWindow File: SignupWindow File contains SignupWindow class and form. It prompts a window for users to sign up an account in
the bank.

TransactionWindow File: TransactionWindow File contains TransactionWindow class and form. It prompts a window for users to start
a transaction.

TransferDialog File: TransferDialog File contains TransferDialog class and form. It prompts a window for users to transfer money
to a specific account.

WithdrawDialog File: WithdrawDialog File contains WithdrawDialog class and form. It prompts a window for users to enter the amount
they want to withdraw.

###Description of Database classes

DBSystem.java: A DBSystem object. It provides database support for the ATM program. Any changes made by users are reflected on the database. 
Therefore, everything is traceable and well recorded for ATM project.

