package dev.juancastro.multiplication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class MultiplicationTest {

    @Test
    @DisplayName("comprueba si se genera una lista de n * a = r, donde a son los numeros del 1 al 10 y r el resultado ")
    void testIfMultiplicationList_ReturnList() {

        MultiplicationTable multiplicationTable = new MultiplicationTable( 5);

        List<String> result = multiplicationTable.generateTable();

        assertThat(result, hasSize(10));
        assertThat(result, contains(
   "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"));


        
    }

    


}
