# rapid4j

------

**rapid4j** is a rapid seed project for building java-backend Modern Application

------

## How to get/use it
> * 1、git clone https://github.com/Mignet/rapid4j
> * 2、execute src/test/resources/rapid4j.sql in your postgres database OR src/test/resources/rapid4j-mysql.sql for mysql
> * 3、update src/main/resources/application.properties to your own db link
> * 4、cd rapid4j
> * 5、mvn clean package -Dmaven.test.skip=true
> * 6、deploy rapid4j/target/rapid4j.war to your webserver, e.g.Tomcat7
> * 7、browse http://localhost:8080/rapid4j to login
> * 8、browse http://localhost:8080/rapid4j/rest/customers/admin you'll get 401 error
> * 9、Congratulations

## For IDE
> #### 1 、IntelliJ IDEA
* File -> Import Project -> select assm folder -> create project form existing sources -> ...

> #### 2、 Eclipse
* File -> Import -> Existing Maven Projects -> ...

## If you have a better suggestion,Please feel free to contract me.
> Author ：CaiWee  
> Email  ：mignetwee@gmail.com  
