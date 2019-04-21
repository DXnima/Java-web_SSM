# Java-web_SSM
#Java web  ssm框架

借鉴：https://www.jianshu.com/p/ce9ac958d274
https://www.cnblogs.com/verlen11/p/5349747.html

#SSM框架理解


最近两星期一直在学JavaEE的MVC框架，因为之前学校开的JavaEE课程就一直学的吊儿郎当的，所以现在真正需要掌握就非常手忙脚乱，在此记录下这段时间学习的感悟，如有错误，希望大牛毫不客气地指出。
 
 
Spring
Spring就像是整个项目中装配bean的大工厂，在配置文件中可以指定使用特定的参数去调用实体类的构造方法来实例化对象。
Spring的核心思想是IoC（控制反转），即不再需要程序员去显式地`new`一个对象，而是让Spring框架帮你来完成这一切。

SpringMVC
SpringMVC在项目中拦截用户请求，它的核心Servlet即DispatcherServlet承担中介或是前台这样的职责，将用户请求通过HandlerMapping去匹配Controller，Controller就是具体对应请求所执行的操作。SpringMVC相当于SSH框架中struts。

mybatis
mybatis是对jdbc的封装，它让数据库底层操作变的透明。mybatis的操作都是围绕一个sqlSessionFactory实例展开的。mybatis通过配置文件关联到各实体类的Mapper文件，Mapper文件中配置了每个类对数据库所需进行的sql语句映射。在每次与数据库交互时，通过sqlSessionFactory拿到一个sqlSession，再执行sql命令。

#SSM框架整合
要让几个框架相互配合，配置文件怎么写，项目的目录结构怎么设计对我这样一个新手来说实在很头疼。
目前我也只刚刚写过一个用户登录的demo，在此记录一下。

项目目录结构

    －LoginDemo
        －src
            －项目主包
                －controller
                －mapper
                －entity
                －service
        －web
            －WEB-INF
                －log4j.properties
                －spring-mybatis.xml
                －springMVC-config.xml
                －web.xml
            －index.jsp
        －pom.xml
        
        

controller：控制层。Controller层负责具体的业务模块流程的控制，在此层里面要调用Serice层的接口来控制业务流程，控制的配置也同样是在Spring的配置文件里面进行，针对具体的业务流程，会有不同的控制器，我们具体的设计过程中可以将流程进行抽象归纳，设计出可以重复利用的子单元流程模块，这样不仅使程序结构变得清晰，也大大减少了代码量。

dao： 持久层。DAO层主要是做数据持久层的工作，主要与数据库进行交互。DAO层首先会创建DAO接口，然后会在配置文件中定义该接口的实现类，接着就可以在模块中就可以调用DAO 的接口进行数据业务的而处理，并且不用关注此接口的具体实现类是哪一个类。DAO 层的数据源和数据库连接的参数数都是在配置文件中进行配置的。

entity：实体层。也就是我们存放实体类的包。

service：业务层。Service层主要负责业务模块的逻辑应用设计。是持久层的实现类。封装Service层的业务逻辑有利于通用的业务逻辑的独立性和重复利用性，程序显得非常简洁。

接下来是前端部分：
webapp目录下创建：
css：存放前端css文件
js：存放前端JavaScript文件
images：存放前端图片
fonts：存放前端的字体文件
在WEB-INF目录下创建：
views：存放前端网页（JSP文件）
同时在view的文件夹下创建：

index.jsp：这里我们把所有的网页文件放在views文件目录下需要删除webapp文件夹下的index.jsp，这里我们不需要用它。

作者：helloMiao
链接：https://www.jianshu.com/p/452bce1a6bea



#几个需要改的地方：

jdbc.properties数据库配置文件：

#版本低的com.mysql.jdbc.Driver 

river=com.mysql.cj.jdbc.Driver 

#mysql jar的位置

mysqlurl=E:/maven-repository/mysql/mysql-connector-java/8.0.12/mysql-connector-java-8.0.12.jar

#数据库地址
#本机IP用localhost，云服务器改为对应的公网IP

#url=jdbc:mysql://IP地址:端口号/数据库名?useUnicode=true&characterEncoding=utf-8

url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8
#数据库用户名
username=root
#数据库的密码
password=*****

#generatorConfig.xml文件 最后面：
 
 <table tableName="你自己的表名" domainObjectName="GetMsg" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"></table>

