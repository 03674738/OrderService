rem 1. Build JAR
call mvnw.cmd clean package

rem 2. DockerFile을 실행시킨다.
call docker build -t 03674738/order-service:1.0 .

rem 3. 도커 허브에 이미지 저장
call docker push 03674738/order-service:1.0

rem 4. ssh 접속 / pull
call ssh tiger@localhost "cd /home/tiger/order-service && docker compose pull && docker compose up -d"