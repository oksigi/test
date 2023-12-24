import java.util.Scanner;

public class Staff {

    Scanner scan = new Scanner(System.in);

    int giveRedbean;
    int giveCream;
    int price = 2000;

    public void inputNumber(){
        System.out.println("                                 [ 손님에게 전달할 붕어빵 개수를 입력해 주세요 ]");
        System.out.println("                                                팥 : ");
        giveRedbean = scan.nextInt();
        System.out.println("                                             슈크림 : ");
        giveCream = scan.nextInt();
    }

    public void checkOut(Customer customer, Inventory inventory,Script script, SharedBoolean sharedBoolean){
        if(giveRedbean <= inventory.bakedRedbean && giveCream <= inventory.bakedCream){
            if(giveRedbean >= 1 && giveCream >= 1){ //팥,슈크림
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "                                                   ㅡㅡㅡㅡ\n" +
                        "                                                  | =  = |\n" +
                        "                                                  \\  ㅇ  /\n" +
                        "                                        ㅡㅡㅡㅡㅡㅡ /      \\\n" +
                        "                                      /          \\      ⦧−−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                        "                                     |           |     /   주문하신 팥 붕어빵 "+giveRedbean+"개,\n" +
                        "                                     |           |    <    슈크림 붕어빵 "+giveCream+"개 나왔습니다.\n" +
                        "                                      \\_________/ /    \\   가격은 "+(giveRedbean*price+giveCream*price)+"원 입니다.\n" +
                        "                                      /         \\/      \\_______________________/\n" +
                        "                                     |   직  원   |\n" +
                        "                                     |           |\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                script.sleep3000();
                if(giveRedbean == customer.redbeanFlavor && giveCream == customer.creamFlavor){
                    script.customerThankyou();
                    script.sleep3000();
                    inventory.bakedRedbean -= giveRedbean;
                    inventory.bakedCream -= giveCream;
                    inventory.money += giveRedbean*price+giveCream*price;
                    sharedBoolean.sharedBoolean = false;
                    sharedBoolean.sharedBoolean2 = false;
                }else if(customer.redbeanFlavor >= 1 && customer.creamFlavor == 0){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    팥 "+customer.redbeanFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\______________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }else if(customer.creamFlavor >= 1 && customer.redbeanFlavor == 0){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    슈크림 "+customer.creamFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\________________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /    제가 주문한 건\n" +
                            "                                          //           \\\\    <    팥 "+customer.redbeanFlavor+"개, 슈크림 "+customer.creamFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\_______________________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }
            }else if(giveRedbean >= 1 && giveCream <= 0){ //팥만
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "                                                   ㅡㅡㅡㅡ\n" +
                        "                                                  | =  = |\n" +
                        "                                                  \\  ㅇ  /\n" +
                        "                                        ㅡㅡㅡㅡㅡㅡ /      \\\n" +
                        "                                      /          \\      ⦧−−−−−−−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                        "                                     |           |     /   주문하신 팥 붕어빵 "+giveRedbean+"개 나왔습니다.\n" +
                        "                                     |           |    <    가격은 "+(giveRedbean*price)+"원 입니다.\n" +
                        "                                      \\_________/ /    \\____________________________/\n" +
                        "                                      /         \\/      \n" +
                        "                                     |   직  원   |\n" +
                        "                                     |           |\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                script.sleep3000();
                if(giveRedbean == customer.redbeanFlavor && giveCream == customer.creamFlavor){
                    script.customerThankyou();
                    script.sleep3000();
                    inventory.bakedRedbean -= giveRedbean;
                    inventory.money += giveRedbean*price;
                    sharedBoolean.sharedBoolean = false;
                    sharedBoolean.sharedBoolean2 = false;

                }else if(customer.redbeanFlavor >= 1 && customer.creamFlavor == 0){ //손님이 팥만 주문했을때
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    팥 "+customer.redbeanFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\______________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }else if(customer.creamFlavor >= 1 && customer.redbeanFlavor == 0){ //손님이 슈크림만 주문했을때
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    슈크림 "+customer.creamFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\________________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    팥 "+customer.redbeanFlavor+"개, 슈크림 "+customer.creamFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\_______________________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }
            }else if(giveCream >= 1 && giveRedbean <= 0){ //슈크림만
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n" +
                        "                                                   ㅡㅡㅡㅡ\n" +
                        "                                                  | =  = |\n" +
                        "                                                  \\  ㅇ  /\n" +
                        "                                        ㅡㅡㅡㅡㅡㅡ /      \\\n" +
                        "                                      /          \\      ⦧−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                        "                                     |           |     /   주문하신 슈크림 붕어빵 "+giveCream+"개 나왔습니다.\n" +
                        "                                     |           |    <     가격은 "+(giveCream*price)+"원 입니다.\n" +
                        "                                      \\_________/ /    \\_______________________________/\n" +
                        "                                      /         \\/\n" +
                        "                                     |   직  원   |\n" +
                        "                                     |           |\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                script.sleep3000();
                if(giveRedbean == customer.redbeanFlavor && giveCream == customer.creamFlavor){
                    script.customerThankyou();
                    script.sleep3000();
                    inventory.bakedCream -= giveCream;
                    inventory.money += giveCream*price;
                    sharedBoolean.sharedBoolean = false;
                    sharedBoolean.sharedBoolean2 = false;
                }else if(customer.creamFlavor >= 1 && customer.redbeanFlavor == 0){ //손님이 슈크림만 주문했을때
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    슈크림 "+customer.creamFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\________________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }else if(customer.redbeanFlavor >= 1 && customer.creamFlavor == 0){//손님이 팥만 주문했을때
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건  /\n" +
                            "                                          //           \\\\    <    팥 "+customer.redbeanFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\______________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                            "                                                           ⦧−−−−−−−−−−−−−−−¬\n" +
                            "                                               ♨\uFE0E♨\uFE0E♨\uFE0E       |  제가 주문한 거랑   |\n" +
                            "                                             ㅡㅡㅡㅡㅡㅡ     \\      달라요 !    ⎭\n" +
                            "                                            /         \\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                           |   \\   /   |\n" +
                            "                                           |     ⋏     |       ⦧−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                            \\_________/       /   제가 주문한 건\n" +
                            "                                          //           \\\\    <    팥 "+customer.redbeanFlavor+"개, 슈크림 "+customer.creamFlavor+"개예요!\n" +
                            "                                         _\\|   손  님   |/_    \\_______________________/\n" +
                            "                                           |           |");
                    script.staffSaySorry();
                }
            }else{
                System.out.println("                                   [ 잘못 입력하셨습니다. 다시 입력해 주세요 ]");
            }
        }else{
            System.out.println("                           [ 현재 가지고 있는 붕어빵이 부족합니다. 개수를 확인해 주세요 ]");
            System.out.println("                                    [ 현재 개수 ▶︎ 팥 "+inventory.bakedRedbean+"개, 슈크림 "+inventory.bakedCream+"개 ]");
            sharedBoolean.sharedBoolean = false;
        }
    }


}
