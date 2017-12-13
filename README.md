# RestAPI
====================================== QUESTION

Build a Restful Service written in Java or Groovy with the following endpoints:

1.	GET : http://<server_url>/math/add?n1=<numeric param 1>&n2=<numeric param 2> This should add numbers 1 and 2 and provide the result in JSON

2.	POST : http://<server_url>/math/add (allow for form params 1&2 in a POST body) This should add two numbers from a POST body

3.	GET : http://<server_url>/time/now This should fetch time for MST at time of call from another service 

(https://www.developer.aero/WaitTime-API/Try-it-Now for YYC is a free one) and simplify the result to timezone and current time. Return the result or the timestring in a rational JSON document.

The service must be built using the following technologies:
Spring Boot 
Gradlew (build)


====================================== INSTRUCTION

1.	Instructions on how to run it locally:

        a. The codes perfectly ran in localhost:8080.  Use Postman
              http://localhost:8080/time/now   method = GET
              http://localhost:8080/math/add  method = POST
              http://localhost:8080/math/add?n1=3&n2=6     (any number for n1 and n2) method = GET
              
        b. Instruction to run locally
              * Download the project WestJet from https://github.com/MatthewNguyen99/WestJetREST
              - Save and name the project as WestJet
              - Open terminal, cd to the folder name WestJet 
              - Run command ./gradlew bootRun
              
              * Download and run Postman from Google
              - In the second bar of Postman from the top, enter http://localhost:8080/time/now
              - Set to GET
              - Click blue button “Send”  ->	The MST time will show 
              
              * In the second bar of Postman from the top, enter http://localhost:8080/math/add
              - Set to POST
              - in the body, set 
                        Key		        Value
                        n1 		        <any number>
                        n2		        <any number>
              - Click blue button “Send”  ->	The result will show in the body below

              * In the second bar of Postman from the top, enter any number after “=”. Choose 9 and 8 for now           
                http://localhost:8080/math/add?n1=9&n2=8
              - Set to GET
              - Click blue button “Send”  ->	The result will show in the body below
                        {
                          "answer": 17
                        }


              
              
              
              
              
 

              
        


