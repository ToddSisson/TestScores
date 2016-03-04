package num9;
import java.io.*;

public class Deserialize {

	public static void main(String[] args) throws Exception {

		ObjectInputStream objectInputFile = new ObjectInputStream(new FileInputStream("Tests.dat"));

		TestScores[] tests = new TestScores[5];

		for (int x = 0; x < tests.length; x++){
			tests[x] = (TestScores) objectInputFile.readObject();
		}

		objectInputFile.close();	

		for (int x = 0; x < tests.length; x++){
			System.out.println("Student " + (x + 1));
			System.out.println("Test scores:");
			for (int i = 0; i < tests[x].getTests().length; i++){
				if (i != tests[x].getTests().length - 1)
					System.out.print(tests[x].getTests()[i] + ", ");
				else
					System.out.println(tests[x].getTests()[i]);
			}
			System.out.println("Average: " + tests[x].calcAverage());
			System.out.println();
		}
	}
}
