package Editor;

import ClasesProporcionadas.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class JPEGImageHandlerBN extends ImageHandler {

    protected String nombreI;
    protected File file = null;
    protected BufferedImage buffImagen = null;

    public JPEGImageHandlerBN(File fileName) {
        super(fileName.getName());
        this.file = fileName;
        this.nombreI = "Black & White-" + fileName.getName();
    }

    @Override
    public void readFile() throws Exception {
        buffImagen = ImageIO.read(file);
        System.out.println("Imagen leida: " + this.handledFileName);
    }

    @Override
    public void generateFiles() throws Exception {
        blancoYnegro(buffImagen);

        System.out.println("Imagen generada: " + nombreI);

        File carpeta = new File("Images Proyect");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
            ImageIO.write(buffImagen, "jpg", new File("Images Proyect\\" + nombreI));
            System.out.println("Imagen generada: " + nombreI);

        } else {
            ImageIO.write(buffImagen, "jpg", new File("Images Proyect\\" + nombreI));
            System.out.println("Imagen generada: " + nombreI);

        }
    }

    public BufferedImage blancoYnegro(BufferedImage Imagen) {
        for (int i = 0; i < buffImagen.getWidth(); i++) {
            for (int j = 0; j < buffImagen.getHeight(); j++) {
                Color color = new Color(buffImagen.getRGB(i, j));
                int media = (color.getRed() + color.getGreen() + color.getBlue()) / (3);
                Color nuevoColor = new Color(media, media, media, color.getAlpha());
                buffImagen.setRGB(i, j, nuevoColor.getRGB());
            }
        }
        return buffImagen;
    }

}
