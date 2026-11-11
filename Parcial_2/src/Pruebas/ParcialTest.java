package Pruebas;

import logica.parcial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParcialTest
{
    @Test
    public void testCoeficienteACero()
    {
        parcial p = new parcial();
        String resultado = p.calcularRaices(0, 2, 3);
        assertEquals("Error: El coeficiente 'a' no puede ser cero", resultado);
    }

    @Test
    public void testRaicesComplejas()
    {
        parcial p = new parcial();
        String resultado = p.calcularRaices(1, 1, 1);
        assertEquals("Error: La ecuación produce raíces complejas", resultado);
    }

    @Test
    public void testRaizUnica()
    {
        parcial p = new parcial();
        String resultado = p.calcularRaices(1, -2, 1);
        assertEquals("Raíz única: 1.0", resultado);
    }

    @Test
    public void testDosRaicesReales()
    {
        parcial p = new parcial();
        String resultado = p.calcularRaices(1, -5, 6);
        assertTrue(resultado.contains("Raíz 1: 3.0"));
        assertTrue(resultado.contains("Raíz 2: 2.0"));
    }
}