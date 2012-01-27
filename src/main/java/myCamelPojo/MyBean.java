package myCamelPojo;

import org.apache.camel.Body;
import org.apache.camel.Consume;
import org.springframework.stereotype.Component;

/**
 * A simple Camel POJO Consumer.
 * 
 * It takes a JAXB object as an argument.
 * Camel type conversion from String -> PersonDocument object kicks in automatically
 */
@Component
public class MyBean {

	@Consume(uri = "file:src/data?noop=true")
	public void personToName(@Body PersonDocument person) {
		System.out.println(person.getFirstName() + " " + person.getLastName());
	}
}
