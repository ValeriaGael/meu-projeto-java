public class MinhClasse {

    public static void main(String[] args) {

        String primeiroNome = "Valéria";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
