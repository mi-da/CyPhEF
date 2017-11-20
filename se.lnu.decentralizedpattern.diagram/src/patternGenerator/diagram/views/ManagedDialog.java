package patternGenerator.diagram.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import patternGenerator.PhysicalNode;



public class ManagedDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public ArrayList<PhysicalNode> physicalNodes = new ArrayList<PhysicalNode>();
	public ArrayList<String> monitoredAttributes = new ArrayList<String>();
	public ArrayList<String> nonMonitoredAttributes = new ArrayList<String>();
	
	public PhysicalNode physicalNode = new PhysicalNode();
	
	private JButton btnRemove;
	private JButton btnAdd;
	private JButton okButton = new JButton("OK");
	
	private JComboBox<String> comboBox;
	private JList<String> listMonitored;
	private JList<String> listNonMonitored;

	public void init(){
		PhysicalNode p1 = new PhysicalNode();
		PhysicalNode p2 = new PhysicalNode();
		p1.setName("bus1");
		p2.setName("bus2");
		
		ArrayList<String> attributes_1 = new ArrayList<String>();
		ArrayList<String> attributes_2 = new ArrayList<String>();
		
		p1.addAttribute("1bus1.lenght");
		p1.addAttribute("1bus1.V");
		p1.addAttribute("1bus1.P");
		p1.addAttribute("2bus1.lenght");
		p1.addAttribute("2bus1.V");
		p1.addAttribute("2bus1.P");
		p1.addAttribute("2bus1.lenght");
		p1.addAttribute("3bus1.V");
		p1.addAttribute("3bus1.P");
		p1.addAttribute("3bus1.lenght");
		p1.addAttribute("4bus1.V");
		p1.addAttribute("4bus1.P");
		p1.addAttribute("4bus1.lenght");
		p1.addAttribute("5bus1.V");
		p1.addAttribute("5bus1.P");
		p1.addAttribute("5bus1.lenght");
		p1.addAttribute("6bus1.V");
		p1.addAttribute("6bus1.P");
		p1.addAttribute("6bus1.lenght");
		p1.addAttribute("7bus1.V");
		p1.addAttribute("7bus1.P");
		p1.addAttribute("7bus1.lenght");
		p1.addAttribute("8bus1.V");
		p1.addAttribute("8bus1.P");
		p1.addAttribute("8bus1.lenght");
		p1.addAttribute("9bus1.V");
		p1.addAttribute("9bus1.P");
		p1.addAttribute("9bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		p1.addAttribute("bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		p1.addAttribute("bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		p1.addAttribute("bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		p1.addAttribute("bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		p1.addAttribute("bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		p1.addAttribute("bus1.lenght");
		p1.addAttribute("bus1.V");
		p1.addAttribute("bus1.P");
		
		p2.addAttribute("bus2.lenght");
		p2.addAttribute("bus2.P");
		
		physicalNodes.add(p2);
		physicalNodes.add(p1);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("ciao");
		try {
			ManagedDialog dialog = new ManagedDialog(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ManagedDialog(ArrayList<PhysicalNode> nodes) {
		if(nodes == null || nodes.isEmpty()){
			
			this.physicalNodes= new ArrayList<PhysicalNode>();
			init();
		}
		else{
			this.physicalNodes= nodes;
		}
		setTitle("Choose component to monitor...");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Annalisa\\Downloads\\if_settings1_16x16_9983.gif"));
		setBounds(450, 200, 597, 371);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			{
				Box verticalBox = Box.createVerticalBox();
				panel.add(verticalBox, BorderLayout.CENTER);
				{
					Component verticalStrut = Box.createVerticalStrut(20);
					verticalBox.add(verticalStrut);
				}
				{
					Box horizontalBox = Box.createHorizontalBox();
					verticalBox.add(horizontalBox);
					{
						JLabel lblNewLabel = new JLabel("Physical component: ");
						horizontalBox.add(lblNewLabel);
					}
					{
						Component horizontalStrut = Box.createHorizontalStrut(20);
						horizontalBox.add(horizontalStrut);
					}
					{
						comboBox = new JComboBox();
						horizontalBox.add(comboBox);
						for(PhysicalNode p:physicalNodes){
							System.out.println(p.getName());
							comboBox.addItem(p.getName());
						}
					}
				}
				{
					Component verticalStrut = Box.createVerticalStrut(20);
					verticalBox.add(verticalStrut);
				}
				{
					Box verticalBox_1 = Box.createVerticalBox();
					verticalBox.add(verticalBox_1);
				}
				{
					Component verticalStrut = Box.createVerticalStrut(20);
					verticalBox.add(verticalStrut);
				}
				{
					JPanel panel_1 = new JPanel();
					verticalBox.add(panel_1);
					GridBagLayout gbl_panel_1 = new GridBagLayout();
					gbl_panel_1.columnWidths = new int[] {20, 150, 20, 177, 20, 150, 20};
					gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
					gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
					gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
					panel_1.setLayout(gbl_panel_1);
					{
						JLabel lblAttributes = new JLabel("Attributes");
						GridBagConstraints gbc_lblAttributes = new GridBagConstraints();
						gbc_lblAttributes.insets = new Insets(0, 0, 5, 5);
						gbc_lblAttributes.gridx = 1;
						gbc_lblAttributes.gridy = 0;
						panel_1.add(lblAttributes, gbc_lblAttributes);
					}
					{
						JLabel lblMonitored = new JLabel("Monitored ");
						GridBagConstraints gbc_lblMonitored = new GridBagConstraints();
						gbc_lblMonitored.insets = new Insets(0, 0, 5, 5);
						gbc_lblMonitored.gridx = 5;
						gbc_lblMonitored.gridy = 0;
						panel_1.add(lblMonitored, gbc_lblMonitored);
					}
					{
						Component horizontalStrut = Box.createHorizontalStrut(20);
						GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
						gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
						gbc_horizontalStrut.gridx = 0;
						gbc_horizontalStrut.gridy = 1;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
					{
						JPanel panel_2 = new JPanel();
						panel_2.setBackground(Color.WHITE);
						GridBagConstraints gbc_panel_2 = new GridBagConstraints();
						gbc_panel_2.insets = new Insets(0, 0, 5, 5);
						gbc_panel_2.fill = GridBagConstraints.BOTH;
						gbc_panel_2.gridx = 1;
						gbc_panel_2.gridy = 1;
						panel_1.add(panel_2, gbc_panel_2);
						GridBagLayout gbl_panel_2 = new GridBagLayout();
						gbl_panel_2.columnWidths = new int[]{90, 0};
						gbl_panel_2.rowHeights = new int[]{130, 0};
						gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
						gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
						panel_2.setLayout(gbl_panel_2);
						{
							listNonMonitored = new JList();
							GridBagConstraints gbc_list = new GridBagConstraints();
							gbc_list.fill = GridBagConstraints.HORIZONTAL;
							gbc_list.anchor = GridBagConstraints.NORTH;
							gbc_list.gridx = 0;
							gbc_list.gridy = 0;
							panel_2.add(listNonMonitored, gbc_list);
						}
					}
					{
						Component horizontalStrut = Box.createHorizontalStrut(20);
						GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
						gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
						gbc_horizontalStrut.gridx = 2;
						gbc_horizontalStrut.gridy = 1;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
					{
						Box verticalBox_1 = Box.createVerticalBox();
						GridBagConstraints gbc_verticalBox_1 = new GridBagConstraints();
						gbc_verticalBox_1.anchor = GridBagConstraints.NORTH;
						gbc_verticalBox_1.insets = new Insets(0, 0, 5, 5);
						gbc_verticalBox_1.gridx = 3;
						gbc_verticalBox_1.gridy = 1;
						panel_1.add(verticalBox_1, gbc_verticalBox_1);
						{
							Component verticalStrut = Box.createVerticalStrut(20);
							verticalBox_1.add(verticalStrut);
						}
						{
							btnAdd = new JButton("Monitor  >>");
							verticalBox_1.add(btnAdd);
						}
						{
							Component verticalStrut = Box.createVerticalStrut(20);
							verticalBox_1.add(verticalStrut);
						}
						{
							btnRemove = new JButton("Remove <<");
							verticalBox_1.add(btnRemove);
						}
					}
					{
						Component horizontalStrut = Box.createHorizontalStrut(20);
						GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
						gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
						gbc_horizontalStrut.gridx = 4;
						gbc_horizontalStrut.gridy = 1;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
					{
						JPanel panel_2 = new JPanel();
						panel_2.setBackground(Color.WHITE);
						GridBagConstraints gbc_panel_2 = new GridBagConstraints();
						gbc_panel_2.insets = new Insets(0, 0, 5, 5);
						gbc_panel_2.fill = GridBagConstraints.BOTH;
						gbc_panel_2.gridx = 5;
						gbc_panel_2.gridy = 1;
						panel_1.add(panel_2, gbc_panel_2);
						GridBagLayout gbl_panel_2 = new GridBagLayout();
						gbl_panel_2.columnWidths = new int[]{91, 0};
						gbl_panel_2.rowHeights = new int[]{1, 0};
						gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
						gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
						panel_2.setLayout(gbl_panel_2);
						{
							listMonitored = new JList();
							GridBagConstraints gbc_list = new GridBagConstraints();
							gbc_list.fill = GridBagConstraints.BOTH;
							gbc_list.gridx = 0;
							gbc_list.gridy = 0;
							panel_2.add(listMonitored, gbc_list);
						}
					}
					{
						Component horizontalStrut = Box.createHorizontalStrut(20);
						GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
						gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
						gbc_horizontalStrut.gridx = 0;
						gbc_horizontalStrut.gridy = 2;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
				}
			}
		}
		for( PhysicalNode p: physicalNodes){
			System.out.println(comboBox.getSelectedItem().toString());
			System.out.println(p.getName());
			if(comboBox.getSelectedItem().toString().equals(p.getName())){
				System.out.println("OK");
				nonMonitoredAttributes.addAll(p.getAttributes());
				System.out.println(p.getAttributes().get(0));
				String[] stockArr = new String[nonMonitoredAttributes.size()];
				stockArr = nonMonitoredAttributes.toArray(stockArr);
				for(String s : stockArr)
				    System.out.println(s);
				listNonMonitored.setListData(stockArr);
			}
		}
		if(listMonitored.getSelectedIndices().length <=0){
			btnRemove.setEnabled(false);
			okButton.setEnabled(false);
		}
			
		if(listNonMonitored.getSelectedIndices().length <=0)
			btnAdd.setEnabled(false);
		
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				nonMonitoredAttributes = new ArrayList<String>();
				monitoredAttributes = new ArrayList<String>();
				String[] stockArr = new String[monitoredAttributes.size()];
				stockArr = monitoredAttributes.toArray(stockArr);
				listMonitored.setListData(stockArr);
				for( PhysicalNode p: physicalNodes){
					if(comboBox.getSelectedItem().toString().equals(p.getName())){
						nonMonitoredAttributes.addAll(p.getAttributes());
						String[] stockArr88 = new String[nonMonitoredAttributes.size()];
						stockArr88 = nonMonitoredAttributes.toArray(stockArr88);
						listNonMonitored.setListData(stockArr88);
					}
				}
			}
		});
		
		//monitoredList.setScr
		
		listNonMonitored.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] selected = listNonMonitored.getSelectedIndices();
				if(selected.length>0){
					btnAdd.setEnabled(true);
				}
				else
					btnAdd.setEnabled(false);
			}
		});
		
		listMonitored.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] selected = listMonitored.getSelectedIndices();
				if(selected.length>0){
					btnRemove.setEnabled(true);
					okButton.setEnabled(true);
				}
				else{
					btnRemove.setEnabled(false);
					okButton.setEnabled(false);
				}
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monitoredAttributes.addAll(listNonMonitored.getSelectedValuesList());
				//nonMonitoredAttributes.removeAll(listNonMonitored.getSelectedValuesList());
				
				String[] stockArr1 = new String[nonMonitoredAttributes.size()];
				stockArr1 = nonMonitoredAttributes.toArray(stockArr1);
				
				String[] stockArr2 = new String[monitoredAttributes.size()];
				stockArr2 =monitoredAttributes.toArray(stockArr2);
				
				listNonMonitored.setListData(stockArr1);
				listMonitored.setListData(stockArr2);
				if(!monitoredAttributes.isEmpty()){
					okButton.setEnabled(true);
				}
				
			}
		});
		
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//nonMonitoredAttributes.addAll(listMonitored.getSelectedValuesList());
				monitoredAttributes.removeAll(listMonitored.getSelectedValuesList());
				
				String[] stockArr1 = new String[nonMonitoredAttributes.size()];
				stockArr1 = nonMonitoredAttributes.toArray(stockArr1);
				
				String[] stockArr2 = new String[monitoredAttributes.size()];
				stockArr2 =monitoredAttributes.toArray(stockArr2);
				
				listNonMonitored.setListData(stockArr1);
				listMonitored.setListData(stockArr2);
				
			}
		});
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						physicalNode.setName(comboBox.getSelectedItem().toString());
						for(String s : monitoredAttributes){
							physicalNode.addAttribute(s);
						}
						dispose();
						
					}
				});
			}
		}
		
	}

	public PhysicalNode getPhysicalNode() {
		return physicalNode;
	}

	public void setPhysicalNode(PhysicalNode physicalNode) {
		this.physicalNode = physicalNode;
	}

	public void setPhysicalNodes(ArrayList<PhysicalNode> physicalNodes) {
		this.physicalNodes = physicalNodes;
	}

	
}
