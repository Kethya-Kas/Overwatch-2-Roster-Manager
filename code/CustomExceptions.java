public class CustomExceptions {

    public static class InvalidHeroException extends Exception {
        public InvalidHeroException(String message) {
            super("InvalidHeroException: " + message);
        }
    }

    public static class HeroDuplicateException extends Exception {
        public HeroDuplicateException(String message) {
            super("HeroDuplicateException: " + message);
        }
    }

    public static class RoleFullException extends Exception {
        public RoleFullException(String message) {
            super("RoleFullException: " + message);
        }
    }

    public static class HeroNotOnRosterException extends Exception {
        public HeroNotOnRosterException(String message) {
            super("HeroNotOnRosterException: " + message);
        }
    }

}
