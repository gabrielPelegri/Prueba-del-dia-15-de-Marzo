package DispositivosEntrada;
public class Raton extends Entrada{
 
  String fabricante;
   int precio;
  public Raton(String fabricante, int precio){
    this.fabricante=fabricante;
    this.precio=precio;
  }
  public int getPrecio(){
    return this.precio;
  }
}