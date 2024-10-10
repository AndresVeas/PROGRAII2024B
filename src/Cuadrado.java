public class Cuadrado {
    public static void main(String[] args) {
        int t=5;
        for (int f=1; f<=t;f++){
            for(int c=1; c<=t; c++){
                if (c==1 || f==1 || c==t || f==t){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
