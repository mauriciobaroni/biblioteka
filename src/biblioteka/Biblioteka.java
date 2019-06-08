
package biblioteka;



public class Biblioteka {

   
    public static void main(String[] args) {

   
     
        
        Cliente a = new Cliente();
        Bibliotecario b = new Bibliotecario();
        Livro l = new Livro();
        
        b.setNome("joao");
        b.setCpf(98765432110L);
        
        l.setNome("Harry Potter");
        l.setAutor("J.K Rolwling");
        
        a.setNome("ricardo");
        a.setCpf(123455678904L);
        
        UsuarioAtivo u = UsuarioAtivo.definirUsuario(b.getNome(), b.getCpf());      //SINGLETON PATTERN
        UsuarioAtivo x = UsuarioAtivo.definirUsuario("Marcelo", 987654310);         //SINGLETON PATTERN

       
        
 
       Emprestimo emp = new Emprestimo("28/05/2019","05/06/2019",a,b,l);
       emp.exibirEmprestimos(emp);
     
    }
    
}
