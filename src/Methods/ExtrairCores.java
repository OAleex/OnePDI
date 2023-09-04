package Methods;

// Metodos
// extrairVermelho
// extrairVermeho
// extrairAzul
// extraorCiano
// extrairMagenta
// extraiBranco


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ExtrairCores {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\OnePDI\\src\\images\\";

    public static void extrairCaveira(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color corCaveira = new Color(pixel);

                if (corCaveira.getRed() >= 255 && corCaveira.getGreen() < 60 && corCaveira.getBlue() < 60) {

                    novaImagem.setRGB(linha, coluna, pixel);

                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

                if (corCaveira.getRed() >= 255 && corCaveira.getGreen() >= 205 && corCaveira.getBlue() >= 0) {

                    novaImagem.setRGB(linha, coluna, pixel);

                }

                // Mostrar Corda
                //if (corCaveira.getRed() >= 175 && corCaveira.getGreen() >= 101 && corCaveira.getBlue() >= 40) {

                //   novaImagem.setRGB(linha, coluna, pixel);

            }

        }


        String caminho = CAMINHO_PADRAO + "caveira.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void extrairNome(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);
                Color corNome = new Color(pixel);

                if (corNome.getBlue() > corNome.getRed() && corNome.getBlue()
                        > corNome.getGreen() && corNome.getBlue() > 20) {


                    novaImagem.setRGB(linha, coluna, pixel);


                } else {
                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }

                if (corNome.getRed() >= 215 && corNome.getGreen() == 0 && corNome.getBlue() == 0) {

                    novaImagem.setRGB(linha, coluna, pixel);

                }

            }
        }


        String caminho = CAMINHO_PADRAO + "nome.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void contorno(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();


        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);
                if (cor.getRed() < 20 && cor.getGreen() < 20 && cor.getBlue() < 20) {

                    novaImagem.setRGB(linha, coluna, pixel);
                } else {

                    Color corTransparente = new Color(0, 0, 0, 0);
                    int pixelTransparente = corTransparente.getRGB();
                    novaImagem.setRGB(linha, coluna, pixelTransparente);
                }
            }
        }



        String caminho = CAMINHO_PADRAO + "contorno.png";

        ImageIO.write(novaImagem, "png", new File(caminho));
        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}