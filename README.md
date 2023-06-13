# RRPipesBackend
Backend API for Pipe data


Spring notes

-> Default request type is GET for any request kind
-> whatever you return from a controller after url request call, spring mvc converts it to json.
-> the json has key name corresponding to property name of the dto class and json values are the values of those properties.

-> if you add only the parent in the pom and not any dependency, the parent doesn't actually pull jars with it, it just decides configurations 
    of dependencies pulled up by the dependency.
-> BOM stands for Bill Of Materials. A BOM is a special kind of POM that is used to control the versions of a project’s dependencies and provide a central 
    place to define and update those versions.
    BOM provides the flexibility to add a dependency to our module without worrying about the version that we should depend on.
    BOM is usually fecilitated by the parent which we add to pom. the parent version decides version for all the dependencies, 
    we need not add versions for all dependencies explicitly.
-> advantages of embedded tomcat server:
    Convenient
    Servlet container config is now application config -> no need to configure servlet container alag se.
    Standalone application
    Useful for microservice architecture-> you don't want to execute additional steps to deploy each of the microservices. 
                                            being able to deploy each service on a single click is a blessing.

-> Spring MVC Controller - View tier
    View tier is handled by the spring MVC.
    Controller is a class that maps a URI and some HTTP Method to some Functionality (java method or services). Controller ha some methods to
    accepts requests and return responses. Spring MVC scans the class path to map the URI with respective Annotations and HTTP Methods.