import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMatematica {

        @Test
        public void testSoma() {
                assertEquals("10 + 1 = 11", 11, Matematica.soma(10, 1));    
        }
}