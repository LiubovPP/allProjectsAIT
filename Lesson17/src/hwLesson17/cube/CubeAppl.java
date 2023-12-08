package hwLesson17.cube;

import hwLesson17.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3);
        cube1.display();
        cube1.perimeter();
        cube1.square();
        cube1.volume();
        System.out.println();
        Cube cube2 =new Cube(15);
        cube2.display();
        cube2.perimeter();
        cube2.square();
        cube2.volume();
        System.out.println();
        Cube cube3 = new Cube(10);
        cube3.display();
        cube3.perimeter();
        cube3.square();
        cube3.volume();
                    }

}
