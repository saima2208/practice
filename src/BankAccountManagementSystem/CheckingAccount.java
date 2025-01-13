package BankAccountManagementSystem;

public class CheckingAccount extends BankAccount {

    public CheckingAccount() {
        super();
    }

    @Override
    public void withdrawal(double amount) throws InsufficientFundsException {
        if (amount > getBalance()){
            throw new InsufficientFundsException("Insufficient Balance");
        }
        super.withdrawal(amount);
    }

    @Override
    public double calculatingInterest() {
        super.calculatingInterest();

        return getBalance() * getInterest();
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException{
        if (amount <= 0){
            throw new InvalidAmountException("Amount must be greater than 0");
        }
        super.deposit(amount);
    }
}
