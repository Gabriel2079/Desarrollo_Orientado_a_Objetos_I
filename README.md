Duoc UC


# 🧠 Desarrollo Orientado a Objetos I

---

## 📘 Descripción general del sistema

# Proyecto: Llanquihue Tour (Semana 3)

## ¿De qué se trata este proyecto?
Este es un programa básico en Java que creé para ayudar a la agencia de viajes "Llanquihue Tour". El objetivo principal es pasar sus registros de clientes y trabajadores (que antes se anotaban a mano) a un sistema ordenado en la computadora. Así evitamos que la información se duplique o se pierda en el negocio.

---

## Estructura del código (Paquetes y Clases)
Organicé el código en dos carpetas principales (paquetes) para separar las tareas:

* **Carpeta `app`**: Aquí está la clase `Main.java`, que es el motor del programa y se encarga de hacer funcionar todo.
* **Carpeta `model`**: Aquí guardé las clases con los datos del sistema usando objetos:
    * `Persona.java`: Guarda los datos básicos como el nombre, correo, dirección y el RUT.
    * `Empleado.java`: Es un tipo de persona, pero tiene los datos del trabajador (su cargo y sueldo).
    * `Direccion.java`: Guarda el domicilio (calle, número y región) de la persona.
    * `Rut.java`: Una clase independiente que creé para manejar el RUT de forma ordenada.

---

## Cómo compilar y ejecutar el programa
Para probar el sistema en tu computadora, sigue estos pasos:

1. Abre la carpeta del proyecto dentro de **IntelliJ IDEA**.
2. En el panel izquierdo, busca la ruta `src/app/ m` y abre el archivo **`Main.java`**.
3. Haz clic derecho sobre el código de `Main.java` y elige la opción **"Run 'Main.main()'"** (o presiona el botón del triángulo verde arriba a la derecha).
4. El programa se compilará solo y verás los datos de prueba impresos abajo en la pantalla de la consola.

---

* **Alumno:** Gabriel Márquez V.
* **Curso:** Desarrollo Orientado a Objetos I (Duoc UC Online)

