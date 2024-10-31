package lotto;

import java.util.*;

public class absLotto implements Lotto {
    private static final int MAX_NUMBER = 45;
    private static final int LOTTO_COUNT = 6;
    private Random random = new Random();

    @Override
    public List<Integer> absLotto() {
        List<Integer> lottoNumber=new ArrayList<>();
        while (lottoNumber.size()<LOTTO_COUNT){
            int number = random.nextInt(MAX_NUMBER)+1;
            if(!lottoNumber.contains(number)){
                lottoNumber.add(number);
            }

        }
        Collections.sort(lottoNumber);
        return lottoNumber;
    }
}
