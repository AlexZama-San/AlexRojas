import java.util.*;
public class Contactos {
    public static Scanner lector=new Scanner(System.in);
    public static Vector<String> Contac=new Vector<String>(0,1);
    public static void AddContact(){
        Persona persona=new Persona();
        String add="";
        persona.setNombre();
        persona.setFechaNac();
        persona.setNumTel();
        persona.setCorreoE();
        add=" Nombre: "+persona.getNombre()+"\n Fecha de nacimiento: "+persona.getFechaNac()+"\n Numero telefonico: "+persona.getNumTel()+"\n Correo Electronico: "+persona.getCorreoE();
        Contac.add(add);
    }
}
