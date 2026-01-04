package jogodavelha.midevs.service;

import java.util.Random;

public class SortearJogador {

   private static final Random random = new Random();


        public static int sorteiojogador() {
        return random.nextInt(1, 3);
        }

}
