import java.util.Random;

public class Customer {

    int redbeanFlavor;
    int creamFlavor;

    public void order(SharedBoolean sharedBoolean){
        Random random = new Random();
        redbeanFlavor = random.nextInt(6);
        creamFlavor = random.nextInt(6);

        System.out.println("\n\n                                            [ 손님이 왔습니다 ]\n\n");

        if(redbeanFlavor >= 1 && creamFlavor >= 1){
            System.out.println("" +
                    "                                                             ⦧−−−−−−−−−−−−−−−−−¬\n" +
                    "                                                            |  팥 "+redbeanFlavor+"개, 슈크림 "+creamFlavor+"개");
            System.out.println("" +
                    "                                               ㅡㅡㅡㅡㅡㅡ     \\    주세요 ~        ⎭\n" +
                    "                                              /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                    "                                             |   ≡   ≡   |\n" +
                    "                                             |     ⊖     |\n" +
                    "                                              \\_________/\n" +
                    "                                              /         \\\n" +
                    "                                             |   손  님   |\n" +
                    "                                             |           |");
            sharedBoolean.sharedBoolean = false;
        }else if(redbeanFlavor >= 1 && creamFlavor <= 0){
            System.out.println("" +
                    "                                                             ⦧−−−−−−−−−−−−−¬\n" +
                    "                                                            |     팥 "+redbeanFlavor+"개");
            System.out.println("" +
                    "                                               ㅡㅡㅡㅡㅡㅡ     \\    주세요 ~    ⎭\n" +
                    "                                              /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                    "                                             |   ≡   ≡   |\n" +
                    "                                             |     ⊖     |\n" +
                    "                                              \\_________/\n" +
                    "                                              /         \\\n" +
                    "                                             |   손  님   |\n" +
                    "                                             |           |");
            sharedBoolean.sharedBoolean = false;
        }else if(creamFlavor >= 1 && redbeanFlavor <= 0){
            System.out.println("" +
                    "                                                             ⦧−−−−−−−−−−−−−¬\n" +
                    "                                                            |    슈크림 "+creamFlavor+"개");
            System.out.println("" +
                    "                                               ㅡㅡㅡㅡㅡㅡ     \\     주세요 ~   ⎭\n" +
                    "                                              /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                    "                                             |   ≡   ≡   |\n" +
                    "                                             |     ⊖     |\n" +
                    "                                              \\_________/\n" +
                    "                                              /         \\\n" +
                    "                                             |   손  님   |\n" +
                    "                                             |           |");
            sharedBoolean.sharedBoolean = false;
        }else if(redbeanFlavor == 0 && creamFlavor == 0){
        }
    }




}
