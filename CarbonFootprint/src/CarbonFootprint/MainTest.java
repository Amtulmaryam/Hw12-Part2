//Amtul Maryam

package CarbonFootprint;

//Test the bicycle, car, and building.
public class MainTest {


	public static void main(String[] args) {
        CarbonFootprint[] carbonFootprint = {new Bicycle(), new Car(), new Building()};
        for(int i = 0; i < carbonFootprint.length; ++i) {
            System.out.println(carbonFootprint[i].getCarbonFootprint());
        }
    }

	}


