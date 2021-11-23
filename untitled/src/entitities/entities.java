package entitities;

public class entities {
    public String nome;
    public double sal;
    public double imp;

    //calculo do salario bruto menos o imposto
    public double calculo() {
        return sal - imp;
    }
    //calculo de porcentagem,o += é usado para fazer atribuições em loop onde a cada laço seja atribuido 1 ao valor inicial então você pode usar,logo apos o calculo ele irá fazer a operaçao de salario liquido ele irá calcular a porcetagem depois  de atribuída
    public double aumentarsalario(double porcentagem) {
        return sal += sal * porcentagem / 100;
        }
        //funciona como um display data para mostrar as informaçoes atualizadas que foram feitas e operadas durante o programa
    public String toString() {
        return nome + ", $" + String.format("%.2f", sal);
        }
    }

