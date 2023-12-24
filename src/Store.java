import java.util.Scanner;
public class Store {

    int setPrice = 100000;  //세트 : 틀, 주전자, 반죽통, 빵식힘 판 등
    int batterPrice = 2000;  //밀가루 반죽(1kg)
    int redbeanPrice = 1500;  //팥앙금(1kg)
    int creamPrice = 1000;  //슈크림(1kg)

    public void sell(Inventory inventory, Script script) {
        Scanner scan = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("\n");
            inventory.checkInventory();
            System.out.println("\n    \uFE0E         ☻◁ ☻◁ ☻◁ ☻◁ ☻◁ ☻◁ ☻◁--- \uD83C\uDD38 \uD83C\uDD43 \uD83C\uDD34 \uD83C\uDD3C  \uD83C\uDD42 \uD83C\uDD43 \uD83C\uDD3E \uD83C\uDD41 \uD83C\uDD34 ---☻◁ ☻◁ ☻◁ ☻◁ ☻◁ ☻◁ ☻◁\n" +
                    "            ⎛⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎞\n" +
                    "            |                              ~ \uD835\uDC74 \uD835\uDC6C \uD835\uDC75 \uD835\uDC7C ~                              |\n" +
                    "            |                                                                        |\n" +
                    "            |            1. 밀가루반죽         1kg(1000g)         ₩ 2,000               |\n" +
                    "            |            2. 팥 앙금           1kg(1000g)         ₩ 1,500               |\n" +
                    "            |            3. 슈크림            1kg(1000g)         ₩ 1,000               |\n" +
                    "            |            4. 붕어빵 기계 세트           1개        ₩ 100,000               |\n" +
                    "            |                                                                        |\n" +
                    "            |                ★ \uD835\uDD3C\uD835\uDD67\uD835\uDD56\uD835\uDD5F\uD835\uDD65! 모든 재료 10kg이상 구매 시 10% 할인 ★                |\n" +
                    "            |                                                                        |\n" +
                    "            |                    < 구매종료를 원하시면 '0'을 입력하세요 >                    |\n" +
                    "            ⎝⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎠\n" +
                    "             ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻ ▷☻");
            System.out.println("\n                                 [ 원하시는 구매항목 번호를 입력해주세요 ]\n");
            choice = scan.nextInt();
            switch(choice){
                case 1: //밀가루 반죽
                    System.out.println("" +
                            "                                                     ⦧−−−−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                                    |   밀가루 반죽 몇kg 드릴까요?   |\n" +
                            "                                       ㅡㅡㅡㅡㅡㅡ     \\   1kg단위로 주문가능합니다!   ⎭\n" +
                            "                                     /⌡⌡⌡⌡⌡⌡⌡⌡⌡⌡\\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                     |   ⋂   ⋂   |\n" +
                            "                                     |     ∇     |\n" +
                            "                                     ⌡\\_________/⌡\n" +
                            "                                     /           \\\n" +
                            "                                     |  \\     /  |\n" +
                            "                                     |   \\   /   |");
                    int a = scan.nextInt();
                    if(a >= 10 && inventory.money >= a*batterPrice*0.9){
                        inventory.money -= a*batterPrice*0.9;
                        System.out.println("" +
                                "                                                   ∧___________________________\n" +
                                "                                                 ⎛  밀가루 반죽 "+a+"kg 구입하셨습니다.\n" +
                                "                                                 \\  10% 할인하여 "+a*batterPrice*0.9+"원 입니다.\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.batter +=1000*a;
                        script.sleep1500();
                    }else if(a >= 1 && inventory.money >= a*batterPrice){
                        inventory.money -= a*batterPrice;
                        System.out.println("" +
                                "                                                   ∧_________________________\n" +
                                "                                                 ⎛  밀가루 반죽 "+a+"kg 구입하셨습니다. ⎞\n" +
                                "                                                 \\     "+a*batterPrice+"원 입니다.         /\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.batter +=1000*a;
                        script.sleep1500();
                    }else if(a == 0){
                        script.inputMoreThan1();
                        script.sleep1000();
                    }else{
                        System.out.println("                                        [ 잔액이 부족합니다 ]");
                    }break;
                case 2: //팥 앙금
                    System.out.println("" +
                            "                                                     ⦧−−−−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                                    |     팥 앙금 몇kg 드릴까요?    |\n" +
                            "                                       ㅡㅡㅡㅡㅡㅡ     \\   1kg단위로 주문가능합니다!   ⎭\n" +
                            "                                     /⌡⌡⌡⌡⌡⌡⌡⌡⌡⌡\\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                     |   ⋂   ⋂   |\n" +
                            "                                     |     ∇     |\n" +
                            "                                     ⌡\\_________/⌡\n" +
                            "                                     /           \\\n" +
                            "                                     |  \\     /  |\n" +
                            "                                     |   \\   /   |");
                    int b = scan.nextInt();
                    if(b >= 10 && inventory.money >= b*redbeanPrice*0.9){
                        inventory.money -= b*redbeanPrice*0.9;
                        System.out.println("" +
                                "                                                   ∧__________________________\n" +
                                "                                                 ⎛  팥 앙금 "+b+"kg 구입하셨습니다.\n" +
                                "                                                 \\  10% 할인하여 "+b*redbeanPrice*0.9+"원 입니다.\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.redbean +=1000*b;
                        script.sleep1500();
                    }else if(b >= 1 && inventory.money >= b*redbeanPrice){
                        inventory.money -= b*redbeanPrice;
                        System.out.println("" +
                                "                                                   ∧______________________\n" +
                                "                                                 ⎛  팥 앙금 "+b+"kg 구입하셨습니다. ⎞\n" +
                                "                                                 \\     "+b*redbeanPrice+"원 입니다.      /\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.redbean +=1000*b;
                        script.sleep1500();
                    }else if(b == 0){
                        script.inputMoreThan1();
                        script.sleep1000();
                    }else{
                        System.out.println("                                        [ 잔액이 부족합니다 ]");
                    }break;
                case 3: //슈크림
                    System.out.println("" +
                            "                                                     ⦧−−−−−−−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                                    |     슈크림 몇kg 드릴까요?     |\n" +
                            "                                       ㅡㅡㅡㅡㅡㅡ     \\   1kg단위로 주문가능합니다!   ⎭\n" +
                            "                                     /⌡⌡⌡⌡⌡⌡⌡⌡⌡⌡\\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                     |   ⋂   ⋂   |\n" +
                            "                                     |     ∇     |\n" +
                            "                                     ⌡\\_________/⌡\n" +
                            "                                     /           \\\n" +
                            "                                     |  \\     /  |\n" +
                            "                                     |   \\   /   |");
                    int c = scan.nextInt();
                    if(c >= 10 && inventory.money >= c*creamPrice*0.9){
                        inventory.money -= c*creamPrice*0.9;
                        System.out.println("" +
                                "                                                   ∧__________________________\n" +
                                "                                                 ⎛  슈크림 "+c+"kg 구입하셨습니다.\n" +
                                "                                                 \\  10% 할인하여 "+c*creamPrice*0.9+"원 입니다.\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.cream +=1000*c;
                        script.sleep1500();
                    }else if(c >= 1 && inventory.money >= c*creamPrice){
                        inventory.money -= c*creamPrice;
                        System.out.println("" +
                                "                                                   ∧______________________\n" +
                                "                                                 ⎛   슈크림 "+c+"kg 구입하셨습니다. ⎞\n" +
                                "                                                 \\     "+c*creamPrice+"원 입니다.       /\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.cream +=1000*c;
                        script.sleep1500();
                    }else if(c == 0){
                        script.inputMoreThan1();
                        script.sleep1000();
                    }else{
                        System.out.println("                                        [ 잔액이 부족합니다 ]");
                    }break;
                case 4: //기계 세트
                    System.out.println("" +
                            "                                                     ⦧−−−−−−−−−−−−−−−−−−−¬\n" +
                            "                                                    |   붕어빵 기계 몇 세트   |\n" +
                            "                                       ㅡㅡㅡㅡㅡㅡ     \\      드릴까요?       ⎭\n" +
                            "                                     /⌡⌡⌡⌡⌡⌡⌡⌡⌡⌡\\     ⩗¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" +
                            "                                     |   ⋂   ⋂   |\n" +
                            "                                     |     ∇     |\n" +
                            "                                     ⌡\\_________/⌡\n" +
                            "                                     /           \\\n" +
                            "                                     |  \\     /  |\n" +
                            "                                     |   \\   /   |");
                    int d = scan.nextInt();
                    if(d >= 1 && inventory.money >= d*setPrice){
                        inventory.money -= d*setPrice;
                        System.out.println("" +
                                "                                                   ∧_________________\n" +
                                "                                                 ⎛   "+d+"세트 구입하셨습니다. ⎞\n" +
                                "                                                 \\   "+d*setPrice+"원 입니다.   /\n" +
                                "                                                  ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                        inventory.set +=d;
                        script.sleep1500();
                    }else if(d == 0){
                        script.inputMoreThan1();
                        script.sleep1000();
                    }else {
                        System.out.println("                                        [ 잔액이 부족합니다 ]");
                    }break;
                case 0:
                    System.out.println("                                         [ 구매를 종료합니다 ]\n\n\n\n\n\n\n\n");
                    script.sleep1500();
                    break;
                default:
                    System.out.println("                                         [ 잘못된 선택입니다 ]");
            }if(choice == 0) {
                break;
            }
        }

    } //sell 메서드


}
