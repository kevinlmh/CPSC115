import java.util.Random;
public class ArrayGenerator {
	public void generate(int size){
		Random random = new Random();
		for(int i=0; i <size; i++ ){
			System.out.print(random.nextInt(size)+",");

		}
	}
	
	public static void main(String args[]) {
		ArrayGenerator ag = new ArrayGenerator();
		ag.generate(1000);
		System.out.print("\n");
	}
}