package Clinica;

public class Medico {
      private int codigo;
	    private String nome;
	    private String sexo;
	    private String especialidade;
	    private Endereco endereco;

	   
	    public Medico(int codigo, String nome, String sexo, String especialidade, Endereco endereco) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.sexo = sexo;
	        this.especialidade = especialidade;
	        this.endereco = endereco;

	    }
	    
	    public int getCodigo() {
	        return codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public String getEspecialidade() {
	        return especialidade;
	    }

	    public Endereco getEndereco() {
	        return endereco;
	    }

	    
	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }

	    public void setEspecialidade(String especialidade) {
	        this.especialidade = especialidade;
	    }

	    public void setEndereco(Endereco endereco) {
	        this.endereco = endereco;
	    }

}
