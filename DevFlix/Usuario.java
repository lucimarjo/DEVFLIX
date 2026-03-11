package DevFlix;
import java.util.ArrayList;
import java.util.Scanner;
public class Usuario{
    private String nome;
    private String email;
    private String senha;
    protected ArrayList<Conteudo> minhaLista;
    static Scanner input=new Scanner(System.in);

    public Usuario(String nome, String email, String senha){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.minhaLista=new ArrayList<>();
    }

    public void adicionarLista(Conteudo conteudo){
        minhaLista.add(conteudo);
        System.out.println(conteudo.getTitulo()+" foi adicionado a Minha Lista");
    }

    public static Usuario criarUsuario(){
        System.out.println("Digite o seu Email: ");
        String novoEmail= input.nextLine();
        System.out.println("Email adicionado\nAgora digite seu nome de usuario: ");
        String novoNome= input.nextLine();
        System.out.println("Digite a sua senha: ");
        String novaSenha=input.nextLine();
        Usuario novoUsuario=new Usuario(novoNome, novoEmail, novaSenha);
        System.out.println("Conta criada com sucesso");
        return novoUsuario;

    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
