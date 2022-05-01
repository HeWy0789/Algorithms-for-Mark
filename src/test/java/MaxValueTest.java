import lombok.SneakyThrows;
import org.example.MaxValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxValueTest {

    private final MaxValue maxValue = new MaxValue();

    private final int[] array = new int[]{1, 5, 3, 8, 10, 3, 12, 20, 1, 7};

    @Test
    @SneakyThrows
    public void checkMaxValueMethod() {
        int max = maxValue.computeMaxValue(array);

        Assertions.assertEquals(20, max);
    }
}
