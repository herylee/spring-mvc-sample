#### 从零开始构建Spring MVC

__web.xml__  
从web.xml中引入`servlet org.springframework.web.servlet.DispatcherServlet`

__blog-servlet.xml__  
Spring MVC的`DispatcherServlet`默认会加载`XXXX-servlet.xml`。文件前面的`XXXX`与`web.xml`
中的`<servlet-name>`定义的一致。例子中为blog。


#### 从零开始构建Spring Security
在Spring mvc的基础上搭建Spring security用于权限管理

__web.xml__  
需要增加filter拦截器，该拦截器又需要增加ContextListener上下文监听器，而监听器又需要为其配置上下文参数，
即是spring mvc和security所需的xml的参数。
```
<filter>
    <filter-name>springSecurityFilterChain</filter-name>
    <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
</filter>
<filter-mapping>
    <filter-name>springSecurityFilterChain</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```
```
<listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
```
```
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>
        /WEB-INF/blog-servlet.xml,
        /WEB-INF/blog-security.xml
    </param-value>
</context-param>
```
__blog-security.xml__  
该文件的关键点在于` <intercept-url pattern="/employee/get" access="hasRole('ROLE_USER')"/>`
中的`access`为`hasRole(**)`，网上和许多书的教材都有问题。


---

Reference & Thx: [http://howtodoinjava.com/spring/spring-mvc/spring-mvc-hello-world-example/](http://howtodoinjava.com/spring/spring-mvc/spring-mvc-hello-world-example/)
