public class main{
	public static void main (String args[]){
		KillerBee killer2;
		WorkerBee worker3;

		//Creating an instance of KillerBee
		killer2 = new KillerBee (2, -10, -30);
		//Testing sting() method
		killer2.sting();
		killer2.sting();
		killer2.sting();
		killer2.sting();
		killer2.sting();
		killer2.sting();
		//Testing diaplayBeeInfo() method
		killer2.displayBeeInfo();

		//Creating an instance of WorkerBee
		worker3 = new WorkerBee (3, -100, -10);
		//Testing doWork() method
		worker3.doWork(-9);
		//Testing diaplayBeeInfo() method
		worker3.displayBeeInfo();
		//Testing drinkNectar() method
		worker3.drinkNectar(-20);
		worker3.displayBeeInfo();		
		}
	}
