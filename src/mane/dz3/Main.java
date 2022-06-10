package mane.dz3;

/*Создать класс компьютер.
        Поля:
        - процессор
        - оперативка
        - жесткий диск
        - ресурс полных циклов работы (включений/выключений)

        Методы:
        - метод описание(вывод всех полей)
        - метод включить, при включении может произойти сбой, при вывзове метода

        рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
        угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке
        включить нужно выдать сообщение что ему конец
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает*/

public class Main {
    public static void main(String[] args) {
        Comp comp = new Comp();
        comp.setComp("core i5","16Gb","1Tb");
        comp.setLivetime();
        System.out.println(comp.getProc()+"\n"+comp.getRAM()+"\n"+comp.getHard_d()+"\n"+comp.getLivetime());
        int temp= comp.getLivetime();
        for (int i=0;i<=temp;i++){
            comp.TurnOn();
            comp.TurnOf();
        }
    }
}
