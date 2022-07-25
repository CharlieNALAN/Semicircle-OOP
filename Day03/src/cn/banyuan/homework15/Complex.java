package cn.banyuan.homework15;

public class Complex {
    double real;
    double im;

    public Complex(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public Complex() {
    }

    public Complex add(Complex c){
        Complex temp = new Complex();
        temp.real=this.real+c.real;
        temp.im=this.im+c.im;
        return temp;
    }
    public Complex add(double real){
        Complex temp = new Complex();
        temp.im=this.im;
        temp.real=this.real+real;
        return temp;
    }

    public Complex sub(Complex c){
        Complex temp = new Complex();
        temp.real=this.real-c.real;
        temp.im=this.im-c.im;
        return temp;
    }

    public Complex mul(Complex c){
        Complex temp = new Complex();
        temp.real=this.real*c.real-this.im*c.im;
        temp.im=this.real*c.im+this.im*c.real;
        return temp;
    }

    @Override
    public String toString() {
        return real+"+"+im+"i";
    }
}
