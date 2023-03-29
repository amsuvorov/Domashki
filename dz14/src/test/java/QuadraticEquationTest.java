import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void getTest1(){
        QuadraticEquation equation = new QuadraticEquation(1, -5, 6);
        double expected=1;
        double actual= equation.solve();
        assert actual==expected;
    }
    @Test
    void getTest2(){
        QuadraticEquation equation = new QuadraticEquation(1, -4, 4);
        double expected=0;
        double actual= equation.solve();
        assert actual==expected;
    }
    @Test
    void getTest3(){
        QuadraticEquation equation = new QuadraticEquation(1, 2, 3);
        double expected=-8;
        double actual= equation.solve();
        assert actual==expected;
    }

}

