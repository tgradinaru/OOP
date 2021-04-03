package oop.patterns.builder;
import java.util.List;

public class House {
    private List<Room> rooms;
    private Roof roof;
    private boolean hasBasement;
    private boolean hasGarden;
    private boolean hasPorch; //veranda

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasPorch(boolean hasPorch) {
        this.hasPorch = hasPorch;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", roof=" + roof +
                ", hasBasement=" + hasBasement +
                ", hasGarden=" + hasGarden +
                ", hasPorch=" + hasPorch +
                '}';
    }
}
