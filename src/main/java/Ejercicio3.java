public class Ejercicio3 {

    public void adivinarSuma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        System.out.println("adivine la suma de los numeros");
        int sumaIngresada = Main.sc.nextInt();
        if (sumaIngresada == suma) {
            System.out.println("Felicidades, adivinaste la suma");
        }else{
            System.out.println("no adivinaste la suma, la respuesta correcta es:  " + suma);
        }
    }
}
