package examen5;

public class MetodosEj2 {

	private int zona1;
	private int zona2;
	private int zona3;

	public MetodosEj2(int zona1, int zona2, int zona3) {
		this.zona1 = zona1;
		this.zona2 = zona2;
		this.zona3 = zona3;
	}

	public int getZona1() {
		return zona1;
	}

	public void setZona1(int zona1) {
		this.zona1 = zona1;
	}

	public int getZona2() {
		return zona2;
	}

	public void setZona2(int zona2) {
		this.zona2 = zona2;
	}

	public int getZona3() {
		return zona3;
	}

	public void setZona3(int zona3) {
		this.zona3 = zona3;
	}

	@Override
	public String toString() {
		return "Ej5Metodos [zona1=" + zona1 + ", zona2=" + zona2 + ", zona3=" + zona3 + "]";
	}

}