package models;


import java.util.ArrayList;
import java.util.List;

import models.domainNames;

public class DomainList
{
    public static ArrayList <domainNames> getDomainList()
    {
        ArrayList <domainNames> domainNamesList = new ArrayList<>();

        domainNames Actor = new domainNames();
        Actor.setTitle("Actor");
        //Actor.setPriority("0");
        domainNamesList.add(Actor);

        domainNames Animation= new domainNames();
        Animation.setTitle("Animation");
        //Animation.setPriority("1");
        domainNamesList.add(Animation);





        return domainNamesList;



    }


}
