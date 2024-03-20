package Clinica;

public class Main {

     public static void main(String[] args) {
	       
	        Endereco endereco = new Endereco("Rua A", 123, "Apto 101", "Centro", "Cidade", "UF", "12345-678");

	       
	        System.out.println("Endereço:");
	        System.out.println("Rua: " + endereco.getRua());
	        System.out.println("Número: " + endereco.getNumero());
	        System.out.println("Complemento: " + endereco.getComplemento());
	        System.out.println("Bairro: " + endereco.getBairro());
	        System.out.println("Cidade: " + endereco.getCidade());
	        System.out.println("UF: " + endereco.getUf());
	        System.out.println("CEP: " + endereco.getCep());
	    }

}
