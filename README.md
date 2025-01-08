# Screenmatch

## ¿Qué es una API?
Es una interfaz de programación de aplicaciones que nos
permite interactuar con servicios web y obtener datos de manera
estructurada

## Cómo usar la API OMDb

La api OMDb es una api que proporciona información detallada sobre 
películas y series

Para acceder a la api OMDB, debemos construir una URL
con una ```API KEY``` y colocar parámetros específicos.
Las respuestas de la api vienen en  formato JSON

### Obtener APIkey
https://omdbapi.com/apikey.aspx

Colocar gratis por 1000 respuestas por día
Llenar nuestros datos y llegara la apiKEy en el correo

Se coectara nuestra aplicación con OMDb para obtener datos

## Protocolo HTTP (HyperText Trnafer Protocol)

Es un protocolo de comunicación que permite la tranferencia de información, se basa en un modelo
cliente-servidor

Se realizan solicitudes a un servidor para obtener información y el 
servidor, responde con los datos solicitados

Usa varios métodos

``Get`` Obtiene fatos del servidor

``Post`` Envia información al servidor

``Put`` Actualiza o edita la información en el servidor

``Delete`` Elimina información

Se usan códigos de status para indicar el rsultado de la operación, los
códigos van del 100 al 599 y se dividen en 5 clases: 
* 1xx: informaciones
* 2xx: exito
* 3xx: redirección
* 4xx: error del cliente
* 5xx: error del servidor

## Exceptions en java

Todas las excepciones son subclases de la clase ``Throwable``

Las excepciones que heredan de la clase Exception se denominan ``excepciones
verificadas`` (checked exceptions). Esto significa que estas excepciones deben 
ser tratadas explícitamente en un bloque try-catch o declaradas en una cláusula 
throws en la firma del método (luego de los paréntesis de los parámetros y antes 
de las llaves). Un ejemplo es la clase ``IOException``, que indica un problema relacionado 
con la lectura/escritura de datos.

### Multi catch

En lugar de tener varios bloques catch para manejar diferentes excepciones, 
puede agruparlos en un solo bloque usando el caracter ``|`` para separar las 
excepciones. 

```java
try {
    metodoQuePuedeLanzarUnaExcepcion();
} catch (NumberFormatException e) {
    System.out.println("tratando error...");
} catch (IllegalArgumentException e) {
    System.out.println("tratando error...");
}
```

Como el tratamiento del error es el mismo para ambas excepciones, 
el código anterior podría haberse escrito usando multi-catch:

```java
try {
    metodoQuePuedeLanzarUnaExcepcion();
} catch (NullPointerException | IllegalArgumentException e) {
    System.out.println("tratando error...");
}
```

### Identación
``ctrl`` + ``shift`` + `i`

## Java.io

proporciona clases e interfaces para entrada y salida de datos en diversos formatos, como archivos, red, teclado, entre otros. 

### La clase File
La clase File representa un archivo o directorio en el sistema de archivos de la computadora, lo que le permite crear, eliminar, listar y manipular archivos y directorios. Para crear un objeto File, debe pasar la ruta del archivo o directorio como argumento al constructor. Por ejemplo:

```java
File file = new File("C:\\miArchivo.txt");
```

### La clase FileReader y FileWriter

Las clases FileReader y FileWriter se utilizan para leer y escribir datos en archivos de texto; la clase FileReader lee caracteres de un archivo de texto, mientras que la clase FileWriter escribe los caracteres.

Para usar la clase FileReader, necesita crear un objeto FileReader pasando un objeto File como argumento, que contenga la ruta del archivo que quieres leer. Luego puede leer los datos del archivo usando el método read() o read(char[]). Por ejemplo:

````java
//Filereader
File file = new File("C:\\miArchivo.txt");
FileReader reader = new FileReader(file);

int data = reader.read();
while (data != -1) {
        System.out.print((char) data);
data = reader.read();
}
        reader.close();


//FileWriter
File file = new File("C:\\salida.txt");
FileWriter writer = new FileWriter(file);
writer.write("Hola mundo!");
writer.close();
````