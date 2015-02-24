import java.io.*;

public class HelloName {
	public static void main(String argv[]) throws IOException{
		BufferedReader input = new BufferedReader
			(new InputStreamReader(System.in));
		System.out.print("Hello, input your name please: ");
		String inputString = input.readLine();
		System.out.println("Hello " + inputString);
	} //main
} //HelloName
