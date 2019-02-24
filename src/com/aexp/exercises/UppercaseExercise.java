package com.aexp.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseExercise {

	public List<String> upperCase(List<String> list) {
		// Complete the method to return the elements in the list converted to
		// uppercase.
		// Do this using a single statement (i.e. not using for, do or while)
	}

	public static void main(String[] args) {
		UppercaseExercise ex = new UppercaseExercise();
		List<String> strings = Arrays.asList("one", "two", "three");
		System.out.println(ex.upperCase(strings));
	}

}
