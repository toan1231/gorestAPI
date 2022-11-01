package gorest;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import requestBuilder.GorestRequestBuilder;
import io.restassured.RestAssured;

public class GorestEnd2EndScenario {
    @Test
    public void end2End() throws JsonProcessingException {
/*This is Gorest API end to end scenario and cover almost everything you learnt so far. Please finish it before next class.
 *  You can reach out me if you have any question

1.Creata request data from java object (by using Encapsulation concept)
2. Convert object to json and print in console
3. Submit POST request to create a new user
4. Validate status code is 201
5. Write response to an external file
6. Get unique id from response
7. Use GetUserByID method to validate if data is created
8. Validate the status code is 200
9. Update name and status of that record with PUT method
10.Validate the status code is 200
11.Use GetUserByID method to validate if data is updated (Validate if you see updated values in response)
12. Delete record by using DELETE method
13. Use GetUserByID method to validate if data is deleted (Validate status code is 404 and error message is "Resource not found" )

 */

        String requestBuilder="";
        GorestRequestBuilder builder=new GorestRequestBuilder();
        builder.setName("thang toan ngo");
        builder.setEmail("chau22667@gmail.com");
        builder.setGender("female");
        builder.setStatus("active");
        //convert object to json and print
        ObjectMapper mapper=new ObjectMapper();
        String stringJSon= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(builder);
        System.out.println(stringJSon);



    }

}

