package br.com.bs;

//Garagem.java
import java.util.ArrayList;
import java.util.List;

public class Garagem<T extends Carro> {
 private List<T> carros;

 public Garagem() {
     this.carros = new ArrayList<>();
 }

 public void adicionarCarro(T carro) {
     carros.add(carro);
     System.out.println(carro.getModelo() + " foi estacionado na garagem.");
 }

 public void exibirCarros() {
     System.out.println("Carros na garagem:");
     for (T carro : carros) {
         System.out.println(carro.getModelo());
     }
 }
}
