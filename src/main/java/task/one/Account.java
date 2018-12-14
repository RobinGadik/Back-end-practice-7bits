package task.one;

import java.util.UUID;

public class Account {
    private String id;
    private long balance;

    public Account(long balance) {
        id = UUID.randomUUID().toString();
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account id: %s with balance %s", id, balance);
    }
}