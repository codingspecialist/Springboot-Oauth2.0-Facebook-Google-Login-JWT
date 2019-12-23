#### Springboot-Oauth2.0-Facebook-Google-Login-JWT

![blog](https://postfiles.pstatic.net/MjAxOTEyMjNfNTQg/MDAxNTc3MTA0ODI0NDc0.7uY2TtTvD8YB6Vx_4KxmKP4xOvYWdzBAu36XAxLymtUg.dHHk6Mkqwz7bvtviB7pdVTZ1cPZqpkDWKmoRl5Kanl0g.PNG.getinthere/Screenshot_79.png?type=w773)

![blog](https://postfiles.pstatic.net/MjAxOTEyMjNfMTQ2/MDAxNTc3MTA0ODI0NDcz.bjHb6lolyy0B4Zd8CI80_qBEpqhJpSld5whDkDMqi0Ig.RvcfbQpejCNOS9JMqMxzQMXMwzcxvTKXW4wyRywAvGsg.PNG.getinthere/Screenshot_80.png?type=w773)

![blog](https://postfiles.pstatic.net/MjAxOTEyMjNfMjkg/MDAxNTc3MTA0ODk5NTAz.dgsxPDjV5CtZCQ2A8TkPNEJ0WYPMWnRd4acN7wHgxNog.s9d-VjMpiE33U42bnxA1PW1LHMS7R5YV8JfEmVK0W_kg.PNG.getinthere/Screenshot_82.png?type=w773)

#### 1. application.yml
```yml
server:
  port: 8443
  ssl:
    enabled: true
    key-store: src/main/resources/bootsecurity.p12
    key-store-password: bootsecurity
    key-store-type: PKCS12
    key-alias: bootsecurity
  servlet:
    context-path: /
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/oauth2?serverTimezone=UTC&useSSL=false
    username: oauth2
    password: bitc5600
  jpa:
    open-in-view: false
    hibernate:
      ddl-auto: update
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
    #show-sql: true
    properties:
      hibernate.format_sql: true

  security:
    oauth2:
      client:
        registration:
          facebook:
            client-id: 
            client-secret: 
            scope:
            - email
            - public_profile

          google: 
            client-id: 
            client-secret: 
            scope: 
            - email
            - profile

app:
  auth:
    tokenSecret: 926D96C90030DD58429D2751AC1BDBBC
    tokenExpirationMsec: 864000000
          

          
```

#### 2. 의존성 추가 (templates mustache)
```xml
<dependency>
	<groupId>io.jsonwebtoken</groupId>
	<artifactId>jjwt</artifactId>
	<version>0.5.1</version>
</dependency>
```
