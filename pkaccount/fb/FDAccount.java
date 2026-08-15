package pkbanking1.pkaccount.fd;

import pkbanking1.pkaccount.Account;
import pkbanking1.pkinterface.*;
public class FDAccount extends Account implements InterestRate
{
int period;
public FDAccount()
{
super();
period=0;

}
public FDAccount(int accno, int period, double amount)
{
super(accno, amount);
this.period=period;
}

public double calc_interest()
{
System.out.println("Balance:"+balance);
double interest=balance*period*fdrate/(12*100);
balance=balance+interest;
System.out.println("New Balance:"+balance);
return interest;
}
public void close()
{
balance=balance+calc_interest();
System.out.println("Maturity amount:"+balance);
System.out.println("Your FD Account is Closed");
}

}



