# AppPersonajes

App for querys about Marvel Characters 
Design pattern MVVM
Clean Architecture

Kotlin

KTX

Clean Architecture

Coroutines

Retrofit

Glide

LiveData

Dagger 2

Data by
Marvel Api https://developer.marvel.com/docs

You Need setup yor own Api Keys in file  gradle.properties and sync project

# Clean Architecture
Layers:

- UI: All logical of views -> activities,fragments and viewmodels

- Framework : Framework of android , Android Libraries ,Retrofit (Http client), Room(Local Database).

- Data :All Repositories of the app for query data.

- Domain: Models of objects and entities.

- UseCase: All Uses Case of the app , how like get Characters ...


# Dagger 2
I Used differents modules by each layer of the architecture , provide data that i needed , inject use cases in the fragment
how like parameters in viewmodel


# Communication

We used sealed class by name *Dataresult* for state of data 
Navigation Component for navigation in the app

#
# Spanish

Aplicacion de Consulta de Personajes Marvel Listado + Detalles

Design pattern MVVM
Clean Architecture
Realizado Bajo Clean Architecture y Patron MVVM

Kotlin

KTX

Clean Architecture

Coroutines
Corrutinas

Retrofit

Glide

LiveData

Dagger 2


Data by
Marvel Api https://developer.marvel.com/docs


Para el Correcto Funcionamiento Ingresar Keys Public y Private en el archivo gradle.properties
y sincronizar el proyecto

# Clean Architecture


Capas
- UI : Se encuentra toda la logica correspondiente a las vistas ,en este caso los fragments con sus respectivos ViewModels /

- Framework:  En esta capa se encontrara todo lo correspondiente al framework de Android,en este caso la libreria de Retrofit ,con el cual se realiza las peticiones,pero tambien puede ir por ejemplo ,la implementacion de ROOM para el manejo de BBDD SQLITE

- Data :Correspondiente a los datos de la aplicacion, podemos encontrar los repositorios de donde se obtendran los datos

- domain:Principalmente encontraremos el modelado de los objetos que se utilizaran en la aplicacion

- useCases:Encontraremos todos los casos de uso que se utilizaron en la app


# Dagger 2
Utilizamos distintos modulos correspondientes a cada capa de la arquitectura, proviendo lo necesario 
en ultima instancia inyectamos los casos de usos en el fragment, y se los pasamos como parametros al viewModel


# Comunicacion
Utilizamos sealed Class denominada *DataResult* para el estado de los datos consultados
Navigation Component para la Navegacion de la Aplicaccion
