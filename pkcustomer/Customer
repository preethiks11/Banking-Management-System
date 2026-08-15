package pkbanking1.pkcustomer;
import pkbanking1.pkaccount.sb.*;
import pkbanking1.pkaccount.fd.*;
import java.util.*;
public class Customer
{
int cust_id;
String name,address;
SBAccount sb;
FDAccount fd;
double amount;
int period;
static int sb_accnum=543210;
static int fd_accnum=876540;
Scanner sc=new Scanner(System.in);

public Customer()
{
cust_id=0;
name=null;
address=null;
}

public Customer(int cust_id,String name, String address)
{
this.cust_id=cust_id;
this.name=name;
this.address=address;
}

public void createAccount(int type)
{
if(type==1)
{
System.out.println("Enter initial amount:");
amount=sc.nextDouble();
sb=new SBAccount(sb_accnum++,amount);

}
else if(type==2)
{
System.out.println("Enter deposit amount:");
amount=sc.nextDouble();
System.out.println("Enter period:");
period=sc.nextInt();
fd=new FDAccount(fd_accnum++,period,amount);
}
else
System.out.println("Invalid type");
}


public void transaction(int type)
{
if(type==1)
{
System.out.println("Enter amount to deposit:");
 amount=sc.nextDouble();
sb.deposit( amount);
}
else if(type==2)
{
System.out.println("Enter amount to withdraw:");
 amount=sc.nextDouble();
sb.withdraw(amount);

}
else if(type==3)
sb.calc_interest();
else if(type==4)
fd.close();
else 
System.out.println("Invalid Choice");
}
}

