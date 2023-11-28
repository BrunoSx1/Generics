package br.com.bs;

//CarroEsportivo.java
public class CarroEsportivo extends Carro {
 public CarroEsportivo(String modelo) {
     super(modelo);
 }

 @Override
 public void acelerar() {
     System.out.println(getModelo() + " está acelerando rapidamente!");
 }
}
