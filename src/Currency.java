public class Currency {
    private double exchangeRate;
    private String code; // like usd, cny

    public Currency(double exchangeRate, String code) {
        this.exchangeRate = exchangeRate;
        this.code = code;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
