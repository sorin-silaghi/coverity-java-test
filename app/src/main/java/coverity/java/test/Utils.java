package coverity.java.test;

public abstract class Utils {

    public static void assertNotNull(Object o) {
        if (o == null) {
            throw new RuntimeException("Object should not be null");
        }
    }

}
