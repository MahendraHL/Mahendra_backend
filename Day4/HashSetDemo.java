package day4;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(4);
		hs.add(1);
		hs.add(64);
		hs.add(3);
		hs.add(3);
		hs.add(2);

		System.out.println(hs);

	}

}
