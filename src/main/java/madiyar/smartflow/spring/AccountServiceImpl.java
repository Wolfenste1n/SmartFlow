package madiyar.smartflow.spring;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public void createAccount(Account account) {

    }

    @Override
    public void deposit(String accountId, double amount) {

    }

    @Override
    public void withdraw(String accountId, double amount) {

    }

    @Override
    public void transfer(String fromAccountId, String toAccountId, double amount) {

    }

    @Override
    public List<String> getTransactionHistory(String accountId) {
       return List.of();
    }
}
