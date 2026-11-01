import companies.Company;
import companies.taxes.Tax01;
import companies.taxes.Tax02;

public class Main {
    public static void main(String[] args) {
Company company = new Company("Рога и копыта", new Tax01());
company.shiftMoney(440);
company.shiftMoney(300);
company.payTaxes();

company.setTaxSystem(new Tax02());
        company.shiftMoney(400);
        company.shiftMoney(-300);
        company.payTaxes();
    }}

