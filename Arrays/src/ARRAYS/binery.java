package ARRAYS;

public class binery {

	public static void main(String[] args) 
	{
		 int[] n=new int[] {2,4,1,44,66,33,99};
		 int search=33;
		 int i,j;
		 System.out.println("\n ascendig oder elements are:");
		 for(i=0;i<n.length;i++)
		 {
			 
			 for(j=i+1;j<n.length;j++)
			 {
				 if(n[i]>n[j])
				 {
					 n[i]=n[i]^n[j];
					 n[j]=n[i]^n[j];
					 n[i]=n[i]^n[j];
				 }
			 }
			 System.out.print(" "+n[i]);
		 }
		
		 int low=0;//
		 int high=n.length-1;//
		 int mid=(low+high)/2;//
		 while(low<=high)//
		 {
			 if(n[mid]<search)
			 {
				 low=mid+1;//
			 }
			 else if(n[mid]>search)
			 {
				 high=mid-1;
			 }
			 else if(n[mid]==search)
			 {
				 System.out.println("\n element found "+(mid));//2
				 break;	
			 }
			 mid=(low+high)/2;
		 }
		 if(low>high)
			 System.out.println("\n element not found");
	}
}
