# springboot-dubbo-consumer
springboot整合dubbo，zookeeper集群做协调服务，这个做消费者

jdk:1.8,  springboot:2.1.6, dubbo:0.2.0 

zookeeper:3.4.9 , curator:2.12.0

zookeeper集群的其中一个端口：192.168.137.131：2181

```

├─.mvn
│  └─wrapper
│          maven-wrapper.jar
│          maven-wrapper.properties
│          MavenWrapperDownloader.java
│          
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─ssm
│  │  │          │  DubboConsumerApplication.java  //启动类
│  │  │          │  
│  │  │          ├─controller
│  │  │          │      UserController.java	      //controller类
│  │  │          │      
│  │  │          ├─pojo
│  │  │          │      User.java		      //bean类
│  │  │          │      
│  │  │          └─service
│  │  │                  UserService.java		//服务接口
│  │  │                  
│  │  ├─resources
│  │  │  │  application.yml				//全局配置文件
│  │  │  │  
│  │  │  ├─static
│  │  │  └─templates
│  │  └─webapp
│  │      └─WEB-INF
│  │          └─jsp
│  │                  index.jsp  			//测试返回页面

```
