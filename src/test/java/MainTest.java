
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;




public class MainTest {

    @Test
    public void testCheckNumb(){

    assert Objects.equals(Main.checkNumb(1), "1") : "Ошибка если не кратно 3 и 5";
    assert Objects.equals(Main.checkNumb(10), "Buzz") : "Ошибка если кратно 5";
    assert Objects.equals(Main.checkNumb(6), "Fizz") : "Ошибка если кратно 5";
    assert Objects.equals(Main.checkNumb(15), "FizzBuzz") : "Ошибка если кратно 3 и 5";

    }

    @Test
    public void exeptionTest() throws IOException {
//ловим ошибку если обращаемся к несуществующему файлу
        try {
            BufferedReader br = new BufferedReader(new FileReader("nums2.txt"));
            Assertions.fail("Expected IOException");
        } catch (IOException thrown) {
            Assertions.assertNotEquals("", thrown.getMessage());
        }

    }
}
