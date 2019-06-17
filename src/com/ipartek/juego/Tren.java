package com.ipartek.juego;

public class Tren {
	
	private String tipo, referencia;
	
	private static final int ASIENTOS_TOTALES = 400;
	private static final int ANOS_MAXIMOS = 40;
	private int asientosOcupados;
	private int anosActivo;
	
	public Tren() {
		
		this.tipo = "Tren de prueba";
		this.referencia = "R000";
		this.anosActivo = 10;
		this.asientosOcupados = 100;
	}
	
	
	
	public Tren(String tipo, String referencia, int asientosOcupados, int anosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anosActivo = anosActivo;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getReferencia() {
		return referencia;
	}



	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}



	public int getAsientosOcupados() {
		return asientosOcupados;
	}



	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}



	public int getAnosActivo() {
		return anosActivo;
	}



	public void setAnosActivo(int anosActivo) {
		this.anosActivo = anosActivo;
	}

	

	@Override
	public String toString() {
		return "Tren [Tipo de tren=" + tipo + "\nReferencia=" + referencia + "\nAsientos ocupados=" + asientosOcupados
				+ " de "+ASIENTOS_TOTALES+"\nAños en activo=" + anosActivo + "]";
	}



	public String trenLleno() {
		String mensaje ="";
		if(getAsientosOcupados() <= ASIENTOS_TOTALES) {
			mensaje = "El tren aun no está lleno";
		}else {
			mensaje = "El tren está completo";
		}
		
		return mensaje;
	}
	
	public String demasiadoViejo() {
		String mensaje = "";
		if(getAnosActivo() < ANOS_MAXIMOS) {
			mensaje = "EN CIRCULACIÓN";
		}else {
			mensaje = "FUERA DE CIRCULACION";
		}
		return mensaje;
	}

}
