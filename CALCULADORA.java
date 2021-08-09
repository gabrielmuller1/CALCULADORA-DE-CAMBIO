import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Gabriel {
    public static void main(String[] args) {

        //valor equuivalente a um real
        Map<String, Double> moedaEmReais = new HashMap<>();
        moedaEmReais.put("Real", 1.0);
        //um real em dollar americano
        moedaEmReais.put("Dolar Americano", 0.19);
        //um real em euro
        moedaEmReais.put("Euro", 0.16);
        //um real em dollar canadense
        moedaEmReais.put("Dolar Canadense", 0.23);

        String moedaOrigem = JOptionPane.showInputDialog("Digite a moeda de origem:");
        Double valorOrigem = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a converter:"));

        String moedaDestino = JOptionPane.showInputDialog("Digite a moeda de destino:");

        Double valor = moedaEmReais.get(moedaOrigem);

        Double valorDedstino = moedaEmReais.get(moedaDestino);

        if(valor != null && valorDedstino != null){
            Double valorConvertido = 0.0;

            Double valorEmReais = 1 / valor;
            valorEmReais *= valorOrigem;

            valorConvertido = valorDedstino * valorEmReais;



            System.out.println(valorOrigem  +  moedaOrigem + " em " + moedaDestino + " é igual a: "+ valorConvertido);
        }else{
            System.out.println("Erro ao tentar pegar valor da moeda, não cadastrada ou invalida");
        }


    }
}
