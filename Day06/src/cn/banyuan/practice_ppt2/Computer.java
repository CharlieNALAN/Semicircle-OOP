package cn.banyuan.practice_ppt2;

public class Computer{
//    String CPU;
//    String ems;
//    String hardDisk;
//
//    public Computer() {
//    }
//
//    @Override
//    public void showCPU(String cpu) {
//        this.CPU=cpu;
//    }
//
//    @Override
//    public void showEMS(String ems) {
//        this.ems=ems;
//    }
//
//    @Override
//    public void showDisk(String hd) {
//        this.hardDisk=hd;
//    }
//
//    @Override
//    public String toString() {
//        return "Computer{" +
//                "CPU='" + CPU + '\'' +
//                ", ems='" + ems + '\'' +
//                ", hardDisk='" + hardDisk + '\'' +
//                '}';
//    }

    CPU cpu;
    EMS ems;
    HardDisk hardDisk;

    public Computer(CPU cpu, EMS ems, HardDisk hardDisk) {
        this.cpu = cpu;
        this.ems = ems;
        this.hardDisk = hardDisk;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu.getCPU() +
                ", ems=" + ems.getEMS() +
                ", hardDisk=" + hardDisk.getHardDisk() +
                '}';
    }
}
