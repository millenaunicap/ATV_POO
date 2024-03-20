package Clinica;

public class Endereco {

      private String rua;
	    private int numero;
	    private String complemento;
	    private String bairro;
	    private String cidade;
	    private String uf;
	    private String cep;

	   
	    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep) {
	        this.rua = rua;
	        this.numero = numero;
	        this.complemento = complemento;
	        this.bairro = bairro;
	        this.cidade = cidade;
	        this.uf = uf;
	        this.cep = cep;
	    }
   
	    
	    
	    public String getRua() {
	        return rua;
	    }

	    public int getNumero() {
	        return numero;
	    }

	    public String getComplemento() {
	        return complemento;
	    }

	    public String getBairro() {
	        return bairro;
	    }

	    public String getCidade() {
	        return cidade;
	    }

	    public String getUf() {
	        return uf;
	    }

	    public String getCep() {
	        return cep;
	    }

	   
	    public void setRua(String rua) {
	        this.rua = rua;
	    }

	    public void setNumero(int numero) {
	        this.numero = numero;
	    }

	    public void setComplemento(String complemento) {
	        this.complemento = complemento;
	    }

	    public void setBairro(String bairro) {
	        this.bairro = bairro;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }

	    public void setUf(String uf) {
	        this.uf = uf;
	    }

	    public void setCep(String cep) {
	        this.cep = cep;
	    }

}
