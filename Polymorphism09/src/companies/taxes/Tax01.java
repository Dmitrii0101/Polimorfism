package companies.taxes;

public class Tax01 extends TaxSystem {
        public int calcTaxFor(int debit,int credit){
            int tax=debit-(credit-debit)*15/100;
        return  Math.max (tax,0);
    }}


