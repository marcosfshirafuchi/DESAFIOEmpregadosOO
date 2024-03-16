# DESAFIO: Empregados OO

Você deve fazer um programa para ler os dados de um departamento, que inclui seu endereço e seus
empregados. Em seguida você deverá mostrar na tela um relatório de folha de pagamento, conforme
exemplos.<br><br>
Para resolver este problema, você deverá implementar as entidades conforme projeto abaixo. O método
payroll() da classe Department é responsável por retornar o valor total da folha de pagamento do
departamento.<br><br>

<p><a href="https://ibb.co/yN99t4x"><img src="https://i.ibb.co/WHhhZVR/image-2024-03-16-T23-01-18-258-Z.png" alt="image-2024-03-16-T23-01-18-258-Z" border="0" align="center"></a></p>
<br><br>
EXEMPLO:<br>
Nome do departamento: Vendas<br>
Dia do pagamento: 10<br>
Email: vendas@lojatop.com<br>
Telefone: 99883355<br>
Quantos funcionários tem o departamento? 2<br>
Dados do funcionário 1:<br>
Nome: João Silva<br>
Salário: 8000.00<br>
Dados do funcionário 2:<br>
Nome: Maria Torres<br>
Salário: 10000.00<br><br>
FOLHA DE PAGAMENTO:<br>
Departamento Vendas = R$ 18000.00<br>
Pagamento realizado no dia 10<br>
Funcionários:<br>
João Silva<br>
Maria Torres<br>
Para dúvidas favor entrar em contato: vendas@lojatop.com<br><br>

ATENÇÃO:<br>
Seu programa principal deve manter uma variável para um objeto do tipo Department. Crie um método
estático showReport para receber como argumento este objeto Department e, a partir dele, exibir todo
relatório na tela.<br><br>
package application;<br>
import java.util.Locale;<br>
import java.util.Scanner;<br>
import entities.Department;<br>
public class Program {<br>
    public static void main(String[] args) {<br>
      Locale.setDefault(Locale.US);<br>
      Scanner sc = new Scanner(System.in);<br>
      Department dept = new ...<br>
      ...<br>
      showReport(dept);<br>
      sc.close();<br>
    }<br><br>
  private static void showReport(Department dept) {<br>
    // MOSTRAR NA TELA OS DADOS DO RELATÓRIO<br>
  }<br>
}<br><br>
ATENÇÃO:<br>
Para o exemplo dado acima, esta é a estrutura de objetos que você deverá criar na memória:<br><br>

<p><a href="https://ibb.co/qkmn8kh"><img src="https://i.ibb.co/nzQ0yz4/image-2024-03-16-T23-16-37-218-Z.png" alt="image-2024-03-16-T23-16-37-218-Z" border="0" align="center"></a></p>
