import java.util.List;
import pojos.Alumno;

public class consulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Alumno> list=crud.crudAlumno.getlist();
        System.out.println();
    }
    
    
    
    
}
