package br.com.Wiu;

public class PassaValor {  
  
    private String Nome;
    private String Telefone;
    private String Endereco;
  
    public void setNome(String nome) {  
        this.Nome = nome;  
    }  
  
    public String getNome() {  
        return Nome;  
    }  

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
}  