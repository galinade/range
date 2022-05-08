package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.crazyCant(100, 4000);
        System.out.println(res);
    }

}
