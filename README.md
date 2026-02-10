#  ChrOnos
![Status](https://img.shields.io/badge/Status-Em%20Andamento-orange)
![Java](https://img.shields.io/badge/Java-17-red?logo=openjdk)
![Spring](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS](https://img.shields.io/badge/CSS-3-blue?logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=flat&logo=mysql&logoColor=white)




Este projeto tem como objetivo o desenvolvimento do Chr0nos, uma aplicação voltada para registro e controle de ponto (entrada, saída e intervalos), desenvolvida em Java, com foco em organização de jornada, persistência de dados e boas práticas de engenharia de software. O sistema foi pensado como um projeto de aprendizado contínuo, simulando um cenário real de aplicação corporativa.

---

## 📌 Funcionalidades

### Registro de Ponto
- Registro de entrada e saída do usuário.
-Controle de intervalos (pausas/almoço).
-Cálculo automático de tempo trabalhado diário.
-Prevenção de registros inválidos (ex: dupla entrada ou saída sem entrada).

### Gerenciamento de Registros
- Armazenamento dos registros de ponto.
- Consulta de histórico por data.
- Organização clara dos dados para futura geração de relatórios.

### Regras de Negócio
- Validação da sequência correta dos eventos de ponto.
- Tratamento de exceções para estados inválidos.
- Separação clara entre camada de domínio, serviços e interface.
---

## 🛠️ Tecnologias utilizadas
### Backend
- **Java 17+**
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de dados relacional (ex: MySQL / PostgreSQL)
- DTO Pattern
- Tratamento de exceções personalizadas
  
### Frontend
- HTML5
- CSS3
- JavaScript
---

## 🚀 Como executar

1. Clone o repositório:
   ```bash
    git clone https://github.com/seu-usuario/chronos.git

   ````
---
2. Configure o banco de dados no application.properties ou application.yml.
---
3. Execute a aplicação Spring Boot:
    ```bash
   ./mvnw spring-boot:run
   ````
---
   ## Estrutura do projeto
````
 src/main/java/
└── com/chronos/
├── controller/
│ └── RegistroPontoController.java
├── service/
│ └── RegistroPontoService.java
├── dto/
│ └── RegistroPontoDTO.java
├── model/
│ └── RegistroPonto.java
├── repository/
│ └── RegistroPontoRepository.java
├── exception/
│ └── RegistroInvalidoException.java
└── ChronosApplication.java


src/main/resources/
├── static/
│ ├── css/
│ ├── js/
│ └── index.html
└── application.properties
````
---

## 📖 Licença
Este projeto é de caráter educacional e pode ser utilizado livremente para fins de estudo, aprendizado e demonstração.

## 👨‍💻 Autor
Desenvolvido por Fabrício Pontes como projeto de aprendizado em Spring Boot, desenvolvimento web e arquitetura backend, com foco em boas práticas, MVC, persistência de dados e organização de código profissional.
