# Overview of a webapp
- *web clients*
- *web server*
- *servlet container*
    - *servlet request*
    - *servlet response*
- Apache Tomcat

Web clients request information from the server using HTTP protocol.
- web server accepts request and processes, finally sends the information in the format of HTML or JSON.
- servlet container is responsible for converting the HTTP request to java code.
- Apache Tomcat is mostly used servlet container.
- servlet requests are the converted HTTP messages, they are passed to servlet method as a parameter.
- servlet responses are the output of servlet method.

## Role of servlet inside web application
### Before Spring
- A developer  has to create a servlet instance, configure servlet container and assign to specific path.
- when a client sends a request Tomcat sends the process to servlet that is associated with the URL path.
Then the servlet process the request and Tomcat sends the response to the client.

### With Spring
- spring introduces **Dispatcher servlet** that is capable of handling all the URL the mapping inside the web application.
- The servlet container calls the dispatcher servlet based on client request, spring will manage all the operation without 
a need for a developer to define a servlet in the web app.