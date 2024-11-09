import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.print("Enter the Size of Array : ");
			int arr[]=new int[sc.nextInt()];
			System.out.print("Enter "+(arr.length-1)+" elements in array : \n");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("arr["+i+"] : ");
				arr[i]=sc.nextInt();
			}
			System.out.println("Array before sorting :");
			System.out.println(Arrays.toString(arr));
			insersionSort(arr);
			System.out.println("Array after sorting :");
			System.out.println(Arrays.toString(arr));
				
		}

	}

	private static void insersionSort(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]<temp;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}

}
