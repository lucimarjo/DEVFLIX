package DevFlix;
import java.util.Scanner;
public class Filme extends Conteudo{
    private String diretor;
    private int duracaoEmMinutos;
    public Filme(String titulo, int AnoLancamento, String diretor, int duracaoEmMinutos){
        super(titulo, AnoLancamento);
        this.diretor=diretor;
        this.duracaoEmMinutos=duracaoEmMinutos;
    }
    Scanner input=new Scanner(System.in);
    @Override
    public void exibirDetalhes(){
        System.out.println("Diretor: "+diretor+"\nDuracao em minutos: "+duracaoEmMinutos+"\nAno de lançamento: "+AnoLancamento);
    }

    @Override
    public void adicionarConteudo(Conteudo filme){
        super.adicionarConteudo(filme);
        System.out.print("Digite o nome do diretor: ");
        diretor=input.nextLine();
        System.out.print("Digite a duração em minutos do filme: ");
        duracaoEmMinutos=input.nextInt();
        System.out.println("Filme "+titulo+" lançado em "+AnoLancamento+" dirigido por "+diretor+" durando "+duracaoEmMinutos+" minutos foi adicionado ao catalogo");
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipo: Filme\nDiretor: "+diretor+"\nDuracao em minutos: "+duracaoEmMinutos;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    
    
}
