spring init --dependencies=web demo
cd demo
```[_{{{CITATION{{{_1{Deploying Spring Boot Applications to Heroku](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku)

### **3. Create a Procfile**
In the root of your project directory, create a file named `Procfile` and add the following line:
```plaintext
web: java -Dserver.port=$PORT -jar target/*.jar
```[_{{{CITATION{{{_3{Deploying a Java App on Heroku - Baeldung](https://www.baeldung.com/java-heroku-deploy-application)

### **4. Set up System Properties**
Create a file named `system.properties` in the root directory of your project and specify the Java runtime:
```plaintext
java.runtime.version=17
```[_{{{CITATION{{{_3{Deploying a Java App on Heroku - Baeldung](https://www.baeldung.com/java-heroku-deploy-application)

### **5. Deploy to Heroku**
Navigate to your project directory, log into Heroku, and create a new Heroku app:
```shell
heroku login
heroku create
git push heroku main
```[_{{{CITATION{{{_3{Deploying a Java App on Heroku - Baeldung](https://www.baeldung.com/java-heroku-deploy-application)

### **6. Open Your App**
Once deployed, you can open your app using:
```shell
heroku open
```[_{{{CITATION{{{_3{Deploying a Java App on Heroku - Baeldung](https://www.baeldung.com/java-heroku-deploy-application)

For more detailed instructions, you can check out the [official Heroku Dev Center guide](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku).

Ready to give it a try? If you run into any snags, I'm here to help! 😊
