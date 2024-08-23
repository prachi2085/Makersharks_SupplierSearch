# Supplier Search API

## Project Description
This project provides a Spring Boot-based API for searching suppliers. Users can query the database to find manufacturers based on specific criteria.

## Prerequisites
- JDK 11 or later
- Maven 3.6 or later
- Spring Boot 2.5 or later

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/prachi2085/supplier-search-api.git

2. Navigate into the project directory:
   cd src/main/java/com/markersharks/supplier/SupplierSearchApiApplication

3. Install dependencies: mvn install
4. Run the Application:
   You can run it from an IDE like Eclipse by importing the project and running it as a Spring Boot application.
5. The API exposes the following endpoints:
GET /suppliers: Retrieve a list of suppliers based on search criteria.
POST /suppliers/search: Search for suppliers with specific parameters.

6. cURL Commands:
   To get a list of suppliers:
   curl -X GET [http://localhost:8080/suppliers](http://localhost:8080/h2-console/login.jsp?jsessionid=b7600b979a1aa4300c421596d1375df9)
   
  
