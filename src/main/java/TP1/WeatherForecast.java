package TP1;

/**
 * JSON Pojo
 */
public class WeatherForecast {
    /*
    {"coord":{"lon":-3.44,"lat":48.81},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],
    "base":"cmc stations","main":{"temp":290.6,"pressure":1003,"humidity":88,"temp_min":290.15,"temp_max":291.15},
    "wind":{"speed":5.7,"deg":180},"clouds":{"all":90},"dt":1444037400,"sys":{"type":1,"id":5639,"message":0.0035,
    "country":"FR","sunrise":1444025945,"sunset":1444067061},"id":2987863,"name":"Perros-Guirec","cod":200}
     */
    // http://wiki.fasterxml.com/JacksonInFiveMinutes
    public static class Coord {
        private String _lon, _lat;

        public String getLon(){ return _lon;}
        public String getLat(){ return _lat;}
        public void setLon(String lon){ _lon = lon;}
        public void setLat(String lat){_lat = lat;}
    }
    private Coord _coord;
    public Coord getCoord(){return _coord;}
    public void setCoord(Coord c){this._coord = c;}

    public String toString(){
        return "Longitude " + _coord.getLon();
    }
}
