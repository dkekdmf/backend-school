package jvm.oom.lotto;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
class LottoApplication {
    private static final List<List<Integer>> lottoHistory = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {


        LottoGenerator generator = new LottoGenerator();
        while (true) {
            List<Integer> lottoNumbers = generator.generate();
            System.out.println(lottoNumbers);
            lottoHistory.add(generator.generate());

            Thread.sleep(100);
        }
    }
}