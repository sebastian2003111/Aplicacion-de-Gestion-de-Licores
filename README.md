# 🥃 Licores del Viejo Mundo - Sistema de Gestión de Pedidos

![Captura de pantalla de la aplicación](ImagenApp.png) 

## 📌 Descripción
Aplicación Java para gestión de pedidos en una licorería, con interfaz gráfica basada en Swing. Permite:
- Explorar productos (Ron, Whisky, Cervezas)
- Agregar items a un pedido
- Calcular totales
- Generar facturas (en desarrollo)

## 🛠️ Tecnologías
- **Lenguaje**: Java 8+
- **Interfaz**: Java Swing (CardLayout para navegación)
- **Gestión de dependencias**: Maven
- **Control de versiones**: Git/GitHub

## 🚀 Cómo Ejecutar el Proyecto

### Requisitos previos
- JDK 8 o superior
- Maven 3.6+
- Git (opcional)

- ## Descarga Del Proyecto
- los componentes de la aplicacion estan comprimidos en la carpeta "Licores Del Viejo Mundo.zip",
  por favor despues de decargarlos de comprimirlos para que asi la App pueda estar disponible para su uso.

### Pasos para instalación:
```bash
# Clonar el repositorio
git clone https://github.com/tu-usuario/licores-del-viejo-mundo.git

# Navegar al directorio
cd licores-del-viejo-mundo

# Compilar con Maven
mvn clean install

# Ejecutar la aplicación
java -cp target/classes com.mycompany.licoresdelviejomundo.LicoresdelViejoMundo

#  Estructura del Código
src/
├── main/
│   ├── java/com/mycompany/licoresdelviejomundo/
│   │   ├── controllers/      # Lógica de controladores
│   │   ├── models/           # Clases de negocio
│   │   ├── views/            # Interfaces gráficas
│   │   └── Main.java         # Punto de entrada
│   └── resources/            # Recursos (imágenes, etc.)
├── test/                     # Pruebas unitarias
└── pom.xml                   # Configuración Maven
