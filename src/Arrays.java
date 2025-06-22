public class Arrays {
    public void printCarsArray(){
        String[] cars = {"Volvo", "OPALA", "MUSTANG", "CHEVETTE"};
        System.out.println("This is a element of array " + cars[0]);

        String[] names = {"Matheus", "Mattew", "Matavo", "METALEWS", "MATHETEW"};

        for(int i = 0; i < names.length; i++){
            System.out.println("This is an list of names " + names[i]);
        }
    }
}
