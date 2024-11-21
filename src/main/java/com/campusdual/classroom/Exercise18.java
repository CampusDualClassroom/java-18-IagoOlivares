package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		int[] array = new int[5];
		array=  createAndInitializeArray(array.length);
		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int numero){

		int[] array = new int[numero];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + " ");
			} else {
				System.out.print(array[i]);
			}
		}
	}
}
