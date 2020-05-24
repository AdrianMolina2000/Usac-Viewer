package Editor;

import ClasesProporcionadas.ImageHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JPEGImageCopy extends ImageHandler {

    protected byte[] filebytes;
    protected String copyname;
    File file = null;

    public JPEGImageCopy(File fileName) {
        super(fileName.getName());
        this.file = fileName;
        this.copyname = "copy-" + fileName.getName();
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
            try (FileOutputStream output = new FileOutputStream("Images Proyect\\" + copyname)) {
                output.write(filebytes);
                output.close();
                System.out.println("Imagen generada: " + copyname);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            FileOutputStream output = new FileOutputStream("Images Proyect\\" + copyname);
            output.write(filebytes);
            output.close();
            System.out.println("Imagen generada: " + copyname);
        }

    }

}
