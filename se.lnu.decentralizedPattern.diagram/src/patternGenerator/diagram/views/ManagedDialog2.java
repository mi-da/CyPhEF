package patternGenerator.diagram.views;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import patternGenerator.PhysicalNode;

import javax.swing.Box;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JList;
import java.awt.Color;

public class ManagedDialog2 extends JDialog {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("ciao");
		try {
			ManagedDialog2 dialog = new ManagedDialog2(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ManagedDialog2(ArrayList<PhysicalNode> nodes) {
		this.physicalNodes = nodes;
		setTitle("Choose component to monitor...");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Annalisa\\Downloads\\if_settings1_16x16_9983.gif"));
		setBounds(450, 200, 450, 300);
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
					Component verticalStrut = Box.createVerticalStrut(20);
					verticalBox.add(verticalStrut);
				}
				{
					JPanel panel_1 = new JPanel();
					verticalBox.add(panel_1);
					GridBagLayout gbl_panel_1 = new GridBagLayout();
					gbl_panel_1.columnWidths = new int[] {20, 90, 20, 89, 20, 90, 20};
					gbl_panel_1.rowHeights = new int[]{0, 0, 0};
					gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
					gbl_panel_1.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
					panel_1.setLayout(gbl_panel_1);
					{
						Component horizontalStrut = Box.createHorizontalStrut(20);
						GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
						gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
						gbc_horizontalStrut.gridx = 0;
						gbc_horizontalStrut.gridy = 0;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
					{
						JPanel panel_2 = new JPanel();
						panel_2.setBackground(Color.WHITE);
						GridBagConstraints gbc_panel_2 = new GridBagConstraints();
						gbc_panel_2.insets = new Insets(0, 0, 5, 5);
						gbc_panel_2.fill = GridBagConstraints.BOTH;
						gbc_panel_2.gridx = 1;
						gbc_panel_2.gridy = 0;
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
						gbc_horizontalStrut.gridy = 0;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
					{
						Box verticalBox_1 = Box.createVerticalBox();
						GridBagConstraints gbc_verticalBox_1 = new GridBagConstraints();
						gbc_verticalBox_1.insets = new Insets(0, 0, 5, 5);
						gbc_verticalBox_1.gridx = 3;
						gbc_verticalBox_1.gridy = 0;
						panel_1.add(verticalBox_1, gbc_verticalBox_1);
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
						gbc_horizontalStrut.gridy = 0;
						panel_1.add(horizontalStrut, gbc_horizontalStrut);
					}
					{
						JPanel panel_2 = new JPanel();
						panel_2.setBackground(Color.WHITE);
						GridBagConstraints gbc_panel_2 = new GridBagConstraints();
						gbc_panel_2.insets = new Insets(0, 0, 5, 0);
						gbc_panel_2.fill = GridBagConstraints.BOTH;
						gbc_panel_2.gridx = 5;
						gbc_panel_2.gridy = 0;
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
						gbc_horizontalStrut.gridy = 1;
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
						String[] stockArr2 = new String[nonMonitoredAttributes.size()];
						stockArr2 = nonMonitoredAttributes.toArray(stockArr2);
						listNonMonitored.setListData(stockArr2);
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
				nonMonitoredAttributes.removeAll(listNonMonitored.getSelectedValuesList());
				
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
				nonMonitoredAttributes.addAll(listMonitored.getSelectedValuesList());
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
