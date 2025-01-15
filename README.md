# First REST API Spring

## Description
This is a demo Spring Boot project designed to provide a simple REST API for managing products. It demonstrates basic operations such as Create, Read, Update, and Delete (CRUD) using Spring Boot, JPA, and H2 in-memory database. The API is documented using Swagger and OpenAPI.

## Features
- **Create Product** - Adds a new product.
- **Get All Products** - Retrieves all products.
- **Get Product by ID** - Retrieves a product by its ID.
- **Update Product** - Updates the details of an existing product.
- **Delete Product** - Deletes a product by its ID.

## Technologies Used
- Spring Boot (version 3.4.1)
- Spring Data JPA
- H2 Database (In-memory)
- OpenAPI (Swagger) for API documentation
- Java 17

## Requirements
- JDK 17 or higher
- Maven

## Getting Started

### Clone the Repository
To get started with the project, clone the repository:

```bash
git clone https://github.com/yourusername/first-rest-api-spring.git
cd first-rest-api-spring
```
## Build and Run the Application
### 1. __Build the project using Maven__:

```bash
mvn clean install
```
### 2. __Run the application__:

```bash
mvn spring-boot:run
```
The application will run on `http://localhost:8080`.

# Swagger UI
After starting the application, you can access the Swagger UI at:

```bash
http://localhost:8080/swagger-ui/index.html
```
This will provide you with an interactive interface to explore the API endpoints.

# API Endpoints
### 1. __Get All Products__
   * __URL__: `/api/v1/products`
   * __Method__: `GET`
   * __Description__: Retrieves all products in the system.
   * __Response Example__:
     ```json
     [
         {
             "id": 1,
             "name": "Product 1"
         },
         {
             "id": 2,
             "name": "Product 2"
         }
     ]
     ```
### 2. __Create Product__
   * __URL__: `/api/v1/products`
   * __Method__: `POST`
   * __Description__: Creates a new product.
   * __Request Body Example__:
     ```json
     {
         "name": "New Product"
     }
     ```
   * __Response Example__:
     ```json
     {
         "id": 3,
         "name": "New Product"
     }
     ```
### 3. __Get Product by ID__
   * __URL__: `/api/v1/products/{id}`
   * __Method__: `GET`
   * __Description__: Retrieves a single product by its ID.
   * __Response Example__ (for ID = 1):
     ```json
     {
         "id": 1,
         "name": "Product 1"
     }
     ```
### 4. __Update Product__
   * __URL__: /api/v1/products/{id}
   * __Method__: PUT
   * __Description__: Updates an existing product by its ID.
   * __Request Body Example__:
     ``json
     {
         "name": "Updated Product Name",
         "id": 1
     }
     ```
   * __Response Example__:
     ```json
     {
         "id": 1,
         "name": "Updated Product Name"
     }
     ```
### 5. __Delete Product__
   * __URL__: `/api/v1/products/{id}`
   * __Method__: `DELETE`
   * __Description__: Deletes a product by its ID.
   * __Response__: `204` No Content

# Example of Use

## Step 1: Create a Product

Send a `POST` request to create a new product:

  ```bash
  POST http://localhost:8080/api/v1/products
  Content-Type: application/json

  {
    "name": "Example Product"
  }
  ```
Response:

  ```json
  {
    "id": 1,
    "name": "Example Product"
  }
  ```
## Step 2: Get All Products

Send a `GET` request to retrieve all products:

  ```bash
  GET http://localhost:8080/api/v1/products
  ```
Response:

  ```json
  [
    {
      "id": 1,
      "name": "Example Product"
    }
  ]
  ```
## Step 3: Get Product by ID

Send a `GET` request to retrieve a product by its ID:

  ```bash
  GET http://localhost:8080/api/v1/products/1
  ```

Response:

  ```json
  {
    "id": 1,
    "name": "Example Product"
  }
  ```
## Step 4: Update Product

Send a `PUT` request to update a product:

  ```bash
  PUT http://localhost:8080/api/v1/products/1
  Content-Type: application/json

  {
    "name": "Updated Product Name",
    "id": 1
  }
  ```
Response:

  ```json
  {
    "id": 1,
    "name": "Updated Product Name"
  }
  ```
## Step 5: Delete Product

Send a `DELETE` request to delete a product:

  ```bash
  DELETE http://localhost:8080/api/v1/products/1
  ```
Response: `204` No Content

# License
This project is licensed under the MIT License - see the LICENSE file for details.

### Key Sections of the README:
1. **Description**: Provides an overview of the project and its functionality.
2. **Technologies Used**: Specifies the technologies, frameworks, and tools.
3. **Getting Started**: Includes instructions for setting up and running the project.
4. **API Endpoints**: Describes the available REST API endpoints with request/response examples.
5. **Example of Use**: Provides real-world usage examples with cURL requests.
6. **License**: Specifies the licensing terms for the project.
