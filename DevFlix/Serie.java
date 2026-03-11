package DevFlix;
import java.util.Scanner;
import java.util.ArrayList;
public class Serie extends Conteudo{
    private int numeroDeTemp;
    private int epPorTemp;

    public Serie(String titulo, int AnoLancamento, int numeroDeTemp, int epPorTemp) {
        super(titulo, AnoLancamento);
        this.numeroDeTemp = numeroDeTemp;
        this.epPorTemp = epPorTemp;

    }
    Scanner input=new Scanner(System.in);

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Temporadas: "+numeroDeTemp+"\nEpisodios por temporada: "+epPorTemp);
    }

    @Override
    public void adicionarConteudo(Conteudo serie){
        super.adicionarConteudo(serie);
        System.out.print("Digite a quantidade de temporadas: ");
        numeroDeTemp=input.nextInt();
        System.out.print("Digite a quantidade de episodios por temporada: ");
        epPorTemp=input.nextInt();
        System.out.println("Serie "+titulo+" lançada em "+AnoLancamento+" com "+numeroDeTemp+" temporadas e "+epPorTemp+" episodios por temporada adicionado ao catalogo");
    }


    @Override
    public String toString(){
        return super.toString()+"\nTipo: serie\nTemporadas: "+numeroDeTemp+"\nEpisodios por temporada: "+epPorTemp;
    }
    
    public int getNumeroDeTemp() {
        return numeroDeTemp;
    }
    public void setNumeroDeTemp(int numeroDeTemp) {
        this.numeroDeTemp = numeroDeTemp;
    }
    public int getEpPorTemp() {
        return epPorTemp;
    }
    public void setEpPorTemp(int epPorTemp) {
        this.epPorTemp = epPorTemp;
    }

    

}
