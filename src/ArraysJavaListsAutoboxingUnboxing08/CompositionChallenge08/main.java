package ArraysJavaListsAutoboxingUnboxing08.CompositionChallenge08;

public class main{

    public static void main (String[] args){
        Wall wall = new Wall("West");
        Wall wal2 = new Wall("East");
        Wall wal3 = new Wall("South");
        Wall wal4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Style", 4,3,3,1);

        Lamp lamp = new Lamp("Clasic", false, 100);

        Bedroom bedRoom = new Bedroom("Szymon" ,wall,wal2,wal3,wal4, ceiling,bed,lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }


}
