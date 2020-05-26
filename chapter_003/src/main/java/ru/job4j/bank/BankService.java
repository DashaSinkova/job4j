package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (accounts.stream().noneMatch(el -> el.equals(account))) {
                accounts.add(account);
            }
        }
    }
    public User findByPassport(String passport) {
        User res = null;
            Optional<User> user = users.entrySet().stream().map(Map.Entry::getKey).filter(el -> el.getPassport().equals(passport)).findAny();
            if (user.isPresent()) {
                res = user.get();
            }
            return res;
    }
    public Account findByRequisite(String passport, String requisites) {
        Account res = null;
        User user = findByPassport(passport);
        if (user != null) {
//            res = users.entrySet().stream().map(Map.Entry::getValue).flatMap(Collection::stream).filter(el -> el.getRequisite().equals(requisites)).findAny().get();
            res = users.entrySet().stream().filter(el -> el.getKey().equals(user)).map(Map.Entry::getValue).flatMap(Collection::stream).filter(el -> el.getRequisite().equals(requisites)).findAny().get();
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