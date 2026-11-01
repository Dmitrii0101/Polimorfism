
   package companies.taxes;
   public  class Tax02 extends TaxSystem {
public int calcTaxFor(int debit,int credit){
    int tax=debit-debit*6/100;
        return  Math.max (tax,0);
    }
}



