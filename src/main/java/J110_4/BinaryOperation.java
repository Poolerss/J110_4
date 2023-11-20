package J110_4;

public interface BinaryOperation {
    int SIZE = 1024;

    boolean checkToIndex(int index);
    void setTrue(int index);
    void setFalse(int index);
    void reverse(int index);
    int trueCount();
}
