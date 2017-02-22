
package olimpiatec;


public class OlimpiaTec {


    public static void main(String[] args) {
        Alumno pedro = new Alumno("5","pedro","masculino","itic");
        
        Equipod equipillo = new Equipod("6",pedro);
        equipillo.addAlumno(pedro);
        Deporte soccer= new Deporte("53","Soocer",equipillo);
         soccer.addEquipod(equipillo);
        System.out.println("");
        
                }
}
