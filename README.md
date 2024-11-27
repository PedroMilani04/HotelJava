# Gerenciamento de Hotel

## Descrição do Projeto

Este projeto feito em **Java** é um sistema de gerenciamento de hotel, que inclui funcionalidades como cadastro de clientes, reservas, pagamento de reservas, gerenciamento de serviços adicionais, check-in e check-out. Ele foi desenvolvido utilizando uma abordagem orientada a objetos, aproveitando conceitos como herança e encapsulamento para facilitar a extensão e manutenção do sistema.

---

## Estrutura do Projeto

Classes principais:

### **1. Quarto**
Classe base responsável por representar os quartos do hotel.

**Atributos principais:**
- `numeroDoQuarto` (int): Número identificador do quarto.
- `TIPO` (enum): Tipo do quarto (ex: Standard, Luxo).
- `preco` (double): Preço da diária do quarto.

---

### **2. Reserva**
Classe para gerenciar as reservas feitas pelos clientes.

**Atributos principais:**
- `quarto` (Quarto): Quarto reservado.
- `cliente` (Cliente): Cliente que fez a reserva.
- `dataEntrada` (String): Data de início da reserva.
- `valorTotal` (double): Valor total da reserva.

---

### **3. Cliente**
Classe base para representar os clientes do hotel.

**Atributos principais:**
- `nome` (String): Nome completo do cliente.
- `cpf` (String): CPF do cliente.
- `idade` (int): Idade do cliente.
- `telefone` (int): Telefone do cliente.

---

### **4. PagamentoReserva**
Classe para gerenciar pagamentos de reservas.

**Atributos principais:**
- `reserva` (Reserva): Reserva associada ao pagamento.
- `valor` (double): Valor pago pelo cliente.

**Métodos principais:**
- Realizar pagamento.
- Consultar status de pagamento.

---

### **5. ServicoAdicional**
Classe para gerenciar serviços adicionais oferecidos pelo hotel.

**Atributos principais:**
- `nome` (String): Descrição do serviço (ex: Spa, Restaurante).
- `valor` (double): Preço do serviço.

**Métodos principais:**
- Listar os dados de um serviço disponível.

---

### **6. FuncionarioHotel**
Classe que herda de `Usuario` e adiciona funcionalidades específicas para funcionários do hotel.

**Atributos principais:**
- `cargo` (String): Cargo do funcionário (ex: Recepcionista, Gerente).
- `salario` (double): Salário mensal do funcionário.

---

### **7. CheckIn**
Classe para gerenciar o processo de check-in dos clientes.

**Atributos principais:**
- `quartos` (Quarto): Quartos relacionados ao check-in.

---

### **8. CheckOut**
Classe para gerenciar o processo de check-out dos clientes.

**Atributos principais:**
- `pagamentos` (PagamentoReserva): Pagamentos de todos os check-outs.
- `servicos` (ServicoAdicional): Data do check-out.

**Métodos principais:**
- Realizar check-out.

---

## Executando o Projeto

1. Certifique-se de ter o Java Development Kit (JDK) instalado na sua máquina.
2. Clone ou faça download do projeto para sua máquina local.
3. Navegue até o diretório do projeto.
4. Compile os arquivos `.java` usando o comando: javac Main.java
5. Execute o programa principal com o comando: java Main.java

---

## Dependências
Nenhuma dependência externa é necessária. O projeto utiliza apenas bibliotecas padrão do Java.

