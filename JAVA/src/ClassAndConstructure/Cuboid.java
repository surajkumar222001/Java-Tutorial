package ClassAndConstructure;

public class Cuboid {
    public static void main(String[] args) {
        int volume;
        // Cuboid stdCuboid = new Cuboid(10,20,30);
        // volume = stdCuboid.volume();
        // System.out.println("Volume of simple cuboid : " + volume);

        // Cuboid stdwithDefaultCuboid = new Cuboid(20,40);
        // volume = stdwithDefaultCuboid.volume();
        // System.out.println("Volume of simple default cuboid : " + volume);

        // Cuboid cube = new Cuboid(10);
        // volume = cube.volume();
        // System.out.println("Volume of  cube : " + volume);


        Cuboid defaultCuboid = new Cuboid();
        volume = defaultCuboid.volume();
        System.out.println(" Volume of default Cuboid : " + volume);
        


    }
    int width , height , depth;
    // public Cuboid(int width ,int height ,int depth){
    //  this.width =width;
    //  this.depth = depth;
    //  this.height=height;
    // }

    // public Cuboid(int width ,int height){
    //     this.width =width;
    //     this.height=height;
    //     this.depth = 10;
    // }

    // public Cuboid(int dimension){
    //     this.width =dimension;
    //     this.height=dimension;
    //     this.depth = dimension;
    // }

    // public  Cuboid(){
    //     this.width =10;
    //     this.height=10;
    //     this.depth = 10;
    // }

    public int volume(){
        return width*height*depth;
    }
    
}
