import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        Staff staff = new Staff();
        Customer customer = new Customer();
        Inventory inventory = new Inventory(200000,0,0,0,0,0,0);
        Bakeware bakeware = new Bakeware();
        Script script = new Script();
        SharedBoolean SB = new SharedBoolean();
        String musicFilePath = "/Users/woosubeen/Desktop/java/메가(java)/BG/Calimba - E's Jammy Jams.wav";
        BGMplayer bgmPlayer = new BGMplayer(musicFilePath);
        Thread musicThread = new Thread(bgmPlayer);

        String name;

        //시작 ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼ ▼

        musicThread.start();
        script.excute();
        name = scan.next();
        System.out.println("                                     "+name+" 붕어빵 가게를 오픈했습니다!");

        boolean button = true;
        while(true){
            script.menu1();
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    while(true){
                        script.askTutorial();
                        choice = scan.nextInt();

                        switch(choice){
                            case 1:
                                script.tutorial(name);
                                script.howToMakeBread();
                            case 2:
                                while(true){
                                    script.menu2();
                                    choice = scan.nextInt();
                                    switch(choice){
                                        case 1: //재료상점
                                            store.sell(inventory, script);
                                            break;
                                        case 2: //영업시작
                                            while(true){
                                                SB.sharedBoolean = true;
                                                while(SB.sharedBoolean){
                                                    customer.order(SB);
                                                }
                                                SB.sharedBoolean2 = true;
                                                while(SB.sharedBoolean2){
                                                    script.menu3();
                                                    choice = scan.nextInt();
                                                    switch(choice){
                                                        case 1:
                                                            if(inventory.set >= 1){
                                                                SB.sharedBoolean = true;
                                                                bakeware.empty(script);
                                                                inventory.checkInventory2(SB);

                                                                bakeware.batter(inventory,script, SB);
                                                                inventory.checkInventory2(SB);

                                                                bakeware.filling(inventory, script, SB);
                                                                inventory.checkInventory2(SB);

                                                                bakeware.batter2(inventory, script, SB);
                                                                inventory.checkInventory2(SB);

                                                                bakeware.remove(inventory, script, SB);
                                                                inventory.checkInventory2(SB);

                                                            }else {
                                                                System.out.println("붕어빵 기계 세트가 최소 1개 이상 필요합니다.");
                                                            }break;

                                                        case 2: //붕어빵 전달 및 계산
                                                            SB.sharedBoolean = true;
                                                            while(SB.sharedBoolean){
                                                                staff.inputNumber();
                                                                staff.checkOut(customer, inventory, script, SB);
                                                            }break;
                                                        case 3: //영업종료
                                                            SB.sharedBoolean2 = false;
                                                            break;
                                                        default:
                                                            script.inputWrongNumber();
                                                    }
                                                }
                                                if(false){
                                                    break;
                                                }else if(choice == 3){
                                                    break;
                                                }
                                            }break;

                                        case 3:  //게임종료
                                            button = true;
                                            while(button){
                                                script.askQuit();
                                                choice = scan.nextInt();
                                                switch(choice){
                                                    case 1:
                                                        System.out.println("                                         [ 게임을 종료합니다 ]");
                                                        return;
                                                    case 2:
                                                        button = false;
                                                        break;
                                                    default:
                                                        script.inputWrongNumber();
                                                }
                                            }break;
                                        default:
                                            script.inputWrongNumber();
                                    }
                                }
                            default:
                                script.inputWrongNumber();
                        }
                    }
                case 2:
                    System.out.println("                                         [ 게임을 종료합니다 ]");
                    return;
                default:
                    script.wrongChoice();
                    break;
            }
        }


    }//main

}