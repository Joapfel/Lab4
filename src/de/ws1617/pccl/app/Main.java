package de.ws1617.pccl.app;

import java.io.IOException;

import de.ws1617.pccl.grammar.Grammar;
import de.ws1617.pccl.grammar.GrammarUtils;
import de.ws1617.pccl.grammar.Lexicon;
import de.ws1617.pccl.grammar.NonTerminal;
import de.ws1617.pccl.search.Automaton;

public class Main {

	public static void main(String[] args) {
		
		
		// read runtime arguments
		try {
			
			Grammar grammar = GrammarUtils.readGrammar(args[0]);
			Lexicon lexicon = GrammarUtils.readLexicon(args[1]);
			NonTerminal startSymbol = new NonTerminal(args[2]);
			String input = args[3];

			
			Automaton automat = new Automaton(grammar, lexicon, startSymbol);
			
		
			if(automat.recognize(input)){
				System.out.println("Processed by: ");
				System.out.println("[Non-deterministic finite automaton]" + "\n");
				System.out.println("User input string: ");
				System.out.println("[" + input + "]" + "\n");
				System.out.println("Accepted: ");
				System.out.println("[yes]");
			}else{
				System.out.println("Processed by: ");
				System.out.println("[Non-deterministic finite automaton]" + "\n");
				System.out.println("User input string: ");
				System.out.println("[" + input + "]" + "\n");
				System.out.println("Accepted: ");
				System.out.println("[no]");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
