# Peaje y Vehículos (*308)

Este proyecto modela un sistema de peaje para estaciones que registra vehículos y calcula los valores correspondientes de peaje según su tipo. Al finalizar, genera un reporte con el total acumulado y los detalles de los vehículos registrados.

## 📜 Requisitos del Problema
- **Estación de peaje**:
    - Nombre, ciudad y total de peajes recolectados.
- **Vehículos admitidos**:
    - **Coche**: $100 por vehículo.
    - **Moto**: $50 por vehículo.
    - **Camión**: $50 por cada eje.

El sistema debe:
1. Calcular el peaje de cada vehículo registrado.
2. Mostrar un listado de vehículos y el total acumulado.

---

## 📂 Estructura del Proyecto

```plaintext
src/main/java/io/aws/peaje/
├── Peaje.java       # Clase principal de la estación de peaje
├── Vehiculo.java    # Clase abstracta base para vehículos
├── Coche.java       # Subclase que representa coches
├── Moto.java        # Subclase que representa motos
├── Camion.java      # Subclase que representa camiones
src/test/java/io/aws/peaje/
├── PeajeTest.java   # Pruebas unitarias con JUnit
```

---

## ⚙️ Instalación y Ejecución

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/peaje-vehiculos.git
   cd peaje-vehiculos
   ```

2. **Compilar el proyecto**:
   ```bash
   mvn clean compile
   ```

3. **Ejecutar las pruebas unitarias**:
   ```bash
   mvn test
   ```

4. **Ejecutar el programa principal**:
   Aún no se ha definido un archivo de ejecución principal, pero el comportamiento puede probarse mediante las clases y pruebas existentes.

---

## 📊 Diagrama UML


---

## ✅ Pruebas Unitarias
Las pruebas unitarias se realizaron con **JUnit 5** y garantizan un mínimo del 70% de cobertura.

### Captura de la sección de pruebas:

---

## 🛠 Tecnologías Utilizadasgit add .

- **Java**: Lenguaje de programación.
- **JUnit 5**: Framework de pruebas.
- **Maven**: Gestión de dependencias.
