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