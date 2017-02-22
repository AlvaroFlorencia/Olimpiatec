 
package olimpiatec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class Equipod {
    private String id;
    private Equipo equipo;                 //Atributod del equipo
     private ArrayList<Alumno> alumnos;
    
    public Equipod(String id, int idTeam, String Name ) {            //Constructor
        this.id = id;
        this.equipo = new Equipo(idTeam,Name);
        
        
    this.alumnos = new ArrayList<Alumno>();
    }
    public Equipod(String id,Alumno alumnos) {
        this.id = id;
        this.equipo = equipo;
       this.alumnos = new ArrayList<Alumno>();
    }

    Equipod(String id, Equipo equipo, ArrayList<Alumno> alumnos) {
       
    }

    public String getId() {
        return id;
    }
                                  //Getters
    public Equipo getEquipo() {
        return equipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEquipo(Equipo equipo) {       //Setters
        this.equipo = equipo;
    }

 
    private boolean findAlumno(String id) {           //Para encontrar un alumno de utiliza un 
                                                           //para saber si esta vacio y mediante un super
                                                           //for se corre un if se compara el id y se regresa true
      
        if (!this.alumnos.isEmpty()) {
            for(Alumno tempAlumno : alumnos) {
             
                if (tempAlumno.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
     public boolean addAlumno(String id, String name, String gender, String carrer) {
        
        
        if (!findAlumno(id)) {                                      //Para añadir un alumno se crear un nuevo 
                                                                      //alumno y se regresa true 
            this.alumnos.add(new Alumno(id, name,gender,carrer));
            
            return true;
        } else {
            return false;
        }
    }
      public boolean addAlumno(Alumno alumno) {
        

        if (!findAlumno(alumno.getId())) {
            this.alumnos.add(alumno);
            
            return true;
             
        } else {
            return false;
        }
      }
        public boolean removeAlumno(String id) {
        
        
        if (findAlumno(id)) {                     //Para remover un alumno se utliza un iterator
                                                           //y un while con la función has next,se compara id 
                                                           //si es igual se remueve
            
            
            ListIterator it = this.alumnos.listIterator();
            while (it.hasNext()) {
                Alumno temp = (Alumno) it.next();
                
               
                if (temp.getId() == id) {
                    it.remove();
                    return true;
                }
            }
            return true;
        } else {
            return false;
        }
    }
        public boolean removeAlumno(Alumno alumno) {
        
      
        return removeAlumno(alumno.getId());
    }
   
        public boolean ActualizarAlumno(String id, String name) {        //Para actualizar el alumno se compara si esta vacío ,
                                                                         //después se utiliza un super for , y por ultimo se compara el id
                                                                          // y se regresa true 
        
        if(!this.alumnos.isEmpty()) {
            for(Alumno tempAlumno : alumnos) {
              
                if ((tempAlumno.getId() == id) && (tempAlumno.getName()!= name)) {
                    tempAlumno.setName(name);
                    return true;
                }
            }
        }
        return false;
    }
    
    
   public boolean ActualizarAlumnoGender(String id, String gender) {
        
        if(!this.alumnos.isEmpty()) {
            for(Alumno tempAlumno : alumnos) {
              
                if ((tempAlumno.getId() == id) && (tempAlumno.getGender()!= gender)) {
                    tempAlumno.setGender(gender);
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean ActualizarAlumnoCarrer(String id, String carrer) {
        
        if(!this.alumnos.isEmpty()) {
            for(Alumno tempAlumno : alumnos) {
              
                if ((tempAlumno.getId() == id) && (tempAlumno.getCarrer()!= carrer)) {
                    tempAlumno.setCarrer(carrer);
                    return true;
                }
            }
        }
        return false;
    }
    
  
    public boolean ActualizarAlumno(Alumno alumnos) {       //Actualizar alumno recibiendo alumno
        ActualizarAlumno(alumnos.getId(),alumnos.getName());
        return (ActualizarAlumnoGender(alumnos.getId(),alumnos.getGender()))
                || (ActualizarAlumnoCarrer(alumnos.getId(), alumnos.getCarrer()));
    }
     @Override
    public String toString(){   //To string
        String temp;
        
        
        temp = "Equipo= " + "[idTeam=" + this.equipo.toString()+ ", Name=" + this.equipo.getName() + "]";
        
        
        for(Alumno tempAlumno : alumnos) {
            temp += "Alumno= , " + "[id= " + tempAlumno.getId() + ", name= " + tempAlumno.getName()+ 
                    ", gender=" + tempAlumno.getGender() + ", carrer=" + tempAlumno.getCarrer() + "]";
           
        }
    
        
       
   
        return temp;
    
}
}
