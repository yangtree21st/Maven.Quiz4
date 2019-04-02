package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Account extends BankAccount implements Transactable {


    Long id;
    Double balance;

    public Account(){
        this.id=id;
         Double balance = super.balance;

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id= id;
    }

    public void setbalance(Double val){
        super.setBalance(val);
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        Account account = new Account();
         balance = account.getBalance() + amountToIncreaseBy;
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        Account account = new Account();
        balance = account.getBalance() - amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
