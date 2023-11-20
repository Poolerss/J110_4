package J110_4;

public class IntegerImpl implements BinaryOperation{

    private int[] array = new int[SIZE/32];
    @Override
    public boolean checkToIndex(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int element = array[indexArray];
        int mask = 1 << bit;
        return (element&mask) == mask;
    }

    @Override
    public void setTrue(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        array[indexArray] = array[indexArray] | mask;
    }

    @Override
    public void setFalse(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = ~(1 << bit);
        array[indexArray] = array[indexArray] & mask;
    }

    @Override
    public void reverse(int index) {
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        array[indexArray] = array[indexArray] ^ mask;
    }

    @Override
    public int trueCount() {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (checkToIndex(i)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String[] str = new String[SIZE];
        for (int i=0 ; i<SIZE ; i++){
            str[i] = checkToIndex(i) ? "1" : "0";
        }
        return String.join(", ", str);
    }
}
