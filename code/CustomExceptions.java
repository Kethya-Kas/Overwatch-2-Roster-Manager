public class CustomExceptions {

    public static class InvalidHeroException extends Exception {
        public InvalidHeroException(String message) {
            super(message);
        }
    }

    public static class HeroDuplicateException extends Exception {
        public HeroDuplicateException(String message) {
            super(message);
        }
    }

    public static class RoleFullException extends Exception {
        public RoleFullException(String message) {
            super(message);
        }
    }

    public static class HeroNotOnRosterException extends Exception {
        public HeroNotOnRosterException(String message) {
            super(message);
        }
    }

}
