# SPRING-REST-API

## Test
```bash
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   116    0   116    0     0  11583      0 --:--:-- --:--:-- --:--:-- 12888
{
  "koreatime": "2025-10-01T14:11:23.997125035+09:00[Asia/Seoul]",
  "timesptamp": 1759295483997,
  "message": "Hello, World!"
}
```

## Run
```bash
$ java -jar build/lib/spring-rest-api-<VERSION>.jar
```

## Build
```bash
$ ./gralew clean bootJar
```

## Remote Run
```bash
# scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

#scp -i <KEY.pem> ubuntu@<SERVER_IP> "cd /home/ubuntu/app/spring-rest-api;pwd;./start.sh:"
```

## Remote Stop
```bash
# scp -i <KEY.pem> stop.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

#scp -i <KEY.pem> ubuntu@<SERVER_IP> "cd /home/ubuntu/app/spring-rest-api;pwd;./stop.sh:"
>>>>>>> main
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17

