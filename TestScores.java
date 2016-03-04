package num9;

import java.io.Serializable;

public class TestScores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int[] tests;
	
	public TestScores(int[] tests){
		this.tests = tests;
	}
	
	public int[] getTests(){
		return tests;
	}
	
	public double calcAverage(){
		int sum = 0;
		for (int x = 0; x < tests.length; x++){
			if (tests[x] < 0 || tests[x] > 100)
				throw new IllegalArgumentException("Illegal array");
			else
				sum += tests[x];
		}

		return (double) sum / tests.length;
	}

}
