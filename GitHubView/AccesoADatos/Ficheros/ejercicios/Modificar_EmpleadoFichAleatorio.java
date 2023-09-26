package Ficheros;

import java.util.Scanner;
import java.io.*;


public class Modificar_EmpleadoFichAleatorio {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int id;
        double salario;
        RandomAccessFile fichero = new RandomAccessFile(new File("AleatorioEmple.dat"), "rw");
        System.out.println("Introduce el id del empleado a actualizar:");
        while (true) {
            System.out.print("Escribe la id del empleado (0 para salir): ");
            id = scanner.nextInt();
            if (id == 0) {
                break;
            }
            long posicion = ((id - 1)* 36);
            // el 36 es por el numero de bytes que usamos para guardar cada empleado,
            //4 para los int y 2 por cada caracter del string
            fichero.seek(posicion); // nos posicionamos
            
            if(fichero.readInt()==0) {
                System.out.println("El empleado no existe");
                continue;
            }
            
            fichero.seek(posicion+28);
            
            salario = fichero.readDouble();
            
            System.out.println("Antiguo salario: " + salario);
            
            System.out.print("Nuevo salario: ");
            salario = scanner.nextDouble();
            fichero.seek(posicion+28);
            fichero.writeDouble(salario);// insertar salario
        }
        fichero.close();
    }
}