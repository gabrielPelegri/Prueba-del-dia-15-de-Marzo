package DispositivosSalida;
public class Pantalla extends Salida{
  String fabricante;
  int precio;
  public Pantalla(String fabricante, int precio){
    this.fabricante=fabricante;
    this.precio=precio;
  }
  public int getPrecio(){
    return this.precio;
  }
}

  
