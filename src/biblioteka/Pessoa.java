
package biblioteka;


public class Pessoa {
    
    private String nome;
    private long cpf;
    
    
    public void setNome(String n) {
        nome =n;
    }
    public String getNome(){
        
        return nome;
    }
    
    public void setCpf(long c) {
        cpf =c;
    }
    
    public long getCpf () {
        return cpf;
    }
    
}
