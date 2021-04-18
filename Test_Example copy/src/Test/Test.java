package Test;

import for_human.Human;
import service.HumanService;

public class Test {
    public static void main(String[] args) {
        HumanService humanService=new HumanService();
        Human human1=humanService.create();
        Human human2=humanService.create();
        Human human3=humanService.create();

        Human hMax=humanService.maxWeightandArmenian(new Human[]{human1,human2,human3});
        System.out.println(hMax.getFirstName());

    }
}
