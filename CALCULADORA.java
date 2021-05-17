public class Gabriel {
    public static void main(String[] args) {
//    "Crie um script na linguagem de programação java que receba a moeda de origem e a moeda de destino de uma lista "
//    "previamente cadastrada, além do valor a ser convertido e retorne o valor convertido com precisão de centavos"

        //valor equuivalente a um real
        Map<String, Double> moedaEmReais = new HashMap<>();
        moedaEmReais.put("real", 1.0);
        //um real em dollar
        moedaEmReais.put("dollar", 0.19);
        moedaEmReais.put("dolar", 0.19);
        //um real em euro
        moedaEmReais.put("euro", 0.16);

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



            System.out.println(moedaOrigem + " em " + moedaDestino + " é igual a: "+ valorConvertido);
        }else{
            System.out.println("Erro ao tentar pegar valor da moeda, não cadastrada ou invalida");
        }


    }
}
