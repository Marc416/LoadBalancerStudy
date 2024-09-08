# LoadBalancerStudy  
L4, L7 로드밸런싱 스터디를 위하여 Nginx를 로드밸런스역할로 두고 제어하면서 부하를 관측해 봅니다.  
[스터디내용](https://devkiwogi.notion.site/L4-L7-88e1c9f3356f4b7f928ef364eb1b0466)

nginx의 다양한 옵션을 이용해서 실습환경을 만들어 봅니다.

# 사용법
### 서버 jar생성
1. `cd /SimpleServer`
2. `./gradlew build`

### 도커 컴포즈 실행
1. `docker-compose up --build`
- 실험종료후 `docker-compose down`

### 모니터링
1. http://localhost:3000 에 접속해 그라파나를 엽니다.
2. 미리 세팅해둔 통합모니터링 보드를 관측합니다.

부하테스트를 하기위해 Jmeter 를 사용합니다.
https://jmeter.apache.org/download_jmeter.cgi
Jmeter를 다운받고 실행한뒤 프로젝트내의 /jmeter/View Results Tree.jmx 파일을 오픈합니다. 
이안에서 Thread Group으로 실험환경을 조정합니다.
