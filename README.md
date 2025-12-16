<h1>Conversor de Temperatura - Java Swing</h1>

<h3>Descrição</h3>

Projeto em Java Swing que implementa um **conversor de temperatura** entre Celsius e Fahrenheit.  
O sistema possui interface gráfica com campos de entrada, botões de ação e imagens ilustrativas.  
O resultado da conversão é exibido com até **duas casas decimais**, e o programa valida entradas inválidas.

---

<h3>Funcionalidades</h3>

<ul>
  <li>Conversão de temperatura entre Celsius e Fahrenheit.</li>
  <li>Validação de entrada: aceita apenas números válidos.</li>
  <li>Placeholder nos combos (“Escolha o tipo de conversão”) que desaparece ao abrir o menu.</li>
  <li>Botão <strong>Limpar</strong> que reseta os campos e placeholders.</li>
  <li>Resultado arredondado para até duas casas decimais.</li>
  <li>Imagem ilustrativa redimensionada para se ajustar ao tamanho do JLabel.</li>
</ul>

---

<h2>Como usar</h2>

<h3>1. Executar o programa</h3>

Abra o projeto no **Eclipse** ou outra IDE Java que suporte Swing.  
Execute a classe principal <code>ViewTemperatura.java</code>.

---

<h3>2. Inserir valor e selecionar unidades</h3>

<ul>
  <li>Digite o valor a ser convertido no campo <strong>Valor para conversão</strong>.</li>
  <li>Selecione a unidade de origem no primeiro combo.</li>
  <li>Selecione a unidade de destino no segundo combo.</li>
  <li>Clique em <strong>Calcular</strong> para ver o resultado.</li>
  <li>Clique em <strong>Limpar</strong> para resetar os campos e placeholders.</li>
</ul>

---

<h3>3. Mensagens de erro</h3>

<ul>
  <li>Entrada inválida (não numérica): <strong>"Erro: coloque um valor válido"</strong></li>
  <li>Se os combos não forem selecionados corretamente, o programa não realiza a conversão.</li>
</ul>

---

<h2>Estrutura do projeto</h2>

<ul>
  <li><strong>src</strong>
    <ul>
      <li>model
        <ul>
          <li>Temperaturas.java</li>
        </ul>
      </li>
      <li>view
        <ul>
          <li>ViewTemperatura.java</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>image
    <ul>
      <li>temperatura-alta.png</li>
    </ul>
  </li>
</ul>

---

<h2>Como funciona a conversão</h2>

<ul>
  <li><strong>Celsius → Fahrenheit:</strong> F = C × 9/5 + 32</li>
  <li><strong>Fahrenheit → Celsius:</strong> C = (F − 32) × 5/9</li>
</ul>

---

<h2>Autor</h2>

<ul>
  <li>Juvam Rodrigues do Nascimento Neto (https://github.com/Juvam-Rodrigues)</li>
</ul>
