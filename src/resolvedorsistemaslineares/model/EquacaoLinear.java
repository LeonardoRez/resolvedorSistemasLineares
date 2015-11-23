package resolvedorsistemaslineares.model;

public class EquacaoLinear {

    double[] vet;

    public EquacaoLinear() {
    }

    public EquacaoLinear(String equacao, int quantVariaveis) {
        //conferindo e retirando espaço em branco
        if (equacao.contains(" ")) {
            equacao = equacao.replaceAll(" ", "");
        }
        System.out.println(equacao);
        //conferindo se a quantidade de variaveis bate com a equacao
        int quantMais = 0;
        for (int i = 0; i < equacao.length(); i++) {
            if (equacao.charAt(i) == '+') {
                quantMais++;
            }
        }
        System.out.println(quantMais);
        if (quantMais != quantVariaveis - 1) {
            throw new IllegalArgumentException("A quantidade de variaveis nao bate");
        }

    }

    public static void main(String[] args) {
        try {
            EquacaoLinear teste = new EquacaoLinear("1+1+1=2", 4);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

}
