package mane.dz3_1;

class Tranport {
    private double power;
    private double maxspeed;
    private double weight;
    private String mark;

    public double getPowerKV() {
        return power * 0.74;
    }

    public void setTransport(double power, double maxspeed, double weight, String mark) { /* во первых это конструктор, во вторых так делать вредно для здоровья) ,а нужно каждой пер-ной свой сетер*/
        this.power = power;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.mark = mark;
    }

    public void getTransport() {
        System.out.println("ранспорт " + getMark() + ": мощность - " + getPower() + "л.с. это - " + getPowerKV() + "КВт, максимальная скорость - " + getMaxspeed() + ", масса - " + getWeight());
    }

    public double getPower() {
        return power;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public double getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }
}

class Ground extends Tranport {
    private int number_wheels;
    private double fuel_rate;

    public void setGround(double power, double maxspeed, double weight, String mark,
                          int number_wheels, double fuel_rate) {
        setTransport(power, maxspeed, weight, mark);
        this.number_wheels = number_wheels;
        this.fuel_rate = fuel_rate;
    }

    public void getGround() {
        getTransport();
        System.out.println("ко-во колес - " + getNumber_wheels() + ", расход топлива - " + getFuel_rate() + "л/100 км");
    }

    public int getNumber_wheels() {
        return number_wheels;
    }

    public double getFuel_rate() {
        return fuel_rate;
    }
}

class Passenger extends Ground {
    private String type_car_body;
    private int number_passengers;

    public void setPassenger(double power, double maxspeed, double weight, String mark,
                             int number_wheels, double fuel_rate,
                             String type_car_body, int number_passengers) {
        setGround(power, maxspeed, weight, mark,
                number_wheels, fuel_rate);
        this.type_car_body = type_car_body;
        this.number_passengers = number_passengers;
    }

    public void getPassenger() {
        getGround();
        System.out.println("тип кузова авто - " + getType_car_body() + ", ко-во пассажиров - " + getNumber_passengers());
    }

    public String getType_car_body() {
        return type_car_body;
    }

    public int getNumber_passengers() {
        return number_passengers;
    }

    public void specialMethodeCar(double time) {
        System.out.print("За время " + time + " ч, автомобиль " + getMark() + " двигаясь с максимальной скоростью " + getMaxspeed() + " км/ч проедет ");
        distanceCalculation(getMaxspeed(), time);
        System.out.print(" км и израсходует ");
        fuelCalculation(getFuel_rate(), getMaxspeed(), time);
        System.out.println(" литров топлива. ");
    }


    private void distanceCalculation(double max_speed, double time) {
        double distance = max_speed * time;
        System.out.print(distance);
    }

    private double fuelCalculation(double fuel_rate, double max_speed, double time) {
        double distance = max_speed * time;
        return fuel_rate / distance;
    }
}

class Truck extends Ground {
    private double capacity;

    public void setTruck(double power, double maxspeed, double weight, String mark,
                         int number_wheels, double fuel_rate,
                         double capacity) {
        setGround(power, maxspeed, weight, mark,
                number_wheels, fuel_rate);
        this.capacity = capacity;
    }

    public void getTruck() {
        getGround();
        System.out.println("грузоподъемность - " + getCapacity() + "тон");
    }

    public double getCapacity() {
        return capacity;
    }

    public void checkingWeight(double weight) {
        if (weight < 0) {
            System.out.println("Количество груза введено не верно");
        } else {
            if (getCapacity() >= weight) {
                System.out.println("Грузовик загружен");
            } else {
                System.out.println("Вам нужен грузовик побольше");
            }
        }
    }
}

class Air extends Tranport {
    private double wingspan;
    private double runway;

    public void setAir(double power, double maxspeed, double weight, String mark,
                       double wingspan, double runway) {
        setTransport(power, maxspeed, weight, mark);
        this.wingspan = wingspan;
        this.runway = runway;
    }

    public void getAir() {
        getTransport();
        System.out.println("размах крыльев - " + getWingspan() + "м, минимальная длинна взлетной полосы - " + getRunway());
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getRunway() {
        return runway;
    }
}

class Civilian extends Air {
    private int num_pasengers;
    private boolean business_class;

    public void setCivilian(double power, double maxspeed, double weight, String mark,
                            double wingspan, double runway,
                            int num_pasengers, boolean business_class) {
        setAir(power, maxspeed, weight, mark,
                wingspan, runway);
        this.num_pasengers = num_pasengers;
        this.business_class = business_class;
    }

    public void getCivilian() {
        getAir();
        System.out.println("ко-во пассажиров - " + getNum_pasengers() + ", бизнес класс есть - " + isBusiness_class());
    }

    public int getNum_pasengers() {
        return num_pasengers;
    }

    public boolean isBusiness_class() {
        return business_class;
    }

    public void checkingCapacity(int passengers) {
        if (passengers < 0) {
            System.out.println("Число пассажиров введено не верно");
        } else {
            if (getNum_pasengers() >= passengers) {
                System.out.println("Гражданский воздушный транспорт заполнен");
            } else {
                System.out.println("Вам нужен гражданский воздушный транспорт побольше");
            }
        }
    }
}

class Military extends Air {
    private boolean ejection_system;
    private int num_rockets;

    public void setMilitary(double power, double maxspeed, double weight, String mark,
                            double wingspan, double runway,
                            boolean ejection_system, int num_rockets) {
        setAir(power, maxspeed, weight, mark,
                wingspan, runway);
        this.ejection_system = ejection_system;
        this.num_rockets = num_rockets;
    }

    public void getMilitary() {
        getAir();
        System.out.println("есть система катапультирования - " + isEjection_system() + ", ко-во ракет - " + getNum_rockets());
    }

    public boolean isEjection_system() {
        return ejection_system;
    }

    public int getNum_rockets() {
        return num_rockets;
    }

    public void shot() {
        int num = getNum_rockets();
        if (num != 0) {
            while (num > 0) {
                System.out.println("Ракета пошла... ");
                num--;
            }
        } else {
            System.out.println("Боеприпасы отсутсвуют");
        }
    }

    public void ejection() {
        if (isEjection_system()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
