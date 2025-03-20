# SauceDemo - Testes Automatizados com Selenium e Java

![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.9-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.15.0-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-blue)
![WebDriverManager](https://img.shields.io/badge/WebDriverManager-5.8.0-blue)

## Descrição

Projeto de **testes automatizados de interface gráfica (UI)** utilizando **Java + Selenium** para testar a funcionalidade de **login** da aplicação [SauceDemo](https://www.saucedemo.com/v1/index.html).

O objetivo do projeto é validar se o fluxo de autenticação do usuário está funcionando corretamente, testando diferentes cenários, como **login bem-sucedido**, **credenciais inválidas** e **campos obrigatórios não preenchidos**.

---

## Tecnologias Utilizadas

- **Java SDK 17+** - Linguagem de programação
- **Maven 3.9.9** - Gerenciamento de dependências
- **Selenium WebDriver 4.15.0** - Automação do navegador
- **JUnit 5.10.0** - Framework de testes
- **WebDriverManager 5.8.0** - Gerenciamento automático do ChromeDriver
- **ChromeDriver** - Driver para automação do Google Chrome

---

## **Pré-requisitos**
Antes de executar o projeto, certifique-se de ter os seguintes requisitos instalados:

- **Java SDK 17+** ou superior
- **Maven 3.9.9** ou superior
- **Google Chrome** atualizado
- **IDE** (IntelliJ)

## Estrutura do Projeto

```
saucedemo-selenium-java/
│── src/
│   ├── main/ 
│   ├── test/
│   │   ├── java/
│   │   │   ├── LoginTest.java
│── pom.xml (Configuração do Maven e dependências)
│── .gitignore (Arquivos ignorados pelo Git)
│── README.md (Documentação do projeto)
```


### **Como Instalar as Ferramentas**
#### **Instalar o Java JDK 17**
Baixe e instale o JDK 17 pelo site oficial: [Download Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

Após a instalação, verifique se o Java está corretamente configurado:
```sh
javac -version
```
## Instalar o Maven

Baixe e instale o Maven pelo site oficial: [Download Apache Maven](https://maven.apache.org/download.cgi)

Após a instalação, verifique se o Maven está configurado corretamente:

```sh
mvn -version
```

## Configuração do Ambiente

Para rodar o projeto, siga os passos abaixo:

### Clonar este repositório:

```sh
git clone https://github.com/seu-usuario/saucedemo-selenium-java.git
cd saucedemo-selenium-java
```
###  Instalar as dependências do Maven:

```sh
mvn clean install
```

### Executar os testes:
```sh
Executar os testes:
```

___

Este projeto foi desenvolvido por [Ueber](https://br.linkedin.com/in/uebersyemmer).



