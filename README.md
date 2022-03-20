# Git Entornos

Proyecto correspondiente a la asignatura de Entornos de Desarrollo, [IES Hermenegildo Lanz](https://www.ieshlanz.es/)

## Descripción

Este proyecto tiene como objetivo fomentar el uso de la herramienta git. 
Para ello se ha compuesto un grupo y un proyecto a realizar.

## Descripción del Proyecto

Se ha diseñado un proyecto que representa diferentes seres vivos y la interacción que puede haber entre ellos.

![Diagrama de clases](https://i.pinimg.com/564x/ba/af/43/baaf432a6588f35495259158b909e6bf.jpg)

### SerVivo

Clase abstracta cada instancia se inicializa con una edad y la propiedad `estaVivo` por defecto es `true`.

### Vegetal

Clase, crea un vegetal con una edad aleatoria entre 1 y 20 utilizando [java.util.Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html).

### Mascota

Interfaz, cualquier objeto al cual se le puede dar un nombre.

### Animal

Clase abstracta que añade la funcionalidad de dormir y despertar a un `SerVivo`, por defecto esta despierto.

### Pez

Clase, posee la habilidad de nadar.
Metodo:
- nadar: devuelve `true` si esta vivo.
- comer: devuelte `true` si otro es un `Vegetal`

### Perro

Clase, posee dos constructores:
- Constructor por defecto: Crea una instancia Perro con `edad=0` y el `nombre=null`.
- Constructor (nombre, edad): Crea una instancia Perro usando los argumentos proporcionados.

Metodo: 
- comer: devuelve `true` si el parametro proporcionado es un Gato (Vivo).
- perseguir: devuelve `true` si el parametro proporcionado es un Gato y esta dormido o un Perro (Vivo).

### Gato

Clase, posee dos constructores:
- Constructor por defecto: Crea una instancia Gato con `edad=0`, `nombre=null` y posee 7 vidas.
- Constructor (nombre, edad): Crea una instancia Gato usando los argumentos proporcionados.

Metodo: 
- comer: devuelve `true` si el parametro proporcionado es un Pez (Vivo) y Pez muere.
- maullar: devuelve un `String` aleatoria con la estructura "(mi)[a]+(u)" donde puede existir desde 1 a 5 caracteres 'a'.
- setEstaVivo: cada vez que se le asigna `false` pierde una viada, si pierde siete vidas muere.

## Equipo

- Autor | Desarrollador: [Bruno García Trípoli](https://github.com/Brbcode)
- Desarrollador: [Antonio Ruiz Galvez](https://github.com/AntonioRG90)
- Desarrollador: [Daniel Puente Maldonado](https://github.com/Danielillo10)
- Desarrollador: [Jairo Daviv Comino Ruiz](https://github.com/jairocomino)
- Desarrollador: [Jóse Domenez Quesada](https://github.com/JDomene99)
- Desarrollador: [Sofía Khudomyasova](https://github.com/sofia1001)


