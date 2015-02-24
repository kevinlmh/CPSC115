/*
 * Copyright Kevin Liu
 * November 18 2013
 * You are allowed to copy, modify, and distribute this file and its contents only
 * if you get the origianl author's permission
 */


/**
 * A class to test bees
 * @author Kevin Liu
 */
public class BeesTest {
    
    /**
     * main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\nCreating a Killer Bee ...");
        System.out.println("Creating a Worker Bee ...");
        
        /* create a KillerBee and a WorkerBee */
        KillerBee killerbee = new KillerBee(001, 100, 10);
        WorkerBee workerbee = new WorkerBee(002, 200, 15);
        
        /* print information of two bees */
        killerbee.displayBeeInfo();
        workerbee.displayBeeInfo();
        
        System.out.println("\nSay KillerBee stung twice.");
        killerbee.sting();
        killerbee.sting();
        killerbee.displayBeeInfo();
        System.out.println("Changing KillerBee's energy value to 120...");
        killerbee.setEnergyValue(120);
        killerbee.displayBeeInfo();
        
        System.out.println("\nSay WorkerBee worked three units and drunk some nectar and got 20 points of energy.");
        workerbee.doWork(3);
        workerbee.drinkNectar(20);
        workerbee.displayBeeInfo();
        System.out.println("\nSubtracting 80 energy points from WorkerBee...");
        workerbee.changeEnergy(-80);
        workerbee.displayBeeInfo();
        
    }
}
