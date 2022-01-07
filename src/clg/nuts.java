
package clg;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class nuts extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton next,back;JTextArea ta;
	public nuts() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.setBackground(Color.GREEN);
		f=new JFrame("Class");
		 setVisible(true);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);
		 ImageIcon ca=new ImageIcon("D:\\ca.jpeg");

		JButton cashew=new JButton(ca);	
		 p.add(cashew);setVisible(true);
		 cashew.addActionListener(this);
		 ImageIcon wa=new ImageIcon("D:\\wa.jpeg");

			JButton wal=new JButton(wa);	
			 p.add(wal);setVisible(true);
			 wal.addActionListener(this);
			 ImageIcon al=new ImageIcon("D:\\al.jpeg");

				JButton alm=new JButton(al);	
				 p.add(alm);setVisible(true);
				 alm.addActionListener(this);

	      String s1[] = { "cashew", "walnuts", " almonds" }; 
	      next=new JButton("CONTINUE");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
	      

p.add(c1);setVisible(true);
p.add(next);setVisible(true);
cashew.setBounds(50, 50, 200, 250);wal.setBounds(50, 50, 200, 250);
alm.setBounds(50, 50, 200, 250);

ta=new JTextArea("",20,50);
p.add(ta);setVisible(true);JScrollPane sc=new JScrollPane(ta);
p.add(sc);   
c1.setBounds(100,430, 100, 20);

next.setBounds(100, 430, 100, 20);
ta.setBounds(100, 530, 100, 20);

