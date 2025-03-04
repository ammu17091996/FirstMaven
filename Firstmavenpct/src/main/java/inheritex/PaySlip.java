package inheritex;

public class PaySlip extends Calculate {
int a,b,c,d,total;
	public static void main(String[] args) {
		
			PaySlip c=new PaySlip();
			
			int basic=c.details();
			int a5=c.deduct();
			int a3=c.bonuss();
			int a1=c.hra(c.basic);
			int a2=c.pf(c.basic);
			
			System.out.println("HRA is"+a1);
			System.out.println("PF is"+a2);
int total=c.totalsalary(basic,a1,a2,a3);
System.out.println("====================PAY SLIP================");
System.out.println("Total Salary is="+total);
System.out.println("Basic Pay="+a1);
System.out.println("Deduction"+a5);
System.out.println("HRA"+a1);
System.out.println("PF"+a2);
System.out.println("Bonus"+a3);
System.out.println("HRA"+a1);
System.out.println("Total Salary By hand"+total);



	}
public int totalsalary(int a,int b,int c,int d)
{
	total=a+b-c-d;
	return total;

}
	}


