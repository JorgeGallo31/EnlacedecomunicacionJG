public class Main {
    public static void main(String[] args) {
        Enlace enlace1 = new Enlace();
        enlace1.nombre = "Fibra Óptica Principal";
        enlace1.velocidadMbps = 1000.0;
        enlace1.origen = "Quito";
        enlace1.destino = "Guayaquil";
        enlace1.activo = false;

        Enlace enlace2 = new Enlace();
        enlace2.nombre = "Respaldo Satelital";
        enlace2.velocidadMbps = 50.0;
        enlace2.origen = "Quito";
        enlace2.destino = "Cuenca";
        enlace2.activo = false;

        Enlace enlace3 = new Enlace();
        enlace3.nombre = "Conexión Regional";
        enlace3.velocidadMbps = 300.0;
        enlace3.origen = "Guayaquil";
        enlace3.destino = "Manta";
        enlace3.activo = false;

        enlace1.mostrarInformacion();
        enlace1.mostrarVelocidad();
        enlace1.activar();


        enlace2.mostrarInformacion();
        enlace2.activar();
        enlace2.desactivar();


        enlace3.mostrarInformacion();
        enlace3.mostrarVelocidad();
    }
}