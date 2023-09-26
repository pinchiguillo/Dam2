# Ficheros en Java

## Ficheros Secuenciales
Los ficheros secuenciales se utilizan para almacenar datos cuando no se conoce de antemano la longitud de cada cadena de texto. Estos ficheros permiten leer y escribir datos de forma dinámica hasta encontrar una separación o un delimitador.

### Ejemplo de lectura en ficheros secuenciales:
```java
try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
    String linea;
    while ((linea = br.readLine()) != null) {
        // Procesar la línea de texto
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### Ejemplo de escritura en ficheros secuenciales:
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))) {
    String texto = "Este es un ejemplo de texto a escribir en el archivo.";
    bw.write(texto);
} catch (IOException e) {
    e.printStackTrace();
}
```

## Ficheros de Objetos
Los ficheros de objetos se utilizan para almacenar objetos Java en un archivo. Esto permite guardar y recuperar objetos de manera eficiente. Para usarlos, los objetos deben implementar la interfaz `Serializable`.

### Ejemplo de escritura de objetos en ficheros de objetos:
```java
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objetos.dat"))) {
    MiObjeto objeto = new MiObjeto(); // Debe ser serializable
    oos.writeObject(objeto);
} catch (IOException e) {
    e.printStackTrace();
}
```

### Ejemplo de lectura de objetos desde ficheros de objetos:
```java
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objetos.dat"))) {
    MiObjeto objeto = (MiObjeto) ois.readObject();
    // Procesar el objeto recuperado
} catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
}
```

## Ficheros de Datos
Los ficheros de datos se utilizan para almacenar datos en formato binario sin formato de texto. Se utilizan principalmente para guardar información estructurada en su forma más cruda.

### Ejemplo de escritura en ficheros de datos:
```java
try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("datos.bin"))) {
    int numero = 42;
    double decimal = 3.14;
    dos.writeInt(numero);
    dos.writeDouble(decimal);
} catch (IOException e) {
    e.printStackTrace();
}
```

### Ejemplo de lectura desde ficheros de datos:
```java
try (DataInputStream dis = new DataInputStream(new FileInputStream("datos.bin"))) {
    int numero = dis.readInt();
    double decimal = dis.readDouble();
    // Procesar los datos leídos
} catch (IOException e) {
    e.printStackTrace();
}
```

## Ficheros de Acceso Aleatorio
Los ficheros de acceso aleatorio se utilizan para almacenar datos cuando se conoce la longitud de los registros y se necesita acceder a ellos de forma aleatoria, es decir, directamente a un registro específico.

### Ejemplo de lectura y escritura en ficheros de acceso aleatorio:
```java
try (RandomAccessFile raf = new RandomAccessFile("acceso_aleatorio.dat", "rw")) {
    // Leer o escribir datos en posiciones específicas
    raf.seek(100); // Mover el puntero al registro 100
    int dato = raf.readInt();
    // Procesar el dato leído

    // También se puede escribir datos en posiciones específicas
    raf.seek(200); // Mover el puntero al registro 200
    raf.writeInt(42); // Escribir un entero en la posición 200
} catch (IOException e) {
    e.printStackTrace();
}
```

Estos son los conceptos básicos de manejo de ficheros en Java. Cada tipo de fichero tiene su propia utilidad y se elige según los requisitos específicos de tu aplicación.

[Ejemplos practicos](ejemplos.md)
[Ejercicios Clase](ejercicios_clase.md)