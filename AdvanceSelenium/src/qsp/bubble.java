package qsp;

public class bubble 
{
public static void main(String[] args)
{
int []msd={10,6,12,3,2};
	for(int i=0;i<msd.length-1;i++)
	{
		for(int j=0;j<msd.length-1;i++)
		{
		if(msd[j]>msd[j+1])
		{
		int temp=msd[j];
		msd[j]=msd[j+1];
		msd[j+1]=temp;
	}
	
}
}
for(int i=0;i<msd.length-1;i++)
{
	System.out.println(msd[i]);
}
}
}