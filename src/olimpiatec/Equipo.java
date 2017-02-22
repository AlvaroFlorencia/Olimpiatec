

package olimpiatec;


public class Equipo {   //Clase utilizada para llevar cuenta de los equipos registrados
   private int  idRegister; 
   private String Name; //Nombre personalizado del equipo

    public Equipo(int idRegister, String Name) {
        this.idRegister = idRegister;                    //Constructor
        this.Name = Name;
    }

    public int getIdRegister() {
        return idRegister;                        //Getters
    }

    public String getName() {
        return Name;
    }

    public void setIdRegister(int idRegister) {   //Setters
        this.idRegister = idRegister;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override//To string
    public String toString() {
        return "Equipo= " + "[idTeam=" + this.idRegister + ", Name=" + this.Name + "]";
    }
   
   
}
