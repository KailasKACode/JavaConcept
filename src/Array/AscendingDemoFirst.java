package Array;

public class AscendingDemoFirst {
	public static void main(String[] args) {
		int a[]= {4,10,5,8,2};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Ascending order: "+a[i]);
		}
	}
	

}
