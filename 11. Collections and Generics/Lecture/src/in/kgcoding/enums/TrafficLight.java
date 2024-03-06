package in.kgcoding.enums;

public enum TrafficLight {
    Red("Stop"), Green("Go"), Yellow("Wait");

    private final String action;
    TrafficLight(String action){
        this.action = action;
    }
}
