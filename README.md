# Java Microservices Instance template(JMit)
java的微服务实例模板，只需简单的配置，就开启一个你自己的微服务实例


## 特性
1、通过flyway对数据库的结构进行版本控制，数据库结构的历史变化一目了然.

2、通过jooq自动生成数据表的实体类，无需再手动一个个创建，简化这类模式代码的编写.
(jooq使用说明 http://amao12580.github.io/post/2016/04/JOOQ-from-entry-to-improve/)

3、所有的实际业务逻辑通过service接口模式来实现.

4、所有的对外api接口写在controller中.
