💱 Conversor de Monedas en Java

Aplicación en Java que permite convertir entre diferentes monedas usando tasas de cambio en tiempo real obtenidas desde la API de ExchangeRate‑API.

El programa es de consola interactiva, donde el usuario elige la conversión que desea realizar y obtiene el resultado de forma clara.

🔹 Funcionalidades

Conversión entre monedas: Quetzales, Dólares, Reales Brasileños y Pesos Mexicanos

Consulta de tasas de cambio en tiempo real

Menú interactivo en consola

Uso de HttpClient y Gson para manejar la API y JSON

📂 Estructura del proyecto
src/
├── model/
│   └── Moneda.java       # Representa los datos de la API
├── service/
│   └── Consulta_Api.java # Maneja la petición HTTP
└── Principal.java        # Menú y lógica de conversión


🚀 Cómo ejecutar

Clonar el repositorio:

git clone https://github.com/fred001-lop/currency-converter-api-java.git

Agregar Gson al proyecto (Maven o .jar).

Ejecutar la clase Principal.java.

javac Principal.java
java Principal
📝 Uso

Al ejecutar, se mostrará un menú con las opciones de conversión.
Luego se ingresa la cantidad y se obtiene un mensaje como:

El valor 25.00 [USD] corresponde al valor final de ===> 195.00 [GTQ]
📌 Tecnologías

Java 11+

HttpClient (java.net.http)

Gson (para JSON)
