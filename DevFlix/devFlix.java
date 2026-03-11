package DevFlix;
import java.util.ArrayList;
import java.util.Scanner;
public class devFlix {
    private static ArrayList<Conteudo> catalogo;
    private static ArrayList<Usuario> usuarios;
    private static Usuario usuarioAtual;
    public static Scanner input=new Scanner(System.in);
    public static int MinMax(int menor, int maior, int escUsuario){
        while (escUsuario<menor || escUsuario>maior){
            System.out.println("Digite um valor dentro do range, digite um valor entre "+menor+" e "+maior);
            escUsuario=input.nextInt();
            input.nextLine();
        }
        return escUsuario;
    }

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios=new ArrayList<>();
        Usuario usuarioEu=new Usuario("Derek", "Derek@gmail.com", "1234");
        usuarios.add(usuarioEu);
        System.out.println("Faça 1- login ou 2- Crie sua conta");
        int escolha = input.nextInt();
        input.nextLine();
        if (escolha==1){
            boolean sucessoLogin=false;
            while (sucessoLogin==false){
                System.out.println("Digite seu email: ");
                String emaildigitado=input.nextLine();
                Usuario usuarioEncontrado = null;
                for (Usuario user:usuarios){
                    if (user.getEmail()!=null && user.getEmail().equals(emaildigitado)){
                        usuarioEncontrado=user;
                        break;
                    }
                }
                if (usuarioEncontrado != null){
                    System.out.println("email encontrado, agora digite a sua senha: ");
                    String senhadigitatda = input.nextLine();
                    if (usuarioEncontrado.getSenha()!= null && usuarioEncontrado.getSenha().equals(senhadigitatda)){
                    sucessoLogin=true;
                    usuarioAtual=usuarioEncontrado; 
                    System.out.println("Login efetuado com sucesso, bem vindo ao DevFlix "+usuarioAtual.getNome());
                    }else{
                        System.out.println("Senha digitada incorreta, por favor tente de novo");
                        usuarioEncontrado=null;
                    }
                }else{
                    System.out.println("email digitado não encontrado no sistema");
                }
            }
        } 
        
        else if(escolha==2){
            Usuario novoUsuario=Usuario.criarUsuario();
            usuarios.add(novoUsuario);
            usuarioAtual=novoUsuario;
        }
        
        ArrayList<Conteudo> catalogo=new ArrayList<>();
            boolean menu=true;
            while (menu){
            System.out.println("Bem vindo ao Devflix "+usuarioAtual.getNome()+", o que deseja fazer\n1- Olhar o catalogo\n2- Adicionar filme/serie\n3- Olhar minha lista\n4- Gerenciar usuarios\n5- Fechar programa");
            switch (input.nextInt()) {
                case 1:
                if (catalogo.isEmpty()){
                    System.out.println("nenhum conteudo foi adicionado ao catalogo");
                    break;
                }
                int num=1;
                for(Conteudo coisa: catalogo){
                    System.out.println(num+"-"+coisa.getTitulo()+"\n-----------------------------------------------");
                    num++;
                }
                System.out.println("\nSe deseja saber mais sobre algo no catalogo digite o seu numero correspondente, senao digite um numero fora do range");
                escolha=input.nextInt();
                input.nextLine();
                if (escolha>catalogo.size()){
                    break;
                }
                Conteudo itemEscolhido = catalogo.get(escolha - 1);
                if (itemEscolhido instanceof Filme){
                    Filme conteudo=(Filme) itemEscolhido;
                    conteudo.exibirDetalhes();
                    
                }else if (itemEscolhido instanceof Serie){
                    Serie conteudo=(Serie) itemEscolhido;
                    conteudo.exibirDetalhes();
                }
                System.out.println("Deseja adicionar o conteudo a Minha Lista? (1-s/2-n)");
                escolha=input.nextByte();
                MinMax(1, 2, escolha);
                if (escolha==1){
                    usuarioAtual.adicionarLista(itemEscolhido);
                }else{
                    break;
                }
                break;
                case 2:
                    System.out.println("Deseja adicinar 1-Filme ou 2-Serie: ");
                    escolha=input.nextByte();
                    escolha= MinMax(1,2,escolha);
                    if (escolha==2){
                        Serie serie=new Serie(null,0,0,0);
                        serie.adicionarConteudo(serie);
                        catalogo.add(serie);
                    } else if(escolha==1){
                        Filme filme=new Filme(null, 0, null, 0);
                        filme.adicionarConteudo(filme);
                        catalogo.add(filme);
                    }
                    break;

                case 3:
                    for(Conteudo cont:usuarioAtual.minhaLista){
                        System.out.println("\n"+cont.getTitulo());
                    }
                    break;
                case 4:
                input.nextLine();
                    System.out.println("Deseja 1- Criar um novo usuario ou 2- Mudar para outro:");
                    int esc=input.nextInt();
                    input.nextLine();
                    MinMax(1, 2, esc);
                    if (esc==2){
                        System.out.println("Lista de usuarios");
                        int cont=1;
                        for(Usuario u:usuarios){
                            System.out.println(cont+"- "+u.getNome()+"\n---------------------------");
                            cont++;
                    } System.out.println("Digite o numero correspondente ao usuario que deseja trocar");
                    esc=input.nextInt();
                    input.nextLine();
                    MinMax(1, usuarios.size(), esc);
                    Usuario usuarioSenha=usuarios.get(esc-1);
                    System.out.println("Digite a senha de "+usuarioSenha.getNome());
                    String usuariosen=input.nextLine();
                    if(usuariosen.equals(usuarioAtual.getSenha())){
                        usuarioAtual=usuarioSenha;
                    }else{
                        System.out.println("Senha digitada incorreta, voltando a tela inicial");
                    }
                    }else{
                        Usuario novoUsuario=Usuario.criarUsuario();
                        usuarios.add(novoUsuario);
                        usuarioAtual=novoUsuario;
                    }
                    break;
                case 5:
                    menu=false;
                    break;
        }
    }
}
}
