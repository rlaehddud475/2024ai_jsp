import lotto.Lotto;
import lotto.absLotto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Lotto lotto = new absLotto();
        Scanner sc = new Scanner(System.in);
        System.out.println("자동 로또 몇개 살거에요?");
        int count = sc.nextInt();
        for (int i=0; i<count; i++){
            List<Integer> lotto1 = lotto.absLotto();
            System.out.println((i+1)+"회 로또 번호 : "+lotto1);
        }
        sc.close();
    }
}
