
public class Main {
    public static void main(String[] args) {
        double[][] vyborka1, vyborka2;
        double[] selection1 = {2,4,5,5,6,7,7,9,9,11,12,14};
        double[] selection2 = {6,12,15,16,18,21,21,27,27,33,36,41};
        int length_selection1 = selection1.length;
        int length_selection2 = selection2.length;
        int num_max, number_of_intervals, interval, min_value, max_value;

        System.out.print("First selection ");
        for (int i = 0; i < length_selection1; i++) {
            System.out.print(" " + selection1[i]);
        }

        System.out.print("\nSecond selection ");
        for (int j = 0; j < length_selection2; j++) {
            System.out.print(" " + selection2[j]);
        }

        System.out.println("\nLength of first selection : " + length_selection1);
        System.out.println("Length of second selection : " + length_selection2);

        if (length_selection1 <= length_selection2) num_max = length_selection2;
        else num_max = length_selection1;

        if (selection1[0] <= selection2[0]) min_value = (int) selection1[0];
        else min_value = (int) selection2[0];

        if (selection1[length_selection1 - 1] <= selection2[length_selection2 - 1])
            max_value = (int) selection2[length_selection2 - 1];
        else max_value = (int) selection1[length_selection1 - 1];

        if (num_max <= 1) {
            number_of_intervals = 1;
        } else if (num_max <= 3) {
            number_of_intervals = 2;
        } else if (num_max <= 12) {
            number_of_intervals = 3;
        } else if (num_max <= 20) {
            number_of_intervals = 4;
        } else {
            number_of_intervals = 5;
        }

        interval = (max_value - min_value) / number_of_intervals;
        vyborka1 = new double[number_of_intervals][length_selection1+1];
        vyborka2 = new double[number_of_intervals][length_selection2+1];

        for (int i = 0; i < number_of_intervals; i++) {
            int min_predel, max_predel;
            int k = 0;

            min_predel = min_value;
            max_predel = min_value + interval;
            for (int j = 0; j < length_selection1; j++) {
                if (selection1[j] < max_predel && selection1[j] >= min_predel || number_of_intervals-i==1 && selection1[j]>=max_predel) {
                    vyborka1[i][k] = selection1[j];
                    System.out.print(vyborka1[i][k] + " ");
                    k++;

                }
            }
            //System.out.println(interval);
            System.out.println();
            vyborka1[i][k] = Double.MAX_VALUE;
            k = 0;
            min_predel = min_value;
            max_predel = min_value + interval;

            for (int j = 0; j < length_selection2; j++) {
                if (selection2[j] < max_predel && selection2[j] >= min_predel || number_of_intervals-i==1 && selection2[j]>=max_predel) {
                    vyborka2[i][k] = selection2[j];
                    k++;
                }
            }
            vyborka2[i][k] = Double.MAX_VALUE;
            min_value += interval;
        }

        double hikvadrat = 0;
        double sum = 0;
        int c = 0;
        int d = 0;
        hikvadrat = length_selection1*length_selection2;
        for (int i = 0; i < number_of_intervals; i++) {
            for (int j = 0; j < length_selection1+1; j++)
            {
                if (vyborka1[i][j] == Double.MAX_VALUE)
                    break;
                c++;
            }
            for (int j = 0; j < length_selection2+1; j++)
            {
                if (vyborka2[i][j] == Double.MAX_VALUE)
                    break;
                d++;
            }
            System.out.println(c + " " + d);
            sum += (1./(c+d))*Math.pow(((double)c/length_selection1) - ((double)d/length_selection2),2);
            c=d=0;

        }

        hikvadrat*=sum;
        System.out.println("Xi^2 = " + hikvadrat);

        double[][] massive_for_probability = {
                {0,0.001,0.004,0.016,0.064,0.158,0.455,1.074,1.642,2.71,3.84,100},
                {0.02,0.04,0.103,0.211,0.446,0.713,1.386,2.41,3.22,4.6,5.99,100},
                {0.115,0.185,0.352,0.584,1.005,1.424,2.37,3.66,4.63,6.25,7.82,100}
        };
        double[] massive_probabilities = {0.01,0.02,0.05,0.1,0.2,0.3,0.5,0.7,0.8,0.9,0.95,1};

        int t;
        for (t = 0; t < 11; t++) {
            if (hikvadrat < massive_for_probability[number_of_intervals-1-1][t]) break;
        }
        System.out.println("Probability is now between " + massive_probabilities[t-1] + " and " + massive_probabilities[t]);
    }
}