public class Calculadora {
    private static int opcion;
    private static void menu(){
        scan.writeLn("--- Calculadora Basica ---");
        scan.writeLn("0. Salir");
        scan.writeLn("1. Suma");
        scan.writeLn("2. Resta");
        scan.writeLn("3. Multiplicacion");
        scan.writeLn("4. Divicion");
        opcion = scan.read_integer("    > Opcion");
    }
    public static void main(String[] args) {
       boolean flag;
       do {
           flag = true;
           menu();
           switch (opcion){
               case 0:
                   flag = false;
                   scan.write("Bye Bye");
                   break;
               case 1:
                   scan.writeLn("Sumar: ");
                   int var_sum_A =  scan.read_integer("Numero 1");
                   int var_sum_B =  scan.read_integer("Numero 2");
                   int Suma = (var_sum_A + var_sum_B);
                   scan.writeLn("Resultado: " + Suma);
                   break;
               case 2:
                   scan.writeLn("Restar: ");
                   int var_res_A =  scan.read_integer("Numero 1");
                   int var_res_B =  scan.read_integer("Numero 2");
                   int Resta = (var_res_A - var_res_B);
                   scan.writeLn("Resultado: " + Resta);
                   break;
               case 3:
                   scan.writeLn("Multiplicar: ");
                   int var_mul_A =  scan.read_integer("Numero 1");
                   int var_mul_B =  scan.read_integer("Numero 2");
                   int Multiplicar = (var_mul_A * var_mul_A);
                   scan.writeLn("Resultado: " + Multiplicar);
                   break;
               case 4:
                   scan.writeLn("Dividir: ");
                   int var_mod_A =  scan.read_integer("Numero 1");
                   int var_mod_B =  scan.read_integer("Numero 2");
                   int Division = (var_mod_A / var_mod_B);
                   scan.writeLn("Resultado: " + Division);
                   break;
               default:
                   scan.write("Esa opcion no es valida");
                   break;
           }
       }while (flag);
    }
}
