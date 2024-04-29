package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {

		int[] array1 = createArray();
		printArray(array1);
		int[] revArray = reverseArray(array1);
		printArray(revArray);
		int[] arraySort = sortArray(array1);
		printArray(arraySort);

		int[] array2 = createArray();
		int[] arrMerge = mergeArray(array1, array2);
		printArray(arrMerge);

		int[] zigzag = zigzagMergeArray(array1, array2);
		printArray(zigzag);
		System.out.println();
		System.out.println("maximum element is:" + maxElement(array1));
		int[] union = unionArray(array1, array2);
		printArray(union);

		int[] intersect = intersectionArray(array1, array2);
		printArray(intersect);
		int[] removeArray = removeDuplicateArray(array1);
		printArray(removeArray);
		int occurance = occuranceArray(array1, 2);
		System.out.println("occurance of 2 is :" + occurance);
		int[] duplicateArray = duplicateElements(array1);
		printArray(duplicateArray);
		int prime = countPrime(array1);
		System.out.println("total prime number in an array is:" + prime);
	}

//creating an array
	public static int[] createArray() {
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int[] array = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();

		}
		return array;
	}

//printing an array
	public static void printArray(int a[]) {
		System.out.println();
		System.out.println("The elements of an array are");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

//reversing the given array
	public static int[] reverseArray(int a[]) {
		System.out.println();
		System.out.println("The array in reverse order is");
		for (int i = 0; i < (a.length - 1); i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}

//sorting an array in ascending order
	public static int[] sortArray(int a[]) {
		System.out.println();
		for (int i = 0; i < (a.length - 1); i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

//merging two arrays
	public static int[] mergeArray(int a[], int b[]) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		return c;
	}

//zigzag merging of two arrays
	public static int[] zigzagMergeArray(int a[], int b[]) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}

		while (i < a.length)
			c[k++] = a[i++];

		while (j < b.length)
			c[k++] = b[j++];
		return c;
	}

//finding maximum elemrnt present in an array
	public static int maxElement(int a[]) {
		int maximum = a[0];
		for (int j = 0; j < a.length; j++) {
			maximum = a[j];
			if (a[j] > maximum)
				maximum = a[j];
		}
		return maximum;
	}

//union of two arrays
	public static int[] unionArray(int a[], int b[]) {
		int a1[] = sortArray(a);
		int b1[] = sortArray(b);
		int c[] = new int[a1.length + b1.length];
		int i = 0, j = 0, k = 0;
		while (i < a1.length && j < b1.length) {
			if (a1[i] == b1[j]) {
				c[k++] = a1[i++];
				j++;

			} else if (a1[i] < b1[j]) {
				c[k++] = a1[i++];
			} else {
				c[k++] = b1[j++];
			}
		}
		while (i < a1.length)
			c[k++] = a1[i++];

		while (j < b1.length)
			c[k++] = b1[j++];
		return c;
	}

//intersection of two arrays
	public static int[] intersectionArray(int a[], int b[]) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[i] = a[i];
				}
			}
		}
		return c;
	}

//remove duplicate elements in an array
	public static int[] removeDuplicateArray(int a[]) {
		int n = a.length;
		if (n == 0 || n == 1)
			return a;
		sortArray(a);
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (a[i] != a[i - 1]) {
				count++;
			}
		}
		int[] result = new int[count];
		result[0] = a[0];
		int j = 1;
		for (int i = 1; i < n; i++) {
			if (a[i] != a[i - 1]) {
				result[j] = a[i];
				j++;
			}
		}

		return result;
	}

//finding the occurence of an element
	public static int occuranceArray(int a[], int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				count++;
			}
		}
		return count;
	}

//duplicate elemts present in an array
	public static int[] duplicateElements(int a[]) {
		int n = a.length;
		if (n == 0 || n == 1)
			return a;
		sortArray(a);
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				count++;
			}
		}

		int[] result = new int[count];
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				result[j++] = a[i];
			}
		}

		return result;
	}

//count prime numbers in an array
	private static int countPrime(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean result = isPrime(a[i]);
			if (result)
				count++;
		}
		return count;
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0)
				return false;
		}
		return true;

	}

}
