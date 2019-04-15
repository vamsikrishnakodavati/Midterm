package pattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookLibrarian librarian = new BookLibrarian();
		
		BookInformation book1 = new BookInformation("j.k.rowling","In Search of Lost Time", "1980", "Swann's Way, the first part of A la recherche de temps perdu, Marcel Proust's seven-part cycle, was published in 1913. In it, Proust introduces the themes that run through the entire work");
		librarian.AddBook(book1);
		
		BookInformation book2 = new BookInformation("James Joyce","Ulysses","1994","Ulysses chronicles the passage of Leopold Bloom through Dublin during an ordinary day, June 16, 1904. The title parallels and alludes to Odysseus (Latinised into Ulysses)");
		librarian.AddBook(book2);
		
		BookInformation book3 = new BookInformation("Homer","The Iliad ","2000","The Iliad is an epic poem in dactylic hexameters, traditionally attributed to Homer. Set in the Trojan War, the ten-year siege of Ilium by a coalition of Greek states,");
		librarian.AddBook(book3);
		
		BookInformation book4 = new BookInformation("Holmer"," The Odyssey","1800","The Odyssey is one of two major ancient Greek epic poems attributed to Homer. It is, in part, a sequel to the Iliad, the other work traditionally ascribed to Homer");
		librarian.AddBook(book4);
		
		BookInformation book5 = new BookInformation("Madame de La Fayette","The Princess of Cleves ","1962","La Princesse de Clèves is a French novel, regarded by many as the beginning of the modern tradition of the psychological novel, and as a great classic work");
		librarian.AddBook(book5);
		
		BookInformation book6 = new BookInformation("Don Quixote","Miguel de Cervantes","1890","Alonso Quixano, a retired country gentleman in his fifties, lives in an unnamed section of La Mancha with his niece and a housekeeper. He has become obsessed with books of chivalry,");
		librarian.AddBook(book6);
		
		BookInformation book7 = new BookInformation("William Faulkner ","The Sound and the Fury","1993","The Sound and the Fury is set in the fictional Yoknapatawpha County. The novel centers on the Compson family, former Southern aristocrats who are struggling to deal with the dissolution ");
		librarian.AddBook(book7);
		
		BookInformation book8 = new BookInformation("Malcolm Lowry","Under the Volcano","1982","To describe his perennial theme, Lowry once borrowed the words of the critic Edmund Wilson:the forces in man which cause him to be terrified of himself");
		librarian.AddBook(book8);
		
		BookInformation book9 = new BookInformation("Gustave Flaubert green","A Sentimental Education","1960","The novel describes the life of a young man (Frederic Moreau) living through the revolution of 1848 and the founding of the Second French Empire, and his love for an older woman");
		librarian.AddBook(book9);
		
		BookInformation book10 = new BookInformation("Markus Zusak","The Book Thief","1933","Trying to make sense of the horrors of World War II, Death relates the story of Liesel — a young German girl whose book-stealing and storytelling talents help sustain her family and the Jewish man they are hiding, as well as their neighbors.");
		librarian.AddBook(book10);
		
		BookInformation book11 = new BookInformation("Lios Lowry","The Giver series","1956","In the future, society has eliminated discord, converting everyone to Sameness");
		librarian.AddBook(book11);
		
		BookInformation book12 = new BookInformation("Arthur Rimbaud","A Season in Hell ","2004","With skill and imagination, Bertrand Mathieu gives us an intimacy of the spoken American that allows readers to absorb themselves in Rimbaud's private drama as in an obsessive dream.");
		librarian.AddBook(book12);
		
		BookInformation book13 = new BookInformation("Pierre Choderlos de Laclos","Dangerous Liaison","2015","The complex moral ambiguities of seduction and revenge make Les Liaisons dangereuses (1782) one of the most scandalous and controversial novels in European literature");
		
		BookInformation book14 = new BookInformation("LM montgomery","Anne of Green Gables series","1989","In this collection of eight novels by Lucy Maude Montgomery, Matthew and Marilla Cuthbert, a rather prim and elderly brother and sister pair, send away for an orphan boy to help them run their farm on Canada's Prince Edward Island.");
		librarian.AddBook(book14);
		
		BookInformation book15 = new BookInformation("philip pullman","His Dark Materials series","2011","In this hit series, young Lyra Belacqua tries to prevent kidnapped children from becoming the subject of gruesome experiments; helps Will Parry — a boy from another world — search for his father;");
		librarian.AddBook(book15);
		
		BookInformation book16 = new BookInformation("Dante Alighieri","The Divine Comedy","1953","Belonging in the immortal company of the great works of literature, Dante Alighieri's poetic masterpiece, The Divine Comedy, is a moving human drama, an unforgettable visionary journey");
		librarian.AddBook(book16);
		
		BookInformation book17 = new BookInformation("william goldman","The Princess Bride","1991","This tale of a handsome farm boy who, aided by a drunken swordsman and a gentle giant, rescues a beautiful princess named Buttercup comes with a slyly humorous, metafictional edge");
		librarian.AddBook(book17);
		
		BookInformation book18 = new BookInformation("william golding","Lord of the Flies","2011","The classic study of human nature depicts the degeneration of a group of schoolboys marooned on a desert island. ");
		librarian.AddBook(book18);
		
		BookInformation book19 = new BookInformation("vernicoroth","Divergent series","2014","In a future Chicago, 16-year-old Beatrice Prior must choose among five predetermined factions to define her identity for the rest of her life");
		librarian.AddBook(book19);
		
		BookInformation book20 = new BookInformation("François René De Chateaubriand","Memoirs From Beyond the Grave","2019","Christmas Summary Classics- This series contains summary of Classic books such as Emma, Arne, Arabian Nights, Pride and prejudice, Tower of London,");
		librarian.AddBook(book20);
		
		System.out.printf("Unsorted");
		librarian.printList();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("Alphabetical order of Authors name");
		SortBook field_to_sort_Author = new SortBook("Author");
		librarian.Set_Sortbook(field_to_sort_Author);
		librarian.printList();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		

		System.out.println("Year of publisging from the past to latest");
		SortBook field_to_sort_YearPublished = new SortBook("YearPublished");
		librarian.Set_Sortbook(field_to_sort_YearPublished);
		librarian.printList();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		

		System.out.println("Alphabetical order of Title");
		SortBook field_to_sort_Title = new SortBook("Title");
		librarian.Set_Sortbook(field_to_sort_Title);
		librarian.printList();
		
		
        
		
		
		

	}

}
