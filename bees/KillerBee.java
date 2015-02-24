/*
 * Copyright Kevin Liu
 * November 18 2013
 * You are allowed to copy, modify, and distribute this file and its contents only
 * if you get the origianl author's permission
 */


/**
 * KillerBee class, a subclass of BasicBee
 * does everything a BasicBee can do
 * it can also sting, when it stings, an amount of energy will be subtracted
 * @author Kevin Liu
 */

public class KillerBee extends BasicBee {
    
	/* constant */
	final static private int MIN_STING_ENERGY = 0;
		
    /* instance variables */
    private int stingCount;
    private int stingEnergy;
    
    /** 
     * KillerBee constructor
     * @param idNum ID number of bee
     * @param energyValue initial value of the KillerBee's energyValue
     * @param stingEnergy initial value of the KillerBee's stingEnergy
     */
    public KillerBee(int idNum, int energyValue, int stingEnergy) {
        super(idNum, energyValue);
		// check if param: stingEnergy is within legal range
		if (stingEnergy >= MIN_STING_ENERGY) {
			this.stingEnergy = stingEnergy;
		}else {
			// if not in legal range, set to MIN_STING_ENERGY
			System.out.println("[ERROR:]work energy cannot be smaller than "+Integer.toString(MIN_STING_ENERGY)+". Automatically set to"+Integer.toString(MIN_STING_ENERGY)+".");
			this.stingEnergy = MIN_STING_ENERGY;
		}// end of stingEnergy check
        stingCount = 0;
    }
    
    /**
     * Sting() is called when a KillerBee stings
     * each time it stings, an amount of energy equals to stingEnergy
     * will be subtracted
     */
    public void sting() {
		// check if there is enough energy to sting
        if (getEnergyValue() >= stingEnergy) {
            changeEnergy(-stingEnergy);
            stingCount++;
        }else {
        	System.out.println("[ERROR:]energy not enough to sting.");
        }// end of energy check
    }
    
    /**
     * displays KillerBee information 
     * including id number, energy value, energy level, sting energy and sting count
     * calls displayBasicBeeInfo() from superclass to print id, energy value and level
     */
    @Override
    public void displayBeeInfo() {
        System.out.println("\n--- Killer Bee Info ---");
        displayBasicBeeInfo();
        System.out.print("Sting Energy: \t");
        System.out.println(stingEnergy);
        System.out.print("Sting Count: \t");
        System.out.println(stingCount);
    }
}
