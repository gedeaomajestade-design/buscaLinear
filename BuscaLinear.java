
public class BuscaLinear {

    public static int buscaLinear(int[] lista, int valor) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 25, 30, 45, 50};
        int valor = 30;

        int resultado = buscaLinear(numeros, valor);

        if (resultado != -1) {
            System.out.println(
                    "Elemento encontrado na posição: " + resultado
            );
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
