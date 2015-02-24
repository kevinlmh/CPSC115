/*
 * Copyright Kevin Liu
 * November 18 2013
 * You are allowed to copy, modify, and distribute this file and its contents only
 * if you get the origianl author's permission
 */


/**
 * WorkerBee Class, a subclass of BasicBee
 * A WorkerBee can do all things a BasicBee can. It can also k and drink nectar
 * For every unit it works, an amount of energy will be subtracted from its energyValue
 * It can gain energy by drinking nectar
 * @author Kevin Liu
 */
public class WorkerBee extends BasicBee {
    
	/* constant */
	final static private int MIN_WORK_ENERGY = 0;	//smallest value workEnergy can be
	final static private int MIN_NECTAR = 0; //minimal amount of energy nectar increses for a bee
	final static private int MIN_UNITS = 1;	//minimal units of work a bee has to do at a time
	
    /* private instance variables */
    private int workEnergy;     //amount of energy subtracted when a KillerBee stings
    private int totalWork;      //total units of work
    
    /** 
     * WorkerBee constructor
     * @param idNum ID number of bee
     * @param energyValue initial value of the WorkerBee's energyValue
     * @param workEnergy initial value of the WorkerBee's workEnergy, cannot exceed MIN_WORK_ENERGY
     */
    public WorkerBee(int idNum, int energyValue, int workEnergy) {
        super(idNum, energyValue);
		// check if param: workEnergy is in legal range
		if (workEnergy >= MIN_WORK_ENERGY) {
			this.workEnergy = workEnergy;
		}else {
			System.out.println("\n[ERROR:]work energy cannot be smaller than "+Integer.toString(MIN_WORK_ENERGY)+". Automatically set to "+Integer.toString(MIN_WORK_ENERGY)+".");
			this.workEnergy = MIN_WORK_ENERGY;
		}// end of workEnergy check
        totalWork = 0;
    }
    
    /**
     * doWork() is called when WorkerBee need to do work
     * for each unit the bee works, the amount equals to workEnergy will
     * be subtracted from its energyValue
     * @param units the number of units the bee need to work
     */
    public void doWork(int units) {
		// check if param: units is in legal range
		if (units >= MIN_UNITS) {
			// check if there is enough energy
	        if (getEnergyValue()-(units*workEnergy) >= MIN_ENERGY) {
	            changeEnergy( -(units*workEnergy) );
	        totalWork += units;
	        }else {
	        	System.out.println("\n[ERROR:]Energy not enough to do work.");
	        }// end of energy check
		} else {
			System.out.println("\n[ERROR:]work units cannot be smaller than "+Integer.toString(MIN_UNITS)+".");
		}//end of units check
        
        
    }
    
    /**
     * drinkNectar() increases energyValue by the amount equals to increment
     * @param increment the amount of energy to increase
     */
    public void drinkNectar(int increment) {
		// check if param: increment is in legal range
        if (increment >= MIN_NECTAR ) {
            changeEnergy(increment);
        }else {
			// if not in legal range set to MIN_NECTAR
        	System.out.println("\n[ERROR:]nectar increment cannot be smaller than "+Integer.toString(MIN_NECTAR)+". Automatically set to "+Integer.toString(MIN_NECTAR)+".");
			changeEnergy(MIN_NECTAR);
        }// end of increment check
    }
    
    @Override
    /**
     * prints information of WorkerBee
     * including id number, energyValue, energyLevel, workEnergy and totalWork
     * calls displayBasicBeeInfo() of super class to print id number and energy value and level
     */
    public void displayBeeInfo() {
        System.out.println("\n--- Worker Bee Info ---");
        displayBasicBeeInfo();
        System.out.print("Work energy: \t");
        System.out.println(workEnergy);
        System.out.print("Total Work: \t");
        System.out.println(totalWork);
    }
}
