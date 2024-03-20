package AtvPoo;



public class Main {
	
	  public static void main(String[] args) {
		   
	        Paciente paciente = new Paciente(
	                1,
	                "João",
	                "07/07/2000",
	                "Masculino",
	                "Unimed",
	                "Penicilina",
	                "A+"
	        );

	        
	        System.out.println("Dados do Paciente:");
	        paciente.imprimirDados();

	        
	        paciente.setNome("João");
	        paciente.setDataNascimento("07/07/2000");
	        paciente.setSexo("Masculino");
	        paciente.setPlanoSaude("Amil");
	        paciente.setAlergia("Penicilina");
	        paciente.setTipoSanguineo("A+");

	       
	        System.out.println("Dados Atualizados do Paciente:");
	        paciente.imprimirDados();
	    }

}
