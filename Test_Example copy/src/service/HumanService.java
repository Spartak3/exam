package service;

import for_human.Human;

import java.util.Scanner;

public class HumanService {

    public Human create()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter firstName");
        String firstName=scanner.next();
        System.out.println("Please enter lastName");
        String lastName=scanner.next();
        System.out.println("Please enter year");
        int year=scanner.nextInt();
        System.out.println("Please enter weight");
        int weight=scanner.nextInt();
        System.out.println("Please enter geneder (m/f)");
        char geneder=scanner.next().charAt(0);
        System.out.println("Please eneter is Armenian (y/n)");
        boolean isArmenian=scanner.next().toString().equals("y");

        Human human=new Human(firstName,lastName,year);
        human.setArmenian(isArmenian);
        human.setGender(geneder);
        human.setWeight(weight);
        human.printInfo();
        return human;
    }


    public Human maxWeightandArmenian(Human[] humans)
    {
        Human human=null;
        for (int i=0;i<humans.length;i++)
        {
            if(humans[i].isArmenian())
            {
                if(human==null)
                    human=humans[i];
                else if(humans[i].getWeight()<human.getWeight())
                {
                    human=humans[i];
                }
            }
        }
        return human;
    }



}
