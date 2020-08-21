package crud;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import pojos.Alumno;
import util.HibernateUtil;

public class crudAlumno {
    public static List<Alumno> getlist(){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Alumno.class);
        List<Alumno> listAlumno= criteria.list();
        for(Alumno alumno : listAlumno){
            System.out.println(alumno.getCodUniversidad()+"  "+ alumno.getCodCarrera()+ " "+ alumno.getCodFacultad());
        }
        session.close();
        return listAlumno;
    }
    
}