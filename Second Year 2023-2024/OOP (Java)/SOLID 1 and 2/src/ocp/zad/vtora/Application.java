package ocp.zad.vtora;

public class Application {
    // Returning the total volume of the geometric objects
    public double getTotalVolume(Cuboid[] cGeoObjects, Sphere[] sGeoObjects) {
        // Variable used to store total volume
        double volSum = 0;

        // Iteratively calculating the volume of each Cuboid
        // and adding it to the total volume

        // Iterating using for each loop to
        // calculate the volume of a cuboid
        for (Cuboid geoObj : cGeoObjects) {

            volSum += geoObj.length * geoObj.breadth
                    * geoObj.height;
        }

        // Iterating using for each loop to
        // calculate the volume of a cuboid
        for (Sphere geoObj : sGeoObjects) {

            // Iteratively calculating the volume of each
            // Sphere and adding it to the total volume
            volSum += (4 / 3) * Math.PI * geoObj.radius
                    * geoObj.radius * geoObj.radius;
        }

        // Returning the to total volume
        return volSum;
    }
}
