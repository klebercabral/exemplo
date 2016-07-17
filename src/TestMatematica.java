import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMatematica {

        @Test
        public void testSoma() {
                //Matematica tester = new Matematica(); // MyClass is tested
        		//OperacoesString tester = new OperacoesString();
                // assert statements
                assertEquals("10 + 1 = 11", 11, Matematica.soma(10, 1));
    
        }
}