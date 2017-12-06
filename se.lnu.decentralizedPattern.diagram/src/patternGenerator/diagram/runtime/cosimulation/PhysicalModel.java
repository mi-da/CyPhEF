package patternGenerator.diagram.runtime.cosimulation;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import prova.src.lnu.cosimulation.CS_PhysicalNetwork;
import prova.src.lnu.entities.PhysicalNode;




public class PhysicalModel {
	
	
	private static ArrayList<PhysicalNode> physicalNodes = new ArrayList<PhysicalNode>();
	private static ArrayList<PhysicalNode> nonSelectedNodes = new ArrayList<PhysicalNode>();
	
	public static boolean isInitialized = false;
	
	public static void choosePhysicalModel(){
////		JFileChooser fc = new JFileChooser();
////		
////		int returnVal = fc.showOpenDialog(null);
////
////        if (returnVal == JFileChooser.APPROVE_OPTION) {
////            File file = fc.getSelectedFile();
////            
//            CS_PhysicalNetwork physicalNetwork = new CS_PhysicalNetwork();
//    		String[] params = {"fmu_model/ObjectStab_Examples_Ninebus.fmu"};
//    		physicalNetwork.initialize(params);
//    		physicalNetwork.print();
    	
		BufferedReader br = null;
		FileReader fr = null;

		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader("fmu_model/phisicalNodes.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;
			PhysicalNode node = new PhysicalNode();

			while ((sCurrentLine = br.readLine()) != null) {
				if(sCurrentLine.startsWith("   "))
					node.addAttribute(sCurrentLine);
				else{
					nonSelectedNodes.add(node);
					physicalNodes.add(node);
					node = new PhysicalNode();
					node.setName(sCurrentLine);
				}
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
//    		nonSelectedNodes.addAll(physicalNetwork.getPhysicalNodes());
//    		physicalNodes.addAll(physicalNetwork.getPhysicalNodes());
            //This is where a real application would open the file.
            
            
        
    
	}
	
	public static void init(){
//		PhysicalNode g2 = new PhysicalNode();
//		g2.addAttribute("");
//		PhysicalNode p2 = new PhysicalNode();
//		
//	
//		
//		p1.setName("bus1");
//		p2.setName("bus2");
//		
//		ArrayList<String> attributes_1 = new ArrayList<String>();
//		ArrayList<String> attributes_2 = new ArrayList<String>();
//		
//		p1.addAttribute("1bus1.lenght");
//		p1.addAttribute("1bus1.V");
//		p1.addAttribute("1bus1.P");
//		p1.addAttribute("2bus1.lenght");
////		p1.addAttribute("2bus1.V");
////		p1.addAttribute("2bus1.P");
////		p1.addAttribute("2bus1.lenght");
////		p1.addAttribute("3bus1.V");
////		p1.addAttribute("3bus1.P");
////		p1.addAttribute("3bus1.lenght");
////		p1.addAttribute("4bus1.V");
////		p1.addAttribute("4bus1.P");
////		p1.addAttribute("4bus1.lenght");
////		p1.addAttribute("5bus1.V");
////		p1.addAttribute("5bus1.P");
////		p1.addAttribute("5bus1.lenght");
////		p1.addAttribute("6bus1.V");
////		p1.addAttribute("6bus1.P");
////		p1.addAttribute("6bus1.lenght");
////		p1.addAttribute("7bus1.V");
////		p1.addAttribute("7bus1.P");
////		p1.addAttribute("7bus1.lenght");
////		p1.addAttribute("8bus1.V");
////		p1.addAttribute("8bus1.P");
////		p1.addAttribute("8bus1.lenght");
////		p1.addAttribute("9bus1.V");
////		p1.addAttribute("9bus1.P");
////		p1.addAttribute("9bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
////		p1.addAttribute("bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
////		p1.addAttribute("bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
////		p1.addAttribute("bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
////		p1.addAttribute("bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
////		p1.addAttribute("bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
////		p1.addAttribute("bus1.lenght");
////		p1.addAttribute("bus1.V");
////		p1.addAttribute("bus1.P");
//		
//		p2.addAttribute("bus2.lenght");
//		p2.addAttribute("bus2.P");
//		
//		
//		
//		physicalNodes.add(p2);
//		physicalNodes.add(p1);
//		
//		nonSelectedNodes.addAll(physicalNodes);
	}
	
	public static ArrayList<PhysicalNode> getPhysicalNodes() {
		if(!isInitialized){
			init();
			isInitialized = true;
		}
		return physicalNodes;
	}
	public static ArrayList<PhysicalNode> getNonSelectedNodes() {
		return nonSelectedNodes;
	}
	
	public static void addPhysicalNode(PhysicalNode p){
		physicalNodes.add(p);
	}
	
	public static void addNonSelectedNode(PhysicalNode p){
		nonSelectedNodes.add(p);
	}
	
	public static void removePhysicalNode(PhysicalNode p){
		for(PhysicalNode pp :physicalNodes)
			if(p.getName().equalsIgnoreCase(pp.getName())){
				physicalNodes.remove(pp);
				return;
			}
	}
	
	public static void removeNonSelectedNode(PhysicalNode p){
		for(PhysicalNode pp :nonSelectedNodes)
			if(p.getName().equalsIgnoreCase(pp.getName())){
				nonSelectedNodes.remove(pp);
				return;
			}
	}

}
