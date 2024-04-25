package lacosRepeticao;

public class repeticao13 {
    public static void main(String[] args) {
        float populacaoA = 80000;
        float populacaoB = 200000;
        float taxaCrescimentoA = populacaoA * 3 /100;
        float taxaCrescimentoB = (float) (populacaoB * 1.5 /100);
        int anos = 1;

        while (populacaoA<populacaoB) {
            populacaoA = populacaoA + taxaCrescimentoA;
            populacaoB = populacaoB + taxaCrescimentoB;
            anos = anos + 1;
        }
        System.out.println("Em " + anos + " anos a população A passa a ter " + populacaoA + " habitantes e a população B passa a ter " + populacaoB + " habitantes.");
    }
}
// 14-Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.