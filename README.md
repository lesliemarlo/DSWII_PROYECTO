# 🚀 Desarrollo de Servicios Web II: Proyecto Final de Gestión de Inventarios 🌐💻

<div align="center">

[![YouTube](https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/YouTube_icon_%282013-2017%29.png/40px-YouTube_icon_%282013-2017%29.png)](https://youtu.be/nAQf4VeFQDQ?si=7i9ioU0BrvWb4xdX)  
**[¡Haz clic aquí para ver el video!](https://youtu.be/nAQf4VeFQDQ?si=7i9ioU0BrvWb4xdX)**  

</div>

# 📦 Gestión de Inventario

Este repositorio contiene varios proyectos desarrollados como parte del curso **DSWII**. Cada proyecto corresponde a un tema del curso y está orientado a implementar conceptos clave como sockets, hilos, serialización y servicios web (SOAP y REST) en el contexto de un sistema de gestión de inventarios.

## 📝 Descripción del Proyecto

El objetivo es modelar un sistema de inventario que incluye las siguientes entidades básicas:

### Entidades principales

#### 📄 Inventario
```java
public class Inventario {
    private Long id;
    private LibroInfo libroInfo; // Información replicada del libro (libroId, tituloLibro, isbnLibro, anioPublicacionLibro)
    private Integer totalCopias; // Número total de copias físicas disponibles
    private Integer copiasDisponibles; // Número de copias actualmente disponibles (no prestadas, no dañadas)
    private LocalDateTime fechaCreacion; // Fecha/hora de creación del registro
    private LocalDateTime fechaActualizacion; // Última fecha/hora de actualización del registro

    private List<Copia> copias; // Relación con las copias
}
```
#### 📄 Copia
```java
public class Copia {
    private Long id; // Identificador único de la copia física
    private LibroInfo libroInfo; // Información replicada del libro
    private String codigoBarras; // Código interno de la copia, identificador único
    private EstadoCopia estadoCopia; // Relación con el estado actual de la copia
    private String ubicacionFisica; // Ubicación física de la copia (ej. "Estante A3", "Bodega", etc.)
    private LocalDateTime fechaCreacion; // Fecha/hora de creación del registro
    private LocalDateTime fechaActualizacion; // Última fecha/hora de actualización del registro
}
```
#### 📄 Estado copia
```java
public class EstadoCopia {
    private Long id; // Identificador único del estado de la copia
    private String nombre; // Nombre descriptivo del estado (ej. "DISPONIBLE", "PRESTADA")
    private String descripcion; // Descripción más extensa del estado
    private LocalDateTime fechaCreacion; // Fecha/hora de creación del registro
    private LocalDateTime fechaActualizacion; // Última fecha/hora de actualización del registro
}
```
#### 📄 LibroInfo
```java
@Embeddable
public class LibroInfo {
    private Long libroId; // Identificador único del libro
    private String tituloLibro; // Título del libro
    private String isbnLibro; // ISBN del libro
    private Integer anioPublicacionLibro; // Año de publicación del libro
}

```
## 👩‍💻 Temas y responsables

Cada link redirigirá a la descarga de su recurso:

| **Integrante** | **Tema asignado**                                                                 |
|-----------------|-----------------------------------------------------------------------------------|
| **Basty**       | [DSWII U01 T02 SocketsStreams](https://cibertecedu-my.sharepoint.com/:u:/g/personal/i202030255_cibertec_edu_pe/EYNjHRYeOcVCmN-mui-cq1wB5MX3tx1LlRewQreqmabViA?e=ngIGLH)                   |
| **Leslie**      | [DSWII U01 T03 Hilos Concurrencia Paralelismo](https://cibertecedu-my.sharepoint.com/:u:/g/personal/i202030255_cibertec_edu_pe/EafXpIkEJgNGho5vKPyzuXEBraCWuJfUvXX2L9V37BGr6g?e=09a1os) |
| **Leslie**      | [DSWII U01 T04 Archivos Flujos Serialización](https://cibertecedu-my.sharepoint.com/:u:/g/personal/i202030255_cibertec_edu_pe/EcWpzyDX8CVFkRRDzQk-edIBIG08AZVWcYhR7eIacIbNCQ?e=C8bgi4) |
| **Zarela**      | [DSWII U02 T05 ServicioWebSOAP.zip](https://cibertecedu-my.sharepoint.com/:u:/g/personal/i202030255_cibertec_edu_pe/EZYyML3S2sBEumhOndyQlN4B7PKcwTZOFe6QJ6PzfqcLVA?e=IZ0peC)           |
| **Zarela**      | [DSWII U02 T07 ServicioWebREST](https://cibertecedu-my.sharepoint.com/:u:/g/personal/i202030255_cibertec_edu_pe/EdsguJ40vEhPkad6NpT9i14BaT66cjFmPjuBW1KUdsFBlQ?e=v9Am5l)                 |


## 👩‍💻 Equipo de Desarrollo

- **Basty Celia Reyes Espíritu**  
  - [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/BastyReyes)  
  - [![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/basty-celia-reyes-espiritu-ab4598228/)

- **Leslie Yesenia Marlo Villanueva**  
  - [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/lesliemarlo)  
  - [![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leslie-yesenia-marlo-villanueva/)

- **Zarela Eugenia Manrique Condori**  
  - [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/ZarelaMC)  
  - [![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/zarelamc/)

# 🚀 Cómo contribuir

## Paso a paso:
### 1. Clonar el repositorio:
Abre tu terminal y clona el repositorio en tu máquina local:

```java
git clone https://github.com/lesliemarlo/DSWII_PROYECTO.git
```

### 2. Abrir el proyecto en NetBeans:

- Ve a Apache NetBeans y selecciona la opción "Abrir proyecto".
- Busca la carpeta donde clonaste el repositorio.
- Selecciona el proyecto correspondiente al tema que vas a trabajar. Cada carpeta del repositorio contendrá un proyecto independiente que puede abrirse de manera autónoma en NetBeans.
### 3. Crear tu proyecto si aún no existe:

- Si tu tema no tiene carpeta, crea un proyecto nuevo en NetBeans. Guarda el proyecto en la carpeta del repositorio.
- Asegúrate de seguir el nombre estándar para las carpetas:
```java
Ejemplo: DSWII_U01_T02_SocketsStreams para el tema de sockets y streams.
Subir los cambios:
```

❗ No elimines ni modifiques otras carpetas. Sube únicamente los archivos de tu proyecto.

### 🗣 Usa los siguientes comandos para guardar y subir tus cambios:
```java
git add .
git commit -m "Añade [nombre de tu tema]"
git push origin [Nombre de tu rama]
```

