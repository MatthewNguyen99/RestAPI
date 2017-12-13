package com.company;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class Controller {

    // QUESTION 1:
    // GET : http://<server_url>/math/add?n1=<numeric param 1>&n2=<numeric param 2>
    // This should add numbers 1 and 2 and provide the result in JSON
    // let's use: http://local:8080/math/add?n1=numOne&n2=numTwo
    @GetMapping (
        path = "/add",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public String addNumberAndProvideResult(@RequestParam("n1") String one,
                                            @RequestParam("n2") String two){
        JSONObject jsonObject = new JSONObject();

        int result = Integer.parseInt(one) + Integer.parseInt(two);
        jsonObject.put("answer",result);

        return jsonObject.toString();
    }


    // QUESTION 2:
    // POST : http://<server_url>/math/add	(allow for form params 1&2 in a POST body)
    // This should add two numbers from a POST body
    // let's use: http://local:8080/math/add
    @PostMapping (
        path = "/add", // for example
                consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public int addTwoNumberFromPostBody(@RequestParam("n1") String one,
                                         @RequestParam("n2") String two){
        JSONObject jsonObject = new JSONObject();
        int result = Integer.parseInt(one) + Integer.parseInt(two);
        return result;
    }
}
