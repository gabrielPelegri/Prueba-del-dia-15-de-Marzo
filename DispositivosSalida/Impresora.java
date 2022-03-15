package DispositivosSalida;
public class Impresora extends Salida{
  String fabricante;
   int precio;
  public Impresora(String fabricante, int precio){
    this.fabricante=fabricante;
    this.precio=precio;
  }
  public int getPrecio(){
    return this.precio;
  }
}