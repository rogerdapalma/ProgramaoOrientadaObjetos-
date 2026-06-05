# AlertaRio RS

**Universidade Franciscana**
**Disciplina:** Programação Orientada a Objetos
**Autor:** Roger da Palma
**E-mail:** [roger.palma@ufn.edu.br](mailto:roger.palma@ufn.edu.br)

---

## 1. Tema do Projeto

O tema escolhido para o trabalho final é o desenvolvimento de um sistema acadêmico chamado **AlertaRio RS**, voltado ao monitoramento climático e hidrológico em regiões de risco no Rio Grande do Sul.

O sistema tem como foco acompanhar a variação do nível dos rios e da quantidade de chuva nas cidades de:

* Porto Alegre
* Caxias do Sul
* Santa Maria

A proposta busca representar, por meio de programação orientada a objetos em Java, um sistema capaz de registrar medições, comparar valores sucessivos e classificar o risco de enchente.

---

## 2. Descrição do Sistema

O **AlertaRio RS** é um sistema desenvolvido em Java para simular o monitoramento de rios e chuva em cidades do Rio Grande do Sul.

O sistema utiliza sensores simulados para gerar valores de medição do nível do rio e da quantidade de chuva. A cada ciclo de execução, o programa registra novas medições, compara os valores atuais com os anteriores e informa se houve aumento, diminuição ou estabilidade.

Após registrar os dados, o sistema realiza uma análise de risco com base nos valores de rio e chuva. O risco pode ser classificado como:

* BAIXO
* MODERADO
* ALTO
* CRITICO

Com base nessa análise, o sistema gera alertas para indicar a situação da cidade monitorada.

Este projeto foi construído seguindo os principais conceitos da Programação Orientada a Objetos, como classes, objetos, encapsulamento, construtores, herança, polimorfismo, classes abstratas, interfaces e tratamento de exceções.

---

## 3. Arquitetura do Projeto

O projeto foi organizado em pacotes, separando as responsabilidades de cada parte do sistema.

```text
ProjetoFinal
├── app
│   └── Main.java
│
├── enums
│   ├── NivelRisco.java
│   └── TipoSensor.java
│
├── exception
│   └── MedicaoInvalidaException.java
│
├── interfaces
│   ├── GeradorAlerta.java
│   └── Monitoravel.java
│
├── model
│   ├── Alerta.java
│   ├── Cidade.java
│   ├── Medicao.java
│   ├── Sensor.java
│   ├── SensorChuva.java
│   └── SensorRio.java
│
├── repository
│   └── MedicaoRepository.java
│
└── service
    ├── AnaliseRiscoService.java
    └── MonitoramentoService.java
```

A arquitetura escolhida foi uma arquitetura em camadas, inspirada no padrão MVC, separando:

* `app`: execução principal do sistema.
* `model`: classes que representam as entidades do sistema.
* `service`: regras de negócio.
* `repository`: armazenamento em memória das medições.
* `interfaces`: contratos utilizados pelas classes.
* `exception`: exceções personalizadas.
* `enums`: valores fixos do sistema.

Essa organização facilita a manutenção, a leitura do código e a aplicação correta dos conceitos de POO.

---

## 4. Funcionamento Geral

O sistema inicia na classe `Main.java`.

Durante a execução, o programa:

1. Cria as cidades monitoradas.
2. Cria sensores de nível do rio e sensores de chuva.
3. Gera valores simulados para cada sensor.
4. Registra as medições no sistema.
5. Compara a medição atual com a medição anterior.
6. Analisa o risco de enchente.
7. Gera alertas conforme o nível de risco.
8. Exibe o histórico final das medições.

Os valores simulados representam:

* Nível do rio em metros.
* Quantidade de chuva em milímetros.

---

## 5. Mapeamento dos 7 Pré-Requisitos de POO

### 1. Classes, Objetos e Atributos

O requisito de classes, objetos e atributos foi aplicado no pacote `ProjetoFinal.model`.

As principais classes do sistema são:

* `Cidade`
* `Medicao`
* `Alerta`
* `Sensor`
* `SensorRio`
* `SensorChuva`

Exemplo:

A classe `Cidade` representa uma cidade monitorada pelo sistema e possui atributos como:

```java
private String nome;
private String estado;
private boolean regiaoDeRisco;
```

No arquivo `Main.java`, são criados objetos dessa classe:

```java
ProjetoFinal.model.Cidade portoAlegre =
        new ProjetoFinal.model.Cidade("Porto Alegre", "RS", true);
```

Também são criados objetos das classes `SensorRio` e `SensorChuva`, representando sensores diferentes dentro do sistema.

---

### 2. Construtores

O requisito de construtores foi aplicado em várias classes do projeto.

A classe `Cidade`, por exemplo, possui construtor padrão e construtores parametrizados:

