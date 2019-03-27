package com.infoshare.academy;

import com.infoshare.academy.domain.Knight;
import com.infoshare.academy.domain.Quest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Quest tutorialIsland = new Quest("Fisnish Tutorial Island");
        Quest killTheDragon = new Quest("Kill the Green dragon");

        Knight lancelot = new Knight("Lancelot", 23, tutorialIsland);
        Knight percival = new Knight("Percival",31);
        percival.setQuest(killTheDragon);

        System.out.println(lancelot);
        System.out.println(percival);
    }
}
