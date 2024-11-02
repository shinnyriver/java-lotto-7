package lotto.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lotto.domain.Lotto;

public class LottoService {

    public List<Integer> generateLotto(String str) {
        return Arrays.stream(str.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();
    }

    public List<Lotto> purchaseLotto(int numberOfLottos) {
        GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();
        List<Lotto> purchasedLotto = new ArrayList<>();
        for (int count = 0; count < numberOfLottos; count++) {
            purchasedLotto.add(new Lotto(generateRandomNumbers.generateLottoNumbers()));
        }
        return purchasedLotto;
    }
}
