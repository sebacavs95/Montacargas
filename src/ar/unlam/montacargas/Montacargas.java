package ar.unlam.montacargas;

import java.util.ArrayList;

public class Montacargas {

	private Double pesoMaximo;
	private ArrayList <Carga> cargas = new ArrayList<Carga> ();
	
	public Montacargas(Double pesoMaximo) {
		this.setPesoMaximo(pesoMaximo);
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Double getPesoMaximo() {
		
		return pesoMaximo;
	}
	
	public Boolean cargarCarga(Carga c) {
		
		return cargas.add (c);
	}

	public Integer obtenerCantidadCargas() {
		
		return this.cargas.size();
	}

	public Double obtenerPesoCargado() {
		Double pesoCargado = 0.0;
		//for(int i=0;i<this.cargas.size();i++) {
		//	pesoCargado += this.cargas.get(i).getPeso();
		//}
		for (Carga carga : cargas) {
			pesoCargado += carga.getPeso();
		}
		return pesoCargado;
	}

}
