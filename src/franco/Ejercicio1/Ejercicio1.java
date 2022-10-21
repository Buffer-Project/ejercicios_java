package franco.Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {

        int numeroDeAfiliado = 0;
        ArrayList<Integer> pacientesDeUrgencia = new ArrayList<>();
        ArrayList<Integer> pacientesConTurno = new ArrayList<>();

        while (numeroDeAfiliado!=-1) {
            ArrayList<Integer> cantidadDeAfiliados = new ArrayList<>();
            Scanner scannerDeSocios = new Scanner(System.in);


            System.out.println("Digite su numero de afiliado: ");
            numeroDeAfiliado = scannerDeSocios.nextInt();
            cantidadDeAfiliados.add(numeroDeAfiliado);


            ArrayList<Integer> cantidadDeTurnos = new ArrayList<>();
            Scanner scannerDeTurnos = new Scanner(System.in);
            int tipoDeAtencion;

            System.out.println("Digite 0 si es urgencia o 1 si es por turno: ");
            tipoDeAtencion = scannerDeTurnos.nextInt();
            cantidadDeTurnos.add(tipoDeAtencion);

            boolean estaRepetido = false;
            int contadorTurno = 1;
            int contadorUrgencia = 1;

            if(tipoDeAtencion==0) {
                if (estaRepetido = false) {
                    pacientesDeUrgencia.add(numeroDeAfiliado);
                } else {
                    estaRepetido=true;
                    contadorUrgencia++;
                }

            }
            if(tipoDeAtencion==1){
                if(estaRepetido=false){
                    pacientesConTurno.add(numeroDeAfiliado);
                } else {
                    estaRepetido=true;
                    contadorTurno++;
                }
            }

        }
        System.out.println("Los pacientes atendidos por urgencia son " + pacientesDeUrgencia);
        System.out.println("Los pacientes atendidos por turno son " + pacientesConTurno);


    }

}