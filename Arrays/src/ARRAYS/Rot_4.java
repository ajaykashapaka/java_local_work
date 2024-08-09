package ARRAYS;
public class Rot_4 
{
	public static void main(String[] args) 
	{ 
		int[] ar= {1,2,3,4,5,6,7,8};
		int i,rot;
		rot=4;
		for(i=rot;i<ar.length;i++)//4<8//5<8;6<8;7<8;8<8
		{
		 System.out.print(ar[i]+" ");//ar[4]=5;ar[5]=6;ar[6]=7;ar[7]=8
		}
		for(i=0;i<rot;i++)//0<4;1<4;2<4;3<4;4<4
		{
			System.out.print(ar[i]+" ");//ar[0]=1;ar[1]=2;ar[2]=3;ar[3]=4
		}
	}
}
