package cn.banyuan.entity;

public class ConsumInfo {
    public String cardNumber;
    public String type;
    public int consumData;

    public ConsumInfo() {
    }

    public ConsumInfo(String cardNumber, String type, int consumData) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.consumData = consumData;
    }
}
