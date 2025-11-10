class Box {
    int length, width, height;

    
    Box() {
       length = width = height = 10;
    }

    Box(int side) {
        length = width = height = side;
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
    }

    public static void main(String[] args) {
        Box b1 = new Box();          
        b1.display();

        Box b2 = new Box(5);          
        b2.display();

        Box b3 = new Box(2, 3, 4);    
        b3.display();
    }
}