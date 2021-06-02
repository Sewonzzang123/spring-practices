## 초기 설정
라이브러리 

```
> Spring-context(->spring core(의존))(->spring-aop(의존))
> Spring Web Mvc 
> Spring Web(DispatcherServlet, ContextLoadListener, EncodingFilter)
```

/WEB-INF/spring-servlet.xml 생성

	<context:annotation-config />
	<context:component-scan base-package="com.douzone.hellospring.controller" />
