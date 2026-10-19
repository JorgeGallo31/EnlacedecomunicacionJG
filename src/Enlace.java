public class Enlace {
    public String nombre;
    public double velocidadMbps;

    String origen;
    String destino;
    boolean activo;

    public void activar() {
        activo = true;
        System.out.println("El enlace " + nombre + " ha sido activado.");
    }

    public void mostrarInformacion() {
        System.out.println("Enlace: " + nombre + " | Origen: " + origen + " | Destino: " + destino);
        System.out.println("¿Está activo?: " + activo);
    }

    void desactivar() {
        activo = false;
        System.out.println("El enlace " + nombre + " ha sido desactivado.");
    }

    void mostrarVelocidad() {
        System.out.println("Velocidad de conexión: " + velocidadMbps + " Mbps");
    }
}