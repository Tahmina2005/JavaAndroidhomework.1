public class Cat extends Animal {
    private Lynx lynx;

    public Cat(int age, Lynx lynx, String color) {
        super(age, color);
        this.lynx = lynx;
    }

    public Lynx getLynx() {
        return lynx;
    }
    public void makeVoice(){
        System.out.println(" ");
    }
    final void makeVoice(String voice){
        System.out.println("voice");
    }
}
