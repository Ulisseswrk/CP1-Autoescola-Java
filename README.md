# 🚗 Sistema de Gestão de Autoescola (CP1 - Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/POO-Conceitos_Básicos-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

> **Checkpoint 1 (CP1) - Domain Driven Design**
> **Professora:** Damiana Costa  

---

## 📌 Sobre o Projeto

Este projeto é um sistema em **Java** desenvolvido para o Checkpoint 1 da disciplina de Domain Driven Design. O objetivo central é aplicar os conceitos básicos de **Programação Orientada a Objetos (POO)**, incluindo a modelagem de classes, atributos, métodos, instanciação de objetos e agregação, utilizando exclusivamente Tipos Primitivos.

O sistema simula o gerenciamento de uma Autoescola, permitindo o cadastro de alunos, instrutores e veículos, além da gestão de aulas teóricas e práticas, culminando na realização de um exame final para aprovação.

---

## ⚙️ Funcionalidades Implementadas

- **Gestão de Alunos:** Criação de perfil com nome, idade e tipo de veículo pretendido.
- **Agendamento e Cancelamento:** Métodos de controle contábil para aulas teóricas e práticas.
- **Validação de Exame:** Regra de negócio que exige um mínimo de 5 aulas (teóricas e práticas) para a liberação do teste.
- **Exame Aleatório:** Simulação de aprovação/reprovação utilizando a classe `Math.random()`.
- **Agregação Estrutural:** A classe `AutoEscola` funciona como um "Todo", agregando as instâncias de `Aluno`, `Instrutor` e `Veiculo`.
- **Feedback no Console:** Interface de texto detalhada para acompanhamento do status do sistema e relatório final.

---

## 📂 Estrutura de Classes (Landmarks)

A arquitetura do projeto é dividida nos seguintes arquivos `.java`:

1. 👤 **`Aluno.java`**: Coração lógico do agendamento, contador de aulas e execução do exame.
2. 👨‍🏫 **`Instrutor.java`**: Classe de cadastro contendo nome, idade, experiência e categoria.
3. 🏍️ **`Veiculo.java`**: Classe de cadastro para a frota (placa, modelo, ano e tipo).
4. 🏢 **`AutoEscola.java`**: Classe de agregação que une todas as partes e exibe o resumo operacional.
5. 🚀 **`Main.java`**: Ponto de entrada do sistema onde os objetos são instanciados, interligados e as simulações são executadas.

---

## 🗺️ Diagrama de Classes (UML)

Abaixo está a representação visual da modelagem do sistema, destacando os relacionamentos de agregação.

<img width="641" height="310" alt="diagrama png" src="https://github.com/user-attachments/assets/7395ecde-57ef-4072-8b03-52f5b6334f15" />

---

## 💻 Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/Ulisseswrk/CP1-Autoescola-Java.git

---

## 👥 Integrantes do Grupo

| Nome Completo | RM |
| :--- | :--- |
| **Ulisses Ribeiro** | `RM562230` |
| Luigi Ferrarini Borghi | `RM563096` |
| Arthur Ferreira | `RM564958` |
| Levi de Jesus | `RM563279` |
