//Marc Katz
//HW26
//pd08
//2013-11-18

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, two Characters will be instantiated
    private Character pat;   //Is it man or woman?
    private Character smaug; //Friendly generic monster name, eh?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
        moveCount = 0;
        gameOver = false;
        isr = new InputStreamReader( System.in );
        in = new BufferedReader( isr );
        newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Character, type chosen by user
      =============================================*/
    public void newGame() {

        String s;
        String name = "";
	String chr;
	int typeChr = 0;
        s = "Welcome to Ye Olde RPG!\n";
        s += "\nChoose your difficulty: \n";
        s += "\t1: Easy\n";
        s += "\t2: Not so easy\n";
        s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
        s += "Selection: ";
        System.out.print( s );

        try {
            difficulty = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

	chr = "For your quest, whom doth thy want to be? \n";
	chr += "\t1: Mage\n";
	chr += "\t2: Archer\n";
	chr += "\t3: Ninja\n";
	chr += "\t4: Warrior\n";
	chr += "\t5: Tank\n";
	chr += "Selection: ";
	System.out.print( chr );

        try {
            typeChr = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
        System.out.print( s );

        try {
            name = in.readLine();
        }
        catch ( IOException e ) { }


        //instantiate the player's character
	if (typeChr == 1)
	     pat = new Mage( name );
	else if (typeChr == 2)
	     pat = new Archer( name );
	else if (typeChr == 3)
	     pat = new Ninja( name );
	else if (typeChr == 4)
	     pat = new Warrior( name );
	else
	     pat = new Tank( name );

	System.out.println( pat.about() );

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
            Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {

        int i = 1;
        int d1, d2;
	String monType;

        if ( Math.random() >= ( difficulty / 3.0 ) )
            System.out.println( "Nothing to see here. Move along!" );

        else {
	    if ( Math.random() < 0.5){
		smaug = new Monster();
		monType = "monster";
	    }
	    else{
		smaug = new Ogre();
		monType = "ogre";
	    }

            System.out.println( "Lo, yonder " + monType  + " approacheth!" );
	    System.out.println( smaug.about() );

            while( smaug.isAlive() && pat.isAlive() ) {

                // Give user the option of using a special attack:
                // If you land a hit, you incur greater damage,
                // ...but if you get hit, you take more damage.
                try {
                    System.out.println( "Do you want to do a normal, super, or special attack?" );
                    System.out.println( "\t1: Normal\n\t2: Super\n\t3: Special" );
                    i = Integer.parseInt( in.readLine() );
                }
                catch ( IOException e ) { }

                if ( i == 2 ){
                    pat.specialize();
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack( pat );
		    pat.normalize();
		}
                else if (i == 3){
                    pat.sacrifice();
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack( pat );
		}
                else{
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack( pat );		    
		}

                System.out.println( pat.getName() + " dealt " + d1 +
                                    " points of damage.");

                System.out.println( "Ye Olde " + monType  + " hit back for " + d2 +
                                    " points of damage.");
            }//end while

            //option 1: you & the monster perish
            if ( !smaug.isAlive() && !pat.isAlive() ) {
                System.out.println( "'Twas an epic battle, to be sure... " + 
                                    "You cut ye olde  " + monType  + " down, but " +
                                    "with its dying breath ye olde monster. " +
                                    "laid a fatal blow upon thy skull." );
                return false;
            }
            //option 2: you slay the beast
            else if ( !smaug.isAlive() ) {
                System.out.println( "HuzzaaH! Ye olde " + monType  + " hath been slain!" );
                return true;
            }
            //option 3: the beast slays you
            else if ( !pat.isAlive() ) {
                System.out.println( "Ye olde self hath expired. You got dead." );
                return false;
            }
        }//end else

        return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {

        //loading...
        YoRPG game = new YoRPG();

        int encounters = 0;

        while( encounters < MAX_ENCOUNTERS ) {
            if ( !game.playTurn() )
                break;
            encounters++;
            System.out.println();
        }

        System.out.println( "Thy game doth be over." );

    }//end main

}//end class YoRPG
