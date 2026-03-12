package exercisioateo6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaBancariaTest {

    ContaBancaria Contabacaria2 = new ContaBancaria(null, 12331, 1000);

     @Test
     public void TestarDeposito(){
         Contabacaria2.Sacar(1100);
    double resultado = Contabacaria2.Depositar(200);

    assertEquals(197, resultado, 0.01);


     }

     
}
