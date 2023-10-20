public class B7_Project extends World{
    public int red;
    public int blue;
    public int green;
    public void go() {
        plane.loadBackGround("pratriots.png");          //*** new method to load a diffrent JPG
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0,0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        for(int row=1; row<plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
        {
            for(int col=1; col<plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col,row);
                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();
                if(red>199 && green>16 && blue>45){
                    plane.setPixelColor(0,128,0);
                }
                if(red<198 && green>16 && blue>35){
                    plane.setPixelColor(128, 0, 128);
                }
            }
        }
        plane.pausetime = 1;
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.teleport(0,0);
        for(int j = 0; j < 4; j++) {
            plane.move(499);
            plane.turn(90);
        }
        plane.teleport(746,252);
        for(int i = 0; i < 4; i++){
        plane.square(50);
        plane.turn(90);
        plane.move(100);
        }
        plane.teleport(761,642);
        for(int n = 0; n < 6; n++){
            plane.triangle(60);
            plane.turn(60);
            plane.move(100);
        }
    }
}