package clg;
import java.awt.event.*;
import java.io.IOException;
import java.awt.*; 
import javax.swing.*; 
public class storage extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton hindi,marathi,back;JTextArea ta;
	public storage() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
	     
		f=new JFrame("Class");
		 setVisible(true);p.setBackground(Color.GREEN);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);
		 ImageIcon img=new ImageIcon("D:\\storage.jpeg");

		 im=new JLabel(img);
		 
		p.add(im);setVisible(true);
		im.setBounds(100,75,1200, 800);

	      String s1[] = { "wheat", "maize", "rice", "fruits","vegetabels","flowers" }; 
	      hindi=new JButton("english");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
	      marathi=new JButton("marathi");	
	      
p.add(c1);setVisible(true);
p.add(hindi);setVisible(true);
p.add(marathi);setVisible(true);

ta=new JTextArea("",20,80);
p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
p.add(sc);
c1.setBounds(100,140, 100, 20);
hindi.setBounds(100, 300, 100, 20);
ta.setBounds(100, 330, 100, 20);
marathi.addActionListener(this);
hindi.addActionListener(this);back=new JButton("<-");back.addActionListener(this);
p.add(back); setVisible(true);
back.setBounds(10,10 ,20, 10);
	}	

 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== hindi)
		{
			if(c1.getSelectedItem()=="wheat") {
				ta.setText(" Hard Wheat / Soft Wheat\r\n"
						+ "Hard wheat has a hard kernel.\r\n"
					
						+ "The kernel is smaller than that of Soft wheat.\r\n"
						+ "\r\n"
						+ "Hard wheat has higher protein because it has a higher gluten content (gluten is a protein). Gluten helps the dough to rise\n"
						+ " by trapping the fermentation gases that come from the added yeast. Conversely, wheat that is lower in gluten content doesn�t\n"
						+ " make as good a rising loaf of bread, but it still works.\r\n"
						+ "\r\n"
						+ "Soft wheat has larger and softer kernels than Hard wheat.\r\n"
						+ "\r\n"
						+ "Soft wheat has less gluten content but is preferably used in pastries, pastas, and cereals.\r\n"
						+ "\r\n"
						+ "Spring Wheat / Winter Wheat\r\n"
						+ "Winter wheat is planted in the fall, it grows over winter and is harvested the following summer.\r\n"
						+ "\r\n"
						+ "Spring wheat is planted in the spring, grows in the summer, and is harvested in the fall.\r\n"
						+ "Red Wheat / White Wheat\r\n"
						+ "Most of the Hard wheat varieties are Red wheat.\r\n"
						+ "\r\n"
						+ "Most of the Soft wheat varieties are White wheat.\r\n"
						+ "\r\n"
						+ "Having said that, there is a Hard White variety of wheat, and is a compromise widely chosen for making bread because of the \n"
						+ ""
						+ "opinion that it tastes a bit better than bread made from Hard Red wheat.");
			}

if(c1.getSelectedItem()=="maize") {
	ta.setText("Conditions for storage\r\n"
			+ "\r\n"
			+ "Maize can be stored for a long period of time (a year of more) if the moisture content is below the safe moisture level (below 14% or 12% and less).\r\n"
			+ "The moisture level should not rise during the storage process by either re-wetting by rain or imbibing moisture from the surrounding air.\r\n"
			+ "The maize must be protected from insects, rodents and birds.\r\n"
			+ "The longer the grain needs to be stored, the lower the required moisture content will need to be.\r\n"
			+ "\r\n"
			+ "Methods of Storage                                                                                                      \r\n"
			+ "\r\n"
			+ "Prior to storage, immediately after harvesting, maize should be dried in the field as much as possible to ensure that it reaches safe moisture level and can then be stored properly.\r\n"
			+ "\r\n"
			+ "Once the products have reached the safe moisture content, they can be stored permanently.\r\n"
			+ "\r\n"
			+ "There are various ways to store maize products depending on the duration of storage and relative humidity of the outside air during the period of storage. ");
}
if(c1.getSelectedItem()=="rice") {
ta.setText(" The first method for storing large amounts of rice is relatively simplistic. Use totes with well-fitting lids. Before packing them away place each bag of rice in the freezer for a week, and then stack the bags in your tote. No need to repackage. Fill the tote, then start on a second"
		+ "Our second long-term storage method for bulk rice is 5-gallon buckets and Diatomaceous Earth. Add Diatomaceous Earth to the rice to destroy eggs and kill any insects that happen to hatch or wander through. You�ll need � cup of Diatomaceous Earth for 5-gallons of rice.\r\n"
		+ "\r\n"
		+ "First, add a thin layer of Diatomaceous Earth to the bottom of the bucket. Then add 4 inches of rice and another layer of Diatomaceous Earth. Repeat until the bucket is within an inch or two of the top then hammer on your lid and add a label.");
}
if(c1.getSelectedItem()=="fruits") {
	ta.setText(" Temperature\r\n"
			+ "Each product handled has its own particular temperature requirements. The time until cooling, temperature stability and its duration need to be considered.\r\n"
			+ "By lowering produce temperature as soon as possible after harvest � generally within four hours � the following effects are achieved:\r\n"
			+ "\r\n"
			+ "Respiration rate is decreased.\r\n"
			+ "Water loss is reduced.\r\n"
			+ "Ethylene production is suppressed.\r\n"
			+ "Sensitivity to ethylene is reduced.\r\n"
			+ "Microbial development is slowed.\r\n"
			+ "Most leafy vegetables and �temperate� fruit � including pome and citrus fruits � are not chill-sensitive and can be stored between 0�C and 2�C for long periods without significant loss of visual quality. Tropical and subtropical fruit and some root vegetables are chill-sensitive and may be damaged at low temperatures. They are generally stored at 13�C or above, although some may be stored safely as low as 5�C if cooled soon after harvest. Temperature must also be stable as changes may affect respiration and marketable quality.\r\n"
			+ "\r\n"
			+ "Relative humidity\r\n"
			+ "Maintaining high humidity around harvested produce reduces water loss, which would result in decreased returns through poor quality (for example, wilting, shrivelling) and loss of saleable weight.\r\n"
			+ "\r\n"
			+ "High humidity should be used with low temperature storage because humidity and warmth combined favour the growth of fungi and bacteria. Although the relative humidity of air increases when it is cooled, it is still necessary to check the relative humidity in a coolroom is satisfactory." );
}if(c1.getSelectedItem()=="vegetables") {
	ta.setText("Fresh vegetables are living organisms, and there is a continuation of life processes in the vegetable after harvest. Changes that occur in the harvested, nonprocessed vegetable include water loss, conversion of starches to sugars, conversion of sugars to starches, flavour changes, colour changes, toughening, vitamin gain or loss, sprouting, rooting, softening, and decay.Some changes result in quality deterioration; others improve quality in those vegetables that complete ripening after harvest. Postharvest changes are influenced by such factors as kind of crop, air temperature and circulation, oxygen and carbon dioxide contents and relative humidity of the atmosphere, and disease-incitant organisms. To maintain the fresh vegetable in the living state, it is usually necessary to slow the life processes, though avoiding death of the tissues, which produces gross deterioration and drastic differences in flavour, texture, and appearance.\r\n"
			+ "\r\n"
			+ "Storage of vegetables contributes to price stabilization by carrying over produce from periods of high production to periods of low production. It also extends the period of consumption of many kinds of vegetables. Storage conditions can contribute to the preservation of the natural living state of the edible portion and to the prevention of deterioration through control of temperature, relative humidity, and the quality of the produce to be stored. Vegetables for storage must be free from mechanical, insect, and disease injury and should be at the proper stage of maturity. and cold (refrigerated) storage are the methods generally employed for vegetables. Common storage, lacking precise control of temperature and humidity, includes the use of insulated storage houses, outdoor cellars, or mounds. Cold storage allows precise regulation of temperature and humidity and maintenance of constant conditions by use of a refrigeration and ventilation system. Temporary storage, suitable only for very brief storage periods, is frequently practiced in the shipping season when large lots are accumulated for carload or truck quantities. The refrigerator car or truck is a means of temporary storage used to protect produce while it is in transit. Short-term storage may last for four or six weeks. Economic factors, such as the probability that prices will increase later in the season, encourage long-term storage of such perishable vegetables as the onion, potato, and sweet potato " );
}if(c1.getSelectedItem()=="flowers") {
	ta.setText(" After Harvest Care\r\n"
			+ "Move flowers to a cool area.\r\n"
			+ "Recut stems under water.\r\n"
			+ "Place flower in solutions depending on the need of the flowers.\r\n"
			+ "After harvesting, flowers are then moved to a cool area where stems can be recut and placed in solutions depending on the specific need of the flowers. Once harvested, flowers continue to transpire and will wilt rapidly. Most flowers will fully recover from wilting if recut and placed in a warm, rehydration solution. Stems are recut by removing about an inch of the end of stems under water prior to placing them in their solution. This helps prevent air bubbles in the water conducting tissue. Air bubbles reduce the uptake of solutions.\r\n"
			+ "\r\n"
			+ "Always treat flowers before they are sleeved to hasten uptake into the stem.\r\n"
			+ "\r\n"
			+ "Importance of Cool Temperatures and High Relative Humidity\r\n"
			+ "Proper temperature management is an important factor for maintaining the quality and vase life of cut flowers. As storage temperatures increase, respiration and water loss increases and wilting occurs. It is important to cool harvested flowers to remove field heat.\r\n"
			+ "\r\n"
			+ "For convenience only, flowers to be sold on that same day can be placed outdoors. Those intended for market at another time should be moved to a cooler as soon as possible with temperatures as close to 33F (most flowers), 41-43F (some flowers such as zinnias and gerberas) or 50F (chilling sensitive flowers) in order to best preserve quality. The best practice is to harvest flowers at their optimum stage and store them at the lowest possible temperature you can provide without causing freezing or chilling injury.\r\n"
			+ "\r\n"
			+ "For sales in retail garden centers and farm stands, all handling and sales should be conducted in a shady area (as cool as possible).\r\n"
			+ "Generally, the lower the temperatures, the longer the flowers last. Most flowers will retain their quality if stored at temperatures near the freezing point (33F). Others, such as those originating from subtropical and tropical regions, develop chilling injury if stored at temperatures below 50F. Symptoms vary depending on plant species and may include darkening or water-soaking of the petals and death of flowers. Flowers such as anthurium, bird-of-paradise, heliconia, certain orchids, as well as others that are susceptible to chilling injury are best stored at temperatures above 50F.\r\n"
			+ "\r\n"
			+ "Relative Humidity is another factor that affects uptake of solution.  There were several recommendations in the literature for suggested relative humidity ranging from 75% to 99%. High relative humidity reduces transpiration and keeps flowers from drying out.\r\n"
			+ "\r\n"
			+ "Water Quality, Hydrating Solutions\r\n"
			+ "Buckets and water used for cut flowers should be clean, buckets disinfected regularly and biocides (unless organic) be added to the solution. Replace the solution often to avoid allowing the solution to become cloudy, which indicates of the presence of high counts of microbes. Dirty water contains bacteria that will prevent uptake of water.\r\n"
			+ "\r\n"
			+ "Another important factor is the specific ions contained in the water. Water quality that is good for human consumption may not be good for cut flowers. For example, fluoride in fluoridated municipal water is very toxic to flowers such as gerbera, gladiolus, and freesia and significantly reduces the vase life of these flowers. Water softeners and water containing high levels of sodium and iron are also toxic to some flowers and should not be used.\r\n"
			+ "\r\n"
			+ "Supplying Food\r\n"
			+ "Once harvested, cut flowers are typically placed in a low light or dark environment where  photosynthesis is at a minimum.  Photosynthesis is a biological process forming carbohydrates (from CO, and H2O in the presence of light), and carbohydrates are needed for the cut flowers to continue to develop. Much of the carbohydrates needed come from starch and sugars stored in the stem, leaves, and petals but the levels may not be adequate.\r\n"
			+ "\r\n"
			+ "In addition to clean, acidified water with a biocide, a continuous supply of food (sugars) is needed by some flowers for maximum postharvest life of the cut flowers. Water and the addition of preservatives to the solution will result in the best performance of many flowers. Numerous brands and mixtures of floral preservatives and flower care products are commercially available and each is formulated for a different purpose. The basic types of flower care products include:\r\n"
			+ "\r\n"
			+ "Hydration solutions\r\n"
			+ "Holding Solutions\r\n"
			+ "Anti-ethylene treatments\r\n"
			+ "Specialized care solutions\r\n"
			+ "Hydrating solutions: After harvest, hydrating solutions are used to facilitate water uptake and restore the turgor of wilted flowers. Hydrating solutions are usually warm water (110F) with a biocide (such as slow release chlorine tablets), acidified to pH 3.5 to 5.0 with citric acid and include a wetting agent. Hydrating solutions are used immediately after harvest and are usually used for a short time, for example four hours. Some growers use hydrating solutions in the field to help prevent flowers from wilting and to restore wilted flowers. Examples of wilt sensitive flowers include veronica, asters and zinnias.\r\n"
			+ "\r\n"
			+ "Holding solutions: In addition to a biocide and acidified water, holding solutions also contain a carbohydrate source (sugar) to encourage bud opening and flower longevity. Holding solutions are usually used after the hydrating solution for several hours for up to two days.\r\n"
			+ "\r\n"
			+ "Depending on the intended use of the preservative, the concentration of each ingredient may vary. For example, a preservative formulated for hard water will contain more citric acid or other acidifiers than the general purpose formula. Many, but not all cut flowers benefit from a solution containing 1 to 2% of sugars and a dilute biocide.\r\n"
			+ "\r\n"
			+ "Vase solutions: (also call flower preservatives) often contain higher concentrations of carbohydrates than holding solutions and are used by the consumer.\r\n"
			+ "\r\n"
			+ "If no commercial preservative is added to the water, it is at least necessary to use clean buckets and clean water.\r\n"
			+ "The next level of improving postharvest care would be to include a biocide such as a solution of 50 ppm bleach (mix three quarter teaspoon of bleach to 1 gallon of water) or preferable slow release chlorine tablets and an acidifier to acidify the water to pH 3.5 to 5.0. Always test the solution on a few stems before placing all flowers in the bleach solution, as some species develop phytotoxicity from the treatment.\r\n"
			+ "\r\n"
			+ "Examples of Flowers in Postharvest Solutions\r\n"
			+ "\r\n"
			+ "Flowers vary in their need for postharvest solutions. For example research at North Carolina State University (NCSU) showed that Eucomois �Sparkling Burgandy� had the longest vase life, up to 43 days in just plain water. The vase life was reduced to 34 days when using holding preservatives; and the use of hydration solution resulted in a reduced vase life of 19 days; and the use of both hydration and holding solutions resulted in the shortest vase life of 11 days.\r\n"
			+ "\r\n"
			+ "Of 14 cultivars of sunflowers tested, most had a vase life using floral preservatives of 8-11 days. The cultivars �Sunny�, �Terra Cotta� and �Sunbright� lasted 14 days. Sunflowers �Solara�, Sunrich Orange� and �Premium Lemon� had vase lifes of 10-12 days when stems were first placed in hydrating solution, then holding solution.\r\n"
			+ "\r\n"
			+ "The vase life for Hydrangea �Limelight� averaged 11 days, minimum vase life was six days. Treatments did not make a difference in the study.\r\n"
			+ "\r\n"
			+ "Lysianthus �ABC Lavender� treated with both hydrator and holding solution had the longest vase life of 14-16 days and shortest vase life occurred with stems treated only with water (vase life 5 days) and seven days when a preservative was used.\r\n"
			+ "\r\n"
			+ "Ethylene\r\n"
			+ "Ethylene, an odorless and colorless gas, is a natural plant growth hormone that affects many physiological processes ranging from seed germination to senescence of plants. Flowers generate ethylene as part of the normal aging process. Ethlene is also produced by ripening fruits and vegetables, exhaust fumes, industrial smoke, tobacco smoke and micro-organisms. To maximize vase life of flowers, it is important avoid storing flowers with fruits and vegetables.\r\n"
			+ "\r\n"
			+ "Certain cut flowers are very sensitive to ethylene and very small amounts (levels as low as twenty parts per billion) can be very harmful. This level of ethylene is common in supermarkets and in the atmosphere of large cities. Responses to exogenous ethylene vary with species, and include abscission, abnormal development of the flower buds, failure of the buds to open and death of the flowers.\r\n"
			+ "\r\n"
			+ "Common ethylene sensitive flowers are delphinium, Asiatic lilies, snapdragons, aconitum and sweet peas.\r\n"
			+ "In addition to cut flowers, some cut herbs that are being used as cut flowers are also sensitive to ethylene. Marjoram, mint, parsley and oregano showed leaf yellowing and leaf abscission when exposed to ethylene while sage, thyme, basil and rosemary were minimally affected. (Smith, 2015). It is thus important that flowers and greens used for cut flowers that are sensitive to ethylene be handled in areas devoid of ethylene contamination.\r\n"
			+ "\r\n"
			+ "Commercial treatment products to prevent the effects of ethylene by susceptible flowers include silver thiosulfate (STS) and 1-Methylcyclopropene (1-MCP).\r\n"
			+ "\r\n"
			+ "Flowers that respond to STS pulse treatments include aconitum, agapanthus, anemone, alstromeria, asiatic lilies, astilbe, campanula, carnation, delphinium, dendrobium, eremerus, freesia, gerbera, gladiolus, goldenrod, gypsophila, kniphofia, phlox, physostegia, roses, scabiosa, snapdragon, stock, sweet pea, and sweet william (Prince and Tayama, 1988).\r\n"
			+ "\r\n"
			+ "STS solutions require special care in disposal and STS is not registered for use in MA.\r\n"
			+ "\r\n"
			+ "1-MCP is used as a gas and is registered for use in MA under the trade names Ethylbloc and Ethylbloc Sachet (2016). See the product labels for more information.\r\n"
			+ "\r\n"
			+ "Typically, accumulation of ethylene is minimal in well-ventilated areas, making these spaces suitable for the handling of flowers. However, if flowers are handled in a closed environment, then, it is important to minimize contamination.\r\n"
			+ "\r\n"
			+ "Maintaining Straight Stems\r\n"
			+ "Flower stems naturally bend away from gravity and this phenomenon is called geotropism. Flowers such as gladiolus, snapdragon, gerbera, tulip, and anemone bend upward when placed horizontally. This bending of the stem away from gravity results in curved stems when they are later placed in a vertical position. These flowers should be handled upright whenever possible.\r\n"
			+ "\r\n"
			+ "Mechanical Damage\r\n"
			+ "Mechanical damage to the leaves and flowers reduces the aesthetic value of the flowers and bruised petals and leaves are more prone to infection with disease organisms and ethylene production. The quality of cut flowers is best maintained with gentle and minimal handling.\r\n"
			+ "\r\n"
			+ "Botrytis\r\n"
			+ "Cut flowers are susceptible to the fungus disease botrytis, which will cause flowers to turn black and decay. Botrytis has ranges of temperature and relative humidity that are necessary for spore germination, infection and disease development. Spore germination and infection depends on a film of moisture for 8 to 12 hours, relative humidity of 93% or greater, and temperatures between 55-65F with colonization of plant tissues occurring at temperatures up to 70F.\r\n"
			+ "\r\n"
			+ "Management: Botrytis can be managed by proper environmental management. To prevent botrytis, avoid harvesting and storing wet flowers. Also, avoid moving flowers directly from cool to warm rooms which results in water droplets forming (condensation) on flowers, leaves and stems. Maintain dry floors in areas where flowers are processed. Do not dump buckets of water or hose down floors. Wet floors will increase relative humidity and increase the risk for botrytis infection." );
}}
		if(e.getSource()==marathi) {
			if(c1.getSelectedItem()=="vegetables") {
				try {
					Desktop.getDesktop().open(new java.io.File("File/Vegetables.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}		
			}
			if(c1.getSelectedItem()=="fruits") {
				try {
					Desktop.getDesktop().open(new java.io.File("File/fruits.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
			}
			if(c1.getSelectedItem()=="wheat")
			{
				try {
					Desktop.getDesktop().open(new java.io.File("File/grains.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}		
			}if(c1.getSelectedItem()=="maize") {
				try {
					Desktop.getDesktop().open(new java.io.File("File/grains.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
			}
			if(c1.getSelectedItem()=="rice") {
				try {
					Desktop.getDesktop().open(new java.io.File("File/grains.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
			}if(c1.getSelectedItem()=="flowers") {
				try {
					Desktop.getDesktop().open(new java.io.File("File/rose.txt"));	
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
			}
			
		}
		if(e.getSource()== back)
{new farmerclass();
}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new storage();
	}
}
