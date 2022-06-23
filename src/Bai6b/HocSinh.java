package Bai6b;

public class HocSinh extends ConNguoi {

    private String tenLop;
    private String tenTruong;
    public HocSinh (String hoVaTen, int namSinh,String tenLop,String tenTruong){
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop(){
        return tenLop;
    }
    public void setTenLop(String tenLop){
        this.tenLop = tenLop;
    }
    public String getTenTruong(){
        return tenTruong;
    }
    public void setTenTruong(String tenTruong){
        this.tenTruong = tenTruong;
    }
    public void an(){
        System.out.println("moăm moăm");
    }
    public void ngu(){
        System.out.println("khò khò");
    }
    public void uong(){
        System.out.println("ọt ọt");
    }
    public void lamBaiTap(){
        System.out.println("... ... ...");
    }

    public static void main(String[] args) {
        HocSinh tien = new HocSinh("Lê Hữu Tiên",2003,"c03","codegym");
        System.out.println("Tên: " + tien.getHoVaTen());
        System.out.println("năm sinh" + tien.getNamSinh());
        System.out.print("ăn ");
        tien.an();
        System.out.println();
        System.out.print("ngủ ");
        tien.ngu();
        System.out.println();
        System.out.print("uống ");
        tien.uong();
        System.out.println();
    }
}
