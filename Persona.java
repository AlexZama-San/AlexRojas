import java.util.*;

public class Persona {
    public static Scanner lector=new Scanner(System.in);
    public static String nombre;
    public static String FechaNac;
    public static String rfc;
    public static String curp;
    public static String NumTel;
    public static String CorreoE;
    public static void setNombre(){
        System.out.println("escriba el nombre de la persona");
        nombre=lector.next();
    }
    public static String getNombre(){
        return nombre;
    }
    public static void setFechaNac(){
        System.out.println("escriba la fecha de nacimiento de la persona");
        FechaNac=lector.next();
    }
    public static String getFechaNac(){
        return FechaNac;
    }
    public static void setRfc(){
        System.out.println("escriba el RFC de la persona");
        rfc=lector.next();
    }
    public static String getRfc(){
        return rfc;
    }
    public static void setCurp(){
        System.out.println("escriba el curp de la persona");
        curp=lector.next();
    }
    public static void setNumTel(){
        System.out.println("escriba el numero telefonico de la persona");
        NumTel=lector.next();
    }
    public static String getNumTel(){
        return NumTel;
    }
    public static void setCorreoE(){
        System.out.println("escriba un correo electronico de la persona");
        CorreoE=lector.next();
    }
    public static String getCorreoE(){
        return CorreoE;
    }
    public static String getCurp(){
        return curp;
    }
    public static int Edad(){
        int edad=0;
        String nac=rfc.substring(4,10);
        int anio=Integer.parseInt(nac.substring(0,2));
        int mez=Integer.parseInt(nac.substring(2,4));
        int day=Integer.parseInt(nac.substring(4,6));
        if (mez==0){
            mez=0;
        }
        else{
            mez--;
        }
        Date FechaHoy=new Date();
        FechaHoy=Calendar.getInstance().getTime();
        if(anio>FechaHoy.getYear()-100) {
            anio=anio+1900;
            if (mez <= FechaHoy.getMonth() && day <= FechaHoy.getDay() || day >= FechaHoy.getDay() && mez < FechaHoy.getMonth()) {
                edad = (FechaHoy.getYear() + 1900) - anio;
            } else {
                edad = (FechaHoy.getYear() + 1900) - anio;
                edad--;
            }
        }
        else {
            anio=anio+2000;
            if (mez <= FechaHoy.getMonth() && day <= FechaHoy.getDay() || day >= FechaHoy.getDay() && mez < FechaHoy.getMonth()) {
                edad = (FechaHoy.getYear() + 1900) - anio;
            } else {
                edad = (FechaHoy.getYear() + 1900) - anio;
                edad--;
            }
        }
    return edad;
    }
}