```java
public Cidade() {
    this.nome = "Cidade não informada";
    this.estado = "RS";
    this.regiaoDeRisco = false;
}

public Cidade(String nome) {
    this.nome = nome;
    this.estado = "RS";
    this.regiaoDeRisco = true;
}

public Cidade(String nome, String estado, boolean regiaoDeRisco) {
    this.nome = nome;
    this.estado = estado;
    this.regiaoDeRisco = regiaoDeRisco;
}
```

Isso demonstra sobrecarga de construtores, pois a mesma classe pode ser inicializada de formas diferentes.

Outras classes que também utilizam construtores são:

* `Medicao`
* `Alerta`
* `Sensor`
* `SensorRio`
* `SensorChuva`
* `MonitoramentoService`
* `MedicaoRepository`

---

### 3. Encapsulamento e Modificadores de Acesso

O encapsulamento foi aplicado por meio do uso de atributos privados e métodos públicos de acesso.

Exemplo na classe `Cidade`:

```java
private String nome;
private String estado;
private boolean regiaoDeRisco;
```

Esses atributos não são acessados diretamente fora da classe. O acesso é feito por métodos getters e setters:

```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    if (nome != null && !nome.trim().isEmpty()) {
        this.nome = nome;
    }
}
```

Esse padrão também aparece em outras classes, como:

* `Medicao`
* `Alerta`
* `Sensor`
* `SensorRio`
* `SensorChuva`

O uso de `private`, `protected` e `public` protege o estado interno dos objetos e evita alterações indevidas.

---

### 4. Herança

A herança foi aplicada no pacote `ProjetoFinal.model`.

A classe abstrata `Sensor` serve como classe base para sensores específicos.

As classes `SensorRio` e `SensorChuva` herdam de `Sensor`:

```java
public class SensorRio extends Sensor
```

```java
public class SensorChuva extends Sensor
```

Essa relação representa corretamente o conceito "É UM":

* `SensorRio` é um `Sensor`.
* `SensorChuva` é um `Sensor`.

Com isso, o sistema reaproveita atributos e métodos comuns definidos na classe `Sensor`, como:

* `identificador`
* `cidade`
* `ultimaMedicao`
* `getIdentificador()`
* `getCidade()`
* `obterUltimaMedicao()`

---

### 5. Polimorfismo

O polimorfismo foi aplicado na classe `Main.java`.

O sistema cria uma lista do tipo `Sensor`, mas adiciona objetos de classes filhas:

```java
java.util.ArrayList<ProjetoFinal.model.Sensor> sensores =
        new java.util.ArrayList<ProjetoFinal.model.Sensor>();

sensores.add(new ProjetoFinal.model.SensorRio("RIO-POA-001", portoAlegre, 5.0));
sensores.add(new ProjetoFinal.model.SensorChuva("CHUVA-POA-001", portoAlegre, 80.0));
```

Mesmo que a lista seja do tipo `Sensor`, ela consegue armazenar objetos do tipo `SensorRio` e `SensorChuva`.

Depois, o sistema percorre todos os sensores de forma uniforme:

```java
for (ProjetoFinal.model.Sensor sensor : sensores) {
    double valorSimulado = gerarValorSimulado(sensor);
    monitoramentoService.registrarMedicao(sensor, valorSimulado);
}
```

Isso demonstra o polimorfismo de inclusão, pois objetos diferentes são tratados pelo tipo da superclasse.

Além disso, os métodos sobrescritos com `@Override` permitem que cada sensor tenha seu próprio comportamento.

---

### 6. Classes Abstratas e Interfaces

O requisito de classe abstrata foi aplicado na classe `Sensor`.

```java
public abstract class Sensor implements ProjetoFinal.interfaces.Monitoravel
```

A classe `Sensor` é abstrata porque representa um conceito genérico. Não faz sentido criar um sensor genérico diretamente, mas sim sensores específicos, como sensor de rio ou sensor de chuva.

Ela possui métodos abstratos:

```java
public abstract String obterDescricao();

public abstract ProjetoFinal.enums.TipoSensor obterTipoSensor();
```

Esses métodos são obrigatoriamente implementados pelas classes filhas `SensorRio` e `SensorChuva`.

O requisito de interfaces foi aplicado nas interfaces:

* `Monitoravel`
* `GeradorAlerta`

A interface `Monitoravel` define o contrato para objetos que registram medições:

```java
public interface Monitoravel {

    void registrarMedicao(double valor) throws ProjetoFinal.exception.MedicaoInvalidaException;

    double obterUltimaMedicao();
}
```

A interface `GeradorAlerta` define o contrato para classes que geram alertas:

```java
public interface GeradorAlerta {

    ProjetoFinal.model.Alerta gerarAlerta(
            ProjetoFinal.model.Cidade cidade,
            ProjetoFinal.enums.NivelRisco nivelRisco,
            String mensagem
    );
}
```

