# Guía de trabajo — Actividad 6: Ejercicios Prácticos Java

## 1. Objetivos de la actividad
- Diseñar e implementar dos algoritmos en **lenguaje Java** (IDE Eclipse o NetBeans).
- Aplicar **arreglos**, **ciclos** (`for`) y **estructuras condicionales** (`if / else`).
- Identificar correctamente las **variables de entrada, proceso y salida** con sus tipos de datos.
- Construir el **diagrama de flujo** de cada programa.
- Comentar las líneas más importantes del código (buenas prácticas).

## 2. Archivos entregados
| Archivo | Descripción |
|---|---|
| `CombinacionesSuma.java` | Programa 1: cuenta las combinaciones de dos arreglos de 6 posiciones cuya suma es igual a una constante `k`. |
| `SumaParesImpares.java` | Programa 2: llena un arreglo de 10 posiciones y calcula la suma de pares y de impares. |
| `diagrama_01_combinaciones_suma.jpg` | Diagrama de flujo del Programa 1. |
| `diagrama_02_suma_pares_impares.jpg` | Diagrama de flujo del Programa 2. |
| `Guia_de_trabajo.md` | Este documento. |
| `Guion_video.md` | Guion para grabar el video. |

---

## 3. Programa 1 — Combinaciones cuya suma es igual a k

### ¿Qué hace?
Se leen dos arreglos de **6 posiciones** y una constante **k** (todo ingresado por el usuario). El programa recorre **todas las combinaciones posibles** tomando un valor del primer arreglo y un valor del segundo, y **cuenta y muestra** aquellas cuya suma sea exactamente `k`. En cada par `(a, b)`, `a` es un valor del primer arreglo y `b` un valor del segundo.

### Variables
| Variable | Tipo | Rol |
|---|---|---|
| `k` | `int` | Entrada (constante a comparar) |
| `arreglo1[6]` | `int[]` | Entrada (primer arreglo) |
| `arreglo2[6]` | `int[]` | Entrada (segundo arreglo) |
| `i`, `j` | `int` | Proceso (índices de los ciclos) |
| `cont` | `int` | Salida (número de combinaciones encontradas) |

### Lógica
1. Se lee `k`.
2. Con un ciclo `for` se llenan las 6 posiciones de `arreglo1`, y con otro las de `arreglo2`.
3. Se inicializa `cont = 0`.
4. Un **ciclo anidado** (doble `for`) recorre cada `arreglo1[i]` contra cada `arreglo2[j]`.
5. Si `arreglo1[i] + arreglo2[j] == k`, se incrementa `cont` y se muestra el par.
6. Al final se imprime el total de combinaciones.

### Ejemplo (el del enunciado)
`arreglo1 = (1,2,3,4,5,6)`, `arreglo2 = (1,2,3,4,5,6)`, `k = 7`.
Combinaciones (valor de arreglo1, valor de arreglo2) que suman 7:

```
(1, 6)  (2, 5)  (3, 4)  (4, 3)  (5, 2)  (6, 1)
Total de combinaciones encontradas: 6
```

> **Nota importante sobre el conteo.** El enunciado menciona “12 combinaciones … y sus simétricas”. Como los dos arreglos del ejemplo son iguales (1–6), las simétricas de esos pares **ya están incluidas** en la misma lista: `(6,1)` es la simétrica de `(1,6)`, `(5,2)` la de `(2,5)`, etc. Por eso el conteo correcto de pares ordenados (valor de arreglo1 + valor de arreglo2) es **6**, que son exactamente los pares que el propio enunciado lista. El programa cuenta cada par una sola vez, de forma transparente. Conviene mencionarlo así en el video para que quede claro que el resultado está bien calculado.

---

## 4. Programa 2 — Sumatoria de pares e impares

### ¿Qué hace?
Se llena un arreglo de **10 posiciones** con números enteros del usuario. Luego se recorre el arreglo sumando por separado los **pares** y los **impares**, y se imprimen ambas sumatorias.

### Variables
| Variable | Tipo | Rol |
|---|---|---|
| `numeros[10]` | `int[]` | Entrada (valores del arreglo) |
| `i` | `int` | Proceso (índice del recorrido) |
| `sumaPares` | `int` | Salida (acumulador de pares) |
| `sumaImpares` | `int` | Salida (acumulador de impares) |

### Lógica
1. Con un ciclo `for` se llenan las 10 posiciones del arreglo.
2. Se recorre el arreglo; para cada `numeros[i]` se evalúa `numeros[i] % 2 == 0`.
   - Si el residuo es 0 → es **par** → se suma a `sumaPares`.
   - En caso contrario → es **impar** → se suma a `sumaImpares`.
3. Se muestran las dos sumatorias.

### Ejemplo (el del enunciado)
`arreglo = (4,7,8,9,10,11,13,6,2,1)`

```
La sumatoria de numeros pares es:   30   (4+8+10+6+2)
La sumatoria de numeros impares es: 41   (7+9+11+13+1)
```

---

## 5. Cómo ejecutar en Eclipse o NetBeans

### Eclipse
1. `File → New → Java Project` (nombre libre, p. ej. `Actividad6`).
2. Clic derecho en `src → New → Class`. El nombre de la clase debe ser **exactamente igual** al del archivo: `CombinacionesSuma` (y luego `SumaParesImpares`).
3. Pegar el contenido del `.java` correspondiente.
4. Clic en **Run** (▶). Los datos se ingresan por la **consola**.

### NetBeans
1. `File → New Project → Java Application`.
2. Crear una clase con el mismo nombre del archivo y pegar el código.
3. Clic derecho en el archivo → **Run File** (o Shift+F6). Ingresar los datos en la ventana de salida.

> Nota: cada clase tiene su propio `main`, así que se pueden ejecutar de forma independiente. Los nombres de archivo y de clase **deben coincidir** para que compile.

## 6. Conceptos clave aplicados
- **Arreglos** (`int[]`) de tamaño fijo.
- **Ciclos `for`** para llenar y recorrer arreglos (incluye **ciclos anidados** en el Programa 1).
- **Condicionales** (`if / else`) y el **operador módulo** `%` para distinguir pares de impares.
- **Acumuladores y contadores** (`cont`, `sumaPares`, `sumaImpares`).
- **Entrada por teclado** con la clase `Scanner`.
