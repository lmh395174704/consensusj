package org.consensusj.exchange;

import javax.money.CurrencyUnit;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Generic XChange ExchangeRateProvider that can wrap any XChange class
 */
public class DynamicXChangeRateProvider extends BaseXChangeExchangeRateProvider {

    public DynamicXChangeRateProvider(String exchangeClassName,
                                      ScheduledExecutorService scheduledExecutorService,
                                      Map<CurrencyUnit, String> tickerSymbolConversions,
                                      CurrencyUnitPair... pairs) {
        super(exchangeClassName, scheduledExecutorService, tickerSymbolConversions, pairs);
    }

    public DynamicXChangeRateProvider(String exchangeClassName, ScheduledExecutorService scheduledExecutorService, CurrencyUnitPair... pairs) {
        super(exchangeClassName, scheduledExecutorService, null, pairs);
    }

    public DynamicXChangeRateProvider(String exchangeClassName, ScheduledExecutorService scheduledExecutorService, String... pairs) {
        super(exchangeClassName, scheduledExecutorService, pairs);
    }

    public DynamicXChangeRateProvider(String exchangeClassName, CurrencyUnitPair... pairs) {
        this(exchangeClassName, null, pairs);
    }


    public DynamicXChangeRateProvider(String exchangeClassName, String... pairs) {
        this(exchangeClassName, null, pairs);
    }
}