A classe `AnaliseRiscoService` implementa a interface `GeradorAlerta`:

```java
public class AnaliseRiscoService implements ProjetoFinal.interfaces.GeradorAlerta
```

---

### 7. Tratamento de Exceções

O tratamento de exceções foi aplicado com o uso de `try-catch-finally` na classe `Main.java`.

```java
try {
    // execução principal do sistema
} catch (ProjetoFinal.exception.MedicaoInvalidaException erro) {
    System.out.println("Erro de medição: " + erro.getMessage());
} catch (InterruptedException erro) {
    System.out.println("A simulação foi interrompida.");
} catch (Exception erro) {
    System.out.println("Erro inesperado no sistema: " + erro.getMessage());
} finally {
    System.out.println("\nSistema AlertaRio RS finalizado.");
}
```

Além disso, foi criada uma exceção customizada chamada `MedicaoInvalidaException`, localizada no pacote `ProjetoFinal.exception`.

```java
public class MedicaoInvalidaException extends Exception {

    public MedicaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```

Essa exceção é lançada quando o sistema tenta registrar uma medição inválida, como valor negativo de chuva ou nível do rio.

Exemplo na classe `SensorRio`:

```java
if (valor < 0) {
    throw new ProjetoFinal.exception.MedicaoInvalidaException(
            "O nível do rio não pode ser negativo."
    );
}
```

Exemplo na classe `SensorChuva`:

```java
if (valor < 0) {
    throw new ProjetoFinal.exception.MedicaoInvalidaException(
            "A quantidade de chuva não pode ser negativa."
    );
}
```

Dessa forma, o sistema protege suas regras de negócio e evita dados inválidos.

---

## 6. Explicação dos Principais Arquivos

### `Main.java`

Classe principal do sistema. Responsável por executar a simulação, criar cidades, sensores, registrar medições e chamar os serviços de análise de risco.

### `Cidade.java`

Representa uma cidade monitorada pelo sistema. Armazena nome, estado e se a cidade pertence a uma região de risco.

### `Medicao.java`

Representa uma medição realizada por um sensor. Armazena a cidade, o tipo do sensor, o valor medido e a data/hora da medição.

### `Alerta.java`

Representa um alerta gerado após a análise de risco. Armazena a cidade, o nível de risco, a mensagem e o horário do alerta.

### `Sensor.java`

Classe abstrata que representa um sensor genérico. Serve como base para os sensores específicos.

### `SensorRio.java`

Classe filha de `Sensor`. Representa um sensor responsável por medir o nível do rio.

### `SensorChuva.java`

Classe filha de `Sensor`. Representa um sensor responsável por medir a quantidade de chuva.

### `MedicaoRepository.java`

Classe responsável por armazenar as medições em memória usando `ArrayList`.

### `MonitoramentoService.java`

Classe responsável por registrar medições, salvar no repositório e comparar o valor atual com o valor anterior.

### `AnaliseRiscoService.java`

Classe responsável por analisar os valores de chuva e nível do rio, classificar o risco e gerar alertas.

### `MedicaoInvalidaException.java`

Exceção customizada usada para impedir o registro de medições inválidas.

### `NivelRisco.java`

Enum que define os níveis possíveis de risco: `BAIXO`, `MODERADO`, `ALTO` e `CRITICO`.

### `TipoSensor.java`

Enum que define os tipos de sensores usados no sistema: `RIO` e `CHUVA`.

### `Monitoravel.java`

Interface que define o contrato para classes que podem registrar medições.

### `GeradorAlerta.java`

Interface que define o contrato para classes que podem gerar alertas.

---

## 7. Como Executar no Eclipse

1. Abra o Eclipse.
2. Importe o projeto na workspace.
3. Verifique se a pasta `src` está configurada como source folder.
4. Abra o arquivo:

```text
ProjetoFinal/app/Main.java
```

5. Clique com o botão direito no arquivo `Main.java`.
6. Selecione:

```text
Run As > Java Application
```

A classe principal do sistema é:

```text
ProjetoFinal.app.Main
```

---

## 8. Considerações Finais

O sistema **AlertaRio RS** foi desenvolvido com o objetivo de aplicar os principais conceitos da Programação Orientada a Objetos em um problema prático e socialmente relevante.

Mesmo sendo uma simulação acadêmica, o projeto demonstra como sensores, medições, cidades, alertas e regras de análise podem ser modelados em Java usando uma arquitetura organizada, reutilizável e orientada a objetos.

O projeto atende aos 7 pré-requisitos obrigatórios do trabalho final:

1. Classes, objetos e atributos.
2. Construtores.
3. Encapsulamento e modificadores de acesso.
4. Herança.
5. Polimorfismo.
6. Classes abstratas e interfaces.
7. Tratamento de exceções.
