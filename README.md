# Автоматизация тестирования <a href="https://mail.ru" target="_blank"><img src="readme/images/mail.svg" width="20" height="20"> mail.ru</a>

## :scroll: Содержание
- [Технологии и инструменты](#pushpin-технологии-и-инструменты)
- [Запуск тестов](#pushpin-запуск-тестов)
- [Описание параметров для сборки](#pushpin-описание-параметров-для-сборки)
- [Отчёт Allure](#pushpin-отчёт-allure)
- [Allure TO](#pushpin-allure-to)
- [Задача в JIRA](#pushpin-задача-в-jira)
- [Отчёт Telegram](#pushpin-отчёт-telegram)

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
<code>clean test -Dbrowser=chrome -DbrowserVersion=100.0 -DbrowserSize=800x600 -Dremote=selenoid.autotests.cloud</code>

## :pushpin: Описание параметров для сборки
- <code>BROWSER</code> браузер, по умолчанию chrome
- <code>BROWSER_VERSION</code> версия браузера, по умолчанию 100.0
- <code>BROWSER_SIZE</code> размер окна браузера, по умолчанию 1920x1080
- <code>REMOTE</code> адрес удаленного сервера

## :pushpin: Отчёт Allure
<img src="readme/screenshots/allure_overview.png" alt="Allure_overview"/>
<img src="readme/screenshots/allure_suites.png" alt="Allure_suites"/>
<img src="readme/screenshots/allure_graphs.png" alt="Allure_graphs"/>

## :pushpin: Allure TO
### Автоматические тест-кейсы
<img src="readme/screenshots/allure_to_testcases.png" alt="Allure_to_testcases"/>
### Создание ручного тест-кейса
<img src="readme/screenshots/allure_to_manual.png" alt="Allure_to_manual"/>

## :pushpin: Задача в JIRA
<img src="readme/screenshots/jira.png" alt="jira"/>

## :pushpin: Отчёт Telegram
<img src="readme/screenshots/telegram.png" alt="telegram"/>

[Вернуться к содержанию](#scroll-содержание)

