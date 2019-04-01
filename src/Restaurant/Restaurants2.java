package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Restaurants2 {

	private JFrame frame;
	private JTextField textFieldChickenQty;
	private JTextField textFieldCubanQty;
	private JTextField textFieldTripletaQty;
	private JTextField textFieldCokeQty;
	private JTextField textFieldSpriteQty;
	private JTextField textFieldOrangeQty;
	private JTextField textFieldGrapeQty;
	private JTextField textFieldCoffeeQty;
	private JTextField textFieldWaterQty;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants2 window = new Restaurants2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1380, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1364, 116);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(72, 61, 139), 12));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("Restaurant Management System");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblTitle.setBorder(new LineBorder(new Color(72, 53, 105), 9));
		lblTitle.setBounds(10, 10, 1344, 96);
		lblTitle.setForeground(Color.WHITE);
		panel.add(lblTitle);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 160, 432, 9);
		frame.getContentPane().add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 7, true));
		panel_1.setBounds(10, 122, 458, 317);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setBounds(52, 10, 54, 28);
		lblProduct.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblProduct);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQty.setBounds(209, 10, 46, 28);
		panel_1.add(lblQty);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(381, 10, 46, 28);
		panel_1.add(lblTotal);
		
		JLabel lblChickenSandwich = new JLabel("Chicken Sandwich");
		lblChickenSandwich.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChickenSandwich.setBounds(34, 54, 127, 17);
		panel_1.add(lblChickenSandwich);
		
		JLabel lblCubanSandwich = new JLabel("Cuban Sandwich");
		lblCubanSandwich.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCubanSandwich.setBounds(34, 86, 127, 17);
		panel_1.add(lblCubanSandwich);
		
		JLabel lblTripleta = new JLabel("Tripleta");
		lblTripleta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTripleta.setBounds(34, 115, 115, 17);
		panel_1.add(lblTripleta);
		
		textFieldChickenQty = new JTextField();
		textFieldChickenQty.setText("0");
		textFieldChickenQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldChickenQty.setBounds(183, 51, 86, 20);
		panel_1.add(textFieldChickenQty);
		textFieldChickenQty.setColumns(10);
		
		textFieldCubanQty = new JTextField();
		textFieldCubanQty.setText("0");
		textFieldCubanQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCubanQty.setBounds(183, 83, 86, 20);
		panel_1.add(textFieldCubanQty);
		textFieldCubanQty.setColumns(10);
		
		textFieldTripletaQty = new JTextField();
		textFieldTripletaQty.setText("0");
		textFieldTripletaQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTripletaQty.setBounds(183, 115, 86, 20);
		panel_1.add(textFieldTripletaQty);
		textFieldTripletaQty.setColumns(10);
		
		JLabel lblChickenTotal = new JLabel("$");
		lblChickenTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChickenTotal.setBounds(362, 57, 67, 14);
		panel_1.add(lblChickenTotal);
		
		JLabel lblCubanTotal = new JLabel("$");
		lblCubanTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCubanTotal.setBounds(362, 89, 67, 14);
		panel_1.add(lblCubanTotal);
		
		JLabel lblTripletaTotal = new JLabel("$");
		lblTripletaTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTripletaTotal.setBounds(362, 118, 67, 14);
		panel_1.add(lblTripletaTotal);
		
		JLabel lblSubTotal = new JLabel("SubTotal:");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSubTotal.setBounds(261, 202, 79, 28);
		panel_1.add(lblSubTotal);
		
		JLabel lblSubTotalOrder = new JLabel("$");
		lblSubTotalOrder.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSubTotalOrder.setBounds(362, 202, 86, 28);
		panel_1.add(lblSubTotalOrder);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(292, 10, 46, 28);
		panel_1.add(lblPrice);
		
		JLabel lblChickenPrice = new JLabel();
		((JLabel) lblChickenPrice).setText("$3.99");
		lblChickenPrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblChickenPrice.setBounds(292, 54, 46, 14);
		panel_1.add(lblChickenPrice);
		
		JLabel lblCubanPrice = new JLabel("$6.99");
		lblCubanPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCubanPrice.setBounds(292, 86, 46, 14);
		panel_1.add(lblCubanPrice);
		
		JLabel lblTripletaPrice = new JLabel("$9.99");
		lblTripletaPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTripletaPrice.setBounds(292, 118, 46, 14);
		panel_1.add(lblTripletaPrice);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTax.setBounds(303, 241, 37, 17);
		panel_1.add(lblTax);
		
		JLabel lblTaxTotal = new JLabel("$");
		lblTaxTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTaxTotal.setBounds(362, 235, 86, 28);
		panel_1.add(lblTaxTotal);
		
		JLabel lblTotalLabel = new JLabel("Total:");
		lblTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalLabel.setBounds(290, 269, 50, 28);
		panel_1.add(lblTotalLabel);
		
		JLabel lblTotalOrder = new JLabel("$");
		lblTotalOrder.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalOrder.setBounds(362, 269, 86, 28);
		panel_1.add(lblTotalOrder);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(16, 171, 432, 9);
		panel_1.add(separator_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(344, 46, 19, 121);
		panel_1.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 128), 7, true));
		panel_2.setBounds(496, 122, 439, 317);
		frame.getContentPane().add(panel_2);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDrinks.setBounds(39, 10, 54, 28);
		panel_2.add(lblDrinks);
		
		JLabel lblQtyDrinks = new JLabel("Qty");
		lblQtyDrinks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQtyDrinks.setBounds(149, 10, 46, 28);
		panel_2.add(lblQtyDrinks);
		
		JLabel lblTotalDrinks = new JLabel("Total");
		lblTotalDrinks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalDrinks.setBounds(330, 10, 46, 28);
		panel_2.add(lblTotalDrinks);
		
		JLabel lblCoke = new JLabel("Coke");
		lblCoke.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCoke.setBounds(29, 52, 115, 17);
		panel_2.add(lblCoke);
		
		JLabel label_1 = new JLabel("Price");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(250, 10, 46, 28);
		panel_2.add(label_1);
		
		JLabel lblSprite = new JLabel("Sprite");
		lblSprite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSprite.setBounds(29, 80, 115, 17);
		panel_2.add(lblSprite);
		
		JLabel lblOrangeJuice = new JLabel("Orange Juice");
		lblOrangeJuice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOrangeJuice.setBounds(29, 108, 115, 17);
		panel_2.add(lblOrangeJuice);
		
		JLabel lblHotCoffee = new JLabel("Hot Coffee");
		lblHotCoffee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHotCoffee.setBounds(29, 164, 128, 17);
		panel_2.add(lblHotCoffee);
		
		JLabel lblWater = new JLabel("Bottle Water");
		lblWater.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWater.setBounds(29, 192, 115, 17);
		panel_2.add(lblWater);
		
		JLabel lblGrapeJuice = new JLabel("Grape Juice");
		lblGrapeJuice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGrapeJuice.setBounds(29, 136, 115, 17);
		panel_2.add(lblGrapeJuice);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(306, 46, 11, 163);
		panel_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 38, 403, 17);
		panel_2.add(separator_4);
		
		textFieldCokeQty = new JTextField();
		textFieldCokeQty.setText("0");
		textFieldCokeQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCokeQty.setColumns(10);
		textFieldCokeQty.setBounds(131, 49, 86, 20);
		panel_2.add(textFieldCokeQty);
		
		textFieldSpriteQty = new JTextField();
		textFieldSpriteQty.setText("0");
		textFieldSpriteQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSpriteQty.setColumns(10);
		textFieldSpriteQty.setBounds(131, 80, 86, 20);
		panel_2.add(textFieldSpriteQty);
		
		textFieldOrangeQty = new JTextField();
		textFieldOrangeQty.setText("0");
		textFieldOrangeQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOrangeQty.setColumns(10);
		textFieldOrangeQty.setBounds(131, 108, 86, 20);
		panel_2.add(textFieldOrangeQty);
		
		textFieldGrapeQty = new JTextField();
		textFieldGrapeQty.setText("0");
		textFieldGrapeQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGrapeQty.setColumns(10);
		textFieldGrapeQty.setBounds(131, 136, 86, 20);
		panel_2.add(textFieldGrapeQty);
		
		textFieldCoffeeQty = new JTextField();
		textFieldCoffeeQty.setText("0");
		textFieldCoffeeQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCoffeeQty.setColumns(10);
		textFieldCoffeeQty.setBounds(131, 164, 86, 20);
		panel_2.add(textFieldCoffeeQty);
		
		textFieldWaterQty = new JTextField();
		textFieldWaterQty.setText("0");
		textFieldWaterQty.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldWaterQty.setColumns(10);
		textFieldWaterQty.setBounds(131, 192, 86, 20);
		panel_2.add(textFieldWaterQty);
		
		JLabel lblCokePrice = new JLabel("$1.50");
		lblCokePrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCokePrice.setBounds(250, 55, 46, 14);
		panel_2.add(lblCokePrice);
		
		JLabel lblSpritePrice = new JLabel("$1.50");
		lblSpritePrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblSpritePrice.setBounds(250, 83, 46, 14);
		panel_2.add(lblSpritePrice);
		
		JLabel lblOrangePrice = new JLabel("$1.99");
		lblOrangePrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblOrangePrice.setBounds(250, 111, 46, 14);
		panel_2.add(lblOrangePrice);
		
		JLabel lblGrapePrice = new JLabel("$1.99");
		lblGrapePrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblGrapePrice.setBounds(250, 139, 46, 14);
		panel_2.add(lblGrapePrice);
		
		JLabel lblCoffeePrice = new JLabel("$1.50");
		lblCoffeePrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCoffeePrice.setBounds(250, 167, 46, 14);
		panel_2.add(lblCoffeePrice);
		
		JLabel lblWaterPrice = new JLabel("$1.99");
		lblWaterPrice.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblWaterPrice.setBounds(250, 195, 46, 14);
		panel_2.add(lblWaterPrice);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 219, 403, 17);
		panel_2.add(separator_5);
		
		JLabel lblCokeTotal = new JLabel("$");
		lblCokeTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCokeTotal.setBounds(327, 53, 67, 14);
		panel_2.add(lblCokeTotal);
		
		JLabel lblSpriteTotal = new JLabel("$");
		lblSpriteTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpriteTotal.setBounds(326, 81, 67, 14);
		panel_2.add(lblSpriteTotal);
		
		JLabel lblOrangeTotal = new JLabel("$");
		lblOrangeTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOrangeTotal.setBounds(327, 109, 67, 14);
		panel_2.add(lblOrangeTotal);
		
		JLabel lblGrapeTotal = new JLabel("$");
		lblGrapeTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGrapeTotal.setBounds(327, 137, 67, 14);
		panel_2.add(lblGrapeTotal);
		
		JLabel lblCoffeeTotal = new JLabel("$");
		lblCoffeeTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCoffeeTotal.setBounds(327, 167, 67, 14);
		panel_2.add(lblCoffeeTotal);
		
		JLabel lblWaterTotal = new JLabel("$");
		lblWaterTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWaterTotal.setBounds(327, 195, 67, 14);
		panel_2.add(lblWaterTotal);
		
		JLabel lblDrinksTotal = new JLabel("$");
		lblDrinksTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDrinksTotal.setBounds(327, 219, 86, 28);
		panel_2.add(lblDrinksTotal);
		
		JLabel lblError = new JLabel("Error");
		lblError.setBounds(29, 265, 318, 14);
		panel_2.add(lblError);
		
		//Total button
		JButton btnSubmitTotal = new JButton("Total");
		btnSubmitTotal.setBounds(47, 487, 141, 29);
		frame.getContentPane().add(btnSubmitTotal);
		btnSubmitTotal.setBackground(new Color(0, 0, 128));
		btnSubmitTotal.setForeground(new Color(255, 255, 255));
		btnSubmitTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//------------------------------TOTAL BUTTON FOOD------------------------------------------------//
				
				//Declare and initialize variables for the Chicken Sandwich
				double chickenQty = Double.parseDouble(textFieldChickenQty.getText());
				((JLabel) lblChickenPrice).getText();
				double chickenPrice = 3.99;
				double chickenSandwich;
			
				//Calculate the quantity and price of the chicken sandwich
				chickenSandwich = (chickenQty * chickenPrice);
				String chickenMeal = String.format("%.2f", chickenSandwich);
				lblChickenTotal.setText("$" + chickenMeal);
				
				//Declare and initialize variables for the Cuban Sandwich
				double cubanQty = Double.parseDouble(textFieldCubanQty.getText());
				double cubanPrice = 6.99;
				double cubanSandwich;
				
				//Calculate the quantity and price of the Cuban sandwich
				cubanSandwich = (cubanQty * cubanPrice);
				String cubanMeal = String.format("%.2f", cubanSandwich);
				lblCubanTotal.setText("$" + cubanMeal);
				
				//Declare and initialize variables for the Tripleta Sandwich
				double tripletaQty = Double.parseDouble(textFieldTripletaQty.getText());
				double tripletaPrice = 9.99;
				double tripletaSandwich;
				
				//Calculate the quantity and price of the tripleta sandwich
				tripletaSandwich = (tripletaQty * tripletaPrice);
				String tripletaMeal = String.format("%.2f", tripletaSandwich);
				lblTripletaTotal.setText("$" + tripletaMeal);
				
				//-------------------------------DRINKS------------------------------------------------//
				
				//Declare and initialize variables to get the values of each drink quantity
				double cokeQty = Double.parseDouble(textFieldCokeQty.getText());
				double spriteQty = Double.parseDouble(textFieldSpriteQty.getText());
				double coffeeQty = Double.parseDouble(textFieldCoffeeQty.getText());
				double orangeQty = Double.parseDouble(textFieldOrangeQty.getText());
				double grapeQty = Double.parseDouble(textFieldGrapeQty.getText());
				double waterQty = Double.parseDouble(textFieldWaterQty.getText());
				
				// Set drinks prices
				double cokePrice = 1.50;
				double spritePrice = 1.50;
				double coffeePrice = 1.50;
				double orangePrice = 1.99;
				double grapePrice = 1.99;
				double waterPrice = 1.99;
				
				// Declare and initialize variables to calculate quantity and price of drinks
				double coke = 0;
				double sprite = 0;
				double coffee = 0;
				double orange = 0;
				double grape = 0;
				double water = 0;
				
				// if coke or sprite or coffee is selected calculate quantity and price
				if (cokeQty > 0 || spriteQty > 0 || coffeeQty > 0) {
					
					//Calculate the quantity and price of the Coke Drink
					coke = (cokeQty * cokePrice);
					String cokeDrink = String.format("%.2f", coke);
					lblCokeTotal.setText("$" + cokeDrink);
					
					
					sprite = (spriteQty * spritePrice);
					String spriteDrink = String.format("%.2f", sprite);
					lblSpriteTotal.setText("$" + spriteDrink);
					
					coffee = (coffeeQty * coffeePrice);
					String coffeeDrink = String.format("%.2f", coffee);
					lblCoffeeTotal.setText("$" + coffeeDrink);
					lblError.setVisible(false);
				} 
				
				// if orange juice or grape juice or bottle of water is selected calculate quantity and price
				if (orangeQty > 0 || grapeQty > 0 || waterQty > 0) {
					
					//Calculate the quantity and price of the Orange Juice Drink
					orange = (orangeQty * orangePrice);
					String orangeDrink = String.format("%.2f", orange);
					lblOrangeTotal.setText("$" + orangeDrink);
					
					//Calculate the quantity and price of the Grape Juice Drink
					grape = (grapeQty * grapePrice);
					String grapeDrink = String.format("%.2f", grape);
					lblGrapeTotal.setText("$" + grapeDrink);
					
					//Calculate the quantity and price of the Bottle of Water Drink
					water = (waterQty * waterPrice);
					String waterDrink = String.format("%.2f", water);
					lblWaterTotal.setText("$" + waterDrink);
					lblError.setVisible(false);
					
				} else {
					lblError.setText("Please type a number");
					lblError.setVisible(true);
				}
				//--------------------------CALCULATE SUBTOTAL & TOTAL----------------------------------------------//
				
				//Calculate the subtotal of all Meals
				double allMeals = chickenSandwich + cubanSandwich + tripletaSandwich;
				//String subTotalMeal = String.format("%.2f", allMeals);
				//lblSubTotalOrder.setText("$" + subTotalMeal);

				
				//Calculate the subtotal of all Drinks
				double allDrinks = coke + sprite + coffee + orange + grape + water;
				String subTotalDrinks = String.format("%.2f", allDrinks);
				//lblSubTotalDrinks.setText("$" + subTotalDrinks);
				lblDrinksTotal.setText("$" + subTotalDrinks);
				
				double subtotal = allMeals + allDrinks;
				String subTotalOrder = String.format("%.2f", subtotal);
				lblSubTotalOrder.setText("$" + subTotalOrder);
				
				//Calculate tax
				double taxRate = 0.07;
				String taxTotal = String.format("%.2f", allMeals * taxRate + allDrinks * taxRate);
				lblTaxTotal.setText("$" + taxTotal);
				
				// Calculate total order
				String allTotals =  String.format("%.2f", allMeals + (allMeals * taxRate) + allDrinks + (allDrinks * taxRate) );
				lblTotalOrder.setText("$" + allTotals);
				lblError.setVisible(false);
			}
		});
		btnSubmitTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//food quantity reset
				textFieldChickenQty.setText("0");
				textFieldCubanQty.setText("0");
				textFieldTripletaQty.setText("0");
				
				//food total reset
				lblChickenTotal.setText("$0.00");
				lblCubanTotal.setText("$0.00");
				lblTripletaTotal.setText("$0.00");
				
				//food subtotal and total reset
				lblSubTotalOrder.setText("$0.00");
				lblTaxTotal.setText("$0.00");
				lblTotalOrder.setText("$0.00");
				
				//drinks reset
				textFieldCokeQty.setText("0");
				textFieldSpriteQty.setText("0");
				textFieldOrangeQty.setText("0");
				textFieldGrapeQty.setText("0");
				textFieldCoffeeQty.setText("0");
				textFieldWaterQty.setText("0");
				
				//drinks total reset
				lblCokeTotal.setText("$0.00");
				lblSpriteTotal.setText("$0.00");
				lblOrangeTotal.setText("$0.00");
				lblGrapeTotal.setText("$0.00");
				lblCoffeeTotal.setText("$0.00");
				lblWaterTotal.setText("$0.00");
				
				//drinks subtotal reset
				lblSubTotalOrder.setText("$0.00");
				lblDrinksTotal.setText("$0.00");
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBackground(new Color(0, 0, 128));
		btnReset.setBounds(513, 487, 141, 29);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(new Color(0, 0, 128));
		btnExit.setBounds(754, 487, 141, 29);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 128), 7, true));
		panel_3.setBounds(962, 122, 380, 496);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(23, 29, 328, 442);
		panel_3.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_5, null);
		panel_5.setLayout(null);
		
		JTextArea textAreaReceipts = new JTextArea();
		textAreaReceipts.setBounds(0, 0, 323, 414);
		panel_5.add(textAreaReceipts);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 451, 925, 24);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(10, 559, 925, 24);
		frame.getContentPane().add(separator_7);
		
		// Button to get order and print Receipt
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Declare variables and initialize to Get and Display each product quantity
				int chickenQty = (int) Double.parseDouble(textFieldChickenQty.getText());
				int cubanQty = (int) Double.parseDouble(textFieldCubanQty.getText());
				int tripletaQty = (int) Double.parseDouble(textFieldTripletaQty.getText());
				
				// Declare and initialize variables to Get and Display values of each drink quantity
				int cokeQty = (int) Double.parseDouble(textFieldCokeQty.getText());
				int spriteQty = (int) Double.parseDouble(textFieldSpriteQty.getText());
				int coffeeQty = (int) Double.parseDouble(textFieldCoffeeQty.getText());
				int orangeQty = (int) Double.parseDouble(textFieldOrangeQty.getText());
				int grapeQty = (int) Double.parseDouble(textFieldGrapeQty.getText());
				int waterQty = (int) Double.parseDouble(textFieldWaterQty.getText());
				
				// Variables to Get and Display drinks prices
				String cokePrice = lblCokeTotal.getText();
				String spritePrice = lblSpriteTotal.getText();
				String coffeePrice = lblCoffeeTotal.getText();
				String orangePrice = lblOrangeTotal.getText();
				String grapePrice = lblGrapeTotal.getText();
				String waterPrice = lblWaterTotal.getText();
				
				// Variables to Get and Display products price
				String chickenPrice = lblChickenTotal.getText();
				String cubanPrice = lblCubanTotal.getText();
				String tripletaPrice = lblTripletaTotal.getText();
				
				// Variables to Get and Display subtotal, tax and total
				//String getFoodCost = lblSubTotalOrder.getText();
				String getSubtotals = lblSubTotalOrder.getText();
				//String getSubtotals = (getFoodCost + getDrinkCost);
				String getTax = lblTaxTotal.getText();
				String getTotalReceipt = lblTotalOrder.getText();
				//----------------------------------------------PRINT RECEIPT ON THE RECEIPT TAB---------------------------------------------------//
				textAreaReceipts.append ("\t\n\t   -------   Welcome!  -------\t\t\t\n" 
							+ "\n-------------------Restaurant Management Systems-------------------\n\n");
				
				if (chickenQty > 0)
				{
					textAreaReceipts.append ("\nChicken Sandwich\t" + chickenQty + "\t" + chickenPrice);
				} 
				
				if (cubanQty > 0)
				{
					textAreaReceipts.append ("\nCuban Sandwich\t" + cubanQty + "\t" + cubanPrice);
				}	
				
				if (tripletaQty > 0)
				{
					textAreaReceipts.append ("\nTripleta Sandwich\t" + tripletaQty + "\t" + tripletaPrice);
				} 
				
				if (cokeQty > 0)
				{
					textAreaReceipts.append ("\nCoke\t\t" + cokeQty + "\t" + cokePrice);
				} 
				
				if (spriteQty > 0)
				{
					textAreaReceipts.append ("\nSprite\t\t"  + spriteQty + "\t" + spritePrice);
				} 
				
				if (orangeQty > 0)
				{
					textAreaReceipts.append ("\nOrange Juice\t\t" + orangeQty + "\t" + orangePrice);
				} 
				
				if (grapeQty > 0)
				{
					textAreaReceipts.append ("\nGrape Juice\t\t" + grapeQty + "\t" + grapePrice);
				} 
				
				if (coffeeQty > 0)
				{
					textAreaReceipts.append ("\nHot Coffee\t\t" + coffeeQty + "\t" + coffeePrice);
				} 
				
				if (waterQty > 0)
				{
					textAreaReceipts.append ("\nBottle of Water\t\t" + waterQty + "\t" + waterPrice);
				} 
				
				// Display subtotal, tax and total into receipt
				textAreaReceipts.append ("\n\n\n_________________________________________________________________________________" 
						+ "\n\t\tSubtotal:  \t " + getSubtotals 
						+ "\n\t\tTax:  \t " + getTax + "\n\t\tTotal:     \t " 
						+ getTotalReceipt + "\n\n\t   -------   Thank You!  -------\t\t\t\n");
				
				//textAreaReceipts.append ("\t\nRestaurant Management Systems:\n\n" + "Chicken Sandwich:\t"
					//	+ chickenQty + "\t" + chickenPrice +"\nCuban Sandwich:\t" 
					//	+ cubanQty + "\t" + cubanPrice + "\nTripleta Sandwich:\t" 
					//	+ tripletaQty + "\t" + tripletaPrice + "\nCost of Food: \t\t\t"
					//	+ getFoodCost + "\nCost of Drinks: \t\t\t "
					//	+ getDrinkCost +  "\n\t\tSub-total: " + getSubtotals 
					//	+ "\n\n\t\tTax:  \t " + getTax + "\n\t\tTotal:   " + getTotalReceipt + "\n\nThanks for supporting Us!!\t\t");
			}
		});
		btnReceipt.setForeground(Color.WHITE);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReceipt.setBackground(new Color(0, 0, 128));
		btnReceipt.setBounds(283, 487, 141, 29);
		frame.getContentPane().add(btnReceipt);
		
		
	}
}

