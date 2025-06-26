# Serving Web Content with Spring MVC

## What You Will Build

You will build an application that has a static home page and that will also accept HTTP GET requests at: http://localhost:8080/greeting.

It will respond with a web page that displays HTML. The body of the HTML will contain a greeting: “Hello, World!”

You can customize the greeting with an optional name parameter in the query string. The URL might then be http://localhost:8080/greeting?name=User.

The name parameter value overrides the default value of World and is reflected in the response by the content changing to “Hello, User!”

## What You Need

* About 15 minutes

* A favorite text editor or IDE

* Java 17 or later

* Gradle 7.5+ or Maven 3.5+

## Starting with Spring Initializr

![sprinhintilzr](https://github.com/user-attachments/assets/507be31a-14e7-4da8-8b4d-4756fb458556)

## Create a Web Controller

![webController](https://github.com/user-attachments/assets/c1cfc960-b6d5-42ae-a2c6-40c63d2967c0)

## Greating html
![greating](https://github.com/user-attachments/assets/eca59208-76e6-4948-8c33-48480693535c)

## Home Page

![home](https://github.com/user-attachments/assets/200b3031-4772-42ae-816c-9cf7962de1a0)

## Ejercicios

1. Cree un formulario en html para hacer la petición "localhost:8080/hello?
name=Catalina" Por un método POST. Al oprimir el botón de enviar del
formulario siempre se debe cargar una página nueva. Modifique o
agregue métodos al controlador según sea necesario.

**formulario.html**

![{F40523AA-25E6-4ACD-8750-8414654377B4}](https://github.com/user-attachments/assets/99400dd6-0249-4068-bddc-5c1201ec8c79)

**FormularioController**

![{1D04F3E1-0ABE-4324-AA2D-00EB06B15670}](https://github.com/user-attachments/assets/ee9c807b-979b-4d4e-845f-2c53f1edae89)

2. Modifique el formulario para que no cargue una página nueva. Ahora
cada vez que se oprima debe actualizar la página, pero no debe
recargarla nuevamente, es decir use Java script.

![{A158DFB4-3183-4E3B-A435-60B1373CFB6A}](https://github.com/user-attachments/assets/19c110f6-357f-4ac2-b820-8160aac3456b)

Resultado de ejecución:

![{1F928173-0D86-44F1-A632-8856543D16C9}](https://github.com/user-attachments/assets/6eeacf50-dcd1-41e5-aa96-258d039ea5c0)




