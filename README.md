<p align="center">
  <img src="https://github.com/hildocosta/hildocosta-Curso-Java--Nelio-Alves/blob/main/logo.png" width="300">
</p>

<h1 align="center">💡 Explorando Métodos Abstratos em Java</h1>

<p>🚀 Este repositório é dedicado à exploração do conceito de métodos abstratos na programação orientada a objetos (POO) em Java. Aqui, você encontrará uma variedade de recursos para aprofundar seu entendimento e praticar sua implementação.</p>

<p>🎓 Sou estudante de Engenharia de Computação no 3º semestre e estou em busca de aprimorar minhas habilidades em Java, especialmente em métodos abstratos. Este repositório serve como um complemento ao meu aprendizado, oferecendo exercícios desafiadores e projetos práticos para aplicar os conceitos aprendidos.</p>

<p>🔥 O objetivo principal é fornecer um ambiente onde eu possa não apenas aprender os conceitos teóricos, mas também colocá-los em prática de maneira significativa, construindo soluções eficazes e elegantes por meio do uso de métodos abstratos.</p>

<h2 align="center">🔒 Licença</h2>

<p>⚖️ Este projeto está licenciado sob a <a href="LICENSE">Licença MIT</a>.</p>

<h2 align="center">📧 Contato</h2>

<h3>🔗 Redes Sociais e Contato</h3>

<ul>
  <li>📌 GitHub: <a href="https://github.com/hildocosta">hildocosta</a></li>
  <li>💼 LinkedIn: <a href="https://www.linkedin.com/in/hildo-costa-b83812231/">Hildo Costa</a></li>
  <li>✉️ Email: hildo.costa@pm.pr.gov.br</li>
</ul>

<p>Agora que você está preparado e animado, vamos começar!</p>

<h2 align="center">🚀 Vamos Começar</h2>

<h3>🧩 Métodos Abstratos</h3>
<p>Métodos abstratos são métodos em uma classe que não possuem implementação. Eles são declarados usando a palavra-chave "abstract" e não incluem um corpo de método. Em vez disso, eles são destinados a serem implementados nas subclasses.</p>

<p>Uma classe que contém pelo menos um método abstrato deve ser declarada como uma classe abstrata. Essa classe abstrata pode conter métodos concretos (com implementação) além dos métodos abstratos.</p>

<p>As subclasses que estendem uma classe abstrata devem fornecer implementações para todos os métodos abstratos da classe pai. Isso permite que as subclasses personalizem o comportamento dos métodos de acordo com suas necessidades específicas.</p>

<p>Os métodos abstratos são úteis para definir um contrato comum para um conjunto de classes relacionadas, permitindo que diferentes implementações forneçam comportamentos específicos para cada classe.</p>

<p>Compreender o uso de métodos abstratos é fundamental para projetar hierarquias de classes flexíveis e reutilizáveis em Java.</p>

<h3>Projeto UML:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Metodos_Abstratos/blob/main/imagem_01.png">
</p>

<h2> Exercício - 01</h2>

<p>💥 Fazer um programa para ler os dados de N figuras(N fornecido pelo usuário), e depois mostrar as áreas destar figuras na mesma ordem em que foram digitadas. </p>

```
Enter the number of shapes: 2

Shape #1 data:

Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): BLACK
Width: 4.0
Height: 5.0

Shape #2 data:

Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): RED
Radius: 3.0

SHAPE AREAS:
20.00
29.61
```

<h2> Exercício - 02</h2>

<p>💥 Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuario), os quais podem ser pessoa fisica ou pessoa juridica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.

Os dados de pessoa fisica sao: nome, renda anual e gastos com saude. Os dados de pessoa juridica sao nome, renda anual e numero de funcionarios. As regras para calculo de imposto sao as seguintes:

**Pessoa Fisica:** pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saude, 50% destes gastos sao abatidos no imposto.

**Exemplo:** uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saude, o imposto fica: (50000.00 * 25%) - (2000.00 * 50%) = **11500.00**

**Pessoa Juridica:** pessoas juridicas pagam 16% de imposto. Porem, se a empresa possuir mais de 10 funcionarios, ele paga 14% de imposto.

**Exemplo:** pessoas cuja renda foi 40000.00 e possui 25 funcionarios, o imposto fica:(40000.00 * 14%) = **560000.00** </p>

```
Enter the number of tax payers: 3
Tax payer #1 data:

Individual or company(i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00

Tax payer #2 data:

Individual or company(i/c)? c
Name: SoftTech
Anual income: 40000.00
Number of employee: 25

Tax payer #3 data:

Individual or company(i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 1000.00

TAXES PAID:

Alex: $ 11500.00
SoftTech: $ 5600.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00


```
