
public class HealthStation {

    private int countWeighings;
    
    public HealthStation() {
        this.countWeighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.countWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.countWeighings;
    }
}
