package com.aexp.exercises;

public class FizzBuzzExercise {

	public String fizzBuzz(Integer i) {
		// Complete this method to return 'Fizz' for multiples of three and 'Buzz' for
		// the multiples of five.
		// For numbers which are multiples of both three and five return 'FizzBuzz'.
		// For numbers that are neither, return the input number.

	}

	public static void main(String[] args) {
		FizzBuzzExercise ex = new FizzBuzzExercise();
		for (int i = 1; i <= 20; i++) {
			System.out.println(ex.fizzBuzz(i));
		}

	}

}
