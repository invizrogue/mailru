# Автоматизация тестирования <a href="https://mail.ru" target="_blank"><img src="readme/images/mail.svg" width="20" height="20"> mail.ru</a>

## :scroll: Содержание
- [Технологии и инструменты](#-pushpin--технологии-и-инструменты)
- [Запуск тестов](#-pushpin--запуск-тестов)
- [Конфигурация тестов](#-pushpin--конфигурация-тестов)

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
<code>gradle clean test -Denv=local</code>

### Удалённо
<code>clean test -Denv=remote</code>

## :pushpin: Конфигурация тестов
### local.properties
- <code>baseUrl</code> - тестируемый ресурс
- <code>browserName</code> - название браузера (chrome, firefox)
- <code>browserVersion</code> - версия браузера
- <code>browserSize</code> - размер окна браузера

### remote.properties
- <code>baseUrl</code> - тестируемый ресурс
- <code>browserName</code> - название браузера (chrome, firefox)
- <code>browserVersion</code> - версия браузера
- <code>browserSize</code> - размер окна браузера
- <code>remote</code> - адрес развёрнутого контейнера selenoid

[Вернуться к содержанию](#-scroll--содержание)

