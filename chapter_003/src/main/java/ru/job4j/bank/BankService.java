package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }
    public User findByPassport(String passport) {
        User res = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                res = user;
                break;
            }
        }
            return res;
    }
    public Account findByRequisite(String passport, String requisites) {
        Account res = null;
        User user = findByPassport(passport);
        if (user != null) {
          for (Account account : users.get(user)) {
              if (account.getRequisite().equals(requisites)) {
                  res = account;
                  break;
              }
            }
        }
        return res;
    }
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dstRequisite);
        boolean res = false;
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            res = true;
        }
        return res;
    }
}
