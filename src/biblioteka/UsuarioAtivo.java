//SINGLETON PATTERN
package biblioteka;

public class UsuarioAtivo {
    
    private static UsuarioAtivo user;
    private String nome;
    private long cpf;
    
    private UsuarioAtivo(){}
    
    public static UsuarioAtivo definirUsuario(String nome, long cpf) {
        
        if (user == null) {
            user = new UsuarioAtivo();
            user.nome = nome;
            user.cpf = cpf;
            
            System.out.println("Usuário do sistema definido com sucesso.");
            System.out.println("Nome:"+user.nome);
            System.out.println("CPF:"+user.cpf+"\n");
            
        }else{
            System.out.println("Usuário já definido anteriormente.");
            System.out.println("Nome:"+user.nome);
             System.out.println("CPF:"+user.cpf+"\n");
        }
        return user;
    }
    
    
}
