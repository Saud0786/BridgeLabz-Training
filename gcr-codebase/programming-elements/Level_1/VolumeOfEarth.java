public class VolumeOfEarth {

    public static void main(String[] args) {
        // radius in kilometers
        double radiusKm = 6378;          
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * 0.621371;

        // Volume in cubic miles
        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + "\n"+"The volume of earth in cubic miles is " + volumeMiles);
        
    }
}