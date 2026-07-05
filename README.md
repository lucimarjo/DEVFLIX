# 🎬 DevFlix - Sistema de Catálogo de Streaming (Backend)

Bem-vindo ao **DevFlix**! Este é um projeto em Java focado em lógica de programação e orientação a objetos (POO), simulando o gerenciamento do catálogo de um serviço de streaming (com filmes e séries), controle de usuários e listas de favoritos personalizado.

## Funcionalidades do Sistema

Gerenciamento de Contas: Criação de novos usuários e sistema de login com validação de e-mail e senha[cite: 1].

Catálogo Dinâmico: Adição e listagem de Filmes e Séries em tempo real[cite: 1].

Herança e Polimorfismo: Uso de classes abstratas e sobrescrita de métodos para exibir detalhes específicos de cada tipo de conteúdo[cite: 1].

Lista Favoritos: Cada usuário logado possui sua própria lista customizada de conteúdos salvos[cite: 1].

## INSTRUÇÕES DE COMPILAÇÃO E EXECUÇÃO DO PROJETO DEVFLIX

**Desenvolvido por: Lucas Lima**

Este projeto Java utiliza múltiplas classes (`devFlix`, `Conteudo`, `Usuario`, `Filme`, `Serie`) e está organizado sob o pacote `DevFlix`.

Para compilar e executar via Terminal, você deve ter o Java Development Kit (JDK) instalado.




## 1. PREPARAÇÃO DA ESTRUTURA

É **crucial** que a estrutura de diretórios reflita o nome do pacote (`DevFlix`).

1.  Crie uma pasta principal para o seu projeto.
2.  Dentro desta pasta, crie uma subpasta chamada: **DevFlix**.
3.  Coloque **todos** os seus arquivos `.java` dentro da pasta `DevFlix`.


## 2. COMPILAÇÃO (GERANDO O .class)

A compilação deve ser feita a partir do diretório **acima** da pasta do pacote (`DevFlix`).

1.  Abra o **Terminal** (CMD, PowerShell, etc.).

2.  Navegue até o diretório-raiz do seu projeto:
    cd C:\Caminho\Para\MeuProjetoDevFlix

3.  Use o compilador Java (`javac`) para compilar todos os arquivos Java:
    javac DevFlix\*.java



## 3. EXECUÇÃO (RODANDO O PROJETO)

A execução também é feita a partir do diretório-raiz, utilizando o nome completo da classe principal.

1.  Certifique-se de estar no mesmo diretório-raiz no Terminal.
2.  Use o interpretador Java (`java`) para executar a classe principal, que é `devFlix` dentro do pacote `DevFlix`:

    java DevFlix.devFlix

## 📂 Estrutura de Pastas

Para que o Java reconheça o pacote corretamente, os arquivos devem estar organizados estritamente desta forma:

```text
DEVFLIX/               <-- Pasta Raiz (Abra esta pasta no VS Code)
└── DevFlix/           <-- Pasta do Pacote (Com "D" maiúsculo)
    ├── devFlix.java   <-- Classe Principal (Contém o método main)
    ├── Conteudo.java  <-- Classe Abstrata mãe
    ├── Filme.java     <-- Subclasse de Conteúdo
    ├── Serie.java     <-- Subclasse de Conteúdo
    └── Usuario.java   <-- Classe de gerenciamento de usuários[cite: 1]
```

## Pré-requisitos & Possíveis Erros

Para compilar e executar este projeto, você precisa do **Java Development Kit (JDK)** instalado na sua máquina (recomendado JDK 17 ou superior).

### Erro Comum: "'javac' não é reconhecido..."
Se você tentar compilar e o Windows exibir este erro, o sistema não sabe onde o Java está instalado. Veja como resolver:
1. Encontre a pasta `bin` da instalação do seu Java (Geralmente em `C:\Program Files\Java\jdk-xx\bin`).
2. No menu Iniciar, pesquise por **"Editar as variáveis de ambiente do sistema"**.
3. Clique em **Variáveis de Ambiente...** e, na tabela de baixo (Variáveis do Sistema), selecione **Path** e clique em **Editar**.
4. Clique em **Novo**, cole o caminho da pasta `bin` e dê **OK** em todas as janelas.
5. **Feche e abra novamente o seu terminal** para carregar a mudança.

### Aviso do VS Code: "non-project file..." ou Erro de Arquivo Temporário
Se você usa o VS Code e tentar rodar o código clicando no botão de "Play" da extensão *Code Runner*, ele pode gerar um arquivo inválido chamado `tempCodeRunnerFile.java` ou dizer que o arquivo não pertence a um projeto.
* **A Solução:** Sempre abra a **pasta raiz** do projeto no VS Code (`File > Open Folder...` selecionando a pasta principal `DEVFLIX`) em vez de abrir os arquivos `.java` isolados.
