package Main;

// buscar uma imagem
// extrair as bandas de cores da imagem
// criar algoritmo que vai exibir a cor por vez, vou escolher a cor
// salvar a imagem que foram geradas
// exibir elas


import Methods.ExtrairCores;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedImage bandas = ImageIO.read(
                new File("C:\\Users\\Administrator\\IdeaProjects\\OnePDI\\src\\images\\OPLOGO.png")
        );

        ExtrairCores.extrairCaveira(bandas);
        ExtrairCores.extrairNome(bandas);
        ExtrairCores.contorno(bandas);

    }
}
