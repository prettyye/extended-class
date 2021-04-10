package av.borisov;

import java.util.Objects;

public class ExtendedClass {
	private byte b;
	private int i;
	private double d;
	private String s;
	
	@Override
	public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject == null || getClass() != anObject.getClass()) {
            return false;
        }

        ExtendedClass other = (ExtendedClass) anObject;

        if (b != other.b) {
            return false;
        }
        if (i != other.i) {
            return false;
        }
        if (d != other.d) {
            return false;
        }
        if (!s.equals(other.s)) {
            return false;
        }
        return true;
    }
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 53*hash + Objects.hashCode(b);
		hash = 53*hash + Objects.hashCode(i);
		hash = 53*hash + Objects.hashCode(d);
		hash = 53*hash + Objects.hashCode(s);
		return hash;
	}
	@Override
	public String toString() {
		return "ExtendedClass{"
				+ "b = " + b + ", "
				+ "i = " + i + ", "
				+ "d = " + d + ", "
				+ "s = " + s + ", "
				+ "hashCode = " + Integer.toHexString(hashCode())
				+"}";
	}
}