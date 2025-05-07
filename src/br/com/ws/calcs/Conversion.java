package br.com.ws.calcs;

import br.com.ws.model.Coin;
import br.com.ws.model.CoinSearch;

public class Conversion extends CoinSearch {

    public Double convert(Double amount, String coinBase, String coinTarget) {;
        CoinSearch coinSearch = new CoinSearch();
        Coin coin = coinSearch.searchCoin(coinBase);
        Double taxa = coin.conversion_rates().get(coinTarget);
        Double conversion = amount * taxa;
        return conversion;

    }

}
