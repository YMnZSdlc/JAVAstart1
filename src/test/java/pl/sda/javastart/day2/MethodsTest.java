package pl.sda.javastart.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// CTRL + SHIFT + T  klikamy na metodzie i tworzymy plik testu
class MethodsTest {

    @Test
    public void testOneAreaRec() {
        assert Methods.areaRect(2, 3) == 6;
        assert Methods.areaRect(4, 4) == 16;
        assert Methods.areaRect(5, 4) == 20;
        assert Methods.areaRect(6, 4) == 24;
    }

    @Test
    public void testTwoAreaRec(){
        assert Methods.areaRect(2,3)==7;
    }

    @Test
    public void testCircRect(){
        assert Methods.circRect(2,3)==10;
        assert Methods.circRect(4,4)==16;
    }

}