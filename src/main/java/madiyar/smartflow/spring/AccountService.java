package madiyar.smartflow.spring;

import java.util.List;

public interface AccountService {
    void createAccount(Account account);
    void deposit(String accountId, double amount);
    void withdraw(String accountId, double amount);
    void transfer(String fromAccountId, String toAccountId, double amount);
    List<String> getTransactionHistory(String accountId);
}
