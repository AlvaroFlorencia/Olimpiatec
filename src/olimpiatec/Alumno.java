
package olimpiatec;


public class Alumno {
     private String id;
    private String name;      //Atributos del alumno
    private String gender;
    private String carrer;

    public Alumno(String id, String name, String gender, String carrer) {
        this.id = id;
        this.name = name;
        this.gender = gender;           //Constructor
        this.carrer = carrer;
    }
    
   

    public String getId() {           //Getters
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {                
        return gender;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setId(String id) {               //Setters
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    @Override               //To string
    public String toString() {
        return "Alumno= , " + "[id= " + this.id + ", name= " + this. name + ", gender=" + this.gender + ", carrer=" + this.carrer + "]";
    }

    
   
    
    
}
