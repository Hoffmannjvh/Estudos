package br.com.javainsider.exceptions.account;

public class AccountService {

    public void createAndWhithdraw(String accountNumber, double amount) throws ServiceException {
        Account3 account = new Account3(accountNumber);
        account.deposit(1000);


        try {
            account.withdraw(amount);

        } catch (InsufficientFundsException e) {
            throw new ServiceException("Error during withdraw", e);

        }

    }

}
