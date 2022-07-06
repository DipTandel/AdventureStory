// AdventureStory
// May 8th, 2021
// ICS3U1, Dip
// Write a choice your own path type story with at least 3 choices

import java.util.Scanner;
public class AdventureStory {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    
    //The beginning of the story
    System.out.println("You and Dave are coming home from a long trip");
    System.out.println("Its late and dark, you're both tired, and your GPS says there is traffic on the route ahead");
    System.out.println(" \"Bro, theres way too much traffic this way, lets change the route man\"  ");
    System.out.println("All of a sudden, you both hear a car behind you, its going fast and it doesn't look like it plans on stopping");
    System.out.println("Dave steers to the right to avoid the car");
    System.out.println("The car hits the brakes and stops on your left, the man inside the car looks at you for a second");
    System.out.println("He seems to be wearing a dark hoodie and you notice a bright green face....");
    System.out.println("Dave is a bit of a hothead and starts to step out of the car to approach the driver");
    System.out.println("Type \"1\" to follow Dave, or Type \"2\" to convice Dave to ignore him and change routes");
    int decision1 = in.nextInt();  //The first decision the user has to make
    
    if (decision1 == 1) { //if the user follows dave then..
      System.out.println("The both of you approach the man as he rolls down his window");
      System.out.println(" \"IS THAT A HUMAN SIZED FROG\", Dave shouts ");
      System.out.println("You and Dave are both very confused as to how a frog is driving a car");
      System.out.println("Kermit: \"Shhhh, you clowns have discovered my existance\" ");
      System.out.println(" \"HE FRICKIN TALKS TOOO\", Dave shouts in excitement");
      System.out.println(" \"This is serious business, im on a secret mission, you guys can either join me.. or not\", Kermit says menacingly");
      System.out.println("Type \"1\" to get in Kermit's car, or Type \"2\" to reject his offer");
      int decision2 = in.nextInt(); //The second decision the user must make      
      if (decision2 == 1) { //if the user gets in the car then...
        System.out.println(" \"Good. Get in\" ");
        System.out.println("You and Dave get in the car as Kermit starts to accelerate");
        System.out.println(" \"What's the mission\" you ask ");
        System.out.println(" \"World domination of the frogs\" ");
        System.out.println(" \"WHAT!, you shout\" ");
        System.out.println(" \"Well you don't really have a choice, you two are the ones that decided to approach me\" ");
        System.out.println(" Dave: \"YOU'RE THE ONE THAT WAS DRIVING LIKE AN IDIOT AND WE'RE NOT SUPPOSED TO NOTICE YOU!");
        System.out.println(" Evil Kermit: \"HEY I NEEDED TO GET AWAY FROM THE B.. evidence\" ");
        System.out.println(" *moment of silence as you and Dave look at each other..*");
        System.out.println("Dave attacks the frog menace as you try to unlock the doors");
        System.out.println("Evil Kermit is losing control on the car");
        System.out.println("You unlock the doors");
        System.out.println(" *zap* ");
        System.out.println("You look at the front seat only to see Dave lying on the seat");
        System.out.println(" \"WHAT HAVE YOU DONE\" ");
        System.out.println(" \"You two should've followed my orders, Dont fail me again\" ");
        System.out.println("Type \"1\" to fight Evil Kermit, or Type \"2\" to do as he says and follow his orders from now on");
        int decision3 = in.nextInt(); //The third decision the user must make        
        if (decision3 == 1) { //if the user fights Evil Kermit, then..
          System.out.println("You lunge at Evil Kermit");
          System.out.println("*zap-zippity-zapzap*");
          System.out.println("current flows through your body, immobilizing you instantly ");
          System.out.println("you feel pain, but are unable to scream");
          System.out.println("you die");
          System.out.println(" \"UNLIMITEDDD POWARRRRRRRRR\" ");
        }
        else { //if the user follows Evil Kermit, then..
          System.out.println("You see no choice but to follow Evil Kermit's orders");
          System.out.println("Humans were no match for Evil Kermit");
          System.out.println("They either died fighting, or were forced to work for him");
          System.out.println("Evil Kermit and the frogs now rule the Earth");
        }
      }      
      else { //if the user doesnt get in the car in the first place, then..
        System.out.println(" \"ummm I think we're ok\", you say ");
        System.out.println(" Dave: \"DUDDDEEEEEE ITS A TALKING FROG LETS GO MAN\" ");
        System.out.println(" \"are you fried? dude looks sus\" ");
        System.out.println(" Kermit: \"What?? I'm just a frog, I mean no harm\" ");
        System.out.println(" \"ok whats your mission then?\" ");
        System.out.println(" Evil Kermit: \"GET IN THE CAR OR DIE\" ");
        System.out.println("You run to your car");
        System.out.println("*zap*, the frog menace tries to zap you but Dave moves his arm away");
        System.out.println("Dave tosses you the keys as he struggles to keep the frog from harming you two");
        System.out.println(" \"AHHHH, you have failed me\", Evil Kermit says to Dave ");
        System.out.println("The car starts and you look at Dave, \"GET IN LETS GOOOOO\" ");
        System.out.println("Dave runs and gets in the car");
        System.out.println("Evil Kermit follows you in his car");
        System.out.println(" \"HOW DO WE STOP AN EVIL FROG FROM TRYING TO KILL US\", says Dave ");
        System.out.println(" \"MAN I DONT KNOW\" ");
        System.out.println(" *zap-zippty-zip-zap-zap* ");
        System.out.println(" Dave: \"HE TRIED TO FRICKIN ELECTRICUTE US, DRIVE FASTER MY GUY \" ");
        System.out.println("You see a sharp turn ahead, Type \"1\" to turn left, or Type \"2\" to turn right");
        int decision3 = in.nextInt(); //The third decision the user must make
        if (decision3 == 1) { //if user turns left, then...
          System.out.println("You manage to make the turn but Evil Kermit does not because of his terrible driving skills");
          System.out.println("Evil Kermit crashes into a pole");
          System.out.println(" \"I WILL FIND YOUUUUUUUuuuuuuu\" *voice fades away");
          System.out.println("Dave calls 911");
          System.out.println(" \"HELLO, WE HAVE AN EVIL FROG CHASING US, THIS IS AN EMERGENCY\" ");
          System.out.println("Emergency call operator: \"Stop wasting our time, is this some dumb prank call\" *call ends* ");
          System.out.println(" \"DAVE, ITS A FREAKIN DEAD END\", you say ");
          System.out.println("The both of you see Evil Kermit approaching your car");
          System.out.println(" \"WHAT DO WE DOOOO HE'S GONNA KILl US\" ");
          System.out.println("AT THAT MOMENT, ANOTHER FROG ATTACKS EVIL KERMIT FROM BEHIND");
          System.out.println("You and Dave step out of the car to help him");
          System.out.println(" \"Stay Back, he's dangerous!\", says Good Kermit in a high pitched voice");
          System.out.println(" Evil Kermit: \"JOIN ME, I will train you, we will be unstoppable with our combined power\" ");
          System.out.println(" Good Kermit: \"YOU KILLED MY FATHER\" ");
          System.out.println(" Evil Kermit: \"No... I am your father\" ");
          System.out.println(" Good Kermit: \"YOU LIE\" ");
          System.out.println(" Evil Kermit: \"CHILL IM NOT LY...\" ");
          System.out.println("Good Kermit proceeds to perform a fatality on Evil Kermit");
          System.out.println("Kermit wipes your memory and leaves you back at your homes");
          System.out.println("Nothing ever happened....");
        }
        else { //if user turns right, then...
          System.out.println("You manage to make the turn but Evil Kermit does not because of his terrible driving skills");
          System.out.println("Evil Kermit crashes into a pole");
          System.out.println(" \"YOU WONT GET FARRRR\" ");
          System.out.println(" \"BRO WHERE ARE WE GOING THATS A RAMP\", Dave says");
          System.out.println(" \"THERE IS NO OTHER WAY, WE HAVE TO JUMP IT\" ");
          System.out.println("You jump the ramp, only leading to some sort of secret cave");
          System.out.println("Dave calls 911");
          System.out.println(" \"You won't get any reception here\", says Batman in an odd voice");
          System.out.println(" \"How did you find this cave?\"");
          System.out.println(" \"Why are you talking like that\", says Dave calmly");
          System.out.println(" \"This isn't secret at all, it was literally a ramp away\" ");
          System.out.println("*Evil Kermit enters the cave*");
          System.out.println(" \"I WILL KILL YOU ALL\" ");
          System.out.println("Evil Kermit's plan is immediately shut down as Batman proceeds to use his epic gadgets to make Evil Kermit electricute himself");
          System.out.println("Batman then proceeds to beat the life out of him");
          System.out.println(" \"ayo chill my guy, your gonna kill him\", you say");
          System.out.println(" \"SHUTUP\", he than knocks you and Dave out");
          System.out.println("You wake up at your house with a blurred memory, you and Dave only remember getting chased by a frog");
          System.out.println("You report it to police but they say that you and Dave were probably drunk");
          System.out.println("You later find out in the news that an Evil Frog has been apprehended");
          System.out.println("Some dudes wearing black suits come to your and Dave's houses and they kidnap you");
          System.out.println("They now consider you and Dave as assets to their investigation");
          System.out.println("They keep asking you about some dude in a bat costume and the Evil frog");
        }
      }
    }
    else { //if the user convinces Dave to ignore the driver and choose a different route, then...
      System.out.println(" \"Dave leave it man im tired, lets take a different route and go home\" ");
      System.out.println("Dave gets back in the car, \"what a stupid idiot, cant drive properly\" ");
      System.out.println(" \"Here lets go from this route\" *shows phone ");
      System.out.println("Dave drops you off and goes home");
      System.out.println("As you walk towards your door you notice a figure in the vent");
      System.out.println("Type \"1\" to get a better look, or Type \"2\" to go home");
      int decision2 = in.nextInt(); //the second decision the user must make
      if (decision2 == 1) { //if the user gets a better look, then...
        System.out.println("You try to get a better look.. you get closer..");
        System.out.println(" \"Hello\", it says ");
        System.out.println(" \"IMPOSTER\", you scream");
        System.out.println(" \"I am no imposter, I've been here for years\" ");
        System.out.println(" \"Please, would you let me out?\" ");
        System.out.println("Type \"1\" to let it out, or Type \"2\" to go home");
        int decision3 = in.nextInt(); //the third decision the user must make
        if (decision3 == 1) { //if the user lets it out, then...
          System.out.println("You get a cordless drill and unscrew the vent to let it out");
          System.out.println("As it gets out you realize its pennywise the clown from \"It\" ");
          System.out.println("Pennywise: \"You've made a grave mistake.....\" ");
          System.out.println(" \"Hey man we can talk ab..\" ");
          System.out.println("You've been eaten by Pennywise the clown");
        }
        else { //if the user doesn't let it out, then...
          System.out.println(" \"Fine, I'll find someone else to prey on..\", you hear from behind you as you walk away ");
          System.out.println(" \"Prey?\", you think to yourself, \"they even said they've been there for years, I better call 911\" ");
          System.out.println("You tell the police about the incident and they say that they'll look into it");
          System.out.println("You go to sleep");
          System.out.println("The next day you get a call saying your friend Dave is missing");
          System.out.println("Congratulations, you realize that you indirectly got your friend killed");
          System.out.println("Such a terrible person");
        }
      }
      else { //if the user goes inside, then...
        System.out.println("You decide its probably nothing and go inside");
        System.out.println("Before you sleep, you get a drink of water");
        System.out.println(" \"sip-sip\" ");
        System.out.println(" \"Hi-Ho\", says a high-pitched voice outside your kitchen window");
        System.out.println(" \"AHHHHHH, WHAT THE HECK\" ");
        System.out.println("You quickly reach for a knife");
        System.out.println("Type \"1\" to throw your knife, or \"2\" to listen to him");
        int decision3 = in.nextInt(); //the third decision the user must make
        if (decision3 == 1) { //if the user throws his knife, then...
          System.out.println(" \"Kermit the fro..\" ");
          System.out.println("You stab Kermit before he could even finish his sentence");
          System.out.println(" \"You..Were..The chosen one...\" *dies ");
          System.out.println("You killed Kermit, how could you do such a thing.");
        }
        else { //if user listens to him then...
          System.out.println(" \"Kermit the frog here, im here to ask you for help against my world dominating evil cousin\" ");
          System.out.println(" \"World dominating what\", you ask");
          System.out.println(" \"I have an evil cousin who wants to take over Earth and if you don't help me, you will all be doomed\" ");
          System.out.println("*smash* a window breaks and Evil Kermit appears");
          System.out.println("Evil Kermit: \"You think the two of you can take me down!\" ");
          System.out.println("Kermit: \"Yes!, me and my friend here.. Hey whats your name?\" ");
          String name = in.next(); //saves name as String variable to print later
          System.out.println("Kermit: \"You won't defeat " + name + " and I\" ");
          System.out.println("You and Kermit take down Evil Kermit and save the world from a crisis");
          System.out.println("Kermit: \"Thanks for your help!\" ");
          System.out.println(" \"I did basically nothing though..\", you say ");
          System.out.println("Kermit takes Evil Kermit with him and disapears and you realize that your house is ruined after this fight");
          System.out.println("Now you have to fix your house, and you're in a financial crisis");
        }
      }
    }
  }
}
        
    
        
        
      
      
      
      
      
      
      
