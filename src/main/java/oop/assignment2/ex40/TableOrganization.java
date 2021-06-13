package oop.assignment2.ex40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TableOrganization {

    static ArrayList<String> firstName = new ArrayList<String>();
    static ArrayList<String> lastName = new ArrayList<String>();
    static ArrayList<String> sortList = new ArrayList<String>();
    static ArrayList<String> position = new ArrayList<String>();
    static ArrayList<String> sepDate = new ArrayList<String>();
    static ArrayList<String> updatedList = new ArrayList<String>();
    static ArrayList<String> foundList = new ArrayList<String>();

    public static void initLists() {

        firstName.add("John");
        firstName.add("Tou");
        firstName.add("Michaela");
        firstName.add("Jake");
        firstName.add("Jacquelyn");
        firstName.add("Sally");

        lastName.add("Johnson");
        lastName.add("Xiong");
        lastName.add("Michaelson");
        lastName.add("Jacobson");
        lastName.add("Jackson");
        lastName.add("Webber");

        position.add("Manager");
        position.add("Software Engineer");
        position.add("District Manager");
        position.add("Programmer");
        position.add("DBA");
        position.add("Web Developer");

        sepDate.add("2016-12-31");
        sepDate.add("2016-10-05");
        sepDate.add("2015-12-19");
        sepDate.add("");
        sepDate.add("");
        sepDate.add("2015-12-18");

        sortList.add("Johnson");
        sortList.add("Xiong");
        sortList.add("Michaelson");
        sortList.add("Jacobson");
        sortList.add("Jackson");
        sortList.add("Webber");
    }

    public static void rearrangeLists()
    {
        Collections.sort(sortList);
        int size = sortList.size();
        //String space1 = "";
        //String space2 = "";
        //String space3 = "";
        String[] space1= new String[20];
        String[] space2= new String[20];
        String[] space3= new String[20];

        int sizeName=0;
        int sizePosition=0;
        int sizeSD=0;

        String[] sizeNameS= new String[20];
        String[] sizePositionS= new String[20];
        String[] sizeSDS= new String[20];

        String compare = "--------------------";


        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(sortList.get(i)== lastName.get(j))
                {
                    sizeName=0;
                    sizePosition=0;
                    sizeSD=0;
                    sizeNameS[j]="";

                    sizePositionS[j]="";

                    sizeSDS[j]="";

                    space1[j] = "";
                    space2[j] = "";
                    space3[j] = "";

                    sizeNameS[j]=(String)firstName.get(j) + " "+ (String)lastName.get(j);
                    sizeName=sizeNameS[j].length();

                    sizePositionS[j]= (String)position.get(j);
                    sizePosition=sizePositionS[j].length();

                    sizeSDS[j]= (String)sepDate.get(j);
                    sizeSD=sizeSDS[j].length();

                    for(int k=0;k<compare.length();k++)
                    {

                        if(sizeName<compare.length())
                        {
                            space1[j]= space1[j]+" ";
                            sizeName++;

                        }
                        if(sizePosition<compare.length())
                        {
                            space2[j]= space2[j]+" ";
                            sizePosition++;

                        }
                        if(sizeSD<compare.length())
                        {
                            space3[j]= space3[j]+" ";
                            sizeSD++;

                        }



                    }
                    updatedList.add(firstName.get(j)+" " +lastName.get(j)+space1[j]+"| "+position.get(j)+space2[j]+"| "+sepDate.get(j));
                }

            }
        }
        //System.out.println(sepDate.get(2));
        //System.out.println(updatedList.get(2));
    }

    public static void searchLists(String searchS)
    {
        String temp;
        for(int i=0; i< updatedList.size();i++)
        {
            temp = updatedList.get(i).substring(0,searchS.length());
            if(searchS.equals(temp))
            {
                foundList.add(updatedList.get(i));
            }
        }
        searchmapLists(foundList);
    }

    private static void searchmapLists(ArrayList<String> foundList) {
        int size = foundList.size();
        String temp= "";
        HashMap<Integer,String> mymap = new HashMap<Integer,String>();

        System.out.println("");
        System.out.println("");
        System.out.println("Name                | Position            | Separation Date");
        System.out.println("--------------------|---------------------|----------------");
        for(int i=0; i<size;i++)
        {
            temp = foundList.get(i);
            mymap.put(i,temp);
            System.out.println(mymap.get(i));
        }

    }


    public static void allmapLists(){
        int size = updatedList.size();
        String temp= "";
        HashMap<Integer,String> mymap = new HashMap<Integer,String>();

        System.out.println("");
        System.out.println("");
        System.out.println("Name                | Position            | Separation Date");
        System.out.println("--------------------|---------------------|----------------");
        for(int i=0; i<size;i++)
        {
            temp = updatedList.get(i);
            mymap.put(i,temp);
            System.out.println(mymap.get(i));
        }

    }

}
