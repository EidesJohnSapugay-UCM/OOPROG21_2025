public class DebugBox {
    private int width, length, height;
    
      public DebugBox() {
        width = length = height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }
    
    public double getVolume() {
        return width * length * height;
    }
    
    public static void main(String[] args) {
        DebugBox b1 = new DebugBox();
        b1.showData();
        System.out.println("Volume: " + b1.getVolume());
        
        
        DebugBox b2 = new DebugBox(3, 4, 5);
        b2.showData();
        System.out.println("Volume: " + b2.getVolume());
    }
}
      }
