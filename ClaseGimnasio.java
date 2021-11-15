public class ClaseGimnasio{
    private String nombreCliente;
    private int clasesProgramadas;
    private boolean conReserva;
   

    public ClaseGimnasio(String nombreDelCliente, int numeroDeClases){
        nombreCliente = nombreDelCliente;
        clasesProgramadas = numeroDeClases;
        conReserva = true;
        
    }
        
    public String getNombre(){
       return nombreCliente; 
    }
    
    public void setNombreCliente (String nombreDelCliente){
        nombreCliente = nombreDelCliente;
        
    }
    
    public void aumentarCantidadClases (){
        clasesProgramadas = clasesProgramadas + 1;
        System.out.println("Usted tiene " + clasesProgramadas + " clases programadas");
        
    }
    
    public int getTotalDeClasesProgramadas(){
        return clasesProgramadas;
    }
    
    public boolean getEstadoReserva(){
        return conReserva;
    }
        
    public void modificarEstadoReserva(){
        if (conReserva ==true){
            conReserva =false;
        }
        else{
            conReserva= true;
        }
    }
    
    public void imprimeTotalClasesReservadas(){
        System.out.println("En el momento, el cliente " + nombreCliente + " tiene reservada " + clasesProgramadas + " clases.");
    }
    
    public String getEstadoCompletoDeReserva(){
        String tieneReserva;
        if (conReserva == true){
            tieneReserva = "Si";
        }
        else{
            tieneReserva = "No";
        }
        return "Cliente: " + nombreCliente + " Clases Programadas:  "  + clasesProgramadas + " . Tiene reserva: " + tieneReserva;
    }
    
 }
 
 
 
 
 /**
  * Datos iniciales:
 
ClaseGimnasio

El nombre de los atributos y su tipo de dato.

nombreCliente
clasesProgramadas
reserva

El nombre de los metodos modificadores del segundo y tercer atributo.

aumentarCantidadClases
reservar

El nombre de los dos ultimos metodos que se piden.

GetEstadoReserva
imprimeEstadoReserva
**/