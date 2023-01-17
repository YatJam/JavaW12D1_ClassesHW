public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink(){
        return volume -= 10;
    }

    public int emptyBottle(){
        return volume = 0;
    }

    public int fullBottle(){
        return volume = 100;
    }
}
