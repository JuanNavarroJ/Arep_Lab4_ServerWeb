# Taller de Arquitecturas de Servidores de Aplicaciones, Meta protocolos de objetos, Patrón IoC, Reflexión

## Link aplicación web

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://arep-lab4-ioc.herokuapp.com/WebService/BM4.jpg)

**Enlace:** [`https://arep-lab4-ioc.herokuapp.com/WebService/`](https://arep-lab4-ioc.herokuapp.com/WebService/P911.jpg)

Para verificar el funcionamiento tenemos diferentes recursos cargados en el servidor los cuales son:

- [`Web.html`](https://arep-lab4-ioc.herokuapp.com/WebService/Web.html)
- [`MG63.jpg`](https://arep-lab4-ioc.herokuapp.com/WebService/MG63.jpg)
- [`BM4.jpg`](https://arep-lab4-ioc.herokuapp.com/WebService/BM4.jpg)
- [`P911.jpg`](https://arep-lab4-ioc.herokuapp.com/WebService/P911.jpg)
- [`Js.js`](https://arep-lab4-ioc.herokuapp.com/WebService/js.js)

---

### Introducción

En este laboratorio se busca utilizar ya el conocimiento de crear un servidor web el cual pueda resolver solicitudes html, js y jpg. Pero a diferencia del laboratorio anterior ahora buscamos hacer un servidor con Meta protocolos de objetos, Patrón IoC y Reflexión. Por esta razón vamos a hacer un servidor simulando el funcionamiento de Spring usando etiquetas.

Ahora en este laboratorio buscamos mejorar el funcionamiento del servidor usando Meta protocolos de objetos, Patrón IoC y Reflexión. 

![bm](https://user-images.githubusercontent.com/44879884/75122712-75256e00-566e-11ea-9238-5eea6cf98fb9.PNG)

---

### Prerequisites

Debemos tener los siguientes programas instalados:
```
- Maven 
- Git
- Navegador web
```

## ¿Como instalar y probar?

Debemos tener un editor java instalado y git, es opcional tener instalado el uso de maven que permitira un mejor control sobre el proyecto.

1. Entramos la terminal del dispositivo y accedemos a la carpeta en la cual queremos guardar el proyecto. 

![1](https://user-images.githubusercontent.com/44879884/75121441-fb878300-5661-11ea-91b5-330ef63613a1.PNG)

2. Usando los comandos de git empezamos con : **$ git clone** https://github.com/JuanNavarroJ/Arep_Lab4_ServerWeb e Ingresamos a la carpeta que descargamos desde Github.

![2](https://user-images.githubusercontent.com/44879884/75121443-fc201980-5661-11ea-8f00-3088434e741c.PNG)

3. Usando maven podemos en la linea de comandos compilar y ejecutar el proyecto con el codigo **$ mvn package**

![3a](https://user-images.githubusercontent.com/44879884/75121444-fcb8b000-5661-11ea-978e-c8be43e677fd.PNG)
![3b](https://user-images.githubusercontent.com/44879884/75121445-fcb8b000-5661-11ea-8615-1fabfffed750.PNG)

4. Si deseas conocer a profundidad el funcionamiento del codigo, podemos abrir el proyecto en un editor java.

![4](https://user-images.githubusercontent.com/44879884/75121446-fcb8b000-5661-11ea-89a4-0bddf55da9fe.PNG)

5. Para generar el javadoc ejecutamos el comando **$ mvn javadoc:javadoc**

![5a](https://user-images.githubusercontent.com/44879884/75121448-fe827380-5661-11ea-930d-c116ce286949.PNG)

## Despliegue continuo

[![CircleCI](https://circleci.com/gh/JuanNavarroJ/Arep_Lab4_ServerWeb.svg?style=svg)](https://circleci.com/gh/JuanNavarroJ/Arep_Lab4_ServerWeb)

## Desarrollo

Construido con:

-   [Maven](https://maven.apache.org/)  - Control de dependencias

-	 [CircleCI](https://circleci.com/)  - Despliegue continuo

-	 [Heroku](https://dashboard.heroku.com/apps) - Plataforma Web

## Autor

-   **Juan David Navarro Jimenez**    -  [JuanNavarroJ](https://github.com/JuanNavarroJ)

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE.md](https://github.com/JuanNavarroJ/Arep_Lab4_ServerWeb/blob/master/LICENSE.txt) file for details.
