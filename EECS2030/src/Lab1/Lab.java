package Lab1;

import java.util.ArrayList;

public class Lab {
	/**
	 * 
	 * @return 
	 */
	public static String getMyID() {
		return "221224662";
	}
	
	public static String getLetterGrade(double grade) throws IllegalArgumentException {
		
		if (grade > 100) {
			throw new IllegalArgumentException();
		} else if (grade >= 90) {
			return "A+";
		} else if (grade >= 80) {
			return "A";
		} else if (grade >= 75) {
			return "B+";
		} else if (grade >= 70) {
			return "B";
		} else if (grade >= 65) {
			return "C+";
		} else if (grade >= 60) {
			return "C";
		} else if (grade >= 55) {
			return "D+";
		} else if (grade >= 50) {
			return "D";
		} else if (grade >= 45) {
			return "E";
		} else if (grade >= 0) {
			return "F";
		} else {
			throw new IllegalArgumentException();
		}
	}
		
	public static double addAndChangeScale(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		return (sum/list.size())/10;
	}
}
