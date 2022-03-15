package ro.sda.ioana.enumeration.ex1;

public enum Planet {
    JUPITER("Jupiter", "Huge", 2345),
    PLUTO("Pluto", "Small", 23455),
    TERRA("Terra", "Medium", 0),
    SATURN("Saturn", "Extra huge", 4546564);


    private final String prettyName;
    private final String size;
    private final long distanceFromTerra;

    //constructorul este by default private
    Planet(String prettyName, String size, long distanceFromTerra) {
        this.prettyName = prettyName;
        this.size = size;
        this.distanceFromTerra = distanceFromTerra;
    }

    public long distanceFromEarth(){
        return distanceFromTerra;
    }


    @Override
    public String toString() {
        return size + " " + prettyName;
    }
}
