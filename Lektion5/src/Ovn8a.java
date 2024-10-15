import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ovn8a {
    
    private ArrayList<Double> tempretures = new ArrayList<Double>();

    public Ovn8a() {
        run();
    }

    public static void main(String[] args) {
        Ovn8a ovn8a = new Ovn8a();
    }


    public void run(){
        BufferedReader br;

        try {
            FileReader fr = new FileReader("./src/temp.txt");
            br = new BufferedReader(fr);

            String line;
            try{
            while ((line = br.readLine()) != null) {
                line = line.replace(",", ".");
                tempretures.add(Double.parseDouble(line));
            }
            } catch (IOException e) {
                System.out.println("Error reading file");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }


    public double getAverage(){
        double sum = 0;
        for (double temp : tempretures) {
            sum += temp;
        }
        return sum / tempretures.size();
    }

    public double getMin(){
        double min = tempretures.get(0);
        for (double temp : tempretures) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public double getMax(){
        double max = tempretures.get(0);
        for (double temp : tempretures) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

}
