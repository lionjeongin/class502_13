package exam07;

public class Book extends java.lang.Object {
    public String toString() {

        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
