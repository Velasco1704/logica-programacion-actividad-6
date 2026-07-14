# Guion del video — Actividad 6 (Ejercicios Prácticos Java)

**Duración sugerida:** 6 a 9 minutos
**Participan los 2 integrantes del grupo** (el criterio lo pide explícitamente).
**Qué tener abierto antes de grabar:** Eclipse o NetBeans con los dos `.java` listos para ejecutar, y los dos diagramas de flujo (`diagrama_01_*.jpg` y `diagrama_02_*.jpg`) abiertos en el visor de imágenes.

> Convención: en *cursiva* va lo que **dices**; entre corchetes **[ ]** va lo que **muestras en pantalla**. Repártanse las partes entre los dos integrantes (por ejemplo: uno explica el Programa 1 y el otro el Programa 2).

---

## 0. Introducción (≈30 s)

[Pantalla con los nombres de los integrantes visibles]

*"Hola, somos [Integrante 1] e [Integrante 2]. En este video presentamos la Actividad 6 de Lógica de Programación, desarrollada en lenguaje Java. Vamos a mostrar dos programas: el primero cuenta las combinaciones de dos arreglos cuya suma es igual a una constante k, y el segundo calcula la suma de números pares e impares de un arreglo de 10 posiciones. De cada programa explicamos su diagrama de flujo, su lógica, y ejecutamos mínimo tres pruebas."*

---

## 1. Programa 1 — Combinaciones cuya suma es igual a k (≈3 a 4 min)

### 1.1 Diagrama de flujo
[Muestra `diagrama_01_combinaciones_suma.jpg`]

*"Este es el diagrama del primer programa. Empieza en INICIO. Primero se lee la constante k, luego se llenan los dos arreglos de 6 posiciones. Se inicializa el contador `cont` en cero. Después vienen dos ciclos anidados: el ciclo externo con el índice i recorre el primer arreglo, y el ciclo interno con el índice j recorre el segundo. Dentro se evalúa la condición `arreglo1[i] + arreglo2[j] == k`: si es verdadera, se aumenta el contador y se muestra el par; si es falsa, se continúa. Al terminar los ciclos se muestra el total y finaliza."*

### 1.2 Explicación del código
[Muestra `CombinacionesSuma.java` y ve señalando]

*"En el código usamos la clase Scanner para leer por teclado. `TAM` vale 6, que es el tamaño de cada arreglo. Con dos ciclos `for` llenamos `arreglo1` y `arreglo2`. Luego el doble `for` recorre todas las combinaciones posibles; cada vez que la suma coincide con k, incrementamos `cont` y mostramos el par. Al final imprimimos cuántas combinaciones se encontraron."*

> Aclaración recomendada (para el punto del enunciado que habla de “12”):
> *"El enunciado menciona 12 combinaciones contando las simétricas. Como en el ejemplo los dos arreglos son iguales, las simétricas ya quedan incluidas en la misma lista: (6,1) es la simétrica de (1,6), (5,2) de (2,5), y así. Por eso el programa cuenta 6 pares ordenados, que son exactamente los que el enunciado lista."*

### 1.3 Pruebas (mínimo 3)

**Prueba 1 — El ejemplo del enunciado**
[Ejecuta. Ingresa: k=7, arreglo1 = 1 2 3 4 5 6, arreglo2 = 1 2 3 4 5 6]
Salida esperada:
```
(1, 6)  (2, 5)  (3, 4)  (4, 3)  (5, 2)  (6, 1)
Total de combinaciones encontradas: 6
```
*"Aquí obtenemos los seis pares que suman 7."*

**Prueba 2 — Arreglos distintos**
[Ingresa: k=13, arreglo1 = 2 4 6 8 10 12, arreglo2 = 1 3 5 7 9 11]
Salida esperada:
```
(2, 11)  (4, 9)  (6, 7)  (8, 5)  (10, 3)  (12, 1)
Total de combinaciones encontradas: 6
```
*"Con otros valores y k=13 encontramos seis combinaciones."*

**Prueba 3 — Sin combinaciones**
[Ingresa: k=100, arreglo1 = 1 1 1 1 1 1, arreglo2 = 1 1 1 1 1 1]
Salida esperada:
```
No existen combinaciones que sumen 100.
Total de combinaciones encontradas: 0
```
*"Cuando ninguna suma llega a k, el programa avisa que no hay combinaciones."*

---

## 2. Programa 2 — Suma de pares e impares (≈3 a 4 min)

### 2.1 Diagrama de flujo
[Muestra `diagrama_02_suma_pares_impares.jpg`]

*"El segundo diagrama también empieza en INICIO. Se leen los 10 números del arreglo y se ponen en cero los acumuladores `sumaPares` y `sumaImpares`. Luego un ciclo con índice i recorre el arreglo; dentro se pregunta si `numeros[i] % 2 == 0`. Si es verdadero, el número es par y se suma a `sumaPares`; si es falso, es impar y se suma a `sumaImpares`. Al terminar el ciclo se muestran las dos sumatorias y finaliza."*

### 2.2 Explicación del código
[Muestra `SumaParesImpares.java`]

*"Aquí `TAM` vale 10. Llenamos el arreglo con un ciclo `for`. Después recorremos el arreglo y usamos el operador módulo `%`: si el residuo al dividir entre 2 es cero, el número es par; de lo contrario es impar. Cada número se acumula en la variable que corresponde. Al final imprimimos ambas sumas."*

### 2.3 Pruebas (mínimo 3)

**Prueba 1 — El ejemplo del enunciado**
[Ingresa: 4 7 8 9 10 11 13 6 2 1]
Salida esperada:
```
La sumatoria de numeros pares es:   30
La sumatoria de numeros impares es: 41
```
*"Los pares 4, 8, 10, 6 y 2 suman 30; los impares 7, 9, 11, 13 y 1 suman 41."*

**Prueba 2 — Todos pares**
[Ingresa: 2 4 6 8 10 12 14 16 18 20]
Salida esperada:
```
La sumatoria de numeros pares es:   110
La sumatoria de numeros impares es: 0
```
*"Como todos son pares, la suma de impares queda en cero."*

**Prueba 3 — Con números negativos y el cero**
[Ingresa: -5 -4 3 2 7 0 -1 8 9 10]
Salida esperada:
```
La sumatoria de numeros pares es:   16
La sumatoria de numeros impares es: 13
```
*"El programa también funciona con negativos; el cero se toma como par. Pares: -4+2+0+8+10 = 16. Impares: -5+3+7-1+9 = 13."*

---

## 3. Cierre (≈20 s)

*"En resumen, aplicamos arreglos, ciclos `for`, ciclos anidados, condicionales y el operador módulo para resolver los dos ejercicios en Java. Gracias por ver el video."*

---

### Lista de verificación antes de subir
- [ ] Aparecen y hablan los **2 integrantes**.
- [ ] Se ejecutó el código en pantalla (Eclipse/NetBeans).
- [ ] **3 pruebas por programa** como mínimo.
- [ ] Se explicó el **diagrama de flujo** de cada programa.
- [ ] El `.zip` incluye los 2 `.java` y los 2 diagramas `.jpg`.
