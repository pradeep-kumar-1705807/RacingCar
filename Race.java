import java.util.ArrayList;

public class Race {

    ArrayList<Team> teams;
    ArrayList<Part> parts;
    ArrayList<Car> cars;

    public Race() {
    }

    public Race(ArrayList<Team> teams, ArrayList<Part> parts, ArrayList<Car> cars) {
        this.teams = teams;
        this.parts = parts;
        this.cars = cars;
    }
    public Car getCar(String carId)
    {
        for(Car car : this.cars) {
            if(carId.equals(car.getCarId())==true)
            {
                return car;
            }
        }
        return null;
    }
    public void updateTopSpeed(Team team , Car car) {
        Integer budget = team.getFunds();

        String partListId = car.getPartListId();
        
        for(Part part : this.parts) {
            if(partListId.equals(part.getPartListId())==true) {
                if(budget - part.getPrice() >=0 ) {

                    int speed = car.getTopSpeed();
                    speed =  speed + part.getSpeedBoost();
                    car.setTopSpeed(speed);
                }
            }
        }

    }
    public void calcuateSpeedBoostForCarsWithinBudget() {
        for(Team team : this.teams) {
            Car car =  team.getCar(this.team.getCarId());
            updateTopSpeed(team,car);
        }
        
    }
}