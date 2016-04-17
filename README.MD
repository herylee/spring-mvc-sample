#### 从零开始构建Spring MVC

__web.xml__  
从web.xml中引入`servlet org.springframework.web.servlet.DispatcherServlet`

__blog-servlet.xml__  
Spring MVC的`DispatcherServlet`默认会加载`XXXX-servlet.xml`。文件前面的`XXXX`与`web.xml`
中的`<servlet-name>`定义的一致。例子中为blog。
