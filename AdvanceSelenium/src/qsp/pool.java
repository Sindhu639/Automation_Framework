package qsp;

public class pool 
{
public static void main(String[] args)
{
	int no=6;
	int count=6;
	for(int i=1;i<=no;i++)
		if(no%i==0)
		{
			count++;
		}
	if(count==2)
	{
		System.out.println(no+"is a prime no");
	}
	else
	{
		System.out.println(no+"is not a prime no");
	}
		
}
}
