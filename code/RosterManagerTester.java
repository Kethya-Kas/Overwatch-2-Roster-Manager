public class RosterManagerTester {
    public static void main(String[] args) {

        // -----------------------Creating Valid Dive rosters----------------

        OWRoster diveRoster = new OWRoster(Archetype.DIVE);

        diveRoster.printCompDetails();
        diveRoster.generateRandomRoster();
        diveRoster.printRoster();
        diveRoster.clearRoster();
        System.out.println("Cleared randomly generated Dive roster!");
        System.out.println();

        Hero winston = new Hero("Winston", Role.TANK);
        Hero tracer = new Hero("Tracer", Role.DAMAGE);
        Hero genji = new Hero("Genji", Role.DAMAGE);
        Hero ana = new Hero("Ana", Role.SUPPORT);
        Hero brigitte = new Hero("Brigitte", Role.SUPPORT);

        System.out.println("Creating valid Dive roster!");
        System.out.println();

        try {

            diveRoster.addHero(winston); // created a valid Dive roster
            diveRoster.addHero(tracer);
            diveRoster.addHero(genji);
            diveRoster.addHero(ana);
            diveRoster.addHero(brigitte);

            diveRoster.removeHero(ana);
            diveRoster.addHero(ana);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        diveRoster.printRoster();

        diveRoster.clearRoster();
        System.out.println("Cleared valid dive roster!");
        System.out.println();

        // -----------------------Creating Invalid Brawl rosters----------------

        OWRoster brawlRoster = new OWRoster(Archetype.BRAWL);

        brawlRoster.printCompDetails();

        Hero doomfist = new Hero("Doomfist", Role.TANK);
        Hero mei = new Hero("Mei", Role.DAMAGE);
        Hero sojourn = new Hero("Sojourn", Role.DAMAGE);
        Hero baptiste = new Hero("Baptiste", Role.SUPPORT);
        Hero lucio = new Hero("Lucio", Role.SUPPORT);

        System.out.println("Creating Invalid Brawl roster!");
        System.out.println();

        try {
            try {
                brawlRoster.addHero(doomfist); // throws InvalidHeroException since Winston is not a brawl Tank
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                brawlRoster.addHero(mei); // throws HeroDuplicateException since Mei is added twice
                brawlRoster.addHero(mei);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                brawlRoster.removeHero(sojourn); // throws HeroNotOnRosterException since Sojourn is not on roster
                                                 // before removal
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                brawlRoster.addHero(sojourn); // throws RoleFullException since trying to add a hero to a role that is
                                              // full
                brawlRoster.addHero(tracer);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            try {
                brawlRoster.addHero(baptiste);
                brawlRoster.addHero(lucio);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } finally {
            System.out.println();
            brawlRoster.printRoster();
        }
    }
}
