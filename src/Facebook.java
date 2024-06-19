abstract class Facebook {
    abstract void search();
    void message(){
        System.out.println("Sent a mesaage");
    }
}

class searchPerson extends Facebook{
    @Override
    void search() {
        System.out.println("Serching person...!");
    }
}

class searchImg extends Facebook{
    @Override
    void search() {
        System.out.println("Image serching");
    }
}


