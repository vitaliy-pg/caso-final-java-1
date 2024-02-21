class SistemaAlertaMonitoreo {
    private double nivelRadiacion;
    private double temperatura;
    private double presion;

    public SistemaAlertaMonitoreo() {
        // Inicializar los valores de los factores críticos
        nivelRadiacion = 0.0;
        temperatura = 0.0;
        presion = 0.0;
    }

    public void monitorearRadiacion(double nivel) {
        nivelRadiacion = nivel;
        if (nivelRadiacion > 100.0) {
            alertar("Nivel de radiación extremo. Se requieren ajustes.");
        }
    }

    public void monitorearTemperatura(double nivel) {
        temperatura = nivel;
        if (temperatura > 40.0 || temperatura < 0.0) {
            alertar("Temperatura fuera de rango. Se requieren ajustes.");
        }
    }

    public void monitorearPresion(double nivel) {
        presion = nivel;
        if (presion > 100.0 || presion < 80.0) {
            alertar("Presión fuera de rango. Se requieren ajustes.");
        }
    }

    public void identificarEventosRaros(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (esPrimo(num)) {
                System.out.println("Evento raro o crítico: " + num);
                count++;
            }
            num++;
        }
    }

    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void alertar(String mensaje) {
        System.out.println("ALERTA: " + mensaje);
    }
}

