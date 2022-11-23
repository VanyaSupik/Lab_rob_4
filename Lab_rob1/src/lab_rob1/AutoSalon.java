package lab_rob1;

public class AutoSalon extends Client {
    private double length;
    private double width;
    private int numberOfCars;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        int n = numberOfCars*2;
        this.numberOfCars = n;
    }

    AutoSalon(double length, double width, int numberOfCars) {
        super();
        this.length = length;
        this.width = width;
        this.numberOfCars = numberOfCars;
    }
    AutoSalon(double length, double width){//Перевизначив конструктори
        this.length = length;
        this.width = width;
    }
    AutoSalon(){
    }
    AutoSalon(int numberOfCars){
        this.numberOfCars = numberOfCars;
    }

    void cars(){
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
    }
    double square(){
        double s = length*width;
        return s;//Площа автосалону
    }
    int square(int length, int width){
        return length*width;//Перевизначив типізований метод

    }
    AutoSalon salon(double m,int n){
        AutoSalon autoSalon = new AutoSalon(length-m,width-m,numberOfCars-n);//Метод посилкового типу
        return autoSalon;
    }
    void about(int years,String brands){
        if(years<2019){
            System.out.println("Марка старого автомобіля: "+brands);
        }else {
            System.out.println("Немає старого автомобіля");
        }
    }
    Client c = new Client("Volkswagen", "Golf7",25000,true,2.0,"Дизель");
    Seller s = new Seller("Іван","Cупик",10,15000);
    void client(){
        System.out.println("Машину яку хоче клієнт "+c.getBrand() + " " + c.getModel() + ", Продавець що обслуговує " + s.getName() + " " + s.getSurName());
    }
    void printInfo(){
        System.out.println("Кількість автомобілів у салоні "+ numberOfCars);
        about1();
    }
}
