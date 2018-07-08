How To Run Spring Boot Application in AWS EC2 Instance ?
========================================================

1. Create a Spring Boot Demo application.

2. Ensure That The Built Demo Spring Boot Application is Running Locally - Success.

3. Create a Trial AWS Account With Your Email Address.

4. Login to Created AWS Account Using AWS Console - https://console.aws.amazon.com/

5. Create a S3 BUCKET in AWS

6. Upload The Built Spring Boot Application to AWS S3 Bucket + Grant Public Access To This Object.

7. Create an AWS EC2 [Elastic Compute Cloud] Instance in AWS.

	a)  Go to the AWS console. Select the ‘EC2 Service‘.

	b) Then, select ‘instances‘ and click on the ‘Launch Instance‘ button. There are no of OS, we can select as a server (Ubuntu, RedHat, Amazon Linux, SUSE Linux). For this tutorial, we selected the Ubuntu.

	c) Select the free tier eligible instance and launch it.

	d) During the launch, it will ask for a creating security key. Select the ‘Create a new key pair‘ and give a name as a 'springbootapplication'. Finally, download the key.

	e) If you are using Mac OS or Linux give a permission to the file using a following command.

	f) >chmod 400 springdemoapplication.pem

8. From Your Laptop Login To The Created AWS EC2 Instance Using SSH.

	>ssh -i "springdemoapplication.pem" ec2-user@ec2-52-14-228-60.us-east-2.compute.amazonaws.com

9. Ensure Java Is Installed In Your AWS EC2 Instance (VM) or Install Java in AWS EC2 Instance.
	>sudo yum install java-1.8.0
	>sudo yum remove java-1.7.0-openjdk

10. Get The Spring Boot Application From AWS S3 Bucket To AWS EC2 Instance.
	> wget https://s3.us-east-2.amazonaws.com/s3-spring-bucket/spring-boot-web-thymeleaf-1.0.jar

11. Please enable 8080 For Your Application In AWS Security Group

	You have to choose "Custom TCP rule" in the dropdown.

	Then you will be able to change the port to 8080.

	https://stackoverflow.com/questions/26338301/ec2-how-to-add-port-8080-in-security-group

12. Finally Start The Spring Boot Application In AWS EC2 Instance :

[ec2-user@ip-172-31-20-5 ~]$ java -jar spring-boot-web-thymeleaf-1.0.jar 


```


 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.2.RELEASE)

2018-07-07 21:35:04.466  INFO 2835 --- [           main] com.learnshare.SpringBootWebApplication  : Starting SpringBootWebApplication v1.0 on ip-172-31-20-5 with PID 2835 (/home/ec2-user/spring-boot-web-thymeleaf-1.0.jar started by ec2-user in /home/ec2-user)
2018-07-07 21:35:04.482  INFO 2835 --- [           main] com.learnshare.SpringBootWebApplication  : No active profile set, falling back to default profiles: default
2018-07-07 21:35:05.334  INFO 2835 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@2328c243: startup date [Sat Jul 07 21:35:05 UTC 2018]; root of context hierarchy
2018-07-07 21:35:08.197  INFO 2835 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
2018-07-07 21:35:08.227  INFO 2835 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
2018-07-07 21:35:08.235  INFO 2835 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.6
2018-07-07 21:35:08.391  INFO 2835 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-07-07 21:35:08.391  INFO 2835 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 3060 ms
2018-07-07 21:35:08.669  INFO 2835 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
2018-07-07 21:35:08.677  INFO 2835 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-07-07 21:35:08.678  INFO 2835 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-07-07 21:35:08.682  INFO 2835 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-07-07 21:35:08.683  INFO 2835 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-07-07 21:35:09.331  INFO 2835 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@2328c243: startup date [Sat Jul 07 21:35:05 UTC 2018]; root of context hierarchy
2018-07-07 21:35:09.475  INFO 2835 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.String com.learnshare.DemoApplicationController.welcome(java.util.Map<java.lang.String, java.lang.Object>)
2018-07-07 21:35:09.479  INFO 2835 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-07-07 21:35:09.482  INFO 2835 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-07-07 21:35:09.540  INFO 2835 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-07-07 21:35:09.546  INFO 2835 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-07-07 21:35:09.619  INFO 2835 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-07-07 21:35:10.460  INFO 2835 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-07-07 21:35:10.564  INFO 2835 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)

```

Recommeded AWS Course in Tamil :

Mr.Susindran Suruli
AWS solution architec and Redhat certified engineer (RHCE)

https://www.udemy.com/aws-tamil-tutorial-from-zero-to-hero/learn/v4/overview
