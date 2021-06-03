## 순서
1. maven project 생성
2. web.xml 추가
3. target Runtime
4. pom.xml 설정
5. web.xml 설정 
> 5-1. /WEB-INF/applicationContext.xml (Root Application Context)
> 5-2. /WEB-INF/spring-servlet.xml (Web Application Context)
6. package 및 소스 코드 추가


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

	
Restful

* GET		/board				(board list)	R	
* GET		/board/view/{no}	(view)			

* POST		/board
* title=...&contents=.....		(create)		C

* DELETE	/board/{no}			(delete)		D

* PUT		/board/{no}
* title=...&contents=.....		(update)		U

