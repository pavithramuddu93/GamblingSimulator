package com.blz;
import java.util.Random;

public class GamblingSimulation {
    public static final int STAKE_PER_DAY = 100;// STAKE PER DAY
    public static final int BET_PER_GAME = 1;
    public static final int WIN = 1;
    public static int stake = 0;/// intial gambler bets with 1

    /*
     * wincheck function will check if gambler wins or loss
     */

    public static void winCheck() {
        Random random = new Random();
        int betReturns = random.nextInt(2);
        if (betReturns == WIN) {
            stake++;// incrementing
        } else {
            stake--;// decrementing
        }

    }
    /*
     * As a Calculative Gambler if won or lost 50% of the stake, would resign for
     * the day
     */

    public static void resignDayCheck() {
        int totalStake = 0;
        stake = 0;
        while (stake != 50 && stake != -50) {
            winCheck();
        }
        totalStake = stake + STAKE_PER_DAY;
        System.out.println("Total stake for resign for a day is  " + totalStake);

    }
    /*
     * After 20 days of playing every day would like to know the total amount won or
     * lost.
     */

    public static void monthlyWinOrLossCheck() {
        int day;
        for (day = 1; day <= 20; day++) {
            System.out.printf("day %d\n", day);
            resignDayCheck();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation");
        monthlyWinOrLossCheck();
    }

}