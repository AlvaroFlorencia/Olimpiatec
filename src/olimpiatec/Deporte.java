
package olimpiatec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class Deporte {
     private String id;
    private  String nameSport;              //Atributos del deporte
  
     private ArrayList<Equipod> equipos;

    public Deporte(String id, String nameSport) {         //Constructor
        this.id = id;
        this.nameSport = nameSport;
        this.equipos= equipos;
        
    }
    public Deporte(String id,String nameSport,Equipod equipos) {  //Constructor
        this.id = id;
        this.nameSport=nameSport;
       this.equipos = new ArrayList<Equipod>();
    }

    public String getId() {
        return id;
    }

    public String getNameSport() {        //Getters
        return nameSport;
    }

    public void setId(String id) {          //Setters
        this.id = id; 
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }
     private boolean findEquipod(String id) {
      
        if (!this.equipos.isEmpty()) {
            for(Equipod tempEquipod : equipos) {          //Para encontrar un equipo de utiliza un 
                                                           //para saber si esta vacio y mediante un super
                                                           //for se corre un if se compara el id y se regresa true 
             
                if (tempEquipod.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
     public boolean addEquipod( String id, Equipo equipo,ArrayList<Alumno> alumnos ) {
        
        
        if (!findEquipod(id)) {
             this.equipos.add(new Equipod(id, equipo,alumnos));      //Para añadir un equipose crear un nuevo 
                                                                      //equipo y se regresa true  
            return true;
        } else {
            return false;
        }
    }
     public boolean addEquipod(Equipod equipos) {
        

        if (!findEquipod(equipos.getId())) {
            this.equipos.add(equipos);
            return true;
        } else {
            return false;
        }
      }
     public boolean removeEquipod(String id) {              //Para remover un equipo se utliza un iterator
                                                           //y un while con la función has next,se compara id 
                                                           //si es igual se remueve
        if (findEquipod(id)) {
            
            
            ListIterator it = this.equipos.listIterator();
            while (it.hasNext()) {
                Equipod temp = (Equipod) it.next();
                
               
                if (temp.getId()== id) {
                    it.remove();
                    return true;
                }
            }
            return true;
        } else {
            return false;
        }
    }
        public boolean removeEquipod(Equipod equipos) {
        
      
        return removeEquipod(equipos.getId());
    }
   public boolean ActualizarEquipod(String id) {
                                                       //Para actualizar el equipo se compara si esta vacío ,
        if(!this.equipos.isEmpty()) {                  //después se utiliza un suoer for , y por ultimo se compara el id
            for(Equipod tempEquipod : equipos) {        // y se regresa true 
              
                if (tempEquipod.getId() == id)  {
                    tempEquipod.setId(id);
                    return true;
                }
            }
        }
        return false;
    }
       public boolean ActualizarEquipod(Equipod equipos) {  
           ActualizarEquipod(equipos.getId());
        return    ActualizarEquipod(equipos.getId());
              
    }
      @Override
    public String toString(){   //To string
        String temp;
        temp="" ;
         for(Equipod tempEquipod : equipos) {
        temp =  "Equipod{" + "id=" + tempEquipod.getId()+ ", equipo=" + tempEquipod.getEquipo()+"]";
                    
         }
        
     
        return temp;
    
}
}
