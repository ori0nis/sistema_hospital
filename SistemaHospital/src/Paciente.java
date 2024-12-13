public class Paciente {
    private int nuss;
    private int sintoma;
    private int exploracion;
    private int nivelPrioridad;
    private int temperaturaActual;

    public Paciente(){}

    public Paciente(int nuss){
        this.nuss = nuss;
    }

    public Paciente(int sintoma, int exploracion, int nivelPrioridad, int temperaturaActual){
        this.sintoma = sintoma;
        this.exploracion = exploracion;
        this.nivelPrioridad = nivelPrioridad;
        this.temperaturaActual = temperaturaActual;
    }

    public Paciente(int nuss, int sintoma, int exploracion, int nivelPrioridad, int temperaturaActual){
        this.nuss = nuss;
        this.sintoma = sintoma;
        this.exploracion = exploracion;
        this.nivelPrioridad = nivelPrioridad;
        this.temperaturaActual = temperaturaActual;
    }

    public String getSintomaName(){
        switch(sintoma){
            case 1 -> {
                return "Dolor";
            }
            case 2 -> {
                return "Lesión traumática";
            }
            case 3 -> {
                return "Fiebre alta";
            }
            case 4 -> {
                return "Confusión o desorientación";
            }
            default -> {
                return "Síntoma desconocido";
            }
        }
    }

    public String getExploracionName(){
        switch (exploracion){
            case 1 -> {
                return "Dolor torácico";
            }
            case 2 -> {
                return "Dolor abdominal";
            }
            case 3 -> {
                return "Dolor de cabeza";
            }
            case 4 -> {
                return "Migraña";
            }
            case 5 -> {
                return "Fractura ósea";
            }
            case 6 -> {
                return "Herida de bala";
            }
            case 7 -> {
                return "Quemadura";
            }
            case 8 -> {
                return "Lesión cerebral traumática";
            }
            case 9 -> {
                return "Neumonía";
            }
            case 10 -> {
                return "Meningitis";
            }
            case 11 -> {
                return "Infección viral";
            }
            case 12 -> {
                return "Reacción alérgica";
            }
            case 13 -> {
                return "Intoxicación por drogas o alcohol";
            }
            case 14 -> {
                return "Deshidratación severa";
            }
            case 15 -> {
                return "Accidente cerebrovascular";
            }
            case 16 -> {
                return "Hipoglucemia severa";
            }
            default -> {
                return "Exploración fallida";
            }
        }
    }

    public int getNivelPrioridad(){
        return nivelPrioridad;
    }

    public int getTemperaturaActual(){
        return temperaturaActual;
    }
}
