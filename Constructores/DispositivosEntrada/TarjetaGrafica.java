package DispositivosEntrada;
public class TarjetaGrafica extends Entrada{
  
  String fabricante;
  int precio;
  public TarjetaGrafica(String fabricante, int precio){
    this.fabricante=fabricante;
    this.precio=precio;
  }
  public int getPrecio(){
    return this.precio;
  }
}