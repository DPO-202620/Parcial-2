package logica;

public class parcial {
    
    public String calcularRaices(double a, double b, double c) {
        if (a == 0) {
            return "Error: El coeficiente 'a' no puede ser cero";
        }
        
        double discriminante = (b * b) - (4 * a * c);
        
        if (discriminante < 0) {
            return "Error: La ecuación produce raíces complejas";
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            return "Raíz única: " + raiz;
        } else {
            double raizDiscriminante = calcularRaizManual(discriminante);
            double raiz1 = (-b + raizDiscriminante) / (2 * a);
            double raiz2 = (-b - raizDiscriminante) / (2 * a);            
            return "Raíz 1: " + raiz1 + " | Raíz 2: " + raiz2;
        }
    }
    
    private double calcularRaizManual(double numero) {
        if (numero == 0) return 0;
        
        double estimacion = numero / 2.0;
        double temporal = 0;       
        while (estimacion != temporal) {
            temporal = estimacion;
            estimacion = ((numero / temporal) + temporal) / 2.0;
        }      
        return estimacion;
    }
}