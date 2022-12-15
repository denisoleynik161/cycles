package SQRService;

import org.junit.jupiter.api.Test;
import ru.netology.cycles.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    void shouldSqrThreeValue() {
        SQRService service = new SQRService();

        int actual = service.bruteForce(200, 300);

        assertEquals(3, actual);

    }
    @Test
    void shouldSqrOverLimit() {
        SQRService service = new SQRService();

        int actual = service.bruteForce(10001, 20001);

        assertEquals(0, actual);

    }
    @Test
    void shouldSqrOneValue() {
        SQRService service = new SQRService();

        int actual = service.bruteForce(1, 101);

        assertEquals(1, actual);

    }
    @Test
    void shouldSqrMaxValue() {
        SQRService service = new SQRService();

        int actual = service.bruteForce(100, 9801);

        assertEquals(90, actual);

    }
}