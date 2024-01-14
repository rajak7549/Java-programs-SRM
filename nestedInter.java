interface myname {
    void display();

    interface letwork {
        void show();
    }
}

class onlyouter implements myname {
    public void display() {
        System.out.println("This is outer interface ");
    }
}

class onlyinner implements myname.letwork {
    public void show() {
        System.out.println("This is inner interface ");
    }
}

public class nestedInter {
    public static void main(String[] args) {
        onlyouter out=new onlyouter();
        onlyinner in = new onlyinner();

        in.show();
        out.display();
    }

}
