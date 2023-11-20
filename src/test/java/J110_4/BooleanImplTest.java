package J110_4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BooleanImplTest {
    private BinaryOperation binaryOperation;

    @Before
    public void setup() {
        binaryOperation = new BooleanImpl();
    }

    @Test
    public void testCheckToIndex() {
        binaryOperation.setTrue(0);
        Assert.assertTrue(binaryOperation.checkToIndex(0));

        binaryOperation.setFalse(1);
        Assert.assertFalse(binaryOperation.checkToIndex(1));
    }

    @Test
    public void testSetTrue() {
        for (int i = 0; i < BinaryOperation.SIZE; i++) {
            binaryOperation.setTrue(i);
            Assert.assertTrue(binaryOperation.checkToIndex(i));
        }
    }

    @Test
    public void testSetFalse() {
        for (int i = 0; i < BinaryOperation.SIZE; i++) {
            binaryOperation.setTrue(i);
        }

        for (int i = 0; i < BinaryOperation.SIZE; i++) {
            binaryOperation.setFalse(i);
            Assert.assertFalse(binaryOperation.checkToIndex(i));
        }
    }

    @Test
    public void testReverse() {
        for (int i = 0; i < BinaryOperation.SIZE; i++) {
            binaryOperation.setTrue(i);
        }

        for (int i = 0; i < BinaryOperation.SIZE; i++) {
            binaryOperation.reverse(i);
            Assert.assertFalse(binaryOperation.checkToIndex(i));
        }

        for (int i = 0; i < BinaryOperation.SIZE; i++) {
            binaryOperation.reverse(i);
            Assert.assertTrue(binaryOperation.checkToIndex(i));
        }
    }

    @Test
    public void testTrueCount() {
        Assert.assertEquals(0, binaryOperation.trueCount());

        binaryOperation.setTrue(0);
        Assert.assertEquals(1, binaryOperation.trueCount());

        binaryOperation.setTrue(1);
        binaryOperation.setTrue(2);
        Assert.assertEquals(3, binaryOperation.trueCount());

        binaryOperation.reverse(1);
        Assert.assertEquals(2, binaryOperation.trueCount());

        binaryOperation.setFalse(2);
        Assert.assertEquals(1, binaryOperation.trueCount());

        binaryOperation.setFalse(0);
        Assert.assertEquals(0, binaryOperation.trueCount());
    }
}