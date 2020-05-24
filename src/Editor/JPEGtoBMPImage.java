package Editor;

import ClasesProporcionadas.ImageHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JPEGtoBMPImage extends ImageHandler {

    protected byte[] filebytes;
    protected String convertedName;
    protected String nombreExt;
    protected String nombreI;
    File file = null;

    public JPEGtoBMPImage(File file) {
        super(file.getName());
        this.file = file;
        this.nombreExt = file.getName();
        if (nombreExt.substring(nombreExt.indexOf(".") + 1, nombreExt.length()).equals("bmp")) {
            nombreI = nombreExt.substring(0, nombreExt.indexOf("."));
            this.nombreExt = nombreI + ".jpeg";
        } else if (nombreExt.substring(nombreExt.indexOf(".") + 1, nombreExt.length()).equals("jpeg")) {
            nombreI = nombreExt.substring(0, nombreExt.indexOf("."));
            this.nombreExt = nombreI + ".bmp";
        } else if (nombreExt.substring(nombreExt.indexOf(".") + 1, nombreExt.length()).equals("jpg")) {
            nombreI = nombreExt.substring(0, nombreExt.indexOf("."));
            this.nombreExt = nombreI + ".bmp";
        }
        this.convertedName = "converted-" + nombreExt;
    }

    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream(file);
        filebytes = new byte[input.available()];
        input.read(filebytes);
        input.close();
        System.out.println("Imagen leida: " + this.handledFileName);
    }

    @Override
    public void generateFiles() throws Exception {

        File carpeta = new File("Images Proyect");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
            try (FileOutputStream output = new FileOutputStream("Images Proyect\\" + convertedName)) {
                output.write(filebytes);
                output.close();
                System.out.println("Imagen generada: " + convertedName);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            FileOutputStream output = new FileOutputStream("Images Proyect\\" + convertedName);
            output.write(filebytes);
            output.close();
            System.out.println("Imagen generada: " + convertedName);
        }

    }

}
