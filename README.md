# 📦 Gestión de Inventario

Este repositorio contiene varios proyectos desarrollados como parte del curso **DSWII**. Cada proyecto corresponde a un tema del curso y está orientado a implementar conceptos clave como sockets, hilos, serialización y servicios web (SOAP y REST) en el contexto de un sistema de gestión de inventarios.

## 📝 Descripción del Proyecto

El objetivo es modelar un sistema de inventario que incluye las siguientes entidades básicas:

### Entidades principales

#### 📄 Inventario
```java
class Inventario {
    int idInventario;
    String nombre;
    int cantidad;
    List<Copia> copias; // Relación con las copias
}
```
#### 📄 Copia
```java
class Copia {
    int idCopia;
    String estadoCopia; // Atributo "EstadoCopia" (Ej: "Disponible", "Reservado", "Dañado")
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

## 🐱‍🐉 Cómo se espera que esté:
![image](https://github.com/user-attachments/assets/41655d7d-ec4b-46b5-b994-6429053f28d7)

