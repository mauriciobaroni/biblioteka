
package biblioteka;

public class Emprestimo {
    
    private String dataRetirada;
    private String dataDevolucao;
    private Cliente cliente;
    private Bibliotecario bibliotecario;
    private Livro livro;
    
    public Emprestimo (String retirada, String devolucao, Cliente c, Bibliotecario b, Livro l) {
        
        dataRetirada = retirada;
        dataDevolucao = devolucao;
        cliente =c;
        bibliotecario =b;
        livro =l;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void exibirEmprestimos (Emprestimo emp) {
        
        System.out.println("Empréstimo:\n");
        System.out.println("Data da retirada: "+emp.getDataRetirada());
        System.out.println("Data da devolução: " +emp.getDataDevolucao());
        System.out.println("Nome do cliente: " +emp.getCliente().getNome());
        System.out.println("CPF do cliente: " +emp.getCliente().getCpf());
        System.out.println("Nome do bibliotecário: " +emp.getBibliotecario().getNome());
         System.out.println("CPF do bibliotecário: " +emp.getBibliotecario().getCpf());
        System.out.println("Nome do livro: " +emp.getLivro().getNome());
         System.out.println("Autor do livro: " +emp.getLivro().getAutor());
      
        
    }
    
    
}
