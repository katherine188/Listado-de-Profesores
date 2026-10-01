# Ejercicio - Lista de Profesores

## Descripción

Este proyecto implementa una lista simplemente enlazada de profesores utilizando Java.

Cada profesor contiene los siguientes datos:

- Nombre
- Edad
- Categoría docente

Las categorías utilizadas son:

- Instructor
- Asistente
- Auxiliar
- Titular

El proyecto permite almacenar profesores en una lista simplemente enlazada y realizar diferentes operaciones sobre los datos almacenados.

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

- `Profesor.java`: representa a cada profesor y almacena su nombre, edad y categoría docente.
- `Nodo.java`: representa cada nodo de la lista y contiene un profesor y una referencia al siguiente nodo.
- `ListaProfesores.java`: contiene la implementación de la lista simplemente enlazada y las operaciones realizadas.
- `Main.java`: contiene los datos de prueba y permite comprobar el funcionamiento de las operaciones.

## Operaciones implementadas

### 1. Agregar profesores

El método `agregar()` permite insertar un nuevo profesor al final de la lista simplemente enlazada. Para realizar esta operación se crea un nuevo nodo que contiene los datos del profesor. Si la lista está vacía, el nuevo nodo se convierte en la cabeza. Si la lista ya contiene elementos, se recorre hasta encontrar el último nodo y se conecta el nuevo nodo.

Ejemplo:
```text
Ana → Carlos → Pedro → null

### 2. ProxCambio
Recorre la lista y busca los profesores que pertenecen a la categoría Instructor y que tienen mas de 26 años. Cuando encuentra un profesor que cumpla ambas condiciones, agrega su nombre al resultado.
Ejemplo:
```text
Ana- 28 años- Instructor
Carlos- 35 años- Asistente
Luis- 30 años- Instructor
Maria- 25 años- Auxiliar
Resultado:
Ana
Luis

### 3. MostrarLista
Muestra los profesores de la lista ordenados de mayor a menor según su edad. Para realizarlo, se recorren los nodos y se busca el profesor de mayor edad para colocarlo en la posición correspondiente.
Ejemplo:
```text
Ana- 28 años
Carlos- 35 años
Maria- 25 años
Pedro- 40 años
Resultado:
Pedro- 40 años
Carlos- 35 años
Ana- 28 años
Maria- 25 años

### 4. CantProfesores
Recorre  la lista y cuenta cuántos profesores existen de cada categoría docente.

```text
Ana → Carlos → Pedro → null
