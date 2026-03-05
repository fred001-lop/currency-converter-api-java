# 💱 Conversor de Monedas en Java

Aplicación en **Java** para convertir entre diferentes monedas usando tasas de cambio en tiempo real desde la **API de ExchangeRate‑API**.  
El programa es de **consola interactiva**, mostrando resultados claros y precisos.

## 🔹 Funcionalidades

- Conversión entre **USD, GTQ, BRL y MXN**.  
- Consulta de tasas de cambio en tiempo real.  
- Menú interactivo de fácil uso.  
- Uso de `HttpClient` para solicitudes HTTP.  
- Uso de `Gson` para parsear JSON de la API.

## 📂 Estructura del proyecto

```text
src/
├── model/
│   └── Moneda.java        # Representa los datos de la API
├── service/
│   └── Consulta_Api.java  # Gestiona la petición HTTP
└── Principal.java         # Menú y lógica de conversión

🚀 Cómo ejecutar
Clona el repositorio:

git clone https://github.com/fred001-lop/currency-converter-api-java.git

Asegúrate de tener Java 11+ y la librería Gson en el proyecto.

Compila y ejecuta:

javac Principal.java
java Principal
📝 Uso

Al ejecutar, se mostrará un menú como este:

*********************************
Sea bienvenido/a al Conversor de Moneda
1) Quetzales a Dólares
2) Dólares a Quetzales
3) Dólar a Real Brasileño
4) Real Brasileño a Dólar
5) Peso Mexicano a Dólar
6) Dólar a Peso Mexicano
7) Salir
Elija una opcion valida:
*********************************

Luego ingresa la cantidad a convertir y verás algo como:

El valor 25.00 [USD] corresponde al valor final de ===> 195.00 [GTQ]
📌 Tecnologías

Java 11+

HttpClient (java.net.http)

Gson (para JSON)

⚡ Recomendaciones

Mantener la API Key en un archivo separado o variable de entorno.


🤝 Autor

Fredy Lopez – Desarrollador Java
