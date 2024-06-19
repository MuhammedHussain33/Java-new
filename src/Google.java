abstract class Google {
    abstract void search();
    void message(){
        System.out.println("Thank you for using Google !........... ");
    }
}

class searchAll extends Google{
    void search(){
        System.out.println("All Search Results");
    }
}

class searchImages extends Google{
    void search(){
        System.out.println("Image search Results");
    }
}

class searchVedios extends Google{
    void search(){
        System.out.println("Vedio Search Results");
    }
}
