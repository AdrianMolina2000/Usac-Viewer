package Editor;

import ClasesProporcionadas.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class JPEGImageHandlerColors extends ImageHandler {

    protected String redName;
    protected String blueName;
    protected String greenName;
    protected String sepiaName;

    protected File file = null;
    protected BufferedImage redImage = null;
    protected BufferedImage blueImage = null;
    protected BufferedImage greenImage = null;
    protected BufferedImage sepiaImage = null;

    public JPEGImageHandlerColors(File fileName) {
        super(fileName.getName());
        this.file = fileName;
        this.redName = "Red-" + fileName.getName();
        this.blueName = "Blue-" + fileName.getName();
        this.greenName = "Green-" + fileName.getName();
        this.sepiaName = "Sepia-" + fileName.getName();

    }

    @Override
    public void readFile() throws Exception {
        redImage = ImageIO.read(file);
        blueImage = ImageIO.read(file);
        greenImage = ImageIO.read(file);
        sepiaImage = ImageIO.read(file);

        System.out.println("Imagen leida: " + this.handledFileName);
    }

    @Override
    public void generateFiles() throws Exception {
        redImage = filtroRojo(redImage);
        blueImage = filtroAzul(blueImage);
        greenImage = filtroVerde(greenImage);
        sepiaImage = filtroSepia(sepiaImage);

        File carpeta = new File("Images Proyect");
        if (!carpeta.exists()) {
            carpeta.mkdirs();

            ImageIO.write(redImage, "jpg", new File("Images Proyect\\" + redName));
            System.out.println("Imagen generada: " + redName);
            ImageIO.write(blueImage, "jpg", new File("Images Proyect\\" + blueName));
            System.out.println("Imagen generada: " + blueName);
            ImageIO.write(greenImage, "jpg", new File("Images Proyect\\" + greenName));
            System.out.println("Imagen generada: " + greenName);
            ImageIO.write(sepiaImage, "jpg", new File("Images Proyect\\" + sepiaName));
            System.out.println("Imagen generada: " + sepiaName);
        } else {

            ImageIO.write(redImage, "jpg", new File("Images Proyect\\" + redName));
            System.out.println("Imagen generada: " + redName);
            ImageIO.write(blueImage, "jpg", new File("Images Proyect\\" + blueName));
            System.out.println("Imagen generada: " + blueName);
            ImageIO.write(greenImage, "jpg", new File("Images Proyect\\" + greenName));
            System.out.println("Imagen generada: " + greenName);
            ImageIO.write(sepiaImage, "jpg", new File("Images Proyect\\" + sepiaName));
            System.out.println("Imagen generada: " + sepiaName);
        }

    }

    private BufferedImage filtroRojo(BufferedImage Imagen) {

        for (int i = 0; i < Imagen.getWidth(); i++) {
            for (int j = 0; j < Imagen.getHeight(); j++) {
                Color color = new Color(Imagen.getRGB(i, j));
                int media = (color.getRed() + color.getGreen() + color.getBlue()) / (3);
                Color nuevoColor = new Color(media, 0, 0, color.getAlpha());
                Imagen.setRGB(i, j, nuevoColor.getRGB());
            }
        }
        return Imagen;
    }

    private BufferedImage filtroAzul(BufferedImage Imagen) {

        for (int i = 0; i < Imagen.getWidth(); i++) {
            for (int j = 0; j < Imagen.getHeight(); j++) {
                Color color = new Color(Imagen.getRGB(i, j));
                int media = (color.getRed() + color.getGreen() + color.getBlue()) / (3);
                Color nuevoColor = new Color(0, 0, media, color.getAlpha());
                Imagen.setRGB(i, j, nuevoColor.getRGB());
            }
        }
        return Imagen;
    }

    private BufferedImage filtroVerde(BufferedImage Imagen) {

        for (int i = 0; i < Imagen.getWidth(); i++) {
            for (int j = 0; j < Imagen.getHeight(); j++) {
                Color color = new Color(Imagen.getRGB(i, j));
                int media = (color.getRed() + color.getGreen() + color.getBlue()) / (3);
                Color nuevoColor = new Color(0, media, 0, color.getAlpha());
                Imagen.setRGB(i, j, nuevoColor.getRGB());
            }
        }
        return Imagen;
    }

    private BufferedImage filtroSepia(BufferedImage Imagen) {

        for (int i = 0; i < Imagen.getWidth(); i++) {
            for (int j = 0; j < Imagen.getHeight(); j++) {
                Color c = new Color(Imagen.getRGB(i, j));
                int red = (int) (0.393 * c.getRed() + 0.769 * c.getGreen() + 0.189 * c.getBlue());
                int green = (int) (0.349 * c.getRed() + 0.686 * c.getGreen() + 0.168 * c.getBlue());
                int blue = (int) (0.272 * c.getRed() + 0.534 * c.getGreen() + 0.131 * c.getBlue());
                if (red > 255) {
                    red = 255;
                }
                if (green > 255) {
                    green = 255;
                }
                if (blue > 255) {
                    blue = 255;
                }
                Color nuevoColor = new Color(red, green, blue, c.getAlpha());
                Imagen.setRGB(i, j, nuevoColor.getRGB());
            }
        }
        return Imagen;
    }

}
