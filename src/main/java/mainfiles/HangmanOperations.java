package mainfiles;


/**
* mainfiles/HangmanOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from mainfiles.idl
* Tuesday, May 1, 2018 6:52:26 PM PHT
*/

public interface HangmanOperations 
{
  boolean start (String name);
  String guessedWord (String name);
  short play (String name, char guess);
  boolean inPlay (String name);
  void shutdown ();
  short length (String name);
} // interface HangmanOperations
