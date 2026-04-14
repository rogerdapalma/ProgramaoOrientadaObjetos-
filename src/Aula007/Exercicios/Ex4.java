package Aula007.Exercicios;

public class Ex4 {

    public void validarIngresso(int idadeTorcedor, boolean isSocio) {
       
        if (idadeTorcedor < 18 && !isSocio) {
            throw new IllegalArgumentException("Acesso negado: Menores não-sócios precisam de acompanhante.");
        }
        
        System.out.println("Acesso liberado! Bom jogo no Beira-Rio.");
    }

    public static void main(String[] args) {
    	Ex4 catraca = new Ex4();

       
        try {
            System.out.println("Tentando validar ingresso...");
            catraca.validarIngresso(15, false); // 15 anos e NÃO é sócio
            
        } catch (IllegalArgumentException e) {
            // Captura a mensagem definida no 'throw'
            System.out.println(e.getMessage());
        }

        // Testando um cenário de sucesso
        try {
            catraca.validarIngresso(20, false); // Maior de idade
            catraca.validarIngresso(12, true);  // Menor, mas é sócio
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
