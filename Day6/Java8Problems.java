package day6;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Java8Problems {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 6, 4, 1, 2, 2, 4, 6, 15, 12, 32, 45);

		// printing even numbers
		asList.stream().filter(e -> e % 2 == 0)
		.forEach(i->System.out.print(i + " "));
		System.out.println();

		// adding even numbers to list
		List<Integer> collect = asList
				.stream().filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(collect);

		// number starting with 1
		asList.stream().map(e -> Integer.toString(e))
		.filter(e -> e.startsWith("1"))
		.forEach(i->System.out.print(i + " "));
		System.out.println();

		
		//Find first element in the list
		Integer orElse=asList.stream().findFirst().orElse(0);
		System.out.println(orElse);
		
		//Total elements present in list
		System.out.println(asList.stream().count());
		
		//Total distinct elements present in list
		System.out.println(asList.stream().distinct().count());
		
		
		//Find the maximum element present in a list
		Integer max=asList.stream()
				.max((o1,o2)->o1.compareTo(o2)).get();
		System.out.println(max);
		
		//or
		Integer maximum=asList.stream().max(Comparator.naturalOrder()).get();
		System.out.println("maximum = "+maximum);
		
		//Find the minimum element present in the list
		Integer min=asList.stream()
				.min((o1,o2)->o1.compareTo(o2)).get();
		System.out.println(min);
		
		//or
		Integer minimum=asList.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Minimum = "+minimum);
		
		
		String input="Java articles are Awesome";
		
		//Find first non repeated character in a string
		Character ch=input.chars().mapToObj(c ->(char) c)
		.filter(e ->input.indexOf(e)==input.lastIndexOf(e))
		.findFirst().get();
		System.out.println(ch);
		
		//Find first repeated character in a string
		Character ch1=input.chars().mapToObj(c ->(char) c)
				.filter(e ->input.indexOf(e) != input.lastIndexOf(e))
				.findFirst().get();
		System.out.println(ch1);
		
		
		//sort all the elements present in a list
		asList.stream().sorted()
		.forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//sort all the elements in reverse order
		asList.stream().sorted((o1,o2)->o2.compareTo(o1))
		.forEach(System.out::print);
		System.out.println();
		
		//or by using collections method
		asList.stream().sorted(Collections.reverseOrder())
		.forEach(System.out::print);
		System.out.println();
		
		//Given an integer array return true if any value is repeated is twice
		//and return false if it is not repeated twice
		boolean size=asList.stream().distinct()
				.collect(Collectors.toList()).size() != asList.size();
		System.out.println(size);
		
		//make a cube of number and check whether it is greater than 150
		asList.stream().map(e -> e*e*e).filter(e -> e>150)
		.forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//write a program to count the each character of a string
		String str1="aadffgghgder";
		Map<Character, Long> col=str1.chars().mapToObj(c ->(char) c)
		.collect(Collectors.groupingBy(Function.identity()
				,Collectors.counting()));
		System.out.println(col);
		
		//find duplicates and its number of occurence
		List<String> names=Arrays.asList("AA","BB","CC","AA");
		names.stream().filter(e ->Collections.frequency(names, e)>1)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((str,count) -> System.out.println(str + " ====> "+count));
		
		
		//print multiples of 5 in the list
		asList.stream().filter(e ->e%5==0).forEach(System.out::println);
		
		//separate even or odd in a list
		Map<Boolean, List<Integer>> li=asList.stream().collect(Collectors
				.partitioningBy(e -> e%2==0));
		System.out.println(li);
		
		
		//merge two unsorted array into single sorted array
		int[] list1 = {1, 6, 4, 1};
		int[] list2 = {3, 6, 2, 1, 9};
		IntStream.concat(Arrays.stream(list1), Arrays.stream(list2))
		.sorted().forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//merge two unsorted into Single sorted array without repeation of elements
		IntStream.concat(Arrays.stream(list1), Arrays.stream(list2))
		.sorted().distinct().forEach(i->System.out.print(i + " "));
		System.out.println();
		
		
		//find 3 minimum numbers in a list
		asList.stream().sorted().limit(3)
		.forEach(i->System.out.print(i + " "));
		System.out.println();
	
		
		//find 3 maximum numbers in a list
		asList.stream().sorted(Comparator.reverseOrder())
		.limit(3).forEach(i->System.out.print(i + " "));
		System.out.println();
	//for getting distinct element in a list use distinct() 
	//so that we can get 3 distinct min and max elements
		
		
		//sort the list of String in increasing order of their length
		List<String> strList=Arrays.asList("AA","BBRGTY","CCGT","AAFFR");
		strList.stream().sorted(Comparator.comparing(String::length))
		.forEach(i->System.out.print(i + " "));
		System.out.println();
	
		
		//sort the list of String in decreasing order of their length	
		strList.stream().sorted(Comparator.comparing(String::length).reversed())
			.forEach(i->System.out.print(i + " "));
		System.out.println();
		
	//sum and average of the array
