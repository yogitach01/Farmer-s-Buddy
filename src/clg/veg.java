package clg;


import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class veg extends JFrame implements ActionListener {
	JFrame f;
	 JLabel l,im;
	 JComboBox c1;
	 JButton next,back;JTextArea ta;
	public veg() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
	     
		f=new JFrame("Class");p.setBackground(Color.GREEN);
		 setVisible(true);
		 add(p,BorderLayout.CENTER);
		 setSize(1200,1000);setResizable(false);ImageIcon img=new ImageIcon("D:\\veg.jpeg");
	      l=new JLabel(img);
	      String s1[] = { "onion", "tomato", " potato"}; 
	      next=new JButton("CONTINUE");	
	      c1 = new JComboBox(s1);
	      c1.setSelectedIndex(0); 
	      
p.add(l);setVisible(true);
p.add(c1);setVisible(true);
p.add(next);setVisible(true);

ta=new JTextArea("",20,70);
p.add(ta);setVisible(true); JScrollPane sc=new JScrollPane(ta);
p.add(sc);
Insets in=p.getInsets();
Dimension size=l.getPreferredSize();
l.setBounds(10, 10, 100, 20);
size=c1.getPreferredSize();
c1.setBounds(100,140, 100, 20);

size=next.getPreferredSize();
next.setBounds(100, 300, 100, 20);
size=ta.getPreferredSize();
ta.setBounds(100, 330, 100, 20);

next.addActionListener(this);
back=new JButton("<-");back.addActionListener(this);
p.add(back); setVisible(true);
size=back.getPreferredSize();
back.setBounds(10,10 ,20, 10);

	}	

 	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== next)
		{
			if(c1.getSelectedItem()=="potato") {
				ta.setText(" Potato is grown in more than 100 countries, under temperate, subtropical and tropical conditions. It is essentially a\n"
						+ " \"cool weather crop\", with temperature being the main limiting factor on production: tuber growth is sharply inhibited in \n"
						+ "temperatures below 10�C (50�F) and above 30�C (86�F), while optimum yields are obtained where mean daily temperatures are in \n"
						+ "the 18 to 20�C (64 to 68�F) range.\r\n"
						+ "\r\n"
						+ "For that reason, potato is planted in early spring in temperate zones and late winter in warmer regions, and grown \n"
						+ "during the coolest months of the year in hot tropical climates. In some sub-tropical highlands, mild temperatures and\n"
						+ " high solar radiation allow farmers to grow potatoes throughout the year, and harvest tubers within 90 days of planting \n"
						+ "(in temperate climates, such in northern Europe, it can take up to 150 days).\r\n"
						+ "\r\n"
						+ "The potato is a very accommodating and adaptable plant, and will produce well without ideal soil and growing conditions.\n"
						+ " However, it is also subject to number of pests and diseases. To prevent the build-up of pathogens in the soil, farmers avoid\n"
						+ " growing potato on the same land from year to year. Instead, they grow potato in rotations of three or more years,\n"
						+ " alternating with other, dissimilar crops, such as maize, beans and alfalfa. Crops susceptible to the same pathogens as potato \n"
						+ "(e.g. tomato) are avoided in order to break potato pests' development cycle.\r\n"
						+ "\r\n"
						+ "With good agricultural practices, including irrigation when necessary, a hectare of potato in the temperate climates of northern \n"
						+ "Europe and North America can yield more than 40 tonnes of fresh tubers within four months of planting. In most developing countries, \n"
						+ "however, average yields are much lower - ranging from as little as five tonnes to 25 tonnes - owing to lack of high quality seed and \n"
						+ "improved cultivars, lower rates of fertilizer use and irrigation, and pest and disease problems.\r\n"
						+ "\r\n"
						+ "Soil and land preparation\r\n"
						+ "The potato can be grown almost on any type of soil, except saline and alkaline soils. Naturally loose soils, which offer the least\n"
						+ " resistance to enlargement of the tubers, are preferred, and loamy and sandy loam soils that are rich in organic matter, with good drainage\n"
						+ " and aeration, are the most suitable. Soil with a pH range of 5.2-6.4 is considered ideal.\r\n"
						+ "\r\n"
						+ "Growing potatoes involves extensive ground preparation. The soil needs to be harrowed until completely free of weed roots. In most cases,\n"
						+ " three ploughings, along with frequent harrowing and rolling, are needed before the soil reaches a suitable condition: soft, well-drained \n"
						+ "and well-aerated.\r\n"
						+ "\r\n"
						+ "Planting\r\n"
						+ "The potato crop is usually grown not from seed but from \"seed potatoes\" - small tubers or pieces of tuber sown to a depth of 5 to 10 cm. Purity of the cultivars and healthy seed tubers are essential for a successful crop. Tuber seed should be disease-free, well-sprouted and from 30 to 40 g each in weight. Use of good quality commercial seed can increase yields by 30 to 50 percent, compared to farmers' own seed, but expected profits must offset the higher cost.\r\n"
						+ "\r\n"
						+ "The planting density of a row of potatoes depends on the size of the tubers chosen, while the inter-row spacing must allow for ridging of the crop (see below). Usually, about two tonnes of seed potatoes are sown per hectare. For rainfed production in dry areas, planting on flat soil gives higher yields (thanks to better soil water conservation), while irrigated crops are mainly grown on ridges.Manuring and fertilization\r\n"
						+ "The use of chemical fertilizer depends on the level of available soil nutrients - volcanic soils, for example, are typically deficient in phosphorus - and in irrigated commercial production, fertilizer requirements are relatively high. However, potato can benefit from application of organic manure at the start of a new rotation - it provides a good nutrient balance and maintains the structure to the soil. Crop fertilization requirements need to be correctly estimated according to the expected yield, the potential of the variety and the intended use of the harvested crop.\r\n"
						+ "\r\n"
						+ "Water supply\r\n"
						+ "The soil moisture content must be maintained at a relatively high level. For best yields, a 120 to 150 day crop requires from 500 to 700 mm (20 to 27.5 inches) of water. In general, water deficits in the middle to late part of the growing period tend to reduce yield more than those in the early part. Where supply is limited, water is directed towards maximizing yield per hectare rather than being applied over a larger area.\r\n"
						+ "\r\n"
						+ "Because the potato has a shallow root system, yield response to frequent irrigation is considerable, and very high yields are obtained with mechanized sprinkler systems that replenish evapotranspiration losses every one or two days. Under irrigation in temperate and subtropical climates, a crop of about 120 days can produce yields of 25 to 35 tonnes/ha (11 to 15.6 tons per acre), falling to 15 to 25 tonnes/ha (6.6 to 15.6 tons per acre) in tropical areas.\r\n"
						+ "\r\n"
						+ "Pests and diseases\r\n"
						+ "Against diseases, a few basic precautions � crop rotation, using tolerant varieties and healthy, certified seed tubers - can help avoid great losses. There is no chemical control for bacterial and viral diseases but they can be controlled by regular monitoring (and when necessary, spraying) of their aphid vectors. The severity of fungal diseases such as late blight depends, after the first infection, mainly on the weather - persistence of favourable conditions, without chemical spraying, can quickly spread the disease.\r\n"
						+ "\r\n"
						+ "Insect pests can wreak havoc in a potato patch. Recommended control measures include regular monitoring and steps to protect the pests' natural enemies. Even damage caused by the Colorado Potato Beetle, a major pest, can be reduced by destroying beetles, eggs and larvae that appear early in the season, while sanitation, crop rotations and use of resistant potato varieties help prevent the spread of nematodes.\r\n"
						+ "\r\n"
						+ "Harvesting\r\n"
						+ "Yellowing of the potato plant's leaves and easy separation of the tubers from their stolons indicate that the crop has reached maturity. If the potatoes are to be stored rather than consumed immediately, they are left in the soil to allow their skins to thicken - thick skins prevent storage diseases and shrinkage due to water loss. However, leaving tubers for too long in the ground increases their exposure to a fungal incrustation called black scurf.\r\n"
						+ "\r\n"
						+ "To facilitate harvesting, the potato vines should be removed two weeks before the potatoes are dug up. Depending on the scale of production, potatoes are harvested using a spading fork, a plough or commercial potato harvesters that unearth the plant and shake or blow the soil from the tubers. During harvesting, it is important to avoid bruising or other injury, which provide entry points for storage diseases.");
			}
if(c1.getSelectedItem()=="tomato") {
				ta.setText("Soil\r\n"
						+ "\r\n"
						+ "Tomato can be grown on a wide range of soils from sandy to heavy clay. However, well-drained, sandy or red loam soils rich in organic matter with a pH range of 6.0-7.0 are considered as ideal.\r\n"
						+ "\r\n"
						+ "Climate\r\n"
						+ "\r\n"
						+ "Tomato is a warm season crop. The best fruit colour and quality is obtained at a temperature range of 21-24�C. Temperatures above 32o C adversely affects the fruit set and development. The plants cannot withstand frost and high humidity. It requires a low to medium rainfall. Bright sunshine at the time of fruit set helps to develop dark red coloured fruits. Temperature below 10 oC adversely affects plant tissues thereby slowing down physiological activitiesSeason of Planting\r\n"
						+ "\r\n"
						+ "Seeds are sown in June July for autumn winter crop and for spring summer crop seeds are sown in November. In the hills seed is sown in March April.\r\n"
						+ "\r\n"
						+ "Raising of Seedlings\r\n"
						+ "\r\n"
						+ "About 250-300 g of seed are sufficient for raising seedlings for one hectare of land. Prior to sowing seeds are treated with fungal culture of Trichoderma viride (4 g/ kg of seed) or Thiram (2g/kg of seed) to avoid damage from damping-off disease. Sowing should be done thinly in lines spaced at 10-15 cm distance. Seeds are sown at a depth of 2-3 cm and covered with a fine layer of soil followed by light watering by water can. The beds should then be covered with dry straw or grass or sugarcane leaves to maintain required temperature and moisture. The watering should be done by water can as per the need till germination is completed. The cover of dry straw or grass is removed immediately after germination is complete. During the last week in nursery, the seedlings may be hardened by slightly withholding water.\r\n"
						+ "\r\n"
						+ "The seedlings with 5-6 true leaves are ready for transplanting within 4 of sowing.\r\n"
						+ "\r\n"
						+ "Planting\r\n"
						+ "Land Preparation\r\n"
						+ "\r\n"
						+ "The field is ploughed to fine tilth by giving four to five ploughing with a sufficient interval between two ploughing. Planking should be done for proper levelling. Furrows are then opened at the recommended spacing. Well-decomposed FYM (25 t/ha) is thoroughly incorporated at the time of land preparation.\r\n"
						+ "\r\n"
						+ "Spacing\r\n"
						+ "\r\n"
						+ "Spacing depends upon the type of variety grown and the season of planting. Normally the seedlings are transplanted at a spacing of 75-90 x 45-60 cm.\r\n"
						+ "\r\n"
						+ "Method of Planting\r\n"
						+ "\r\n"
						+ "Seedlings are transplanted in furrows in light soils and on side of the ridges in case of heavy soils. A pre-soaking irrigation is given 3-4 days prior to transplanting. Before planting seedlings should be dipped in a solution prepared by Nuvacron (15ml) and Dithane M - 45 (25g) in 10 litres of water for 5-6 minutes. Transplanting should preferably be done in the evening.\r\n"
						+ "\r\n"
						+ "Intercultivation\r\n"
						+ "Weed Control\r\n"
						+ "\r\n"
						+ "The field should be kept weed-free, especially in the initial stage of plant growth, as weeds compete with the crop and reduce the yield drastically. Frequent shallow cultivation should be done at regular interval so as to keep the field free from weeds and to facilitate soil aeration and proper root development. Deep cultivation is injurious because of the damage of roots and exposure of moist soil to the surface. Two-three hoeing and the earthing up are required to keep the crop free of weeds. Pre- emergence application of Basalin (1kg a.i./ha) or Pendimethalin (1kg a.i./ha), coupled with one hand weeding 45 days after transplanting is effective for control of weeds. Plastic mulching (black or transparent) can be used to control the weeds. Weeds can be controlled successfully by mulching plus use of herbicides such as Pendimethalin (0.75 kg a.i./ha) or Oxyfluorfen (0.12 kg a.i./ha).\r\n"
						+ "\r\n"
						+ "Crop Rotation\r\n"
						+ "\r\n"
						+ "Tomato should not be grown successively on the same field and a break of at least one year is required between planting of tomatoes or other Solanacesous crops (eg. Chillies, Brinjals, Capsicum, Potato, Tobacco, etc.), cucurbits and many other vegetables. The crops, which can be grown after tomatoes, are as follows- Cereals (eg. Rice, Corn Sorghum, Wheat, Millets, etc.) or Cruciferons crops (eg. Cabbage, Cauliflower, Kohlrabi etc) or Radish, Watermelon, Onion, Garlic, Groundnut, Cotton, Safflower , Sunflower, Sesame, Sugar beet and Marigold.\r\n"
						+ "\r\n"
						+ "Intercropping\r\n"
						+ "\r\n"
						+ "Tomato is well fitted in different cropping systems of cereals, grains, pulses and oilseeds. Cropping systems rice-tomato, rice-maize, okra-potato-tomato, tomato-onion are popular in various parts of India. Spinach or radish can also be grown as inter-crop in tomato successfully.\r\n"
						+ "\r\n"
						+ "Staking\r\n"
						+ "\r\n"
						+ "Due to the tall habit and heaving bearing nature of the hybrids staking is essential. Staking facilitates intercultural operations and helps in maintaining the quality of the fruits. It is done 2-3 weeks after transplanting. Staking can be done either by wooden stakes or laying overhead wires to which individual plant is tied. In case of indeterminate types, tow or three wires are stretched parallel to each other along the row and plants are tied to these wires.\r\n"
						+ "\r\n"
						+ "Irrigation\r\n"
						+ "Tomato is very sensitive to water application. Heavy irrigation provided after a long spell of drought causes cracking of the fruits. Hence it should be avoided. Light irrigation should be given 3-4 days after transplanting. Irrigation intervals should be according to soil type and rainfall, irrigation should be given 7-8 days interval during kharif, during rabi 10-12 days and 5-6 days during summer.\r\n"
						+ "\r\n"
						+ "Flowering and fruit development are the critical stages of tomato therefore; water stress should not be given during this period.\r\n"
						+ "\r\n"
						+ "Manuring & Fertilization\r\n"
						+ "The fertilizer dose depends upon the fertility of soil and amount of organic manure applied to the crop. For a good yield, 15-20 tonnes of well-decomposed FYM is incorporated into the soil. Generally, application of 120 kg N, 80 kg P2O5 and 50 kg K2O per hectare is recommended for getting optimum yield. Half dose of N and full dose of P and K is given at the time of planting. The balance half of N is given as top dressing 30 days after transplanting.Harvesting\r\n"
						+ "Depending on the variety, fruits become ready for first picking in about 60-70 days after transplanting. The stage of harvesting depends upon the purpose to which the fruits are to be used. The different stages of harvesting are as follows-\r\n"
						+ "\r\n"
						+ "Dark green colour - Dark green colour is changed and a reddish pink shade is observed on fruit. Fruits to be shipped are harvested at this stage. Such fruits are then sprayed with ethylene 48 hours prior to shipping. Immature green tomatoes will ripen poorly and be of low quality. A simple way to determine maturity is to slice the tomato with a sharp knife. If seeds are cut, the fruit is too immature for harvest and will not ripen properly.\r\n"
						+ "Breaker stage - Dim pink colour observed on � part of the fruit. Fruits are harvested at this stage to ensure the best quality. Such fruit are less prone to damage during shipment often fetch a higher price ");
			}
if(c1.getSelectedItem()=="onion") {
	ta.setText(" Storage\r\n"
			+ "India is the second largest onion growing country in the world. Indian onions are famous for their pungency and are available round the year. Indian onions has two crop cycles, first harvesting starts in November to January and the second harvesting from January to May.\r\n"
			+ "\r\n"
			+ "The onion is a hardy cool-season biennial but usually grown as annual crop. The onion has narrow, hollow leaves and a base which enlarges to form a bulb. The bulb can be white, yellow, or red and require 80 to 150 days to reach harvest.\r\n"
			+ "\r\n"
			+ "The major Onion producing states are Maharashtra, Madhya Pradesh, Karnataka, Gujarat, Rajasthan, Bihar, Andhra Pradesh, Haryana, West Bengal, Uttar Pradesh, Chhattisgarh, Odisha, Tamil Nadu, Jharkhand and Telangana in the country.\r\n"
			+ "\r\n"
			+ "Climate\r\n"
			+ "Onion is a temperate crop but can be grown under a wide range of climatic conditions such as temperate, tropical and subtropical climate. The best performance can be obtained in a mild weather without the extremes of cold and heat and excessive rainfall. However, onion plant is hardy and in the young stage can withstand freezing temperature also. In India, short-day onion is grown in the plains and requires 10-12 hours day length. The long-day onion is grown in hills requiring 13-14 hours day length. For vegetative growth, lower temperature combined with short photoperiod is required whereas relatively higher temperature along with longer photoperiod is required for bulb development and maturity. The optimum temperature for vegetative phase and bulb development is 13-24C and 16-25C, respectively. It requires about 70% relative humidity for good growth. It can grow well in places where the average annual rainfall is 650-750 mm with good distribution during the monsoon period. Areas with low (< 650 mm) or heavy rainfall (>750 mm) are not particularly suitable for rain-fed crop.\r\n"
			+ "\r\n"
			+ "Soil\r\n"
			+ "Onion can be grown in all types of soils such as sandy loam, clay loam, silt loam and heavy soils. However, the best soil for successful onion cultivation is deep, friable loam and alluvial soils with good drainage, moisture holding capacity and sufficient organic matter. In heavy soils, the bulbs produced may be deformed. Onion crop can be grown successfully on heavy soil with application of organic manure prior to planting and preparation of the field for onion cultivation should be very good. The optimum pH range, regardless of soil type, is 6.0 - 7.5, but onion can also be grown in mild alkaline soils. Onion crop is more sensitive to highly acidic, alkali and saline soils and water logging condition. Onions do not thrive in soils having pH below 6.0 because of trace element deficiencies, or occasionally, Al or Mn toxicity. The threshold electrical conductivity of a saturation extract (ECe) for onion crop is 4.0 dS/m. When the ECe level exceeds this, crop yield starts declining.\r\n"
			+ "\r\n"
			+ "Raising small Bulblets\r\n"
			+ "\r\n"
			+ "This method is used for getting early crop in the kharif season so as to meet the demand of green onion for salad in early winter. For this purpose, small onion bulblets of kharif onion varieties like Agrifound Dark Red, Baswant 780, N-53 and Arka Kalyan raised in the previous season are used for planting. Raised beds or flat beds are prepared depending upon the soil type. To cover one square metre area of the bed 15 g of seed are sufficient. The best time of sowing of seeds for getting quality bulblets is mid January to the beginning of February depending upon the area. The plants are left in the nursery bed up to April-May till their tops fall. Harvesting is done along with the tops and selected bulblets (1.5 to 2.00 cm in dia.) are stored by hanging method till July in a well-ventilated house. Such well stored bulblets are used for transplanting in the Kharif season\r\n"
			+ "\r\n"
			+ "Broadcasting in Beds/Direct Sowing\r\n"
			+ "\r\n"
			+ "Seeds of big onion are sown directly in lines (30 cm apart) in parts of Chitradurga, Bellary and Dharwar districts of Karnataka, which are thinned later to give proper spacing for development of bulbs. Seeds of small onion (Bangalore Rose, Agrifound Rose and Arka Bindu) are broadcasted in small flat beds which are thinned later. For broadcasting directly in the field or sowing in the row, 20-25 kg seeds per hectare are used. In the plains, seeds are sown in lines 30 cm apart during September-October. After sowing, hand hoeing is done to allow the seeds to reach to a depth of 2.5-3 cm. Hand watering or light irrigation is given immediately after covering the seeds. Weeding is recommended at 10 days interval for preventing smoothering of seedlings by weeds.\r\n"
			+ "\r\n"
			+ "Planting\r\n"
			+ "Land preparation\r\n"
			+ "\r\n"
			+ "Prior to transplanting, field should be ploughed and disked properly to eliminate debris and soil clods. Organic manures equivalent to 75 kg N/ha (approximately FYM 15 t/ha or poultry manure 7.5 t/ha or vermicompost 7.5 t/ha) should be incorporated at the time of last ploughing and beds with appropriate size should be prepared after leveling. Mostly, flat beds of the size 1.5-2.0 m width and 4-6 m length is formed. However, flat bed should be avoided to prevent water logging during Kharif or rainy season. Water logging favours Anthracnose disease which is most devastating during Kharif season. Broad bed furrows (BBF) of 15 cm height and 120 cm top width with 45 cm furrow are formed to achieve proper spacing and population density. It is suitable for drip and sprinkler irrigation as well. BBF is the best method for Kharif onion production because the excess water can be drained out through the furrow. This improves the aeration and helps in reducing the incidence of Anthracnose disease.\r\n"
			+ "\r\n"
			+ "Transplanting\r\n"
			+ "\r\n"
			+ "Proper care should be taken while selecting seedlings for transplanting. Over and under aged seedlings should be avoided for better establishment. At the time of transplanting, one third of the seedling top should be cut to get good establishment. The onion seedling should be transplanted after dipping roots in carbendazim solution (0.1%) for two hours to reduce the incidence of fungal diseases during the establishment. The optimum spacing is 15 cm between the rows and 10 cm between plants.");
}}
		if(e.getSource()== back)
{new szaid();
}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new veg();
	}

}
