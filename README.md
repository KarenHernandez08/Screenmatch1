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