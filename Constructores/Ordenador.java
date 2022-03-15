package Constructores;
import java.util.*;
import Unidad.UnidadCentral;
import DispositivosEntrada.*;
import DispositivosSalida.*;
public class Ordenador{
 
  UnidadCentral unidad;
  Entrada entrada1;
  Entrada entrada2;
  Entrada entrada3;
  Salida salida1;
  Salida salida2;
  Salida salida3;
  int precio;
  public Ordenador(Entrada e1,Entrada e2,Entrada e3,Salida s1,Salida s2,Salida s3, UnidadCentral u){
    this.unidad=u;
    this.entrada1=e1;
    this.entrada2=e2;
    this.entrada3=e3;
    this.salida1=s1;
    this.salida2=s2;
    this.salida3=s3;
    this.precio=u.getPrecio() + e1.getPrecio() + e2.getPrecio() + e3.getPrecio() + s1.getPrecio() + s2.getPrecio() + s3.getPrecio();
    
  }
  public Ordenador(Entrada e1,Salida s1,UnidadCentral u){
    this.unidad=u;
    this.entrada1=e1;
    this.salida1=s1;
  }
  
}