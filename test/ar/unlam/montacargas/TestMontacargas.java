package ar.unlam.montacargas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMontacargas {
	
	
	@Test
	public void queSePuedaCrearUnaCargaConUnPeso() {
		Double peso = 10.0;
		
		Carga c = new Carga (peso);
		
		Double vo = c.getPeso();
		
		assertEquals(peso,vo,0.01);
		
	}
	
	
	@Test
	public void queSePuedaCrearUnMontacargasConUnPesoMaximo() {
		Double pesoMaximo = 20.0;
		
		Montacargas m = new Montacargas (pesoMaximo);
		
		Double vo = m.getPesoMaximo();
		
		assertEquals(pesoMaximo,vo,0.01);
		
	}
	
	@Test
	public void queSePuedaAgregarUnaCargaAUnMontaCargas() {
		Double peso = 15.0;
		Carga c = new Carga (peso);
		
		Double pesoMaximo = 20.0;
		Montacargas m = new Montacargas (pesoMaximo);
		
		Boolean agrego = m.cargarCarga(c);
		
		assertTrue(agrego);
		
		Integer cantidadCargas = 1;
		Integer cantidadCargasObtenidas = m.obtenerCantidadCargas();
		
		assertEquals(cantidadCargas,cantidadCargasObtenidas);
		
		Double peso2 = 10.0;
		Carga c2 = new Carga(peso2);
		
		m.cargarCarga(c2);
		
		Double ve = 25.0;
		Double vo = m.obtenerPesoCargado();
		
		assertEquals(ve,vo,0.01);
		
		
	}

}
