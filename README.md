# Nivell 1

Aquest projecte conté una sèrie d'exercicis per practicar l'ús de l'API de Java Lambdas and Streams a partir de Java 8.

## Exercicis

### Exercici 1
A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.

### Exercici 2
Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.

### Exercici 3
Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

### Exercici 4
Fer la mateixa impressió del punt anterior, però mitjançant method reference.

### Exercici 5
Crea una Functional Interface amb un mètode anomenat `getPiValue()` que ha de retornar un `double`. Des del `main()` de la classe principal, instància la interfície i assigna-li el valor `3.1415`. Invoca el mètode `getPiValue()` i imprimeix el resultat.

### Exercici 6
Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

### Exercici 7
Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

### Exercici 8
Crea una Functional Interface que contingui un mètode anomenat `reverse()`. Aquest mètode ha de rebre i retornar un `String`. En el `main()` de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.

# Nivell 2

### Exercici 1
Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes les cadenes que comencen amb la lletra 'A' (majúscula) i tenen exactament 3 lletres. Imprimeix el resultat.

### Exercici 2
Programa un mètode que retorna una cadena separada per comes, basada en una llista d’`Integers`. Cada element ha d’anar precedit per la lletra "e" si el nombre és parell, o per la lletra "o" si el nombre és imparell. Per exemple, si la llista d’entrada és `(3, 55, 44)`, la sortida ha de ser "o3, o55, e44". Imprimeix el resultat.

### Exercici 3
Crea una Functional Interface que contingui un mètode anomenat `operacio()`. Aquest mètode ha de retornar un `float`. Injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que es pugui transformar l’operació amb una suma, una resta, una multiplicació i una divisió.

### Exercici 4
Crea una llista que contingui algunes cadenes de text i nombres. Ordena-les per:
1. Alfabèticament pel primer caràcter. (`charAt(0) retorna el codi numèric del primer caràcter`)
2. Les cadenes que contenen una "e" primer, la resta després.
3. Modifica tots els elements de la llista que tenen una ‘a’. Canvia la ‘a’ per un ‘4’.
4. Mostra només els elements que són numèrics (encara que estiguin guardats com `Strings`).

# Nivell 3

### Exercici 1
Crea una classe `Alumne` amb els atributs: `Nom`, `Edat`, `Curs` i `Nota`.

- Omple una llista amb 10 alumnes.
- Mostra per pantalla el nom i l’edat de cada alumne/a.
- Filtra la llista per tots els alumnes que el seu nom comença per ‘A’. Assigna a aquests alumnes a una altra llista i mostra per pantalla la nova llista (tot amb lambdes).
- Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
- Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o més, i que no són de PHP.
- Mostra tots els alumnes que fan JAVA i són majors d’edat.

## Tecnologies Utilitzades
- Java 8+
- API de Java Streams i Lambdas

## Com executar el projecte
1. Clonar el repositori.
2. Compilar el projecte amb `javac`.
3. Executar la classe `Main` amb `java`.

```sh
javac -d bin src/Nivell1/*.java
java -cp bin Nivell1.Main
```

## Autor
Luis Portas Montero

