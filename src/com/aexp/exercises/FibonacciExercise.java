package com.aexp.exercises;

public class FibonacciExercise {

	public Integer fibonacci(Integer n) {
		// Complete this method to output the nth element of the Fibonacci sequence
		// ( 0, 1, 1, 2, 3, 5, 8, 13, 21, 34..)
	}

	public static void main(String[] args) {

		FibonacciExercise ex = new FibonacciExercise();
		for (int i = 0; i < 10; i++) {
			System.out.println(ex.fibonacci(i));
		}
	}
}
