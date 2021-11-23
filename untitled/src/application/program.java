package application;
import entitities.entities;
//sempre importar as bibiliotecas scanner e locale
import java.util.Locale;
import java.util.Scanner;

public class program {
        //sempre definiar o public static void e setar o locale
        public static void main(String[] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            //fazer puxar as variaveis da outra classe que está na package entities"ent" pode ser definido pelo usuario.
            entities ent = new entities();

        //print para guardar os dados inseridos pelo usuario,se usar o ln ele vai pular uma linha antes de aparecer o salario
        System.out.print("Nome: ");
             ent.nome = sc.next();
        System.out.print("salario bruto: ");
            ent.sal = sc.nextDouble();
        System.out.print("Imposto: ");
            ent.imp = sc.nextDouble();
        //calcula o salario bruto e imposto e mostra o salario liquido,ent.calculo está no package entities.
        System.out.println("salario liquido: " +ent.calculo());
        //porcetagem calculado no package entities,puxa um numero double e pula pra proxima linha que irá ler a formula que está na classe entities
        System.out.println("Qual a porcentagem que deseja aumentar do salario?");
            double porcentagem = sc.nextDouble();
            ent.aumentarsalario(porcentagem);
        //display data explicado na classe entities
        System.out.println("Dados atualizados: "+ent);

        sc.close();
   }
}

