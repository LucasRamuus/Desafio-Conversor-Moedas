# 💱 Conversor de Moedas

Bem-vindo ao **Conversor de Moedas**!  
Este projeto foi desenvolvido como parte do **Challenge de Java da Alura + Oracle ONE**, com o objetivo de praticar e aplicar os conhecimentos adquiridos nos cursos:

- **Java: criando a sua primeira aplicação**
- **Java: aplicando a Orientação a Objetos**
- **Java: trabalhando com listas e coleções de dados**
- **Java: consumindo API, gravando arquivos e lidando com erros**

---

## 🧠 Objetivo do Projeto

O desafio propõe construir um **Conversor de Moedas** que:

- Ofereça **interação via console** (terminal);
- Permita **converter valores entre diferentes moedas**;
- Utilize uma **API de câmbio em tempo real**, garantindo taxas atualizadas;
- Aplique conceitos de **Orientação a Objetos**, **coleções**, **tratamento de erros** e **consumo de APIs REST**.

---

## ⚙️ Tecnologias Utilizadas

- **Java 17+**
- **Maven** (para gerenciamento de dependências)
- **Gson** (para desserialização de JSON)
- **API ExchangeRate** (para obter as taxas de câmbio em tempo real)

---

## 🚀 Funcionalidades

- Menu interativo no console com 6 opções de conversão:
  1. USD → BRL  
  2. BRL → USD  
  3. EUR → USD  
  4. USD → EUR  
  5. GBP → BRL  
  6. BRL → ARS  

- Conversão de valores baseada em taxas dinâmicas da API;
- Tratamento de erros para conexões e entradas inválidas;
- Saída amigável e formatada no terminal.

---

## 🧩 Estrutura do Projeto

Conversor-de-Moedas/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/conversor/
│ │ ├── App.java # Classe principal (menu e interação)
│ │ ├── ApiService.java # Responsável por conectar à API
│ │ └── Conversor.java # Lógica de conversão de moedas
│ └── resources/
│
├── pom.xml # Arquivo de configuração do Maven
└── README.md # Este arquivo

---
### 1️⃣ Clonar o repositório

git clone https://github.com/seu-usuario/Conversor-de-Moedas.git
cd Conversor-de-Moedas

🔑 API Utilizada

A aplicação utiliza a API ExchangeRate API
 para obter as taxas de câmbio em tempo real.
Para utilizá-la, é necessário criar uma conta gratuita e gerar uma API Key, que deve ser inserida no código.

🧪 Exemplo de Execução
=== Conversor de Moedas ===
1. USD → BRL
2. BRL → USD
3. EUR → USD
4. USD → EUR
5. GBP → BRL
6. BRL → ARS
0. Sair

Escolha uma opção: 1
Digite o valor: 100
Resultado: 100.0 USD = 556.40 BRL

🎯 Aprendizados

Durante o desenvolvimento deste projeto, foram aplicados e reforçados conceitos de:

Consumo de APIs REST em Java;

Desserialização de JSON com Gson;

Estruturação de classes e métodos (POO);

Manipulação de dados e coleções;

Tratamento de exceções e erros;

Integração com Maven.

👨‍💻 Autor

Desenvolvido por Lucas Gabriel Ramos da Silva
📚 Aluno do programa Oracle Next Education + Alura
