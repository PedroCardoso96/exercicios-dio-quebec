

public class Letscode {
    public static void main(String[] args) {
        String diaDaSemana = "domingo";
        switch (diaDaSemana) {
            case "sábado":
            case "domingo":
                System.out.println("É fim de semana");
                break;
            case "segunda-feira":
            case "terça-feira":
            case "quarta-feira":
            case "quinta-feira":
            case "sexta-feira":
                System.out.println("É dia útil");
        }


    }
}

