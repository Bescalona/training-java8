package enumerados;

public enum DiasSemana {
	LUNES(true),
	MARTES(true),
	MIERCOLES(true),
	JUEVES(true),
	VIERNES(true),
	SABADO(false),
	DOMINGO(false);
	
	private boolean laborable;

	private DiasSemana(boolean laborable) {
		this.laborable = laborable;
	}
	
	@Override
	public String toString() {
		if(this.laborable) {
			return "The day "+this.name().toLowerCase()+ " is laborable";
		}else {
			return "The day "+this.name().toLowerCase()+ " isn't laborable";
		}
	}
}
