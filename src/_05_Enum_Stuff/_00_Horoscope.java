package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	//ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
	//LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	 public static void enumMethod() {
		 Zodiac data = Zodiac.LIBRA;
		 switch(data) {
		 case ARIES:{
			 JOptionPane.showMessageDialog(null, "You don’t want things to turn out in a way that suggests that you are the center of the world, but you must put yourself first or no one else will. Understanding that selfishness is sometimes the only boundary you can stick to in order to stay protected, you shouldn’t give up on it today.");
		 }
		 case TAURUS:{
			 JOptionPane.showMessageDialog(null, "Width of Soul and width of mind go hand in hand today. You are willing to experiment, try out a new perspective, and give as many changes to your inner world as needed. There is a hidden sense of joy in solitude and in not having to deal with certain matters just yet.");
		 }
		 case GEMINI:{
			 JOptionPane.showMessageDialog(null, "Paraguay’s flag has a different design on two sides. You have everything that is needed to show yourself in any light you desire, but people expect something else instead. Hold on to your authentic core though no matter what anyone else might do, say or expect from you in the long run.");
		 }
		 case CANCER:{
			 JOptionPane.showMessageDialog(null, "The importance of relationships in your life is becoming clear, as they seem to affect every decision made and every emotion you’ve ever felt. Even though you don’t understand why you are so used to repeating some of your deeply rooted patterns, this is a good time to learn to recognize them and more through them in a healthier way.");
		 }
		 case LEO:{
			 JOptionPane.showMessageDialog(null, "This is a good moment to rely on works of art, music, and creative talent of other people to push you through any trouble that might come your way. You have everything you need to not feel alone or as if you don’t belong in the world around you.");
		 }
		 case VIRGO:{
			 JOptionPane.showMessageDialog(null, "There are more than four hundred definitions to the word “set”. Even though you don’t know all of them, you are still finding your way around the dictionary and know how to speak your mind when you are ready to share whatever might be for sharing.");
		 }
		 case LIBRA:{
			 JOptionPane.showMessageDialog(null, "Masculine and feminine energies are in a strange balance within and you know exactly when to move and when to wait for things to come your way. Still, your mind is a bit too quick to give time for solid and practical moves.");
		 }
		 case SCORPIO:{
			 JOptionPane.showMessageDialog(null, "You never really understood superficial dialogue that doesn’t seem to have a purpose found in words. The deed of connecting through well-known conditions of society is a positive point right now, but you still need someone you can talk to about the less common topics.");
		 }
		 case SAGITTARIUS:{
			 JOptionPane.showMessageDialog(null, "James Buchanan, former U. S. President, used to buy slaves in one state only to free them in another. Beliefs that make you different from all other people in your life shouldn’t be the source of your insecurities, especially not when your immunity to outer influences should be as high as possible.");
		 }
		 case CAPRICORN:{
			 JOptionPane.showMessageDialog(null, "You don’t know what the smartest move might be at the moment, but you are sure about the feel and the atmosphere that you wish to pursue. Some things are going your way even though they seem irrational and out of focus in more ways than one.");
		 }
		 case AQUARIUS:{
			 JOptionPane.showMessageDialog(null, "Remind yourself of your own sensitivity today, before expecting miracles from your own deeds and struggles. You don’t have to get everything done all at once, especially not at a time like this, when there are obvious elephants in the room that have to be acknowledged.");
		 }
		 case PISCES:{
			 JOptionPane.showMessageDialog(null, "Sticky rice was mortar used to build the Great Wall of China. Even though you never thought that some methods and ideas will work, they obviously have their own place at the moment and have been needed, just as they are, to give balance to your world.");
		 }
		 }
	 }
	// 3. Make a main method to test your method
	
}
