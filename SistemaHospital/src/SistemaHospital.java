import java.util.Scanner;

public class SistemaHospital {
    public static void main(String[] args) {
        isNussValid();
    }

    private static void isNussValid() {
        Scanner consola = new Scanner(System.in);
        System.out.print("Número de la Seguridad Social (NUSS) del paciente: ");

        boolean nussValido = false;
        int nuss = 0;

        while (!nussValido) {
            nuss += Integer.parseInt(consola.nextLine());

            if(nuss >= 100000 && nuss <= 999999) {
                nussValido = true;
            } else {
                System.out.print("Por favor, introduzca un NUSS válido: ");
            }
        }
        System.out.println("Paciente: " + nuss);
        triaje(nuss);
    }

    private static void triaje(int nuss) {
        Scanner consola = new Scanner(System.in);
        boolean salir = false;

        System.out.println();

        try {
            while (!salir) {
                int sintoma = mostrarMenu(consola);
                var paciente = exploracion(consola, sintoma);
                imprimirDiagnostico(nuss, paciente);
                if(paciente != null || sintoma == 5){
                    salir = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error en la app: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println();
        }
    }

    private static int mostrarMenu (Scanner consola){
        System.out.print("""
                    Síntoma del paciente:
                    \t1. Dolor
                    \t2. Lesión traumática
                    \t3. Fiebre alta
                    \t4. Confusión o desorientación
                    \t5. Salir
                    """);
        return Integer.parseInt(consola.nextLine());
    }

    private static Paciente exploracion(Scanner consola, int sintoma){
        Paciente paciente = null;

        switch (sintoma){
            case 1 -> {
                System.out.println("""
                        ¿Exploración?
                        \t1. Dolor torácico
                        \t2. Dolor abdominal
                        \t3. Dolor de cabeza
                        \t4. Migraña
                        """);
                var exploracion = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es el nivel de prioridad del paciente? (0-5): ");
                var nivelPrioridad = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es su temperatura actual? ");
                var temperaturaActual = Integer.parseInt(consola.nextLine());
                paciente = new Paciente(sintoma, exploracion, nivelPrioridad, temperaturaActual);
            }
            case 2 -> {
                System.out.println("""
                        ¿Exploración?
                        \t5. Fractura ósea
                        \t6. Herida de bala
                        \t7. Quemadura
                        \t8. Lesión cerebral traumática
                        """);
                var exploracion = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es el nivel de prioridad del paciente? (0-5): ");
                var nivelPrioridad = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es su temperatura actual? ");
                var temperaturaActual = Integer.parseInt(consola.nextLine());
                paciente = new Paciente(sintoma, exploracion, nivelPrioridad, temperaturaActual);
            }
            case 3 -> {
                System.out.println("""
                        ¿Exploración?
                        \t9. Neumonía
                        \t10. Meningitis
                        \t11. Infección viral
                        \t12. Reacción alérgica
                        """);
                var exploracion = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es el nivel de prioridad del paciente? (0-5): ");
                var nivelPrioridad = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es su temperatura actual? ");
                var temperaturaActual = Integer.parseInt(consola.nextLine());
                paciente = new Paciente(sintoma, exploracion, nivelPrioridad, temperaturaActual);
            }
            case 4 -> {
                System.out.println("""
                        ¿Exploración?
                        \t13. Intoxicación por drogas o alcohol
                        \t14. Deshidratación severa
                        \t15. Accidente cerebrovascular
                        \t16. Hipoglucemia severa
                        """);
                var exploracion = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es el nivel de prioridad del paciente? (0-5): ");
                var nivelPrioridad = Integer.parseInt(consola.nextLine());
                System.out.print("Cuál es su temperatura actual? ");
                var temperaturaActual = Integer.parseInt(consola.nextLine());
                paciente = new Paciente(sintoma, exploracion, nivelPrioridad, temperaturaActual);
            }
            case 5 -> {
                System.out.println("Que tenga un buen día!");
            }
            default -> {
                System.out.println("Opción inválida");
            }
        }
        return paciente;
    }

    private static void imprimirDiagnostico(int nuss, Paciente paciente){
        if(paciente != null){
            System.out.println();
            System.out.printf("""
                    El diagnóstico del paciente con NUSS %d es:
                    Síntoma: %s
                    Exploración: %s
                    Nivel prioridad: %d
                    Temperatura actual: %d
                    """,
                    nuss,
                    paciente.getSintomaName(),
                    paciente.getExploracionName(),
                    paciente.getNivelPrioridad(),
                    paciente.getTemperaturaActual());
            }
        }
    }

