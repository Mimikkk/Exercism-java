import java.util.HashMap;

class SpaceAge {
    private static final HashMap<String, Float> PLANETS_EARTH_YEARS = new HashMap<>(){{
        put("Earth", 1.0f);
        put("Mercury", 0.2408467f);
        put("Venus", 0.61519726f);
        put("Mars", 1.8808158f);
        put("Jupiter", 11.862615f);
        put("Saturn", 29.447498f);
        put("Uranus", 84.016846f);
        put("Neptune", 164.79132f);
    }};

    private final double seconds;
    private static final double EARTH_SECONDS = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }
    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Earth");
    }

    double onMercury() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Mercury");
    }

    double onVenus() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Venus");
    }

    double onMars() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Mars");
    }

    double onJupiter() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Jupiter");
    }

    double onSaturn() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Saturn");
    }

    double onUranus() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Uranus");
    }

    double onNeptune() {
        return getSeconds() / EARTH_SECONDS / PLANETS_EARTH_YEARS.get("Neptune");
    }

}
