# INSTRUÇÕES DE COMPILAÇÃO E EXECUÇÃO DO PROJETO DEVFLIX

**Desenvolvido por: Lucas**

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
