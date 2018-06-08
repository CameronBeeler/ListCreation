package com.cambeeler;

public class Main {

    public static void main(String[] args) {
        // write your code here

        LL newList = new LL();
        String stringData = "Saint Louis.kansas.Denver.Darwin.Brisbane.Perth.Melbourne.Valley Forge.Canberra.Adelaide.Sydney.Canberra.Dallas.Houston.Austin.Chicago.New York.San Diego.Seattle  ";

        String[] data = stringData.split("\\.");
        int index=0;
        System.out.println("\n");
        for (String s : data) {
            System.out.println("Value = " + s);
            newList.addItem(s);
            index++;
        }
        System.out.println("data set size " + index + "\n");
//        newList.removeItem("garbage");
//        newList.removeItem("Perth");
//        newList.removeItem("Sydney");
//        newList.removeItem("Adelaide");
//        newList.removeItem("Darwin");
//        newList.removeItem("Melbourne");
//        newList.removeItem("Brisbane");
//        newList.removeItem("Canberra");
//        newList.removeItem("Perth");







        newList.printList();


    }
}
