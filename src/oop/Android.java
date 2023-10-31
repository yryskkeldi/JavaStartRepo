package oop;

public class Android extends Phone{

    public Android(String mark, String model, float memory) {
        super(mark, model, memory);
    }

    @Override
    public String sendMessage() {
        return " - написали с устройства \"Андроид\"" ;
    }

    String [] bla = {"На данный момент я занят.", "Перезвоните позже."};

    @Override
    public String call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return "Звонит: " + phoneNumber;
    }
}




