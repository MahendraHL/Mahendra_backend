package Day1;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int array[] = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		System.out.println("The array Elements are");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		s.close();
		ascendingOrder(array);
		descendingOrder(array);
	}

	public static void ascendingOrder(int array[]) {
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("the array lements in ascending order");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void descendingOrder(int array[]) {
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("the array lements in desscending order");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
