# retailservice

Spring Boot 3.5 (Java 25, Maven) service exposing an in-memory product catalog. Moved out of `bankingservices`.

- Port `8082`, context path `/retail` (base URL `http://localhost:8082/retail`)
- Catalog is a static in-memory map seeded from `LoadProductData`; mutations persist for the JVM lifetime and leak across tests, so avoid exact-size assertions.

| Method | Endpoint Path | Description |
| :--- | :--- | :--- |
| `GET` | `/v1/product/allproducts` | Returns all products |
| `GET` | `/v1/product/productId/{productId}` | Returns one product, or `404` |
| `POST` | `/v1/product/addproduct` | Adds a product and returns it |
| `GET` | `/v1/product/productmessage` | Triggers a product/user lookup and returns a message |

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 25)
mvn test
mvn spring-boot:run
curl -s http://localhost:8082/retail/v1/product/allproducts
```
