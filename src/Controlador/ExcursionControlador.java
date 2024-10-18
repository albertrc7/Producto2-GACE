/*package Controlador;
import Modelo.ListaExcursion;
import Vista.VistaExcursion;
public class ExcursionControlador {
    private ListaExcursion listaExcursion;
    private VistaExcursion vistaExcursion;
    public void gestionarExcursion(){
        System.out.println("Proximamente");
    }
    public void crearExcursion(){
        System.out.println("Proximamente");
    }

    public void eliminarExcursion(String codigo){
        System.out.println("Proximamente");
    }

    public void mostrarDetalleExcursion(String codigo){
        System.out.println("Proximamente");
    }

}

*/
package Controlador;
import Modelo.ListaExcursion;
import Modelo.Excursion;
import Vista.VistaExcursion;

public class ExcursionControlador {
    private ListaExcursion listaExcursion;
    private VistaExcursion vistaExcursion;

    public ExcursionControlador(ListaExcursion lista, VistaExcursion vista) {
        this.listaExcursion = lista;
        this.vistaExcursion = vista;
    }

    public void gestionarExcursion() {
        vistaExcursion.mostrarExcursiones(listaExcursion.getListaExcursiones());
    }

    public void crearExcursion(String codigo, String descripcion, Date fecha, int noDias, double precio) {
        Excursion excursion = vistaExcursion.formExcursion(codigo, descripcion, fecha, noDias, precio);
        listaExcursion.anyadirExcursion(excursion);
    }

    public void eliminarExcursion(String codigo) {
        Excursion excursion = listaExcursion.getExcursion(codigo);
        if (excursion != null) {
            listaExcursion.eliminarExcursion(excursion);
        }
    }

    public void mostrarDetalleExcursion(String codigo) {
        Excursion excursion = listaExcursion.getExcursion(codigo);
        if (excursion != null) {
            vistaExcursion.detalleExcursion(excursion);
        }
    }
}


