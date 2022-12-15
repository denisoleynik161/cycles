package ru.netology.cycles.sqr;

public class SQRService {

    public int bruteForce(int one, int two) {
        int count = 0;
        for (int i = 10; i <= 99; i ++) {
            if (i * i >= one && i * i <= two){
                count += 1;
            }
        }
        return count;
    }
}