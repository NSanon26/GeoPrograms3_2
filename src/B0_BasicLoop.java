public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
  //      plane.isTrail=true;
   //     for(int x=0;x<5;x=x+1)
   //     {
   //         System.out.println(x);
     //       plane.square(100);

     //   }
   // }
        GridOfSquares();
}

public void GridOfSquares(){
        int xValue = 0;
    plane.teleport(6,5);
        for(int j = 0; j<30; j++){
            for(int i = 0; i < 30; i++){

                plane.pausetime = 1;
                plane.setColor(200,0,0);
                plane.isTrail = true;
                plane.square(25);
                plane.isTrail = false;
                plane.move(25);
            }
            xValue += 25;
            plane.teleport(xValue,0);
        }



    }
}
