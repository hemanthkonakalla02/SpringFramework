1]Explain indetail about Spring framework ?

    ->Spring is a powerful lightweight open source java framework used to build enterprise applications easily and efficiently

    Why Spring framework ?
      ->Before Spring framework was introduced,Developers used EJB(Enterprise Java Beans)
      ->In EJB thier are lot of problems like:-
          i)Very complex to write
          ii)Too much boiler plate code
          iii)Hard to test
          iv)Heavy and Slow
          v)Tightly coupled code
          vi)Difficult to maintain

      ->To Resolve all this problems in EJB,in the year 2003 Spring framework was introduced by John Rodson
      ->By using Spring framework
          i)It is very simple and easy to write
          ii)Less boiler plate code
          iii)Easy to test
          iv)Lightweight and fast
          v)Loosely coupled code
          vi)Easy to maintain


2]Difference between Spring and SpringBoot ?

    ->In Spring we has to do lot of manual XML configurations
    ->In Spring we has to add the manual Server externally because it does not provide any embedded server
    ->To create Spring project setup is more 
    ->Complexity is high
    ->Spring is widely used to develop large enterprise applications


    ->SpringBoot provides auto-configuration feature,this feature is enough to diffrentiate between Spring and Spring Boot
    ->SpringBoot provides the Embedded tomcat server
    ->To create Springboot project setup time is less
    ->Complexity is Simple
    ->SpringBoot is used to develop Modern Rest API's



3]Explain indetail about Singleton Design Pattern ?

    ->Singleton is a design pattern
    ->Singleton ensures a class has only one instance throughout the application and provides a global access point to it

    Why it is needed ?
        ->Some Resource should exists only one like database connection pool,logger or config manager
        ->Creating multiple instance would waste memory or cause inconsistency
        ->By default spring framework follows single ton design pattern

        
4]Explain indetail about IOC ?

    ->IOC stands for Inversion of Control
    ->Inversion of Control is a design principle where the control of object creation and dependency management is transfered 
    from application code to Spring IOC Container
    ->The IOC container in spring framework is responsible for
        ->Creating objects(beans)
        ->Injecting dependencies
        ->Managing the Bean life cycle

    Main containers
        ->BeanFactory
        ->ApplicationContext

5]Explain indetail about Dependency Injection ?

        ->Dependency injection is a design pattern and it is a technique to achieve Inversion of Control
        ->Which means Instead of creating the objects inside the class,the container provides the required objects
        ->In Spring framework thier are 3types of Dependency Injection :-
            1]Field Injection
            2]Constructor Injection
            3]Setter Injection


6]Explain indetail about Autowiring ?

    ->Autowiring is the feature of a spring that automatically performs dependency injection
    ->Instead of manually configuring dependency,spring automatically injects them
    ->In Spring we can perform Autowire in 3 ways:-
        i)byType : it uses class name
        ii)byName : field name and bean id should match
        iii)Constructor : it expects a parameterised constructor
