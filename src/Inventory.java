class Inventory {
    int money;
    int set;
    int batter;
    int redbean;
    int cream;
    int bakedRedbean; //완성된 팥 붕어빵
    int bakedCream; //완성된 슈크림 붕어빵

    public Inventory(int money, int set, int batter, int redbean, int cream, int bakedRedbean, int bakedCream) {
        this.money = money;
        this.set = set;
        this.batter = batter;
        this.redbean = redbean;
        this.cream = cream;
        this.bakedRedbean = bakedRedbean;
        this.bakedCream = bakedCream;
    }

    public void checkInventory(){  //재고 확인 메서드 (상점용)
        System.out.println(
                "    ▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽");
        System.out.println("                         [현재 자금]  ▶︎  "+money+"원       [붕어빵 기계 세트]  ▶︎  "+set+"개"+
                "\n                    [재료]  ▶  밀가루 반죽 : "+batter+"g  |  팥 앙금 : "+redbean+"g  |  슈크림 : "+cream+"g");
        System.out.println("    △△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△");
    }

    public void checkInventory2(SharedBoolean sharedBoolean){  //재고 확인 메서드 (영업중)
        while(sharedBoolean.sharedBoolean){
            System.out.println(
                    "    ▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽");
            System.out.println("               [현재 자금]  ▶︎  "+money+"원"+
                    "\n                   [재료]  ▶  밀가루 반죽 : "+batter+"g  |  팥 앙금 : "+redbean+"g  |  슈크림 : "+cream+"g" +
                    "\n           [만들어진 붕어빵]  ▶  팥 붕어빵 : "+bakedRedbean+"개  |  슈크림 붕어빵 : "+bakedCream+"개");
            System.out.println("    △△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△△");
            break;
        }
    }


}
