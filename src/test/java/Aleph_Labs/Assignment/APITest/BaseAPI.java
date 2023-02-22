package Aleph_Labs.Assignment.APITest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPI {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://jsonplaceholder.typicode.com")
			.setContentType(ContentType.JSON)
			.build();
}
