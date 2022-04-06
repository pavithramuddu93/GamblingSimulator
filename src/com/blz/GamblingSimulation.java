package com.blz;
import java.util.Random;

public class GamblingSimulation {
    public static final int STAKE_PER_DAY = 100;
    public static final int BET_PER_GAME = 1;
    public static final int WIN = 1;
    public static int stake = 0;/// intial gambler bets with 1

    public static void winCheck() {
        Random random = new Random();
        int betReturns = random.nextInt(2);
        if (betReturns == WIN) {
            stake++;// incrementing
            System.out.println("win");
        } else {
            stake--;// decrementing
            System.out.println("loss");
        }
        System.out.println("stake = " + stake);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation");
        winCheck();// calling function
    }

}