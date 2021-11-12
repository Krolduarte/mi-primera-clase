public class ClaseGimnasio{
    private String nombreCliente;
    private int clasesProgramadas;
    private boolean conReserva;

    public ClaseGimnasio(String nombreDelCliente, int numeroDeClases, boolean tieneReserva){
        nombreCliente = nombreDelCliente;
        clasesProgramadas = numeroDeClases;
        conReserva = true;
    }
        
    public String getNombre(){
       return nombreCliente; 
    }
    
    public void aumentarCantidadClases (int numeroDeClases){
        clasesProgramadas = numeroDeClases + 1;
    }
    
    public int getNumeroDeClasesProgramadas(){
        return clasesProgramadas;
    }
    
    public boolean getEstadoReserva(){
        return conReserva;
    }
    
    public void setNombreCliente (String nombreDelCliente){
        nombreCliente = nombreDelCliente;
        
    }
    
    
    
    public void cambiarEstadoReserva(){
        conReserva = false;
    }
    
    public void imprimeEstadoReserva(){
        System.out.println("En el momento, el cliente " + nombreCliente + " tiene reservada " + clasesProgramadas + " clases.");
    }
    
    public String getEstadoCompleto(){
        
        return nombreCliente + " tiene "  + clasesProgramadas +  " clases programadas y " + "tiene reserva: " + conReserva;
    }
    
 }
 
 
 
 
 /**
 
ClaseGimnasio

El nombre de los atributos y su tipo de dato.

nombreCliente
clasesProgramadas
reserva

El nombre de los métodos modificadores del segundo y tercer atributo.

aumentarCantidadClases
reservar

El nombre de los dos últimos métodos que se piden.

GetEstadoReserva
imprimeEstadoReserva
**/