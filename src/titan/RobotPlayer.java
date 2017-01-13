package titan;

import battlecode.common.*;


public strictfp class RobotPlayer {
    static RobotController rc;
    static final int RALLYFREQUENCY = 1;

    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {

        // RobotController object for this robot

        RobotPlayer.rc = rc;

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
        FLEE, // Run from an enemy or bullets
        EXPLORE, // Move to a new area
        DEFOREST, // Request lumberjack to remove terrain
        SETUPFARM, // Plan a simple gardening setup
        SETUPBARRACKS, // Plan a light production setup
        SETUPFACTORY, // Plan a heavy production setup
        RALLY, // Coordinate an attack

    }
    public static void runArchon() throws GameActionException {
        // Begin in the observe state
        ArchonAction action = ArchonAction.OBSERVE;


        int simpleGardeners = 0; // Gardeners only capable of producing scouts
        int lightProducers = 0; // Gardeners designed to produce units
        int heavyProducers = 0; // Gardeners designed to produce tanks

        while(true) {
            try{
                switch (action){
                    case OBSERVE:
                        // TODO: Check for enemy threat, check for neutral trees, update local Archon storage, decide whether to explore, or take various macro-actions
                        break;
                    case EXPLORE:
                        // TODO: Find a suitable farming location if none are available, avoid becoming trapped in production structures
                        break;
                    case FLEE:
                        // TODO: Run away from enemies and dodge bullets if necessary
                        break;
                    case DEFOREST:
                        // TODO: Broadcast location of a tree to lumberjacks
                        break;
                    case SETUPFARM:
                        // TODO: Spawn gardener, broadcast location for farm
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // Enum of the actions a gardener might want to take
    public enum GardenerAction {

        FLEE, // Run from an enemy
        LISTEN, // Listen for requests from Archon
        GENPATH, // Generate a path given a center location
        PLANT, // Plant trees in path
        GARDEN, // Move through queue, water and shake
        PRODUCE, // Produce units

    }
    public static void runGardener() throws GameActionException {

        GardenerAction action = GardenerAction.LISTEN;
        static Step[] path; // Holds the pattern that the gardener is responsible for
        while(true) {
            try{
                switch(action){
                    case LISTEN:
                        // TODO: Read broadcast from
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
    public static void runSoldier() throws GameActionException {
        ;
    }
    public static void runLumberjack() throws GameActionException {
        ;
    }
    public static void runTank() throws GameActionException {
        ;
    }
    public static void runScout() throws GameActionException {
        ;
    }

    static MapLocation randomLocation(MapLocation center, float radius) {
        return center.add((float)(Math.random()*2*Math.PI), (float)(Math.random()*radius));
    }
}

