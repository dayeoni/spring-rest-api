# SPRING-REST-API

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

