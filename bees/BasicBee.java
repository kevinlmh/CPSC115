/*
 * Copyright Kevin Liu
 * November 18 2013
 * You are allowed to copy, modify, and distribute this file and its contents only
 * if you get the origianl author's permission
 */



/**
 * BasicBee class
 * every bee has an id number, an energy value and an energy level
 * @author Kevin Liu
 */
public abstract class BasicBee {
    
    /* Constants */
    static final protected int MIN_ENERGY = 0;        //the lowest energy value a bee can have
    static final private int VALUE_DEAD = 0;        //the energy value of a dead bee
    static final private int VALUE_WEAK = 100;      //energy higher than VALUE_DEAD and lower than VALUE_WEAK is weak
    static final private int VALUE_NORMAL = 200;    // energy higher that VALUE_WEAK and lower that VALUE_NORMAL is normal, 
                                                        //energy higher than VALUE_NORMAL is strong

    /* private instance variables */
    private int idNum;          //the id number of a bee
    private int energyValue;    //energy value of a bee
    private String energyLevel; //energy level of a bee, can be "dead, ""weak", "normal" or "strong", 
                                    //will be set according to energyValue
    
    /**
     * BasicBee constructor
     * @param idNum the id number you want to give a bee
     * @param energyValue  initial energy value of a bee
     */
    public BasicBee(int idNum, int energyValue) {
        this.idNum = idNum;
		// check if param: energyValue is in legal range
        if (energyValue >= MIN_ENERGY) {
            this.energyValue = energyValue;
        }else {
			// if not in legal range, set energyValue to MIN_ENERGY
			System.out.println("[ERROR:]energy level cannot be lower than "+Integer.toString(MIN_ENERGY)+". Automatically set to "+Integer.toString(MIN_ENERGY)+".");
            this.energyValue = MIN_ENERGY;
        }// end of energyValue check
        setEnergyLevel();
    }
    
    /* private methods */
    
    /**
     * inspect the current value of energyValue and set energyLevel accordingly
     * an energyValue of 1-99 is a level of "weak"
     * 100-199 is "normal"
     * 200 and above is "strong"
     * and 0 is "dead"
     */
    private void setEnergyLevel() {
        
        /* set energyLevel according to energyValue */
        if (energyValue == VALUE_DEAD) {
            energyLevel = "dead";
        }else if (energyValue >VALUE_DEAD && energyValue < VALUE_WEAK) {
            energyLevel = "weak";
        }else if (energyValue >= VALUE_WEAK && energyValue < VALUE_NORMAL) {
            energyLevel = "normal";
        }else {
            energyLevel = "strong";
        }
    }
    
    /* public methods */
    
    /**
     * @return the current energy level of a bee
     */
    public String getEnergyLevel() {
        return energyLevel;
    }
    
    /**
     * @return energy value of a bee
     */
    public int getEnergyValue() {
        return energyValue;
    }
    /**
     * set energy value of a bee
     * @param energyValue the energy value you want set for a bee
     */
    public void setEnergyValue(int energyValue) {
		// check if param: energyValue is in legal range
		if (energyValue >= MIN_ENERGY) {
	        this.energyValue = energyValue;
	        setEnergyLevel();
		}else {
			System.out.println("[ERROR:]energy level cannot be lower than "+Integer.toString(MIN_ENERGY)+".");
		}// end of energyValue check
		
        
    }
    
    /**
     * change the energy value of a bee
     * @param change the amount of energy you want to change, can be negative
     */
    public void changeEnergy(int change) {
        energyValue += change;
        setEnergyLevel();
    }
    
    /**
     * displays information of a BasicBee
     * including id number, energy value and energy level
     */
    public void displayBasicBeeInfo() {
        System.out.print("ID number: \t");
        System.out.println(idNum);
        System.out.print("Energy Value: \t");
        System.out.println(energyValue);
        System.out.print("Energy Level: \t");
        System.out.println(energyLevel);
    }
    
    /**
     * diaplayBeeInfo() is an abstract method
     * it should be override be subclasses to display information of a bee
     * that is derived from BasicBee
     */
    public abstract void displayBeeInfo();   
}
