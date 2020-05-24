package Editor;

import ClasesProporcionadas.ImageHandler;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class JPEGImageHandlerRotator extends ImageHandler {

    protected String nombreI;
    protected String vNombre;
    protected File file = null;
    protected BufferedImage xImagen = null;
    protected BufferedImage yImagen = null;

    public JPEGImageHandlerRotator(File fileName) {
        super(fileName.getName());
        this.file = fileName;
        this.nombreI = "Hrotation-" + fileName.getName();
        this.vNombre = "Vrotation-" + fileName.getName();
    }

    @Override
    public void readFile() throws Exception {
        xImagen = ImageIO.read(file);
        yImagen = ImageIO.read(file);
        System.out.println("Imagen leida: " + this.handledFileName);
    }

    @Override
    public void generateFiles() throws Exception {
        rotarX(xImagen);
        rotarY(yImagen);

        File carpeta = new File("Images Proyect");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
            ImageIO.write(xImagen, "jpg", new File("Images Proyect\\" + nombreI));
            System.out.println("Imagen generada: " + nombreI);

            ImageIO.write(yImagen, "jpg", new File("Images Proyect\\" + vNombre));
            System.out.println("Imagen generada: " + vNombre);

        } else {
            ImageIO.write(xImagen, "jpg", new File("Images Proyect\\" + nombreI));
            System.out.println("Imagen generada: " + nombreI);

            ImageIO.write(yImagen, "jpg", new File("Images Proyect\\" + vNombre));
            System.out.println("Imagen generada: " + vNombre);

        }
    }

    private void rotarX(BufferedImage imagen) {
        BufferedImage Aux = new BufferedImage(imagen.getWidth(), imagen.getHeight(), imagen.getType());
        for (int i = 0; i < imagen.getHeight(); i++) {
            for (int j = 0; j < imagen.getWidth(); j++) {
                Aux.setRGB(j, (imagen.getHeight() - 1) - i, imagen.getRGB(j, i));
            }
        }
        this.xImagen = Aux;
    }

    private void rotarY(BufferedImage imagen) {
        BufferedImage Aux = new BufferedImage(imagen.getWidth(), imagen.getHeight(), imagen.getType());
        for (int i = 0; i < imagen.getHeight(); i++) {
            for (int j = 0; j < imagen.getWidth(); j++) {
                Aux.setRGB((imagen.getWidth() - 1) - j, i, imagen.getRGB(j, i));
            }
        }
        this.yImagen = Aux;
    }

}
