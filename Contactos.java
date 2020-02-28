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
    public static void removeContact(){
        int elecc;
        System.out.println("¿que contacto desea remover?");
        int c=0;
        while(c<Contac.size()){
            System.out.println(c+".- "+Contac.get(c)+"\n");
            c++;
        }
        elecc=lector.nextInt();
        Contac.remove(elecc);
    }
    public static void MostrarLista(){
        int c=0;
        while(c<Contac.size()){
            System.out.println(c+".- "+Contac.get(c)+"\n");
            c++;
        }
    }
}
