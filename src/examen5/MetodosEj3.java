package examen5;

public class MetodosEj3 {

	private String NombreProducto;
	private int stockProducto;
	private int PrecioProducto;

	public MetodosEj3(String nombreProducto, int stockProducto, int precioProducto) {
		NombreProducto = nombreProducto;
		this.stockProducto = stockProducto;
		PrecioProducto = precioProducto;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public int getStockProducto() {
		return stockProducto;
	}

	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}

	public int getPrecioProducto() {
		return PrecioProducto;
	}

	public void setPrecioProducto(int precioProducto) {
		PrecioProducto = precioProducto;
	}

	@Override
	public String toString() {
		return "MetodosEj3 [NombreProducto=" + NombreProducto + ", stockProducto=" + stockProducto + ", PrecioProducto="
				+ PrecioProducto + "]";
	}

}
