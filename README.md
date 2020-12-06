Тренинг «Unit Testing & TDD Advanced»
=====================================
18 ак. ч, 24 астр. ч.

Цели тренинга
=============
После тренинга участники смогут:
--------------------------------
- [ ] Обеспечить переход к (A)TDD в команде
- [ ] Сохранять качества дизайна и архитектуры при использовании (A)TDD
- [ ] Развивать через (A)TDD data driven applications на Spring, использующие БД и очереди 
- [ ] Развивать через (A)TDD интеграционные приложения на Spring, использующие внешние SOAP/REST-сервисы 
- [ ] Оптимизировать выполнение тестов для Spring-приложений
- [ ] Повысить надежность тестов многопоточного кода
- [ ] Повысить надежность тестов date/time-зависимого кода

Ожидания от участников на входе
-------------------------------
- [ ] Понимание автотестирования и практики TDD в объеме тренинга [Unit Testing and TDD](https://github.com/eugene-krivosheyev/unit-testing-and-tdd)

Пререквизиты
============
### Hardware
- [ ] RAM ≥ 8Гб

### Software
- [ ] [git client](https://git-scm.com/download/win)
- [ ] [JDK8](https://adoptopenjdk.net/)
- [ ] [IDEA Ultimate](https://www.jetbrains.com/idea/download) (можно trial)
- [ ] [Gradle](https://gradle.org/install/)
- [ ] [Docker](https://docs.docker.com/desktop/)
- [ ] [JMeter](https://jmeter.apache.org/download_jmeter.cgi)  
- [x] [Chrome](https://www.google.com/intl/ru/chrome/)

### Доступы
- [ ] https://github.com:443 (с возможностью логина, pull и push)
- [ ] https://mvnrepository.com:443
- [ ] https://repo.maven.apache.org:443

Программа
=========
Зачем мы собрались? (0.5 часа всего / _из них_ 0 часов практики)
---------------------------------------------------------------
- [ ] Обзор тренинга
- [ ] О тренере
- [ ] Разбивка по парам и знакомство-представление друг друга
- [ ] Приоритезация целей тренинга и сбор проблем
- [ ] Склонирована кодовая база
```
git clone --depth 1 -b master https://github.com/eugene-krivosheyev/agile-practices-application
git clone --depth 1 -b <YYYY-MM-project> https://github.com/eugene-krivosheyev/unit-testing-and-tdd-advanced
```
- [ ] Soundcheck
```
cd agile-practices-application
mvn clean verify -DexcludedGroups='selenium'
gradle clean check bootJar jacocoTestReport pitest -i --scan --no-build-cache -DexcludedGroups='selenium'
```

Выравнивание понимания (A)TDD (1/1)
-----------------------------
- [ ] Given pairs
- [ ] When pairs align answers:
1. What is [TDD](https://github.com/eugene-krivosheyev/unit-testing-and-tdd#какую-ценность-дает-практика-tdd-050)?
1. What is [rhythm/mantra for TDD cycle](https://github.com/eugene-krivosheyev/unit-testing-and-tdd#в-каком-ритме-писать-по-tdd-1505)?
1. What are [Test-Driven Development Patterns](https://github.com/eugene-krivosheyev/unit-testing-and-tdd#базовые-шаблоны-tdd-151)?
1. What are Red Bar Patterns?
1. What are Testing Patterns?
1. What are Green Bar Patterns?
1. What are the most important patterns of TDD, as you think?
1. What is ATDD?
1. What is the architecture mapping between Acceptance and Unit tests? 
- [ ] Then group aligns answers

Что дают практики TDD и ATDD? (2/1)
-----------------------------
- [ ] Given pairs
- [ ] And Layered Decision Making Model
- [ ] And Process Metrics concept
- [ ] And Internal Quality Attributes concept
- [ ] And Trade-off concept
- [ ] When pairs align answers:
1. What are intentional values of TDD in terms of PM/QA vs trade-offs?
1. What are your real-life shown values of TDD in terms of PM/QA vs trade-offs?
1. What are intentional values of ATDD in terms of PM/QA vs trade-offs?
1. What are your real-life shown values of ATDD in terms of PM/QA vs trade-offs?
1. What roles do communicate around Acceptance/System tests?
1. What roles do communicate around Integration tests?
1. What roles do communicate around Unit tests?
- [ ] Then group aligns answers
- [ ] And training backlog updated with (A)TDD problems faced

(A)TDD through Spring Boot based DB-driven app (2/1.5)
-----------------------------------------
- [ ] Given pairs
- [ ] And legacy codebase
- [ ] And recap for [testing framework](https://junit.org/junit5/docs/current/user-guide/)
- [ ] And recap for [build tool](https://docs.gradle.org/6.7/userguide/userguide.html)
- [ ] And recap for test fixture reuse with Builders
- [ ] And recap for [test-doublers](https://site.mockito.org): dummy, stub, fake
- [ ] And recap for Spring test support
- [ ] And recap for Spring test context management and reuse
- [ ] And recap for [containerized test environment](https://www.testcontainers.org/quickstart/junit_5_quickstart/) 
- [ ] And new app requirements
- [ ] When pairs implement new features through orthodox ATDD and TDD
- [ ] Then public code and design review stands for internal Quality Attributes
- [ ] And branch coverage and mutation coverage increased
- [ ] And architecture issues faced at development solved

(A)TDD through Spring Boot based message-driven app (2/1.5)
----------------------------------------------
- [ ] Given pairs
- [ ] And legacy codebase
- [ ] And recap for test-doublers: mock, spy
- [ ] And recap for [test suites](https://junit.org/junit5/docs/current/user-guide/#writing-tests-tagging-and-filtering)
- [ ] And recap for [build tool test suites support](https://javabydeveloper.com/run-tag-specific-junit-5-tests-from-gradle-command/)
- [ ] And new app requirements
- [ ] When pairs implement new features through orthodox ATDD and TDD
- [ ] Then public code and design review stands for internal Quality Attributes
- [ ] And branch coverage and mutation coverage increased
- [ ] And Spring context usage optimized for test run performance
- [ ] And test suites used for faster feedback 
- [ ] And architecture issues faced at development solved

(A)TDD through Spring Boot based integration-driven app (2/1.5)
--------------------------------------------------
- [ ] Given pairs
- [ ] And legacy codebase
- [ ] And recap for [external service calls](https://www.twilio.com/blog/5-ways-to-make-http-requests-in-java) and [swagger code generation](https://www.baeldung.com/spring-boot-rest-client-swagger-codegen)
- [ ] And recap for external REST service test-doublers
- [ ] And new app requirements
- [ ] When pairs implement new features through orthodox ATDD and TDD
- [ ] Then public code and design review stands for internal Quality Attributes
- [ ] And branch coverage and mutation coverage increased
- [ ] And Spring context usage optimized for test run performance
- [ ] And test suites used for faster feedback 
- [ ] And architecture issues faced at development solved


(A)TDD through macro benchmark (3/1.5)
------------------------------
- [ ] Given pairs
- [ ] And legacy codebase
- [ ] And recap for benchmark scopes
- [ ] Add recap for parallel test run options: [standalone tool](https://jmeter.apache.org/usermanual/get-started.html), [build](https://discuss.gradle.org/t/relationship-between-forkevery-maxparallelfork-and-parallel/25126/2) [tool](https://stackoverflow.com/a/55558242), [test framework](https://junit.org/junit5/docs/snapshot/user-guide/#writing-tests-parallel-execution), test code
- [ ] Add recap for concurrency issues to detect
- [ ] Add recap for app monitoring and loging
- [ ] And new app requirements
- [ ] When pairs implement new features through orthodox ATDD and TDD
- [ ] Then public code and design review stands for internal Quality Attributes
- [ ] And branch coverage and mutation coverage increased
- [ ] And Spring context usage optimized for test run performance
- [ ] And test suites used for faster feedback 
- [ ] And concurrency and architecture issues faced at development solved

TDD through mirco benchmark (3/1.5)
--------------------------- 
- [ ] Given pairs
- [ ] And legacy codebase
- [ ] And recap for JMH
- [ ] And new app requirements
- [ ] When pairs verify correctness of new features' implementation through orthodox ATDD and TDD
- [ ] And concurrency issues faced at development solved

(A)TDD through date/time dependent app* (1/0.5)
---------------------------------------
- [ ] Given pairs
- [ ] And legacy codebase
- [ ] And recap for date/time API
- [ ] When pairs implement new features through orthodox ATDD and TDD
- [ ] Then public code and design review stands for internal Quality Attributes
- [ ] And branch coverage and mutation coverage increased
- [ ] And Spring context usage optimized for test run performance
- [ ] And test suites used for faster feedback 
- [ ] And concurrency and architecture issues faced at development solved

Как внедрить TDD в процесс разработки? (1/1)
--------------------------------------
- [ ] Given pairs
- [ ] When pairs align answers:
1. Most blocking factors for (A)TDD adoption
1. Solving steps for top-5 blockers
- [ ] Then group aligns answers

Финальная ретроспектива (0.5/0.5)
---------------------------------
- [ ] План конкретных ближайших действий на производстве
