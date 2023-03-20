# Автоматизация тестирования <a href="https://mail.ru" target="_blank"><img src="readme/images/mail.svg" width="20" height="20"> mail.ru</a>

## :scroll: Содержание
- [Технологии и инструменты](#pushpin-технологии-и-инструменты)
- [Запуск тестов](#pushpin-запуск-тестов)
- [Описание параметров для сборки](#pushpin-описание-параметров-для-сборки)
- [Задача в Jenkins](#pushpin-задача-в-jenkins)
- [Отчёт Allure](#pushpin-отчёт-allure)
- [Allure TO](#pushpin-allure-to)
- [Задача в JIRA](#pushpin-задача-в-jira)
- [Отчёт Telegram](#pushpin-отчёт-telegram)
- [Видео прохождения тест-кейса](#pushpin-видео-прохождения-тест-кейса)

## :pushpin: Технологии и инструменты
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="readme/images/IntelliJ_IDEA_Icon.svg" width="50" height="50" title="IntelliJ Idea" alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="readme/images/java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://junit.org/junit5/"><img src="readme/images/JUnit5.svg" width="50" height="50"  alt="JUnit5"/></a>
<a href="https://gradle.org/"><img src="readme/images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="readme/images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="readme/images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/"><img src="readme/images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="readme/images/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="readme/images/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="readme/images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<img src="readme/images/Telegram.svg" width="50" height="50"  alt="Telegram"/>
</p>

## :pushpin: Запуск тестов
### Локально
<code>gradle clean test -Dbrowser=chrome -DbrowserVersion=100.0 -DbrowserSize=800x600</code>

### Удалённо
<code>clean test -Dbrowser=chrome -DbrowserVersion=100.0 -DbrowserSize=800x600 -DselenoidUrl=selenoid.autotests.cloud</code>

## :pushpin: Описание параметров для сборки
- <code>BROWSER</code> браузер, по умолчанию chrome
- <code>BROWSER_VERSION</code> версия браузера, по умолчанию 100.0
- <code>BROWSER_SIZE</code> размер окна браузера, по умолчанию 1920x1080
- <code>SELENOID_URL</code> адрес удаленного сервера с selenoid

## :pushpin: Задача в Jenkins

<a href="https://jenkins.autotests.cloud/job/C17-dmikhaylov_ru-mailru14/"><img src="readme/screenshots/jenkins.png" alt="Задача в jenkins"></a>

## :pushpin: Отчёт Allure
<img src="readme/screenshots/allure_overview.png" alt="Allure_overview"/>
<img src="readme/screenshots/allure_suites.png" alt="Allure_suites"/>
<img src="readme/screenshots/allure_graphs.png" alt="Allure_graphs"/>

## :pushpin: Allure TO
### Автоматические тест-кейсы
<a href="https://allure.autotests.cloud/project/2049/test-cases?treeId=3950"><img src="readme/screenshots/allure_to_testcases.png" alt="Allure_to_testcases"/></a>

### Создание ручного тест-кейса
<img src="readme/screenshots/allure_to_manual.png" alt="Allure_to_manual"/>

## :pushpin: Задача в JIRA
<a href="https://jira.autotests.cloud/browse/HOMEWORK-606"><img src="readme/screenshots/jira.png" alt="jira"/></a>

## :pushpin: Отчёт Telegram
<img src="readme/screenshots/telegram.png" alt="telegram"/>

## :pushpin: Видео прохождения тест-кейса
<img src="readme/video/jenkins.gif" alt="gif"/>

[Вернуться к содержанию](#scroll-содержание)

