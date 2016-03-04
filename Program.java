package num9;

import java.util.Scanner;
import java.io.*;

public class Program {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		TestScores[] tests = new TestScores[5];

		for (int x = 0; x < tests.length; x++){
			int[] array = new int[2];
			for (int i = 0; i < array.length; i++){
				System.out.print("Enter data for student " + (x + 1) + ", test score " + (i + 1) + ": ");
				array[i] = input.nextInt(); 
			}
			tests[x] = new TestScores(array);
		}

		ObjectOutputStream objectOutputFile = new ObjectOutputStream(new FileOutputStream("Tests.dat"));
		
		for (int x = 0; x < tests.length; x++){
			objectOutputFile.writeObject(tests[x]);
		}

		objectOutputFile.close();
		input.close();
	}
}
