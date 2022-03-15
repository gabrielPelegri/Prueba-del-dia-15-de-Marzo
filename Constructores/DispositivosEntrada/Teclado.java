package DispositivosEntrada;
public class Teclado extends Entrada{
 
  String fabricante;
  int precio;
  public Teclado(String fabricante, int precio){
    this.fabricante=fabricante;
    this.precio=precio;
  }
  public int getPrecio(){
    return this.precio;
  }
}