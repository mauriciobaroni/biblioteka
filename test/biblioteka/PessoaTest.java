
package biblioteka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PessoaTest {
    private Pessoa p;
    private String nome;
    public PessoaTest() {
    }
    

    
    @Before
    public void setUp() {
        
         p = new Pessoa();
    }
    
//TESTE DOS MÉTODOS SETTERS
 
    @Test
    public void testSetNome() {
      
      String nome1 = "mauricio";
      String nome2 = "Mauricio";
       
      p.setNome("Mauricio");
      
      assertEquals(nome1,p.getNome());     //teste falha
      assertEquals(nome2,p.getNome());     //teste aprovado
      
    
    }

    @Test
    public void testSetCpf() {
      
      long cpf1 = 12345678910L;
      long cpf2 = 10987654321L;
       
      p.setCpf(12345678910L);
      
      assertEquals(cpf1,p.getCpf());        //teste aprovado
      assertEquals(cpf2,p.getCpf());      //teste falha
    }

   
    
}