next.addActionListener(this);back=new JButton("<-");back.addActionListener(this);
p.add(back); setVisible(true);
back.setBounds(10,10 ,20, 10);

	}	

 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== next)
		{
			if(c1.getSelectedItem()=="cashew") {
				ta.setText("Climate and Soil\r\n"
						+ "It is a hardy tropical plant and does not exact a very specific, climate. It can come up in places situated within 35 latitude on either side of the equator and also in the hill ranges upto 700 m MSL. It can grow well in places receiving rainfall from 50 cm to 250 cm and tolerate a temperature range of 25 to 49 C. it requires a bright weather and does not tolerate excessive shade.\r\n"
						+ "\r\n"
						+ "Cashew is cultivated on a wide variety of soils in India like laterite, red and coastal sandy soil. To a limited extent, it is also grown on black soils. It can be also grown in hill slopes in virgin organic matter rich soils. They do not prefer water logged or saline soils.Propagation\r\n"
						+ "Seed Propagation\r\n"
						+ "Seed propagation is seldom practised now except to raise the rootstock materials. Seeds should be collected during the month of March to May and the heavy seed nuts, which sink in water, are alone mixed with 2 parts of fine sand. They take normally 15 to 20 days for germination.\r\n"
						+ "\r\n"
						+ "Vegetative propagation\r\n"
						+ "One year old shoots as well as current season shoots are used for air-layering. Though there is good root development in this method, heavy mortality occurs both at nursery stage and on the main field. Other drawbacks of this method are that it is cumbersome, time consuming and production of a limited number of layers per tree and as such layers are also not suitable for cyclone prone areas as they do not have a tap root providing less anchorage to soil.\r\n"
						+ "\r\n"
						+ "The vegetative propagation through cuttings is seldom practised, as success is very less. Similarly veneer grafting, side grafting and patch budding are also reported to be successful but the nursery period is quite long, 3 to 4 years. Recently 'epicotyl grafting' and 'soft wood grafting' are recommended for commercial scale adoption. In the case of epicotyl grafting, tender seedlings with height of 15 cm are selected as root stocks and a 'V' shaped cut is made after beheading it at a height of 4 to6 cm from the cotyledons connective. The precured scion is collected and a wedge is made at the base of it, so as to exactly fit in the cut made in the stock. The scion is exactly fitted in the stock and tied with polythene strips. The success of epicotyl grafting varies from 50 to 60 per cent and depends upon high humidity, temperature, freedom from fungal disease, number of rainy days and rate of cambial growth. When the above method is adopted in 30 to 40 days old seedling, it is known as soft wood grafting. The success varies from 40 to 50 per cent.\r\n"
						+ "\r\n"
						+ "Planting\r\n"
						+ "Pits of 45x45x45 cm are dug and filled with a mixture of top soil, 10 kg of farm yard manure and one kg of neem cake at a distance of 7m x7m either way during June July and planted. In the case of seedling, 45 days old seedlings are transplanted.\r\n"
						+ "\r\n"
						+ "Training and pruning\r\n"
						+ "All the side shoots must be removed upto a height of atleast 2m from the ground to cause the branches to form and spread out from the upper section of the trunk. Periodical pruning of dead wood and criss cross branches during the month of July is recommended to minimise the losses through diseases such as dieback and to increase the yield.Top working\r\n"
						+ "As most of the existing cashew plantations are of seedling progenies, the yield level is very low and highly erratic. Hence, top working with improved clones are suggested now. Trees of 20 to 25 years old are beheaded at a height of 0.5 m from the ground during December-February. A paste, made using 50 g, each of BHC 50 per cent wettable powder and copper oxychloride in a litre of water, should be applied all over the stump to check any infection by invading pathogens and borer insects. Profuse sprouting normally results in but only 10 to 15 healthy shoots and properly spaced on the stumps are alone retained. These shoots are grafted at softwood stage (cleft grafting) when they are about 40 to 50 days old. 7-8 successful grafts may be encouraged to grown and the sprouts should be periodically removed. Top worked trees grown vigorously due to the well established root system and they start yielding about 4kg per tree from the second year of rejuvenation and the yield gradually increases to stabilise at 8 kg from the fourth year of top working.\r\n"
						+ "\r\n"
						+ "Yield\r\n"
						+ "The yield depends upon many factors. Individual trees, which yield more than 6 kg after 15 years, are considered as good yielders.\r\n"
						+ "\r\n"
						+ "Cashew processing\r\n"
						+ "Processing consists of roasting, shelling, extracting the oil, peeling, grading and packing\r\n"
						+ "\r\n"
						+ "Roasting\r\n"
						+ "Roasting makes the shells brittle, besides making the extraction of kernels easier. A slight underoasting or overroasting adversely affects the quality and recovery of kernels. In the open pan roasting method, one kilogram of nuts are kept in shallow iron pans or earthen pots and are heated over an open fire. The nuts are rapidly turned to prevent charring. The roasted nuts are then removed from the pan and thrown on the floor. They are quickly covered with earth, which would absorb shell oil adhering to the roasting nuts and also cool them. The nuts are then subjected to subsequent operations. The cashew nuts are also roasted by drying under sun for two to three days when they lose much of the moisture contents and become brittle enough for shelling. The other improved methods of roasting cashewnuts are\r\n"
						+ "\r\n"
						+ "i. Continuous roasting process\r\n"
						+ "The principle adopted in this system is the same as in the case of open pan roasting method. This plant consists of a single walled or double walled rotating metallic drum. In the case of double walled drum, the smoke or gases produced during roasting escape through the interspace between the two walls of the drum and are condensed to shell oil by a cooling system but in the case of single walled drum, the gases that escape from the nuts during the process of roasting are allowed to escape through a chimney provided at the lower end and there is no provision for collecting shell liquid.\r\n"
						+ "\r\n"
						+ "ii. Oil bath process\r\n"
						+ "In this method, the nuts are held in wire trays and are passed through a bath of cashew shell oil maintained at a temperature of 200 to 2020C for a period of three minutes whereby the shell oil is recovered from the shells to the maximum possible extent. This process ensures uniform roasting of nuts and eliminates charring of kernels.\r\n"
						+ "\r\n"
						+ "Shelling\r\n"
						+ "After roasting, shelling is done by labour. Each nut is placed edgewise and cracked open with a light wooden mallet and the kernel extracted with or without the help of a wire prong. Care has to be taken that the inner kernel is intact and is not broken into bits.\r\n"
						+ "\r\n"
						+ "Peeling\r\n"
						+ "Removal of a thin outer brown skin is done by hand with the help of a safety pin or small hand knife. Peeling is made easier when the kernels are subjected to a heat treatment for about four hours in a drying chamber. After peeling, the kernels are spread out indoors on cement flooring so that they may absorb some moisture and become less brittle. This prevents the tendency to break easily during grading.\r\n"
						+ "\r\n"
						+ "Grading\r\n"
						+ "Grading is done based on \"counts\" or number of kernels per pound. The kernels, which have no split, are separated as 'wholes'. These are again separated into six grades as 210,240,280,320,400 and 430 whole nuts per pound. The graded kernels should be fully developed, ivory white in colour and free from insect damage and black or brown spots. The broken and split kernels are then separated and classified as standard and scorched pieces, splits, butts, small pieces and each grade is separately packed.\r\n"
						+ "\r\n"
						+ "Packing\r\n"
						+ "Packing is done in this. In this method, the air inside the tine is exhausted and they are recharged with Co2 before they are sealed air-tight.");
			}
if(c1.getSelectedItem()=="walnuts") {
		ta.setText("Rainfalls during late spring (after leaf growth) have been reported to favor the spread of the bacterium Xanthomonas juglandis,\n"
				+ " which causes serious damage to trees. The spring frosts can often cause damage in the mountainous regions. If you plan to grow walnut\n"
				+ " trees in high altitude, you can select spots where cold air masses can escape easily, or use late varieties, which sprout well after the frosts.\n"
				+ " Cool riversides and seaside areas are often considered suitable for cultivating walnut trees. On the contrary, sites that are surrounded by hills,\n"
				+ " where cold air masses cannot escape easily and spots that are not protected against strong winds should be avoided.\r\n"
				+ "\r\n"
				+ "You can enrich this article by leaving a comment or photo of your walnut orchard climate specifications.When are Walnuts Ready to Pick? \n"
				+ "Walnuts may be either English or the black walnut varieties, with the latter having a thicker shell and more intense flavor.\n"
				+ " Both types are fruiting, deciduous trees that are fairly easy to grow and lacking in few serious issues especially once mature.\n"
				+ " They can grow to 100 feet (30 m.) tall and 50 feet (15 m.) across, which makes the tree a bit unmanageable for some landscapes.\n"
				+ " Luckily, young trees can be trained via pruning. Walnut trees can be grown with a central leader or remove the leader which will encourage \n"
				+ "side shoot growth and restrict the tree�s size. A pitted shell encases a fibrous, leather sheath that splits as the nuts begin to ripen \n"
				+ "in the fall and indicates that walnut tree harvesting is nigh. Once you are done harvesting the walnuts, you can eat them right away,\n"
				+ " but keep in mind they won�t be quite like those purchased ones at the grocers.");		
			}
if(c1.getSelectedItem()=="almonds") {
	ta.setText("Almond Tree | Soil Requirement\r\n"
			+ "\r\n"
			+ "The almond trees plants are able to grow on the large variety of soil having the soil pH, ranging from 6.8 to 8.5. However, growing almonds on deep and loamy soil having well drainage facility is considered as the best suitable for optimum fruit production. However, these fruit trees are not able to grow well on the heavy and poorly drained soil having water lodging problems.\r\n"
			+ "\r\n"
			+ "For commercial almond cultivation, the ideal soil pH is 6.8 to 8.5 for producing quality and quantity production of nuts.\r\n"
			+ "\r\n"
			+ "How to Plant Almond Tree?\r\n"
			+ "\r\n"
			+ "Method of Propagation\r\n"
			+ "\r\n"
			+ "This fruit crop is mostly propagated through the means of vegetative propagation or through the means of seeds. For propagating almond with the help of seeds, seeds should be sown directly to the field in well-prepared beds.\r\n"
			+ "\r\n"
			+ "However, at the time of seed sowing, nuts should be laminated well for the better germination of seeds. One can also use peach as a rootstock for the propagation. But, the tree plants, grown through the means of rootstock plantation are not able to survive for a longer time. The seedling of almonds having some thickness as pencil thickness should be budded at around 10 cm above from the base of plants with suitable shield budding method for the better plant growth.\r\n"
			+ "\r\n"
			+ "Land Preparation in The Almond Farming\r\n"
			+ "\r\n"
			+ "A good land preparation definitely yields higher fruits in the cultivation. Also, the cultivating soil should have fine tilth form and is free from the weed and other materials. For bringing soil in fine tilth form, around two to three normal plowing with the local tractor is sufficient enough followed by a couple of harrowing. To increase the soil fertility and productivity, about 25 tonnes of well rotten farmyard manure per hectare should be added at the time of last harrowing or plowing.\r\n"
			+ "\r\n"
			+ "Also, level the soil well for the uniform growth of tree plants. And, any soil deficiency should be corrected at the time of land preparation only.\r\n"
			+ "\r\n"
			+ "Plantation And Spacing in Almond farming\r\n"
			+ "\r\n"
			+ "For Almond Plantation, the budded plants should be planted in a square or hexagonal system of plantation should be followed by keeping a distance of 6 meters apart from each other for normal plantation depending on the soil type and availability of irrigation. However, for planting with medium-high density system, the spacing should be 4.0 meter by 4.0 meter and for high-density plantation, the spacing should be 3.5 meters to 2.5 meters.\r\n"
			+ "\r\n"
			+ "Before plantation, prepare pits having dimension 3 feet each should be dug up between September to October for planting in the month of Feb and March. Make use of bamboo sticks to provide support to protect them from heavy winds and can grow straight. Try to plant pollinizer cultivar in every third to fourth row so that at the time of blooming, the pollinizer can coincide well with the main varieties.\r\n"
			+ "\r\n"
			+ "However, it is a good idea to place about 8 to 10 honey bee hives for good pollination at the time of flowering stage.\r\n"
			+ "\r\n"
			+ "Pollination in Almond farming\r\n"
			+ "\r\n"
			+ "Friends, these fruit trees are not self-pollinating so there is a need of artificial pollination in the cultivation. So, cultivate with 33 % pollinizer plantation so that bloom can coincide with each other well. For commercial cultivation of almonds, Waris, Jordan alo IXL, and Ne-Plus-Ultra are generally used as the pollinizer.\r\n"
			+ "\r\n"
			+ "However, placing about 8 to 10 honey bee hives are found to be highly beneficial. This also increases the fruiting and production to about more than 10 %.\r\n"
			+ "\r\n"
			+ "Frost Management in Almond Farming\r\n"
			+ "\r\n"
			+ "Due to early buddings in the plants, especially during the new blossoms, frost conditions may lead to the total destruction of the crop. This may lead to lower down the nut production, and even complete loss of bloom. So, the crop should provide protection from the seasonal and unexpected frost conditions.\r\n"
			+ "\r\n"
			+ "For providing protection from frost, using Super-net micro-sprinklers to every tree plant is the best way at an irrigation rate 4 mm per hour.\r\n"
			+ "\r\n"
			+ "Irrigation in Almond Farming\r\n"
			+ "\r\n"
			+ "The requirement of irrigation in commercial almond farming is an important task that plays an important role in nut production and varies, depending on climate and soil type, used for cultivation. However, water to be supply on the basis of plant need.");
}}if(e.getSource()== back)
{new sorchads();
}
		}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
new nuts();
	}

}
