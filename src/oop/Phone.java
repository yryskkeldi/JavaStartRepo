package oop;

public abstract class Phone {
    public String phoneNumber;
    public String mark;
    public String model;
    public float memory;

    public Phone(String mark, String model, float memory) {
        this.mark = mark;
        this.model = model;
        this.memory = memory;
    }

    public String answer(){
        return "Вызов принят.";
    }
    public String decline(){
        return "Вызов отклонён.";
    }
    public String call(String str){
        return "Звонит: " + str;
    }
    public abstract String sendMessage();
}
