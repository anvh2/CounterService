package Entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    private String user_id;

    @Column
    private long balance;

    public Account(){

    }

    public Account(String user_id, long balance){
        this.user_id = user_id;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }
}
