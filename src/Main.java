public class Main {

    public static void main(String[] args) {

        ListaProfesores lista = new ListaProfesores();

        // Agregar profesores
        lista.agregar(new Profesor("Ana", 28, "Instructor"));
        lista.agregar(new Profesor("Carlos", 35, "Asistente"));
        lista.agregar(new Profesor("Maria", 25, "Auxiliar"));
        lista.agregar(new Profesor("Pedro", 40, "Titular"));
        lista.agregar(new Profesor("Luis", 30, "Instructor"));
        lista.agregar(new Profesor("Sofia", 24, "Asistente"));
        lista.agregar(new Profesor("Juan", 32, "Auxiliar"));
        lista.agregar(new Profesor("Laura", 45, "Titular"));

        // Probar ProxCambio()
        System.out.println("1. Profesores candidatos al próximo cambio:");
        System.out.println(lista.ProxCambio());

        // Probar MostrarLista()
        System.out.println("2. Profesores ordenados por edad:");
        lista.MostrarLista();

        System.out.println();

        // Probar CantProfesores()
        System.out.println("3. Cantidad de profesores por categoría:");
        lista.CantProfesores();
    }
}