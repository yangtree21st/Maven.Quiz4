package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {


    private ArrayList<BankAccount> accounts;
    
    public Bank(){
        accounts = new ArrayList<BankAccount>();
    }

    public Bank(ArrayList accounts){
        this.accounts = accounts;
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {

         accounts.remove(indexNumber);
        return accounts.get(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);

    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
       // throw new UnsupportedOperationException("Method not yet implemented");
        return accounts.contains(bankAccount);
    }


}
