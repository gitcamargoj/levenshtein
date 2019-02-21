public class Levenshtein {
    private String primaria;
    private String secundaria;

    public Levenshtein(String primaria, String secundaria) {
        this.primaria = primaria;
        this.secundaria = secundaria;
    }

    public String getPrimaria() {
        return primaria;
    }

    public void setPrimaria(String primaria) {
        this.primaria = primaria;
    }

    public String getSecundaria() {
        return secundaria;
    }

    public void setSecundaria(String secundaria) {
        this.secundaria = secundaria;
    }

    public int criterioZero(String primaria, String secundaria) {
        this.primaria = primaria;
        this.secundaria = secundaria;

        if (primaria.equals(secundaria)) return 1;
        else {
            return criterioUm(primaria, secundaria);
        }
    }

    private int criterioUm(String primaria, String secundaria) {
        this.primaria = primaria;
        this.secundaria = secundaria;
        String backupPrimaria = primaria;
        char auxiliar;
        int contador = 0;

        for (int i = 0; i < primaria.length(); i++) {
            for (int j = 0; j < secundaria.length(); j++) {
                if (backupPrimaria.charAt(i) == secundaria.charAt(j)) contador++;
                auxiliar = backupPrimaria.charAt(i);
                for (int k = 0; k < primaria.length(); k++) {
                    if (backupPrimaria.charAt(k) == auxiliar) backupPrimaria.replace(backupPrimaria.charAt(k), '*');
                }

            }
        }

        return criterioDois(primaria, secundaria, contador);

    }

    private int criterioDois(String primaria, String secundaria, int contador) {
        this.primaria = primaria;
        this.secundaria = secundaria;
        int ct = 0;

        for (int i = 0; i < primaria.length(); i++) {
            for (int j = 0; j < secundaria.length(); j++) {
                if (primaria.charAt(i) == secundaria.charAt(j)) ct++;
            }
            contador+=(ct*2);
            ct = 0;
        }

        return criterioTres(primaria, secundaria, contador);
    }

    private int criterioTres(String primaria, String secundaria, int contador) {
        this.primaria = primaria;
        this.secundaria = secundaria;

        for (int i = 0; i < primaria.length(); i++) {
            if (primaria.length() == i || secundaria.length() == i) break;
            if (primaria.charAt(i) == secundaria.charAt(i)) contador+=3;
        }

        return distancia(contador);
    }

    private int distancia(int contador) {
        if ((contador >= 40 && contador <= 60) || contador > 60) {
            return 2;
        } else if (contador >= 20 && contador <= 39) {
            return 3;
        } else if (contador >= 6 && contador <= 19) {
            return 4;
        } else if (contador <= 6) {
            return 5;
        }
        return 0;
    }
}
