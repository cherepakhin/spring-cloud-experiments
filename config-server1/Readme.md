##Пояснения

Проверка работы
```shell script
curl http://127.0.0.1:9999/application/default/master
``` 

В схеме localhost:9999/application/default

- 9999 - порт определен в application.yml
- application - название сервиса. В самом сервисе определяется в *spring.application.name*
- default - Active Spring Profile
- master - Git label/**branch(ВЕТКА!!!)** (если не указано, то используется master)
