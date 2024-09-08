# LoadBalancerStudy  
L4, L7 로드밸런싱 스터디를 위하여 Nginx를 로드밸런스역할로 두고 제어하면서 부하를 관측해 봅니다.  
[스터디내용](https://devkiwogi.notion.site/L4-L7-88e1c9f3356f4b7f928ef364eb1b0466)

SpringBoot로 만든 SimpleServer를 단일 서버로 두고 Nginx에서 backend1, backend2로 네이밍하고 부하제어를 했습니다.  
부하에대한 데이터는 prometheus에 적재하고 grafana에서 모니터링을 할 수 있게 하였습니다.  
Nginx 전체 request Count, backend1, backend2 에 대한 모니터링 패널을 추가하여 비교할 수 있게 미리 만들었습니다.  

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
