package pessoa;

public class PessoaJuridica extends Pessoa {

	//Atributos

	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica(String nome, String telefone, String cnpj){
		super(nome,telefone);
		this.cnpj = cnpj;
		
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



}
