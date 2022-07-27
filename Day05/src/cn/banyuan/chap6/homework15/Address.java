package cn.banyuan.chap6.homework15;

public class Address {
    private String address;
    private String zipCode;

    public Address() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
