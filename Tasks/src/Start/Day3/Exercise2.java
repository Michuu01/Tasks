package Start.Day3;

import java.math.BigDecimal;

public class Exercise2 {
    public static void main(String[] args) {
        exercise();
    }


    //Napisz program, który określi która z 3 podanych liczb jest największa

    private static void exercise() {
        BigDecimal bd1 = new BigDecimal("123333");
        BigDecimal bd2 = new BigDecimal("93222.42");
        BigDecimal bd3 = new BigDecimal("93222");
        BigDecimal max;
        if (bd1.compareTo(bd2) > 0) {
            if (bd1.compareTo(bd3) > 0) {
                max = bd1;
            } else {
                max = bd3;
            }
        } else {
            if (bd2.compareTo(bd3) > 0) {
                max = bd2;
            } else {
                max = bd3;
            }
        }
        System.out.println(max);

    }
}
