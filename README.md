# AppPersonajes
Aplicacion de Consulta de Personajes Marvel Listado + Detalles

Realizado Bajo Clean Architecture y Patron MVVM

Kotlin

KTX

Clean Architecture

Corrutinas

Retrofit

Glide

LiveData

Dagger 2


Datos Consultados Bajo
Marvel Api https://developer.marvel.com/docs

Para el Correcto Funcionamiento Ingresar Keys Public y Private en el archivo gradle.properties
y sincronizar el proyecto

# Clean Architecture
Capas
- UI : Se encuentra toda la logica correspondiente a las vistas ,en este caso los fragments con sus respectivos ViewModels

- Framework:  En esta capa se encontrara todo lo correspondiente al framework de Android,en este caso la libreria de Retrofit ,con el cual se realiza las peticiones,pero tambien puede ir por ejemplo ,la implementacion de ROOM para el manejo de BBDD SQLITE

- Data :Correspondiente a los datos de la aplicacion, podemos encontrar los repositorios de donde se obtendran los datos

- domain:Principalmente encontraremos el modelado de los objetos que se utilizaran en la aplicacion

- useCases:Encontraremos todos los casos de uso que se utilizaron en la app


# Dagger 2
Utilizamos distintos modulos correspondientes a cada capa de la arquitectura, proviendo lo necesario 
en ultima instancia inyectamos los casos de usos en el fragment, y se los pasamos como parametros al viewModel


# Comunicacion
Utilizamos sealed Class denominada DataResult para el estado de los datos consultados
Navigation Component para la Navegacion de la Aplicaccion
