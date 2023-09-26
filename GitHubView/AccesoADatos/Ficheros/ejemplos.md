# Ficheros en Java

## Ficheros Secuenciales
### Ejemplo de lectura
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

### Ejemplo de escritura
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))) {
    String texto = "Este es un ejemplo de texto a escribir en el archivo.";
    bw.write(texto);
} catch (IOException e) {
    e.printStackTrace();
}
```

## Ficheros de objetos
### Ejemplo de escritura
```java
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objetos.dat"))) {
    MiObjeto objeto = new MiObjeto(); // Debe ser serializable
    oos.writeObject(objeto);
} catch (IOException e) {
    e.printStackTrace();
}
```

### Ejemplo de lectura
```java
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objetos.dat"))) {
    MiObjeto objeto = (MiObjeto) ois.readObject();
    // Procesar el objeto recuperado
} catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
}
```

## Ficheros de datos

### Ejemplo de escritura
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

### Ejemplo de lectura
```java
try (DataInputStream dis = new DataInputStream(new FileInputStream("datos.bin"))) {
    int numero = dis.readInt();
    double decimal = dis.readDouble();
    // Procesar los datos leídos
} catch (IOException e) {
    e.printStackTrace();
}
```
## Ficheros de acceso aleatorio
### Ejemplo de lectura y escritura
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