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

        domainNames Art_Director= new domainNames();
        Art_Director.setTitle("Art Director");
        //Animation.setPriority("1");
        domainNamesList.add(Art_Director);

        domainNames Cinematographer= new domainNames();
        Cinematographer.setTitle("Cinematographer");
        //Animation.setPriority("1");
        domainNamesList.add(Cinematographer);

        domainNames Director= new domainNames();
        Director.setTitle("Director");
        //Animation.setPriority("1");
        domainNamesList.add(Director);

        domainNames Editor= new domainNames();
        Editor.setTitle("Director");
        //Animation.setPriority("1");
        domainNamesList.add(Editor);

        domainNames Film_gear= new domainNames();
        Film_gear.setTitle("Film Gear");
        //Animation.setPriority("1");
        domainNamesList.add(Film_gear);

        domainNames Film_critic= new domainNames();
        Film_critic.setTitle("Film Critic");
        //Animation.setPriority("1");
        domainNamesList.add(Film_critic);

        domainNames MD= new domainNames();
        MD.setTitle("Music Director");
        //Animation.setPriority("1");
        domainNamesList.add(MD);

        domainNames PD= new domainNames();
        PD.setTitle("Producer");
        //Animation.setPriority("1");
        domainNamesList.add(PD);

        domainNames SW= new domainNames();
        SW.setTitle("Screenwriter");
        //Animation.setPriority("1");
        domainNamesList.add(SW);

        domainNames ScW= new domainNames();
        ScW.setTitle("Screenwriter");
        //Animation.setPriority("1");
        domainNamesList.add(ScW);

        domainNames SD= new domainNames();
        SD.setTitle("Sound Designer");
        //Animation.setPriority("1");
        domainNamesList.add(SD);







        return domainNamesList;



    }


}
