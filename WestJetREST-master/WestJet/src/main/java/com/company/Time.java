package com.company;


import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/time")
public class Time {

    // QUESTION 3:
    // GET : http://<server_url>/time/now
    // This should fetch time for MST at time of call from another service
    // (https://www.developer.aero/WaitTime-API/Try-it-Now for YYC is a free one)
    // and simplify the result to timezone and current time.  Return the result or
    // the timestring in a rational JSON document.
    // let's use: http://local:8080/time/now
    @GetMapping(
            path = "/now",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public String fetchTimeMST(){
        JSONObject jsonObject = new JSONObject();
        Date time = Calendar.getInstance().getTime();

        jsonObject.put("answer",time);

        return jsonObject.toString();
    }

}
