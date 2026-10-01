public class ListaProfesores {

    private Nodo cabeza;

    public void agregar(Profesor profesor) {

        Nodo nuevo = new Nodo(profesor);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    public String ProxCambio() {

        String resultado = "";
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.profesor.categoria.equals("Instructor")
                    && actual.profesor.edad > 26) {

                resultado += actual.profesor.nombre + "\n";
            }

            actual = actual.siguiente;
        }

        return resultado;
    }

    public void MostrarLista() {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;

        while (actual != null) {

            Nodo mayor = actual;
            Nodo siguiente = actual.siguiente;

            while (siguiente != null) {

                if (siguiente.profesor.edad > mayor.profesor.edad) {
                    mayor = siguiente;
                }

                siguiente = siguiente.siguiente;
            }

            Profesor temporal = actual.profesor;
            actual.profesor = mayor.profesor;
            mayor.profesor = temporal;

            actual = actual.siguiente;
        }

        actual = cabeza;

        while (actual != null) {
            System.out.println(
                    actual.profesor.nombre + " - "
                            + actual.profesor.edad + " años - "
                            + actual.profesor.categoria
            );

            actual = actual.siguiente;
        }
    }

    public void CantProfesores() {

        int instructores = 0;
        int asistentes = 0;
        int auxiliares = 0;
        int titulares = 0;

        Nodo actual = cabeza;

        while (actual != null) {

            switch (actual.profesor.categoria) {

                case "Instructor":
                    instructores++;
                    break;

                case "Asistente":
                    asistentes++;
                    break;

                case "Auxiliar":
                    auxiliares++;
                    break;

                case "Titular":
                    titulares++;
                    break;
            }

            actual = actual.siguiente;
        }

        System.out.println("Cantidad de profesores por categoría:");
        System.out.println("Instructor: " + instructores);
        System.out.println("Asistente: " + asistentes);
        System.out.println("Auxiliar: " + auxiliares);
        System.out.println("Titular: " + titulares);
    }
}