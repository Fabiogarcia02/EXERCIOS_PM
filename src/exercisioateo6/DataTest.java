package exercisioateo6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class DataTest {
    
    @Test
   public void TesteComparaDia(){
        Data D = new Data(10, 6, 2006);
        
        int resultado =D.comparaData(10,6,2006);
        int resultado0 = D.comparaData(10, 6, 2006);
        assertSame(resultado0, resultado);
        
   }
}
