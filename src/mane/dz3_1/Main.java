package mane.dz3_1;
/*
В классе Транспорт есть поля: - Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг) - Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )

В классе Наземный добавляются поля: -Количество колёс - Расход топлива(л/100км)

В классе Легковой добавляются поля: - Тип кузова - Кол-во пассажиров
В классе Грузовой добавляется поле: - Грузоподъёмность(т)
                       Транспорт
              Наземный         Воздушный
        Легковой Грузовой Гражданский Военный
В классе Воздушный добавляются поля: - Размах крыльев (м) - Минимальная длина взлётно-посадочной полосы для взлёта

В классе Гражданский добавляются поля: - Кол-во пассажиров - Наличие бизнес класса (true/false)
В классе Военный добавляются поля: - Наличие системы катапультирования (true/false) - Кол-во ракет на борту
В конечных классах (Легковой, Грузовой, Военный, Гражданский)
разработать метод описание который будет возвращать составленную строку
с описанием всех характеристик объекта.
В строку включить ещё один параметр мощность в киловаттах (кВ) .  1 л.с = 0.74 кВ

Для легкового разработать метод который будет принимать время и считать сколько километров проедет машина
двигаясь с максимальной скоростью и сколько топлива она израсходует за это время, результат вывести в консоль,
расчёт израсходуемого топлива вынести в отдельный метод private.
привер результата: Для грузового разработать метод который проверит можно ли загрузить в него xxx груза

Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим “Вам нужен грузовик побольше ”.
Такой же метод делаем для Гражданских самолётов, только проверяем  вместимость пассажиров.

Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то “Боеприпасы отсутствуют”.
А так же метод катапультирование, который проверит если наличие системы катапультирования true, то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”

 р.с. стори метод сететранспорт в классе транспорт*/
public class Main {
    public static void main(String[] args) {
        Passenger passenger=new Passenger();
        Truck truck=new Truck();
        Civilian plane=new Civilian();
        Military military_plane=new Military();

        passenger.setPassenger(10,130,1800,"Audi",4,8.1,"standart",8);
        truck.setTruck(20,80,4865,"MA3",6,20,60);
        plane.setCivilian(40,250,90,"Airbus",12.6,1200,150,false);
        military_plane.setMilitary(50,300,60,"MilTeh",10,800,true,6);

        passenger.getPassenger();
        System.out.println();
        truck.getTruck();
        System.out.println();
        plane.getCivilian();
        System.out.println();
        military_plane.getMilitary();
        System.out.println();

        passenger.specialMethodeCar(16.7);
        System.out.println();

        truck.checkingWeight(50);
        truck.checkingWeight(100);
        System.out.println();

        plane.checkingCapacity(120);
        plane.checkingCapacity(151);
        System.out.println();

        military_plane.shot();
        military_plane.ejection();
    }
}
