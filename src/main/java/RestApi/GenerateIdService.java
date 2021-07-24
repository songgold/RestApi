package RestApi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class GenerateIdService {
    private Random random = new Random();

    @Autowired
    public void setRandom(Random random) {
        this.random = random;
    }

    public String getId() {
        return "XYZ" + random.nextInt(10);
    }
}
