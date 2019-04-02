package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee extends Account implements Transactable,Worker  {
   ;
    private Double workhour;
    private BankAccount bankAccount;
    private Double hourlyWage;


    public Employee() {
      this.bankAccount = bankAccount;
      workhour = 0.0;

    }

    public Employee(BankAccount bankAccount) {
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
      Employee employee = new Employee();
        workhour = employee.getHoursWorked() + numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.workhour;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.getHourlyWage() * this.getHoursWorked();
    }
}
