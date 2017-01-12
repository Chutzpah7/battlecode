package titan;

import battlecode.common.*;

import java.util.Queue;
import java.util.Stack;

public strictfp class RobotPlayer {
    static RobotController rc;


    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {

        // This is the RobotController object. You use it to perform actions from this robot,
        // and to get information on its current status.
        RobotPlayer.rc = rc;

        // Here, we've separated the controls into a different method for each RobotType.
        // You can add the missing ones or rewrite this into your own control structure.
        switch (rc.getType()) {
            case ARCHON:
                runArchon();
                break;
            case GARDENER:
                runGardener();
                break;
            case SOLDIER:
                runSoldier();
                break;
            case LUMBERJACK:
                runLumberjack();
                break;
            case TANK:
                runTank();
                break;
            case SCOUT:
                runScout();
                break;
        }
    }
    // Enum of the actions an archon might want to take
    public enum ArchonAction {

        OBSERVE, // Sense trees, consider bullet supply
        FLEE, // Run from an enemy
        DODGE, // Avoid taking damage from bullets
        EXPLORE, // Move to a new area
        UNBLOCK, // Avoid being trapped by gardeners
        PRODUCE, // Produce a gardener
        REQUEST, // Request gardener produce combat units
        DEFOREST, // Request lumberjack to remove terrain
        PLAN, // Plan a gardening or production setup
        RALLY, // Coordinate an attack


    }
    public static void runArchon() throws GameActionException {
        // Begin in the observe state
        ArchonAction action = ArchonAction.OBSERVE;
        Stack<MapLocation> prospectiveGardens;


        while(true) {
            try{
                switch (action){
                    case OBSERVE:
                        // TODO: Check for enemy threat, 
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    // Enum of the actions a gardener might want to take
    public enum GardenerAction {

        WAIT, // Wait several turns for assignment from Archon
        FLEE, // Run from an enemy
        LISTEN, // Listen for requests from Archon
        PLANT, // Plant trees until saturated
        YIELD, // Move out of the way of another unit
        PUTTER, // Move towards tree in queue
        TEND, // Water and shake tree in queue, move to bottom
        REROUTE, // Compute a better route among trees
        PRODUCE, // Fulfill requests made by Archons

    }
    public static void runGardener() throws GameActionException {

    }
    public static void runSoldier() throws GameActionException {

    }
    public static void runLumberjack() throws GameActionException {

    }
    public static void runTank() throws GameActionException {

    }
    public static void runScout() throws GameActionException {

    }
}
