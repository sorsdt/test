package calculator.domain;

public class ComplexObject {
    private int valueA;
    private int valueB;

    public ComplexObject(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public ComplexObject() {
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexObject that = (ComplexObject) o;

        if (valueA != that.valueA) return false;
        return valueB == that.valueB;
    }

    @Override
    public int hashCode() {
        int result = valueA;
        result = 31 * result + valueB;
        return result;
    }

    public int getValueA() {

        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }
}
