public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch(grade)
        {
            case 'A' :
                System.out.println("Mükemmel : Geçtiniz!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Çok Güzel : Geçtiniz.");
                break;
            case 'D' :
                System.out.println("İyi : Geçtiniz");
            case 'F' :
                System.out.println("Maalesef : Kaldınız.");
                break;
            default :
                System.out.println("Yanlış giriş yaptınız.");
        }
    }
}

