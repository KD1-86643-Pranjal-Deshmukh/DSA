package Assignment.Question2;

import java.util.Arrays;

public class Question02 {

	public static void main(String[] args) {
		Employee arr[]= {
				new Employee(1,"ramesh",30000),
				new Employee(1,"suresh",20000),
				new Employee(1,"ganesh",50000),
				new Employee(1,"rajesh",10000)
		};
		System.out.println("Array before sorting :");
		System.out.println(Arrays.toString(arr));
		SortBySalary(arr);
		System.out.println("Array After sorting :");
		System.out.println(Arrays.toString(arr));

	}

	private static void SortBySalary(Employee[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			Employee temp=arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j].getSalary()>temp.getSalary();j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}

}
