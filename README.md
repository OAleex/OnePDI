# OnePDI

![OnePDI](https://s11.gifyu.com/images/SgXiv.gif)

## Descrição
O projeto `OnePDI` é uma aplicação Java que permite extrair cores específicas de uma imagem e realizar operações de extração, como a extração de contorno, nome, caveira e chapéu.

## Funcionalidades

- **Extrair Contorno:** O método `extrairContorno` extrai o contorno da imagem, mantendo apenas a parte preta (contorno) e tornando o restante transparente.

- **Extrair Nome:** O método `extrairNome` extrai o nome ou texto presente na imagem, mantendo apenas a parte não preta (contorno) e tornando o contorno transparente.

- **Extrair Caveira e Chapéu:** O método `extrairCaveiraChapeu` extrai a caveira e o chapéu presentes na imagem, mantendo apenas esses elementos e tornando o restante transparente.

## Uso

1. Certifique-se de ter o ambiente de desenvolvimento Java configurado.

2. Clone este repositório ou copie a classe `ExtrairCores` para o seu projeto Java.

3. Importe as bibliotecas necessárias, como `javax.imageio`, `javax.swing`, `java.awt`, e `java.awt.image`.

4. Utilize os métodos `extrairContorno`, `extrairNome` e `extrairCaveiraChapeu` passando uma imagem do tipo `BufferedImage` como argumento.

5. Os resultados serão salvos como arquivos de imagem (PNG) no diretório especificado pela constante `CAMINHO_PADRAO`. Certifique-se de ajustar o nome do arquivo e a extensão do arquivo de saída conforme necessário.

6. Os resultados também serão exibidos em janelas Swing para visualização.

## Exemplo de Uso

```java
public static void main(String[] args) {
    try {
        BufferedImage imagem = ImageIO.read(new File("caminho_para_sua_imagem.jpg"));
        
        // Extrair Contorno
        OnePDI.extrairContorno(imagem);
        
        // Extrair Nome
        OnePDI.extrairNome(imagem);
        
        // Extrair Caveira e Chapéu
        OnePDI.extrairCaveiraChapeu(imagem);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
