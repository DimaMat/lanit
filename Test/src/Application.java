import animals.Kotik;

public class Application {

    public static boolean compareVoice (Kotik k1, Kotik k2) {
        return k1.getVoice() == k2.getVoice();
    }

    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("���", "���", 5, 7);
        Kotik kotik2 = new Kotik();

        kotik2.setName("����");
        kotik2.setVoice("����");
        kotik2.setSatiety(4);
        kotik2.setWeight(5);

        for (String day: kotik1.liveAnotherDay()) {
            System.out.println(day);
        }

        System.out.println("��� �� ������  " + kotik2.getName() + ", ��� ��� :" + kotik2.getWeight());


        if (compareVoice(kotik1, kotik2))
            System.out.println("���� ������� ��������  ");
        else
            System.out.println("���� ������� ��-�������");

        System.out.println("����� ����  " + Kotik.count);
    }

}
