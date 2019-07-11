package lotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoController {

    private LottoGenerator lottoGenerator;

    /*
    Jeżeli mamy pole typu interface to przy inicjalizacji mus stworzyć obiekt klasy,
    który implementuje interface, czyli obiekt, w tym przypadku, LottoGenerator
    */

    public void setLottoGenerator(LottoGenerator lottoGenerator) {
        this.lottoGenerator = lottoGenerator;
    }

    @GetMapping("/")
    public String generateRandomData(ModelMap map) {
        setLottoGenerator(new SimpleLottoGenerator());
        map.put("numbers", lottoGenerator.generateDescription());
        return "lotto";
    }

}
