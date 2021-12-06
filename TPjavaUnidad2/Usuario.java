
package TPjavaUnidad2;


import java.util.Scanner;


/**
 Crear un programa en java en el cual se pida al usuario ingresar su nombre,
 * apellido, edad, hobbie, editor de código preferido, sistema operativo que 
 * utiliza, luego deberá mostrarse por consola los datos ingresados.
 */
public class Usuario {
    private String nomYape;
    private String usuario;
    private String contraseña;
    private int edad;
    private String hobbie;
    private String editorFav;
    private String sistOp;
    
    Scanner teclado= new Scanner(System.in);
    Scanner tecla= new Scanner(System.in);
    public Usuario() {
    }

    public Usuario(String nomYape, String usuario, String contraseña, int edad, String hobbie, String editorFav, String sistOp) {
        this.nomYape = nomYape;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorFav = editorFav;
        this.sistOp = sistOp;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public void setEditorFav(String editorFav) {
        this.editorFav = editorFav;
    }

    public void setSistOp(String sistOp) {
        this.sistOp = sistOp;
    }

    public String getNomYape() {
        return nomYape;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getEditorFav() {
        return editorFav;
    }

    public String getSistOp() {
        return sistOp;
    }
    
    public void cargarDatos(){
        
        System.out.println("Bienvenido"
                            + "\nIngrese el Nombre y Apellido: ");
        nomYape= teclado.nextLine();
    
        System.out.println("Ingrese el Usuario: ");
        usuario=teclado.nextLine();
        
        System.out.println("Ingrese la contraseña: ");
        contraseña= teclado.nextLine();
        
        System.out.println("Ingrese la edad: ");
        edad=tecla.nextInt();
        
        System.out.println("Ingrese un hobbie: ");
        hobbie=teclado.nextLine();
        
        System.out.println("Ingrese su editor de código : ");
        editorFav=teclado.nextLine();
        
        System.out.println("Ingrese su sistema operativo: ");
        sistOp=teclado.nextLine();
    }
    
    public void mostrarDatos(){
        System.out.println("Les datos ingresados son"
                + "\nNombre y apellido: "+ nomYape
                + "\nEdad: "+ edad
                + "\nHobbie: "+ hobbie
                + "\nEditor favorito: "+ editorFav
                + "\nSistema operativo: "+ sistOp
        );
    }
}