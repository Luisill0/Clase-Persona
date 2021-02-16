package uaslp;

public class Main {

    public static void main(String[] args) {
	    Persona Sara = new Persona();
	    Persona Jose = new Persona();

	    Sara.setNombre("Sara");
	    Jose.setNombre("Jose");

	    for(int i=0;i<4;i++){
            Sara.cumpliranios();
            if(i%2==0){
                Jose.cumpliranios();
            }
        }
        System.out.println(Sara.getNombre()+" tiene " + Sara.getEdad() + " anios");
        System.out.println(Jose.getNombre()+" tiene " + Jose.getEdad() + " anios");
    }
}

class Persona{
    private int edad;
    private String nombre;

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return nombre;
    }

    int getEdad(){
        return edad;
    }

    void cumpliranios(){
        edad++;
    }
}