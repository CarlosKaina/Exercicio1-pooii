package exercio1.facens.pooii.sistema.sistema.dtos;

public class ClientDTO {
    
    private String nome;
    private String email;
    private String dataNacimento;
   
    public ClientDTO() {
    
    }
    
    public ClientDTO(String nome, String email, String dataNacimento) {
        this.nome = nome;
        this.email = email;
        this.dataNacimento = dataNacimento;
    }
 
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }
}
