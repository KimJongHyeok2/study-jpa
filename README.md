## JPA(Java Persistent API)
여러 ORM 전문가가 참여한 EJB 3.0 스펙 작업에서 기존 EJB ORM이던 Entity Bean을 JPA로 바꾸고 JavaSE, JavaEE를 위한 영속성(persistence) 관리와 ORM을 위한 표준 기술이다.<br><br>
ORM(Object Relational Mapping)이란 RDB 테이블을 객체 지향적으로 사용하기 위한 기술이다. RDB 테이블은 객체 지향적 특징(상속, 다형성, 레퍼런스, 오브젝트 등)이 없고 자바와 같은 언어로 접근하기 쉽지 않다. 때문에 ORM을 사용해 오브젝트와 RDB 사이에 존재하는 개념과 접근을 객체 지향적으로 다루기 위한 기술이다.<br><br>

<h3>장점</h3>
<ul>
  <li>객체 지향적으로 데이터를 관리할 수 있기 때문에 비즈니스 로직에 집중할 수 있으며, 객체지향 개발이 가능하다.</li>
  <li>JPA를 잘 이해하고 있다면, 테이블 생성 및 변경 등 관리가 쉽다.</li>
  <li>로직을 쿼리에 집중하기 보다는 객체 자체에 집중 할 수 있다.</li>
  <li>생산성이 높다.</li>
</ul>
<h3>단점</h3>
<ul>
  <li>어렵다, 장점을 더 극대화 하기 위해서 알아야 할게 많다.</li>
  <li>미숙하다면 데이터의 손실이 발생할 수 있다.</li>
  <li>성능상 문제가 있을 수 있다.</li>
</ul>

## JPA, Hibernate, Spring Data JPA의 차이점
**JPA**는 Java Persistence API의 약자로, 자바 어플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스이다. 여기서 중요하게 여겨야 할 부분은, JPA는 말 그대로 인터페이스라는 점이다. JPA는 특정 기능을 하는 라이브러리가 아니다. 마치 일반적인 백엔드 API가 클라이언트가 어떻게 서버를 사용해야 하는지를 정의한 것처럼, JPA 역시 자바 어플리케이션에서 관계형 데이터베이스를 어떻게 사용해야 하는지를 정의하는 한 방법일 뿐이다.<br><br>
**Hibernate**는 JPA라는 명세의 구현체이다. 즉, 위에서 언급한 javax.persistence.EntityManager와 같은 인터페이스를 직접 구현한 라이브러리이다. JPA와 Hibernate는 마치 자바의 interface와 해당 interface를 구현한 class와 같은 관계이다.<br><br>
**Spring Data JPA**는 Spring에서 제공하는 모듈 중 하나로, 개발자가 JPA를 더 쉽고 편하게 사용할 수 있도록 도와준다. 이는 JPA를 한 단계 추상화시킨 Repository라는 인터페이스를 제공함으로써 이루어진다. 사용자가 Repository 인터페이스에 정해진 규칙대로 메소드를 입력하면, Spring이 알아서 해당 메소드 이름에 적합한 쿼리를 날리는 구현체를 만들어서 Bean으로 등록해준다.

<img src="https://user-images.githubusercontent.com/47962660/66216504-8d691080-e700-11e9-9e31-d49062812484.png"/>

## 레퍼런스
<ul>
  <li>https://blog.woniper.net/255</li>
  <li>https://suhwan.dev/2019/02/24/jpa-vs-hibernate-vs-spring-data-jpa/</li>
  <li>https://velog.io/@junwoo4690/Spring-Boot-JPA-%EC%82%AC%EC%9A%A9%ED%95%B4%EB%B3%B4%EA%B8%B0-erjpw41nl7</li>
  <li>https://dotoridev.tistory.com/6</li>
</ul>
