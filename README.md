# IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무
> '2024. 01. 11 ~ 2024. 02. 08'

[수료증.pdf](https://github.com/user-attachments/files/16476971/default.pdf)
![image](https://github.com/user-attachments/assets/5261c768-d765-41c7-87f7-582a169fa8a8)
<br><br>
## 배운 점 & 아쉬운 점 
- **[API 개념 이해와 문서 작성]**
  - API 문서를 작성할 때 필요한 주요 개념들(요청 URL, 요청 파라미터, 응답 바디 등)에 대한 설명을 요청하고, 이 과정에서 API가 무엇인지, 이를 문서화하는 과정에서 어떤 것들이 필요한지 이해했다.
  - API 문서 작성이 단순한 작업처럼 보일 수 있지만, 실제로는 매우 중요한 작업이라는 것을 느꼈다. 사용자가 API를 정확히 이해하고 사용할 수 있도록 명확하게 설명하는 것이 중요함을 깨달았다.
- **[Spring Boot 프로젝트 설정 및 테스트]**
  - Spring Boot 프로젝트를 설정하고, 이를 통해 간단한 테스트 페이지를 만들면서 Spring Boot의 기본 설정, MyBatis와 MariaDB의 연동, 그리고 간단한 컨트롤러 작성 방법을 배웠다.
  - Spring Boot는 초기 설정만 잘 해두면 매우 빠르고 효율적으로 웹 애플리케이션을 개발할 수 있다는 점을 느꼈다. MyBatis와 MariaDB를 연동하는 과정에서 데이터베이스와의 연동이 얼마나 중요한지 깨달았다.
- **[MyBatis와 Spring Boot를 활용한 API 개발]**
  - MyBatis를 이용해 데이터베이스와의 연동을 설정하고, 특정 연도의 로그인 수를 조회하는 API를 개발했다. 이 과정에서 SQL 쿼리를 MyBatis 매퍼 파일에서 정의하고, 이를 서비스와 컨트롤러에서 사용하는 방법을 익혔다.
  - API를 개발하면서 SQL 쿼리를 작성하고, 이를 통해 원하는 데이터를 정확하게 가져오는 것이 중요하다는 것을 깨달았다. 데이터베이스와의 연동을 통해 서버와 클라이언트 간의 데이터 흐름을 이해하게 되었다.
- **[API 가이드 문서 작성]**
  - 작성한 API들을 바탕으로 API 가이드 문서를 작성했다. 문서에는 각 API의 요청 URL, 요청 파라미터, 응답 바디 등의 정보가 포함되었다. API 가이드 문서 작성이 단순히 형식적인 작업이 아니라, 실제로 API를 사용하는 사람들이 이를 어떻게 사용할지에 대한 고려가 필요하다는 것을 깨달았다. 문서 작성의 중요성을 다시 한번 느꼈다.
- **[자바 코드로 비즈니스 로직 구현]**
    - 단순한 SQL 쿼리로 해결할 수 없는 부분을 자바 코드를 조합하여 해결하는 방법을 배웠다. 예를 들어, 휴일을 제외한 로그인 수를 계산하는 과제를 수행했다. 단순한 쿼리로는 해결할 수 없는 복잡한 비즈니스 로직을 구현하는 과정에서 자바의 유연성을 느꼈다. 데이터베이스와의 연동뿐만 아니라, 실제 비즈니스 로직을 자바 코드로 구현하는 것이 얼마나 중요한지 깨달았다.
- 처음 접하는 API 개발과 문서 작성이었기 때문에 부족한 부분이 많다고 느꼈다. 특히 API 가이드 문서를 작성하면서, 내가 만든 문서가 정말로 다른 사람들이 쉽게 이해할 수 있을지에 대해 고민하게 됐다. 비록 모든 것을 완벽하게 해내지는 못했지만, 이번 과정을 통해 Spring Boot, MyBatis, MariaDB와 같은 기술들에 대한 기초 지식을 습득하게 되어 다행이라고 생각한다. API 문서 작성 방법이나 관련된 내용을 더 깊이 공부해야겠다는 필요성을 느꼈다. 앞으로는 단순히 작동하는 코드뿐만 아니라, 다른 사람들이 쉽게 이해하고 사용할 수 있는 문서를 작성하는 방법을 지속적으로 학습하고 발전시켜 나가야겠다고 느꼈다.<br><br>
      
## 1차 : 개발환경 세팅
🔗 [1차 과제](https://github.com/k-r-1/api-backend-comento/tree/main/settingweb)
> _Java: Oracle JDK 8 (version "1.8.0_221")_ <br>
_Eclipse IDE: 2019-09 R (4.13.0)_ <br>
_Tomcat: 9.0.85_ <br>
_MariaDB: 10.2.14_ <br>
_MySQL Workbench: 8.0.34_ <br>

- JDK 1.8, Eclipse, Spring 다운로드 및 설치
- 톰캣 설정 및 Hello World 출력
- mariaDB, mySql WorkBench 설치 및 샘플 DB 구축<br></br>
![1-5 mariadb, mySql Workbench 설치 및 샘플 DB 구축](https://github.com/k-r-1/api-backend-comento/assets/83098949/403cd295-5eae-4b18-9890-082510e4fc42)
- 스프링, Mariadb, MyBatis 연동, 데이터 조회<br></br>
![1-6  스프링, Mariadb, MyBatis 연동, 데이터 조회](https://github.com/k-r-1/api-backend-comento/assets/83098949/80d9b3db-b16a-41a0-8c56-0f0cd87f0a70)

## 2차 : API 가이드 문서(초안) 작성하기
🔗 [2차 과제](https://github.com/k-r-1/api-backend-comento/blob/main/%5B2%EC%B0%A8%5D%20%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%20%EA%B0%80%EC%9D%B4%EB%93%9C%20%EB%AC%B8%EC%84%9C%20%EC%9E%91%EC%84%B1.docx)
<br>
### REST API란?
- 웹의 장점을 최대한 활용하는 API
- Representational State Transfer -> 자원을 이름으로 구분해 자원의 상태를 주고받는 API 방식
- 명확하고 이해하기 쉬운 API
- REST API는 URL의 설계 방식을 말함
- 특징 : 서버/클라이언트 구조, 무상태, 캐시 처리 가능, 계층화, 인터페이스 일관성
- _장점_
  - URL만 보고도 무슨 행동을 하는 API인지 명확하게 알 수 있음
  - 상태가 없다는 특징이 있어서 클라이언트와 서버의 역할이 명확하게 분리됨
  - HTTP 표준을 사용하는 모든 플랫폼에서 사용 가능
- _단점_
  - HTTP 메서드, 즉, GET, POST와 같은 방식의 개수에 제한이 있고, 설계를 하기 위해서 공식적으로 제공되는 표준 규악이 없음
- REST API는 주소와 메서드만 보고 요청의 내용을 파악할 수 있다는 강력한 장점이 있어 많은 개발자가 사용 <br>

### HTTP 통신에 관하여
- 웹 브라우저에서는 서버에 있는 텍스트나 이미지 등 여러 가지 자료를 가져올 때 HTTP라는 프로토콜(통신 규약)을 통해 자료를 주고 받는데, 이것을 'HTTP 통신'이라고 함
- HTTP : 클라이언트의 웹 브라우저가 서버에 웹 서비스를 요청하면 서버가 적절한 응답을 하여 클라이언트의 사용자에게 웹 페이지를 제공하는 서비스
- HTTP는 서버와 클라이언트 간에 하이퍼텍스트 문서를 송수신하는 프로토콜
- 클라이언트와 서버 간에 자료를 주고받으려면 미리 약속된 규칙이 필요한데, 이것을 '프로토콜(protocol)이라고 함
- 웹에서는 'HTTP(Hypertext Transfer Protocol)'라는 프로토콜을 사용함
- 클라이언트에서 서버로 자료 요청하는 것은 'HTTP 요청(HTTP request)', 서버에서 응답해서 클라이언트로 자료를 보내는 것은 'HTTP 응답(HTTP response)이라고 함
- 예를 들어 웹 브라우저 창에서 구글 검색 사이트를 찾아가려면 '_https://www.google.com_'을 입력해야 하는데, 이렇게 사이트 주소의 맨 앞에 붙는 http 또는 https가 현재 문서의 프로토콜을 알려 주는 것
  - 여기서에서 HTTPS 프로토콜은 기존의 HTTP 프로토콜보다 보안이 더욱 강화된 프로토콜임 <br>

### 브라우저에 URL을 입력 후 요청하여 서버에서 응답하는 과정
1. 클라이언트는 웹 브라우저에 URL 주소를 입력하고, TCP 포트 번호 80을 이용하여 접속하려는 서버에 연결을 시도한다.
2. 그러면 클라이언트는 TCP 요청 소켓을 이용하여 URL 주소를 포함한 요청 메시지를 서버에 전송한다.
3. 서버는 클라이언트의 요청 메시지에 응답하여 소켓을 통해 메시지를 전송하고 TCP 연결 설정을 해제한다.
- 클라이언트가 데이터를 요청할 때는 GET이라는 요청 정보, 파일 이름, 버전 등을 서버에 전송한다.
- 서버는 요청을 정상적으로 처리했다는 OK 정보를 응답으로 반환한다.
<br>

> _출처:_ <br>
_신선영, 『 스프링 부트 3 백엔드 개발자 되기: 자바 편 』, 골든래빗(2023), 128-129._ <br>
_고경희, 『 Do it! 모던 자바스크립트 프로그래밍의 정석 』, 이지스퍼블리싱(2022), 431._ <br>
_진혜진, 『 IT CookBook, 네트워크 개론(3판) 』, 한빛아카데미(2019), 336-337._ <br><br>

## 3차 : 간단한 Restful API 구현
- 간단한 RestController 구현 20년도 접속자 리스트 출력
- 샘플 데이터를 DB table로 작성하고 table에 insert <br><br>
![3-3  20년도 로그인수 API](https://github.com/k-r-1/api-backend-comento/assets/83098949/49d76a06-44ee-436f-8adf-b967a1ca206f)

## 4차 : SW 활용 현황 API 구현 및 API 가이드 문서 보완
🔗 [4차 과제](https://github.com/k-r-1/api-backend-comento/tree/main/settingweb_boot)
🔗 [API 가이드 문서](https://github.com/k-r-1/api-backend-comento/blob/main/%5B4%EC%B0%A8%5D%20API%20%EA%B0%80%EC%9D%B4%EB%93%9C%20%EB%AC%B8%EC%84%9C.docx)
<br><br>
- 3차 과제에서 작성한 API와 SQL(5가지)를 중심으로 API를 개발 <br>
  - 월별 접속자 수 <br>
    ![24년 01월 월별 로그인수](https://github.com/k-r-1/api-backend-comento/assets/83098949/92756009-0625-4ef1-9f02-5a495bb0aad7)
  - 일자별 접속자 수 <br>
    ![일별로그인수](https://github.com/k-r-1/api-backend-comento/assets/83098949/54fd840a-89d8-428a-9d7c-bd9ceafeb947)
  - 평균 하루 로그인 수 <br>
    ![평균 하루 로그인 수](https://github.com/k-r-1/api-backend-comento/assets/83098949/84493d74-b486-433c-aca4-e21c160cbcb2)
  - 휴일을 제외한 로그인 수 <br>
    ![휴일을 제외한 24년 01월 월별 로그인수](https://github.com/k-r-1/api-backend-comento/assets/83098949/802fc304-8061-4448-b137-75e3d610abdd)
  - 부서별 월별 로그인 수 <br>
    ![부서별월별로그인수](https://github.com/k-r-1/api-backend-comento/assets/83098949/056a85a3-2348-4f9b-9014-a35bfe5518df)   
- 완성된 API를 가지고 2차 과제로 진행했던 API 가이드 문서를 보완 <br><br>

requestinfo <br><br>
![requestinfo 데이터](https://github.com/k-r-1/api-backend-comento/assets/83098949/a68f93b8-38b0-44dc-b377-80155766445f)
<br>
user <br><br>
![user 데이터](https://github.com/k-r-1/api-backend-comento/assets/83098949/3bf7de01-c226-4264-8ad2-31ab45c76fd4)
<br>
holidays <br><br>
![holidays 데이터](https://github.com/k-r-1/api-backend-comento/assets/83098949/17430d4b-9ad9-4fec-a6b7-2ac6d8519341)


