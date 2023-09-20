# Ejemplos Básicos de Python

En este archivo, encontrarás ejemplos de código Python para diversas funcionalidades básicas.

## Impresión (print)

La función `print` se utiliza para mostrar información en la consola.

```python
print("Hola, mundo!")
```

En este ejemplo, se imprimirá "Hola, mundo!" en la consola.

## Importación (import)

Para usar módulos o bibliotecas en Python, primero debes importarlos.

```python
import math
print(math.sqrt(16))
```

Aquí, importamos el módulo `math` y luego usamos la función `sqrt` para calcular la raíz cuadrada de 16.

## Listas

Las listas son estructuras de datos para almacenar múltiples elementos.

```python
frutas = ["manzana", "banana", "cereza"]
print(frutas[0])
```

En este caso, creamos una lista de frutas y luego imprimimos el primer elemento, que es "manzana" (las listas en Python están indexadas desde 0).

## Directorios

Puedes usar el módulo `os` para trabajar con directorios.

```python
import os
print(os.getcwd())  # Obtiene el directorio de trabajo actual
```

Este código imprimirá el directorio de trabajo actual.

## Control de Excepciones

Puedes manejar errores con bloques `try` y `except`.

```python
try:
    resultado = 10 / 0
except ZeroDivisionError as e:
    print(f"Error: {e}")
```

Aquí, intentamos dividir por cero, lo cual generará un error `ZeroDivisionError` que luego manejamos en el bloque `except`.

## Imports Personalizados

Puedes crear tus propios módulos e importarlos.

```python
# Supongamos que tienes un archivo "misfunciones.py" con una función llamada "saludar"
from misfunciones import saludar
saludar("Juan")
```

Esto importa la función `saludar` desde el archivo `misfunciones.py` y la usa para saludar a Juan.

Espero que estos ejemplos te sean útiles para entender conceptos básicos de Python.
```

## Condicionales (if, elif, else)

Los condicionales se utilizan para tomar decisiones en función de condiciones.

```python
edad = 18
if edad >= 18:
    print("Eres mayor de edad")
else:
    print("Eres menor de edad")
```

Este código verifica si la variable `edad` es mayor o igual a 18 y muestra un mensaje apropiado en función de esa condición.

## Bucles (for, while)

Los bucles te permiten repetir tareas.

```python
# Bucle for
frutas = ["manzana", "banana", "cereza"]
for fruta in frutas:
    print(fruta)

# Bucle while
contador = 0
while contador < 5:
    print(contador)
    contador += 1
```

El primer bucle `for` itera a través de la lista de frutas e imprime cada una. El segundo bucle `while` imprime números del 0 al 4.

## Funciones

Las funciones son bloques de código reutilizables.

```python
def suma(a, b):
    return a + b

resultado = suma(3, 5)
print(resultado)
```

En este ejemplo, definimos una función `suma` que toma dos argumentos y devuelve la suma. Luego, llamamos a la función y almacenamos el resultado en la variable `resultado`.

## Clases y Objetos

Puedes crear clases para definir objetos y sus comportamientos.

```python
class Persona:
    def __init__(self, nombre):
        self.nombre = nombre

    def saludar(self):
        print(f"Hola, soy {self.nombre}")

juan = Persona("Juan")
juan.saludar()
```

Aquí, creamos una clase `Persona` con un método `saludar`. Luego, creamos un objeto `juan` y llamamos al método `saludar` en ese objeto.

## Manejo de Archivos

Puedes trabajar con archivos para leer y escribir datos.

```python
# Escribir en un archivo
with open("miarchivo.txt", "w") as archivo:
    archivo.write("Hola, archivo!")

# Leer desde un archivo
with open("miarchivo.txt", "r") as archivo:
    contenido = archivo.read()
    print(contenido)
```
## Diccionarios

Los diccionarios son estructuras de datos que almacenan pares clave-valor.

```python
# Crear un diccionario
persona = {
    "nombre": "Juan",
    "edad": 30,
    "ciudad": "Madrid"
}

# Acceder a valores por clave
print(persona["nombre"])  # Imprime "Juan"

# Agregar un nuevo par clave-valor
persona["trabajo"] = "Programador"

# Iterar a través de claves y valores
for clave, valor in persona.items():
    print(f"{clave}: {valor}")
```

En este ejemplo, creamos un diccionario `persona` que almacena información sobre una persona, incluyendo su nombre, edad y ciudad. Luego, accedemos a valores individuales por clave, agregamos un nuevo par clave-valor y también iteramos a través de todas las claves y valores en el diccionario.

Los diccionarios son muy útiles para almacenar datos estructurados en Python y son ampliamente utilizados en muchas aplicaciones. 

Claro, aquí tienes más contenido para tu archivo `ejemplos.md` con ejemplos adicionales de conceptos básicos en Python:

## Comprehension de Listas y Diccionarios

Python ofrece una sintaxis concisa para crear listas y diccionarios de manera más eficiente.

```python
# List Comprehension
numeros = [1, 2, 3, 4, 5]
cuadrados = [x ** 2 for x in numeros]

# Dictionary Comprehension
personas = ["Juan", "Ana", "María"]
edades = {"Juan": 30, "Ana": 25, "María": 28}

# Diccionario de edades cuadradas usando Dictionary Comprehension
edades_cuadradas = {nombre: edad ** 2 for nombre, edad in edades.items()}
```

En estos ejemplos, utilizamos comprensiones de listas y diccionarios para transformar datos de manera más concisa.

## Módulo datetime

El módulo `datetime` se utiliza para trabajar con fechas y horas.

```python
import datetime

hoy = datetime.date.today()
print(hoy)

ahora = datetime.datetime.now()
print(ahora)
```

Estos ejemplos demuestran cómo obtener la fecha actual y la fecha y hora actuales utilizando el módulo `datetime`.

## Expresiones Lambda

Las expresiones lambda son funciones anónimas de una sola línea.

```python
suma = lambda x, y: x + y
print(suma(3, 5))

cuadrado = lambda x: x ** 2
print(cuadrado(4))
```

Aquí, creamos funciones lambda simples para realizar operaciones específicas.

## Manipulación de Cadenas

Puedes manipular cadenas de texto de diversas maneras.

```python
mensaje = "Hola, mundo"
print(len(mensaje))  # Longitud de la cadena
print(mensaje.upper())  # Convertir a mayúsculas
print(mensaje.split(","))  # Dividir la cadena en una lista
```

Estos ejemplos muestran algunas operaciones comunes en cadenas de texto.

## Librería estándar

Python tiene una amplia librería estándar que incluye módulos para diversas tareas, como `random` para generación de números aleatorios, `json` para manejo de datos JSON, `csv` para trabajar con archivos CSV, entre otros.

```python
import random

numero_aleatorio = random.randint(1, 10)
print(numero_aleatorio)
```

Este ejemplo utiliza el módulo `random` para generar un número aleatorio entre 1 y 10.
