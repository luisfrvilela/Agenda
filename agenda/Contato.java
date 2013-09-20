
package agenda;

public class Contato {
    
    //Atributos

        private String nome;
        private String telefone;
	
public Contato(String nome){
    this.nome = nome;
}

//Metodos

	public void setNome(String nome){
	   this.nome = nome;

        }

	public String getNome(){
		return nome;
        }

       
	public void setTelefone(String telefone){
	   this.telefone = telefone;

	}

	public String getTelefone(){
		return telefone;
	}

}
