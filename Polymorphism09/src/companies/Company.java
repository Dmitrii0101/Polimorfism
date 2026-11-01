package companies;
import companies.taxes.TaxSystem;
public class Company {
    private String tytle; // название
   private int debit;// доходы
    private int credit;
    private TaxSystem taxSystem;

    // расходы
    public Company(String tytle, TaxSystem taxSystem) {
        this.tytle=tytle;
        this.taxSystem=taxSystem;
    }

public void shiftMoney(int amount) {
    if (amount>0 ){
        debit+=amount;
    }else{
        credit+=Math.abs(amount);
        credit += -amount;
        credit -= amount;
    }}


    public void setTaxSystem (TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }


public void payTaxes (){
   int tax=taxSystem.calcTaxFor(debit, credit);
   System.out.printf("Компания %s заплатила налог  в размере: %d cумма в рублях  руб.\n", tytle, tax);
        int debit=0;
        int credit=0;

}}






