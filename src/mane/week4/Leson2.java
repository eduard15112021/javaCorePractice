package mane.week4;

import java.util.Scanner;

/*
умный дом:

тут не правильно, нужно же создать массивы что бы было возможно обратиться к каждому элементу в пределах одного кейса
 и еще косяк: печаль беда, нет реализации отмены вводимого значения, а это было в условии, а я как обычно....
 */
class TV {
    private boolean status=false;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void on_of() {
        if (isStatus()) {
            System.out.println("телевизор выключен");
            setStatus(false);
        } else {
            System.out.println("телевизор включен");
            setStatus(true);
        }
    }

    public void information() {
        if (isStatus()) {
            System.out.println("телевизор включен");
        } else {
            System.out.println("телевизор выключен");
        }
    }
}

class Doors {
    private boolean status=false;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void on_of() {
        if (isStatus()) {
            System.out.println("дверь закрыта");
            setStatus(false);
        } else {
            System.out.println("дверь отрыта");
            setStatus(true);
        }
    }

    public void information() {
        if (isStatus()) {
            System.out.println("дверь отрыта");
        } else {
            System.out.println("дверь закрыта");
        }
    }
}

class Windows {
    private boolean status=false;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void on_of() {
        if (isStatus()) {
            System.out.println("окрно закрыто");
            setStatus(false);
        } else {
            System.out.println("окно отрыто");
            setStatus(true);
        }
    }

    public void information() {
        if (isStatus()) {
            System.out.println("окно отрыто");
        } else {
            System.out.println("окрно закрыто");
        }
    }
}

class Switches {
    private boolean status=false;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void on_of() {

//        status = status ? !status : status;
        if (isStatus()) {
            System.out.println("выключатель 'выключен'");
            setStatus(false);
        } else {
            System.out.println("выключатель 'включен'");
            setStatus(true);
        }
    }

    public void information() {
        if (isStatus()) {
            System.out.println("выключатель 'включен'");
        } else {
            System.out.println("выключатель 'выключен'");
        }
    }
}

public class Leson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TV tv = new TV();
        Doors door1 = new Doors();
        Doors door2 = new Doors();
        Windows window2
                = new Windows();
        Windows window1 = new Windows();
        Switches switcher1 = new Switches();
        Switches switcher2 = new Switches();
        boolean flag = true;
        while (flag) {
            System.out.println("выберите элемент умного дома: 1-телевизор, 2-дверь, 3-окна, 4-выключатель, 5-если хотите выйти");
            int num1 = sc.nextInt();
            switch (num1) {
                case 1: {
                    System.out.println("вы выбрали телефизор, что вы хотите сделать: 1 - нажать на красную кнопку, 2 - узнать статус");
                    int num2 = sc.nextInt();
                    switch (num2) {
                        case 1: {
                            tv.on_of();
                            break;
                        }
                        case 2: {
                            tv.information();
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("вы выбрали двери, с каким объектом вы хотите работать: 1 - дверь 1, 2 - дверь 2");
                    int num3 = sc.nextInt();
                    switch (num3) {
                        case 1: {
                            System.out.println("вы выбрали дверь 1, что вы хотите сделать: 1 - сделать действие, 2 - узнать статус");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1: {
                                    door1.on_of();
                                    break;
                                }
                                case 2: {
                                    door1.information();
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("вы выбрали дверь 2, что вы хотите сделать: 1 - сделать действие, 2 - узнать статус");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1: {
                                    door2.on_of();
                                    break;
                                }
                                case 2: {
                                    door2.information();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("вы выбрали окна, с каким объектом вы хотите работать: 1 -окно 1, 2 - окно 2");
                    int num3 = sc.nextInt();
                    switch (num3) {
                        case 1: {
                            System.out.println("вы выбрали окно 1, что вы хотите сделать: 1 - сделать действие, 2 - узнать статус");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1: {
                                    window1.on_of();
                                    break;
                                }
                                case 2: {
                                    window1.information();
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("вы выбрали окно 2, что вы хотите сделать: 1 - сделать действие, 2 - узнать статус");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1: {
                                    window2.on_of();
                                    break;
                                }
                                case 2: {
                                    window2.information();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("вы выбрали переключатели, с каким объектом вы хотите работать: 1 - переключатель 1, 2 - переключатель 2");
                    int num3 = sc.nextInt();
                    switch (num3) {
                        case 1: {
                            System.out.println("вы выбрали переключатель 1, что вы хотите сделать: 1 - сделать действие, 2 - узнать статус");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1: {
                                    switcher1.on_of();
                                    break;
                                }
                                case 2: {
                                    switcher1.information();
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("вы выбрали переключатель 2, что вы хотите сделать: 1 - сделать действие, 2 - узнать статус");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1: {
                                    switcher2.on_of();
                                    break;
                                }
                                case 2: {
                                    switcher2.information();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    flag = false;
                    break;
                }
            }
        }
    }
}
