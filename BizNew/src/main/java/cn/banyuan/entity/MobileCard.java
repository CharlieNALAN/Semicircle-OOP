package cn.banyuan.entity;

public class MobileCard {
    public String cardNumber;
    public String userName;
    public String passWord;
    public ServicePackage serPackage;
    public double consumAmount;
    public double money;
    public int realTalkTime=0;
    public int realSMSCount=0;
    public int realFlow=0;

    public MobileCard() {
    }

    public MobileCard(String cardNumber, String userName, String passWord) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.passWord = passWord;
    }

    public void showMeg(){

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ServicePackage getSerPackage() {
        return serPackage;
    }

    public void setSerPackage(ServicePackage serPackage) {
        this.serPackage = serPackage;
    }

    public double getConsumAmount() {
        return consumAmount;
    }

    public void setConsumAmount(double consumAmount) {
        this.consumAmount = consumAmount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getRealTalkTime() {
        return realTalkTime;
    }

    public void setRealTalkTime(int realTalkTime) {
        this.realTalkTime = realTalkTime;
    }

    public int getRealSMSCount() {
        return realSMSCount;
    }

    public void setRealSMSCount(int realSMSCount) {
        this.realSMSCount = realSMSCount;
    }

    public int getRealFlow() {
        return realFlow;
    }

    public void setRealFlow(int realFlow) {
        this.realFlow = realFlow;
    }
}
