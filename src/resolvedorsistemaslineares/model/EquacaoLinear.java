package resolvedorsistemaslineares.model;

public class EquacaoLinear {

    double[] vet;

    public EquacaoLinear() {
    }

    public EquacaoLinear(String equacao, int quantVariaveis) {

        equacao = retirarEspacos(equacao);
        if (confQuantVar(equacao, quantVariaveis)) {
            vet = new double[quantVariaveis + 1];
        }

    }

    //Separando os coeficientes
    private void separarCoeficientes(String equacao) {
        
    }

    //conferindo se a quantidade de variaveis bate com a equacao
    private boolean confQuantVar(String equacao, int quantVariaveis) {
        int quantMais = 0;
        for (int i = 0; i < equacao.length(); i++) {
            if (equacao.charAt(i) == '+') {
                quantMais++;
            }
        }
        if (quantMais != quantVariaveis - 1) {
            throw new IllegalArgumentException("A quantidade de variaveis nao bate");
        }
        return true;
    }

    //confere e retira espaços em branco na string
    private String retirarEspacos(String e) {
        if (e.contains(" ")) {
            e = e.replaceAll(" ", "");
        }
        return e;
    }
    //Método main para testar a própria classe aos poucos
    public static void main(String[] args) {
        try {
            EquacaoLinear teste = new EquacaoLinear("1+1+1=2", 3);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

}
