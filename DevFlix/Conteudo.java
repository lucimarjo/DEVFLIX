package DevFlix;
import java.util.Scanner;
import java.util.ArrayList;
public abstract class Conteudo {
    protected String titulo;
    protected int AnoLancamento;
    Scanner input=new Scanner(System.in);
    
    public Conteudo(String titulo, int AnoLancamento) {
        this.titulo = titulo;
        this.AnoLancamento = AnoLancamento;
    }
    public void exibirDetalhes(){
        System.out.println("Detalhes sobre "+titulo);
    }

    public void adicionarConteudo(Conteudo conteudo){
        System.out.print("Digite o titulo: ");
        titulo=input.nextLine();
        System.out.print("Digite o ano do lançamento: ");
        AnoLancamento=input.nextInt();
        input.nextLine();
    }

    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nAno de lançamento: "+AnoLancamento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoLancamento() {
        return AnoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        AnoLancamento = anoLancamento;
    }

    


}
