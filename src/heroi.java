import java.util.Scanner;
public class heroi {
    public static void main(String[] args) {
        String heroi;
        String categoriaExperiencia = "Ferro";
        int qtdExperiencia;
        Scanner recebe = new Scanner(System.in);
        System.out.print("Nome do Heroi: - -  ");
        heroi = recebe.nextLine();
        System.out.print("Experiência: ");
        qtdExperiencia = recebe.nextInt();
        if (qtdExperiencia < 1000){
            categoriaExperiencia = "Ferro";
        } else if (qtdExperiencia > 1000 && qtdExperiencia <= 2000) {
            categoriaExperiencia = "Bronze";
        }else if (qtdExperiencia > 2000 && qtdExperiencia <= 5000) {
            categoriaExperiencia = "Prata";
        }else if (qtdExperiencia > 5000 && qtdExperiencia <= 7000) {
            categoriaExperiencia = "Ouro";
        }else if (qtdExperiencia > 7000 && qtdExperiencia <= 8000) {
            categoriaExperiencia = "Platina";
        }else if (qtdExperiencia > 8000 && qtdExperiencia <= 9000) {
            categoriaExperiencia = "Ascendente";
        }else if (qtdExperiencia > 9000 && qtdExperiencia <= 10000) {
            categoriaExperiencia = "Imortal";
        }else categoriaExperiencia = "Radiante";


        System.out.println("O Herói de nome: " + heroi + " está no nível de " + categoriaExperiencia);
    }
}
