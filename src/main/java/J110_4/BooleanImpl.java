package J110_4;


public class BooleanImpl implements BinaryOperation {
    private boolean[] array = new boolean[SIZE];

    @Override
    public boolean checkToIndex(int index) {
        return array[index];
    }

    @Override
    public void setTrue(int index) {
        array[index] = true;
    }

    @Override
    public void setFalse(int index) {
        array[index] = false;
    }

    @Override
    public void reverse(int index) {
        array[index] = !array[index];

    }

    @Override
    public int trueCount() {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (array[i]) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i=0; i<SIZE; i++){
            sb.append(array[i] ? 1:0).append(" ");
        }
       sb.append("]");
        return sb.toString();
    }
}
