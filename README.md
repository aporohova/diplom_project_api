# Проект автоматизации API тестирования для сайта [Allure.Autotests](https://allure.autotests.cloud/)
![site_logo.png](images/screenshots/allure_main2.png)![site_logo.png](images/screenshots/allure_main.png)

## **Содержание:**

____
* Технологии и инструменты
* Примеры автоматизированных тест-кейсов
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Интеграция с Allure TestOps
* Интеграция с JIRA
* Уведомления в Telegram при помощи бота
____

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://rest-assured.io/"><img src="images/logo/RestAssured.svg" width="50" height="50"  alt="RestAssured" title="RestAssured"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/IntelliJ_IDEA.svg" width="40" height="40"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java_logo.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/github.svg" width="38" height="40"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="40" height="45"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/gradle.svg" width="40" height="50"  alt="Gradle"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/allure2.svg" width="55" height="55"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/jira.svg" width="100" height="50"  alt="Jira"/></a>  
</p>

___
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
___
* ✓ *Открытие созданного проекта*
* ✓ *Добавление описания к проекту*
* ✓ *Создание и удаление dashboard в проекте*
* ✓ *Создание тест-кейса*
* ✓ *Добавление комментария к тесту и его удаление*

___

## <img alt="Jenkins" height="25" src="images/logo/jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/diploma_project_api/)</a>

___
<p align="center">
<a href="https://jenkins.autotests.cloud/job/diploma_project_web/"><img src="images/screenshots/dashboard_jenkins.png" alt="Jenkins" width="950"/></a>

***Для локального запуска:***
```bash  
✓  Создать файл app.properties и разместить по адресу src/test/resources/config/app.properties
✓  Файл должен содержать следующие данные: 
-username=username для allure.autotests.cloud
-password=пароль юзера
-baseUrl=https://allure.autotests.cloud
```
___
__
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/diploma_project_api/7/allure/)</a>

___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/overview_allure.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/suites_allure.png" width="850">  
</p>

### *Графики*


  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/graphs_allure.png" width="850">  
<img title="Allure Graphics" src="images/screenshots/graphs_allure2.png" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/allure2.svg" width="35"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3512/dashboards">Allure TestOps</a>
___

### *Allure TestOps Dashboard*

<p align="center">
<img title="Allure TestOps Dashboard" src="images/screenshots/dashboard_testops.png" width="850">  
</p> 

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/manual_testops.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img alt="Allure TestOps Tests" src="images/screenshots/auto_testops.png" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/jira.svg" width="45"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-791">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screenshots/jira_api.png" width="">  
</p>

____

## <img alt="Allure" height="25" src="images/logo/telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/telegram_report.png" width="550">  
</p>

____