//		int[] list1 = {1, 6, 4, 1};
		int sum=Arrays.stream(list1).sum();
		double avg=Arrays.stream(list1).average().getAsDouble();
		System.out.println("Sum = " + sum + " Average = " + avg);
		
		
		
		//reversing an integer array
//		int[] list1 = {1, 6, 4, 1};
		IntStream.rangeClosed(1, list1.length)
		.map(e -> list1[list1.length-e]).forEach(i->System.out.print(i + " "));
		System.out.println();
		
		
		//Check given string is palindrome or not
		String givString="malayalam";
		boolean noneMatch = IntStream.range(0, givString.length()/2)
		.noneMatch(e -> givString.charAt(e) != givString.charAt(givString.length()-e-1));
		System.out.println(noneMatch);
		
		//last element of an array
		//List<String> strList=Arrays.asList("AA","BBRGTY","CCGT","AAFFR");
		String resString=strList.stream().skip(strList.size()-1).findFirst().get();
		System.out.println(resString);
		
		
		//check the age of a person in years
		LocalDate bday=LocalDate.of(1999, 07, 27);
		LocalDate today=LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(bday, today));
		
		//Join list of string with prefix,suffix and delimiter
		//List<String> strList=Arrays.asList("AA","BBRGTY","CCGT","AAFFR");
		String res=strList.stream().collect(Collectors.joining(", ", "Prefix ", " Suffix"));
		System.out.println(res);
		
		//check whether two strings are anagram o0r not
		String s1="care";
		String s2="race";
		s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted()
				.collect(Collectors.joining());
		String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted()
				.collect(Collectors.joining());
		Boolean option=Optional.ofNullable(s1).map(e ->e.equals(collect2)).get();
		System.out.println(option);
		
		
		//Sum of all digits in a number
		int num=1223;
		int num2=Stream.of(String.valueOf(num).split(""))
		.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(num2);
		
		//find the second maximum in an integer array
		List<Integer> numList = Arrays.asList(1, 2, 4, 6, 5, 12, 3, 45);
		int secondMax=numList.stream().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secondMax);
		
		//Common elements in 2 arrays
		List<Integer> l1 = Arrays.asList(1, 2, 4, 6, 5);
		List<Integer> l2 = Arrays.asList(1, 78, 3, 5, 7);
		l1.stream().filter(l2::contains).forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//Reverse each word of a string
		//String input="Java articles are Awesome";
		String result=Arrays.stream(input.split(" ")).map(word -> new StringBuffer(word).reverse())
		.collect(Collectors.joining(" "));
		System.out.println(result);
		
		//Sum of first 10 natural numbers
		int sumOfNumbers=IntStream.range(1, 11).sum();
		System.out.println(sumOfNumbers);
		
		//Find string which starts with number
		List<String> stringList = Arrays.asList("Java", "1Html", "Python");
		stringList.stream().filter(e -> Character.isDigit(e.charAt(0)))
				.forEach(System.out::println);
		

		//Find the duplicate elements in an list
	//	List<Integer> asList = Arrays.asList(1, 6, 4, 1, 2, 2, 4, 6, 15, 12, 32, 45);
		Set<Integer> set1 = new HashSet<Integer>();
		asList.stream().filter(i ->!set1.add(i))
		.collect(Collectors.toSet()).forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//Fibonacci series
		Stream.iterate(new int[] {0,1}, f -> new int[] {f[1], f[0] + f[1]})
		.limit(10).map(f->f[0]).forEach(i->System.out.print(i + " "));
		
		
	}

}
