
package paquete4;

public class Ejecutor2 {

    public static void main(String[] args) {

        String nombre = "Rene";
        String apellido = "Elizalde";
        String identificacion = "1100";
        int edad = 36;
        EstudiantePresencial esP = new EstudiantePresencial(
                nombre, apellido, identificacion, edad);
        esP.establecerNumeroCreditos(10);
        esP.establecerCostoCredito(200);
        esP.calcularMatriculaPresencial();
        System.out.println(esP);

    }

}
