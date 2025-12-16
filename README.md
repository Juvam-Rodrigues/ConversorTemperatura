<h1>🌡️ Conversor de Temperatura - Java Swing</h1>

<h2>📝 Descrição</h2>
<p>Projeto em Java Swing que implementa um <strong>conversor de temperatura</strong> entre Celsius e Fahrenheit.<br>
O sistema possui interface gráfica com campos de entrada, botões de ação e imagens ilustrativas.<br>
O resultado da conversão é exibido com até <strong>duas casas decimais</strong>, e o programa valida entradas inválidas.</p>

<hr>

<h2>⚙️ Funcionalidades</h2>
<ul>
  <li>Conversão de temperatura entre Celsius e Fahrenheit.</li>
  <li>Validação de entrada: aceita apenas números válidos.</li>
  <li>Placeholder nos combos (“Escolha o tipo de conversão”) que desaparece ao abrir o menu.</li>
  <li>Botão <strong>Limpar</strong> que reseta os campos e placeholders.</li>
  <li>Resultado arredondado para até duas casas decimais.</li>
  <li>Imagem ilustrativa redimensionada para se ajustar ao tamanho do JLabel.</li>
</ul>

<hr>

<h2>🚀 Como usar</h2>

<h3>1️⃣ Executar o programa no Eclipse ou IDE</h3>
<p>Abra o projeto no <strong>Eclipse</strong> ou outra IDE Java que suporte Swing.<br>
Execute a classe principal <code>ViewTemperatura.java</code>.</p>

<h3>2️⃣ Executar o JAR (binário)</h3>
<p>Para executadar o JAR gerado (<code>ConversorTemperatura.jar</code>), entre dentro da pasta <code>bin</code>:</p>
<ol>
  <li>Abra o terminal ou CMD.</li>
  <li>Navegue até a pasta <code>bin</code> onde está o JAR:
    <pre>cd D:\PROGRAMACAO\Java\Projetos - eclipse\ConversorTemperatura\bin</pre>
  </li>
  <li>Execute o JAR:
    <pre>java -jar ConversorTemperatura.jar</pre>
  </li>
</ol>
<p><strong>Observação:</strong> a pasta <code>image</code> precisa estar junto com o JAR dentro de <code>bin</code> para que as imagens sejam carregadas corretamente.</p>

<h3>3️⃣ Inserir valor e selecionar unidades</h3>
<ul>
  <li>Digite o valor a ser convertido no campo <strong>Valor para conversão</strong>.</li>
  <li>Selecione a unidade de origem no primeiro combo.</li>
  <li>Selecione a unidade de destino no segundo combo.</li>
  <li>Clique em <strong>Calcular</strong> para ver o resultado.</li>
  <li>Clique em <strong>Limpar</strong> para resetar os campos e placeholders.</li>
</ul>

<h3>4️⃣ Mensagens de erro</h3>
<ul>
  <li>Entrada inválida (não numérica): <strong>"Erro: coloque um valor válido"</strong></li>
  <li>Se os combos não forem selecionados corretamente, o programa não realiza a conversão.</li>
</ul>

<hr>

<h2>📂 Estrutura do projeto</h2>
<pre>
src/
 ├─ model/
 │   └─ Temperaturas.java
 ├─ view/
 │   └─ ViewTemperatura.java
 └─ image/
     └─ temperatura-alta.png
bin/
 └─ ConversorTemperatura.jar
</pre>

<h2>🔢 Como funciona a conversão</h2>
<ul>
  <li><strong>Celsius → Fahrenheit:</strong> F = C × 9/5 + 32</li>
  <li><strong>Fahrenheit → Celsius:</strong> C = (F − 32) × 5/9</li>
</ul>

<hr>

<h2>👤 Autor</h2>
<ul>
  <li>Juvam Rodrigues do Nascimento Neto (<a href="https://github.com/Juvam-Rodrigues">GitHub</a>)</li>
</ul>
