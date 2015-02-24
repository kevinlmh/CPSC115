import java.io.*;

public class Grader {
	public static void main(String argv[]) throws IOException {
		BufferedReader input = new BufferedReader
			(new InputStreamReader(System.in));
		String inputString;
		
		int midterm1, midterm2, finalexam;
		float sum;
		
		System.out.print("Input your grade on the first midterm: ");
		inputString = input.readLine();
		midterm1 = Integer.parseInt(inputString);
		System.out.print("Input your grade on the second midterm: ");
		inputString = input.readLine();
		midterm2 = Integer.parseInt(inputString);
		System.out.print("Input your grade on the final exam: ");
		inputString = input.readLine();
		finalexam = Integer.parseInt(inputString);
		
		sum = midterm1 + midterm2 + finalexam;
		System.out.print("Your average in this course is: ");
		System.out.println(sum/3);
	} //main()
} // Grader
