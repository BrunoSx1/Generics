package br.com.bs;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Exemplo de uso
     Garagem<CarroEsportivo> garagemEsportiva = new Garagem<>();
     CarroEsportivo carro1 = new CarroEsportivo("Ferrari");
     CarroEsportivo carro2 = new CarroEsportivo("Lamborghini");

     garagemEsportiva.adicionarCarro(carro1);
     garagemEsportiva.adicionarCarro(carro2);
     garagemEsportiva.exibirCarros();
 }
}
