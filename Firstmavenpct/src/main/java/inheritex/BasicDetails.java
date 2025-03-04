package inheritex;

import java.util.Scanner;

public class BasicDetails 
{
	int basic,deduction,bonus;
public int details()
{
	System.out.println("ENter the basic pay");
	Scanner s=new Scanner(System.in);
	basic=s.nextInt();
return basic;
}
public int deduct ()
{
	System.out.println("ENter the deduction");
	Scanner s=new Scanner(System.in);
	deduction=s.nextInt();
return deduction;
}
public int bonuss()
{
	System.out.println("ENter the bonus");
	Scanner s=new Scanner(System.in);
	bonus=s.nextInt();
return bonus;
}
}
