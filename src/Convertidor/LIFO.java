package Convertidor;

import Categorias.Categoria;
import ClasesProporcionadas.JPEGHandler;
import Editor.JPEGImageCopy;
import Editor.JPEGImageHandlerBN;
import Editor.JPEGImageHandlerColors;
import Editor.JPEGImageHandlerRotator;
import Editor.JPEGtoBMPImage;
import Imagenes.Imagen;
import Imagenes.ListaCircular;
import InterfazGrafica.Editor;
import static InterfazGrafica.Convertidor.JProgress;
import static InterfazGrafica.Convertidor.JT_Area;
import static InterfazGrafica.Convertidor.TB_BMP_JPEG1;
import static InterfazGrafica.Convertidor.TB_ByN;
import static InterfazGrafica.Convertidor.TB_Copia;
import static InterfazGrafica.Convertidor.TB_Modificar;
import static InterfazGrafica.Convertidor.TB_RGBS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LIFO extends Thread {

    Categoria categoria;
    ColaSimple colaProcesamiento = new ColaSimple();
    ListaCircular listaImagenes = new ListaCircular();
    int tamanio = 0;

    public LIFO(ColaSimple colaProcesamiento) {
        this.colaProcesamiento = colaProcesamiento;
        tamanio = colaProcesamiento.getSize();
    }

    @Override
    public void run() {
        int x = 0;
        for (int i = 0; i < tamanio; i++) {
            categoria = (Categoria) colaProcesamiento.peek();
            listaImagenes = categoria.getListaImagenes();
            JProgress.setMaximum(tamanio);
            for (int j = 0; j < listaImagenes.getSize(); j++) {
                Imagen imagen = (Imagen) listaImagenes.get(j);
                Fotos(imagen, categoria);
            }
            x += 1;
            JProgress.setValue(x);
        }

    }

    public void Fotos(Imagen imagen, Categoria categoria) {
        if (imagen != null) {
            if (TB_BMP_JPEG1.isSelected()) {
                JPEGtoBMPImage convertir = new JPEGtoBMPImage(imagen.getFile());
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(convertir);
                    JT_Area.append(categoria.getNombreCategoria() + "| JPGE_to_BMP-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_Copia.isSelected()) {
                JPEGImageCopy convertir = new JPEGImageCopy(imagen.getFile());
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(convertir);
                    JT_Area.append(categoria.getNombreCategoria() + "| Image Copy-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));
                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_ByN.isSelected()) {
                JPEGImageHandlerBN blancoYnegro = new JPEGImageHandlerBN(imagen.getFile());
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(blancoYnegro);
                    JT_Area.append(categoria.getNombreCategoria() + "| Black&White-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));

                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_RGBS.isSelected()) {
                JPEGImageHandlerColors colores = new JPEGImageHandlerColors(imagen.getFile());
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(colores);
                    JT_Area.append(categoria.getNombreCategoria() + "| Red-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));
                    JT_Area.append(categoria.getNombreCategoria() + "| Green-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));
                    JT_Area.append(categoria.getNombreCategoria() + "| Blue-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));
                    JT_Area.append(categoria.getNombreCategoria() + "| Sepia-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));

                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (TB_Modificar.isSelected()) {
                JPEGImageHandlerRotator colores = new JPEGImageHandlerRotator(imagen.getFile());
                JPEGHandler handler = new JPEGHandler();
                try {
                    handler.runHandler(colores);
                    JT_Area.append(categoria.getNombreCategoria() + "| hRotation-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));
                    JT_Area.append(categoria.getNombreCategoria() + "| vRotation-" + imagen.getNombre());
                    JT_Area.append(System.getProperty("line.separator"));

                } catch (Exception ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe agregar una imagen",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
