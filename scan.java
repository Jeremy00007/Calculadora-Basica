import java.util.Scanner;

public class scan {
    public static void write(String texto){
        System.out.print(texto);
    }
    public static void writeLn(String texto){
        System.out.println(texto);
    }

    public static int read_integer(String message){
        int entero = 0;
        Boolean flag = true;
        Scanner teclado;
        do {
            write("\t"+message+": ");
            teclado = new Scanner(System.in);
            try{
                entero = teclado.nextInt();
                flag = false;
            }catch(Exception e){
                writeLn("Error: Ese no es un entero válido.");
                writeLn("Intentalo nuevamente el proximo año.");
            }
        }while (flag);
        return entero;
    }

    public static double read_decimal(String message){
        double decimal = 0;
        Boolean flag = true;
        Scanner teclado;
        do {
            write("\t"+ message +": ");
            teclado = new Scanner(System.in);
            try{
                decimal = teclado.nextDouble();
                flag = false;
            }catch(Exception e){
                writeLn("Error: Ese no es un entero válido.");
                writeLn("Intentalo nuevamente el proximo año.");
            }
        }while (flag);
        return decimal;
    }
}
