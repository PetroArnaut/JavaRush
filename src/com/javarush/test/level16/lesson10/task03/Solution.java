package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        Thread thread = new TestThread();
        thread.start();
        //Thread.sleep(5000);
        thread.interrupt();

    }

    //Add your code below - добавь код ниже


    public static class TestThread extends Thread {

        public void run() {
            while (true) {
                System.out.println(1);
                try
                {
                    sleep(500);
                }
                catch (InterruptedException e)
                {
                    return;
                }
            }
        }
    }
}
