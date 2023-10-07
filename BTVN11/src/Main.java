// Tính diện tích và chu vi các hình tứ giác biết độ dài 4 cạnh và 1 đường chéo
class Tugiac {
    // truyền độ dài 4 cạnh và 1 đường chéo
    private float ab;
    private float bc;
    private float cd;
    private float da;
    private float ac;

    public Tugiac(float ab, float bc, float cd, float da, float ac) {
        // |ab - bc| < ac < ab + bc, |cd - da| < ac < cd + da
        kiem_tra_dieu_kien_tam_giac(ab, bc, ac);
        kiem_tra_dieu_kien_tam_giac(bc, cd, ac);
        kiem_tra_dieu_kien_tam_giac(cd, da, ac);


        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
        this.da = da;
        this.ac = ac;
    }

    public float tinhDienTich() {
        return Tugiac.tinhDienTichTamGiac(ab, bc, ac) + Tugiac.tinhDienTichTamGiac(ac, cd, da);
    }

    public float tinhChuVi() {
        return ab + bc + cd + da;
    }

    public static float tinhDienTichTamGiac(float side1, float side2, float side3) {
        float p = (side1 + side2 + side3) / 2; // nửa chu vi
        return (float) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    private static void kiem_tra_dieu_kien_tam_giac(float side1, float side2, float side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Không thỏa mãn điều kiện tam giác");
        }
    }

    public float getAb() {
        return ab;
    }
    public void setAb(float ab)
    {
        this.ab=ab;
    }
    public float getBc()
    {
        return bc;
    }
    public void setBc(float bc)
    {
        this.bc=bc;
    }
    public float getCd(){
        return cd;

    }

    public void setCd(float cd) {
        this.cd = cd;
    }
    public float getDa()
    {
        return da;
    }
    public void setDa(float da) {
        this.da = da;
    }
    public float getAc()
    {
        return ac;
    }
    public void setAc(float ac)
    {
        this.ac=ac;
    }
}


class HinhBinhHanh extends Tugiac {
    public HinhBinhHanh(float ab, float bc, float ac) {
        super(ab, bc, ab, bc, ac);
    }

    public float tinhDienTich() {
        return Tugiac.tinhDienTichTamGiac(getAb(), getBc(), getAc()) * 2;
    }

    public float tinhChuVi() {
        return super.tinhChuVi();
    }
}

class HinhChuNhat extends HinhBinhHanh {
    public HinhChuNhat(float ab, float bc) {
        super(ab, bc, (float) Math.sqrt(ab * ab + bc * bc));
    }

    public float tinhDienTich() {
        return getAb() * getBc();
    }

    public float tinhChuVi() {
        return super.tinhChuVi();
    }
}

class HinhVuong extends HinhChuNhat {
    public HinhVuong(float ab) {
        super(ab, ab);
    }

    public float tinhDienTich() {
        return getAb()*getAb();
    }

    public float tinhChuVi() {
        return super.tinhChuVi();
    }
}

class HinhThoi extends Tugiac {
    public HinhThoi(float diagonal1, float diagonal2) {
        super(diagonal1, diagonal1, diagonal2, diagonal2, (float) Math.sqrt(diagonal1 * diagonal1 + diagonal2 * diagonal2) / 2);
    }

    public float tinhDienTich() {
        return (getAb() *getCd()) / 2;
    }

    public float tinhChuVi() {
        return super.tinhChuVi();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Tugiac ob_tg;
            ob_tg = new Tugiac(5.0f, 4.0f, 6.0f, 3.0f, 7.0f);

            HinhBinhHanh ob_hbh;
            ob_hbh = new HinhBinhHanh(5.0f, 8.0f, 7.0f);

            HinhChuNhat ob_hcn;
            ob_hcn = new HinhChuNhat(3.0f, 4.0f);

            HinhVuong ob_hv;
            ob_hv = new HinhVuong(6.0f);

            HinhThoi ob_ht;
            ob_ht = new HinhThoi(5.0f, 7.0f);

            // Gọi các hàm tính diện tích và chu vi của các hình
            System.out.println("Diện tích hình vuông là: " + ob_hv.tinhDienTich());
            System.out.println("Chu vi hình vuông là: " + ob_hv.tinhChuVi());

            System.out.println("Diện tích hình thoi là: " + ob_ht.tinhDienTich());
            System.out.println("Chu vi hình thoi là: " + ob_ht.tinhChuVi());

            System.out.println("Diện tích tứ giác là: " + ob_tg.tinhDienTich());
            System.out.println("Chu vi tứ giác là: " + ob_tg.tinhChuVi());

            System.out.println("Diện tích hình bình hành là: " + ob_hbh.tinhDienTich());
            System.out.println("Chu vi hình bình hành là: " + ob_hbh.tinhChuVi());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());//Nếu các tham số độ dài cạnh không thỏa mãn điều kiện, một ngoại lệ IllegalArgumentException sẽ được in ra để báo lỗi.
        }
    }
}
