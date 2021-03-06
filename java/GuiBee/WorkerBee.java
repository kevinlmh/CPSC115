/*
 * Copyright Kevin Liu
 * November 18 2013
 * You are free to copy, modify, and distribute this file and its contents but
 * you have to acknowledge the original author in your code.
 */

/**
 * WorkerBee Class
 * @author Kevin Liu
 */
public class WorkerBee {
    
    /* private instance variables */
    private int idNum;
    private int energyValue;
    private String energyLevel;
    private int workEnergy;
    private int totalWork;
    
    /** 
     * constructor method
     * @param idNum ID number of bee
     * @param energyValue initial value of the WorkerBee's energyValue
     * @param workEnergy initial value of the WorkerBee's workEnergy
     */
    public WorkerBee(int idNum, int energyValue, int workEnergy) {
        this.idNum = idNum;
        if (energyValue >= 0) {
            this.energyValue = energyValue;
        }else {
            this.energyValue = 0;   //if energyValue is negetive, set to 0 
        }
        setEnergyLevel();
        this.workEnergy = workEnergy;
        totalWork = 0;
    }
    
    /* private method setEnergyLevel only called by constructor */
    private void setEnergyLevel() {
        
        /* set energyLevel according to energyValue */
        if (energyValue == 0) {
            energyLevel = "dead";
        }else if (energyValue >= 1 && energyValue <= 99) {
            energyLevel = "weak";
        }else if (energyValue >= 100 && energyValue <= 199) {
            energyLevel = "normal";
        }else {                     // 200 and above
            energyLevel = "strong";
        }
    }
    /* public methods */
        
    /*public String getEnergyLevel() {
        return energyLevel;
    }*/
    
    public void setEnergyValue(int energyValue) {
        if (energyValue >= 0) {
            this.energyValue = energyValue;
        }else {
            this.energyValue = 0;       //if energyValue is negative, set to 0
        }
    }
    
    public void setWorkEnergy(int workEnergy) {
        if (workEnergy >= 0) {
            this.workEnergy = workEnergy;
        }else {
            this.workEnergy = 10;       //if workEnergy is negative, set to 10
        }
    }

    /* prints basic bee information */
    public String getBeeInfo() {
        return "--- Worker Bee Info ---"
                +"\nID number: \t"+Integer.toString(idNum)
                +"\nEnergy Value: \t"+Integer.toString(energyValue)
                +"\nEnergy Level: \t"+energyLevel
                +"\nWork energy: \t"+Integer.toString(workEnergy)
                +"\nTotal Work: \t"+Integer.toString(totalWork);
    }
    /* do work will subtract workEnergy from energyValue */
    public void doWork(int units) {
        if ( (energyValue - units * workEnergy) >= 0 ){     //work only if bee has enough energy
            energyValue -= units * workEnergy;
            setEnergyLevel();
            totalWork += units;
        }
    }
    /* drink nectar can increase bee's energy */
    public void drinkNectar(int increment) {
        energyValue += increment;
        setEnergyLevel();
    }

}
