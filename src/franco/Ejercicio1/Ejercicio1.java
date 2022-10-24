package franco.Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {

        int numeroDeAfiliado;
        ArrayList<Integer> pacientesDeUrgencia = new ArrayList<>();
        ArrayList<Integer> pacientesConTurno = new ArrayList<>();

        System.out.println("Digite su numero de afiliado: ");
        Scanner recepcion = new Scanner(System.in);
        numeroDeAfiliado = recepcion.nextInt();


            while (numeroDeAfiliado != -1) {
                int tipoDeAtencion;

                System.out.println("Digite 0 si es urgencia o 1 si es por turno: ");
                tipoDeAtencion = recepcion.nextInt();


                if (tipoDeAtencion == 0) {
                    pacientesDeUrgencia.add(numeroDeAfiliado);

                }
                if (tipoDeAtencion == 1) {
                    pacientesConTurno.add(numeroDeAfiliado);
                }
                System.out.println("Digite su numero de afiliado: ");
                numeroDeAfiliado = recepcion.nextInt();
            }
            System.out.println("Los pacientes atendidos por urgencia son " + pacientesDeUrgencia);
            System.out.println("Los pacientes atendidos por turno son " + pacientesConTurno);

            int cantidadDeUrgencias = 0;
            int cantidadDeTurnos = 0;
            for (int i = 0; i < pacientesDeUrgencia.size(); i++) {

                if (numeroDeAfiliado == pacientesDeUrgencia.get(i)) {
                    cantidadDeUrgencias++;
                }

            }

            System.out.println("El afiliado se atendio " + cantidadDeUrgencias + " veces de urgencia");

            for (int i = 0; i < pacientesConTurno.size(); i++) {

                if (numeroDeAfiliado == pacientesConTurno.get(i)) {
                    cantidadDeTurnos++;
            }



        }

            System.out.println("El afiliado se atendio " + cantidadDeTurnos + " veces con turno");

    }




}






