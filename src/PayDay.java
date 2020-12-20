public class PayDay {
    public static void main(String[] args) {

        int PayDay1 = 100;
        int PayDay2 = 2000;
        int PayDay3 = 2500;

        int Rise1 = 1000;
        int Rise2 = 200;
        int Rise3 = 25;

        System.out.println("Pensja wynosi: "+PayDay3);

        int Payday= 2500;

        int result = 0;

        switch(Payday){
            case 100:
                result=PayDay1+Rise1;
                break;
            case 2000:
                result=PayDay2+Rise2;
                break;
            case 2500:
                result=PayDay3+Rise3;
                break;
        }
        System.out.println("Pensja po podwyżce wynosi: "+result);

        int result1 = 0;
        switch (Payday){
            case 100:
                result1=(Rise1*100)/PayDay1;
                break;
            case 2000:
                result1=(Rise2*100)/PayDay2;
                break;
            case 2500:
                result1=(Rise3*100)/PayDay3;
                break;

        }
        System.out.println("Pensja wzrosła o: "+result1+"%");
    }
}
