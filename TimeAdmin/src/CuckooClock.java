class CuckooClock implements TimeAdmin{
    public void update(Subject subject){
        for(int i = 0; i < ((ConcreteSubject)subject).getHour(); i++){
            System.out.println("ぽっぽー！");
        }
    }
}