package patternGenerator.diagram.runtime.cosimulation;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import patternGenerator.PhysicalNode;







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
		
		
		PhysicalNode G2 =  new PhysicalNode();
		

		G2.addAttribute("Eqp");
		G2.addAttribute("Exc.AVR.x[1]");
		G2.addAttribute("delta");
		G2.addAttribute("w");
		G2.addAttribute("Efd");
		G2.addAttribute("Exc.AVR.u");
		G2.addAttribute("Exc.AVR.x_scaled[1]");
		G2.addAttribute("Exc.AVR.y");
		G2.addAttribute("Exc.u");
		G2.addAttribute("Gov.u");
		G2.addAttribute("Gov.werror.y");
		G2.addAttribute("Iarm");
		G2.addAttribute("Pe");
		G2.addAttribute("Pg");
		G2.addAttribute("Pm");
		G2.addAttribute("Qg");
		G2.addAttribute("V");
		G2.addAttribute("id");
		G2.addAttribute("iq");
		G2.addAttribute("theta");
		G2.addAttribute("vd");
		G2.addAttribute("vq");
		G2.addAttribute("wrl.wr.Hsum");
		G2.addAttribute("wrl.wr.Hwsum");
		G2.addAttribute("D");
		G2.addAttribute("Exc.AVR.a[1]");
		G2.addAttribute("Exc.AVR.a[2]");
		G2.addAttribute("Exc.AVR.a_end");
		G2.addAttribute("Exc.AVR.b[1]");
		G2.addAttribute("Exc.AVR.bb[1]");
		G2.addAttribute("Exc.AVR.bb[2]");
		G2.addAttribute("Exc.AVR.d");
		G2.addAttribute("Exc.AVR.x_start[1]");
		G2.addAttribute("Exc.AVR.y_start");
		G2.addAttribute("Exc.Ef0");
		G2.addAttribute("Exc.Efmax");
		G2.addAttribute("Exc.Efmin");
		G2.addAttribute("Exc.K");
		G2.addAttribute("Exc.Limiter.uMax");
		G2.addAttribute("Exc.Limiter.uMin");
		G2.addAttribute("Exc.T");
		G2.addAttribute("Exc.Verror.k1");
		G2.addAttribute("Exc.Verror.k2");
		G2.addAttribute("Exc.Vref");
		G2.addAttribute("Gov.Limiter.uMax");
		G2.addAttribute("Gov.Limiter.uMin");
		G2.addAttribute("Gov.Pm0");
		G2.addAttribute("Gov.Pmmax");
		G2.addAttribute("Gov.Pmmin");
		G2.addAttribute("Gov.werror.k1");
		G2.addAttribute("Gov.werror.k2");
		G2.addAttribute("Gov.wref");
		G2.addAttribute("H");
		G2.addAttribute("Pg0");
		G2.addAttribute("Sbase");
		G2.addAttribute("Td0p");
		G2.addAttribute("TripTime");
		G2.addAttribute("V0");
		G2.addAttribute("ra");
		G2.addAttribute("rt");
		G2.addAttribute("theta0");
		G2.addAttribute("xd");
		G2.addAttribute("xdp");
		G2.addAttribute("xq");
		G2.addAttribute("xt");
		G2.addAttribute("Exc.Limiter.u");
		G2.addAttribute("Exc.Limiter.y");
		G2.addAttribute("Exc.Verror.u1");
		G2.addAttribute("Exc.Verror.u2");
		G2.addAttribute("Exc.Verror.y");
		G2.addAttribute("Exc.y");
		G2.addAttribute("Gov.Limiter.u");
		G2.addAttribute("Gov.Limiter.y");
		G2.addAttribute("Gov.werror.u1");
		G2.addAttribute("Gov.werror.u2");
		G2.addAttribute("Gov.y");
		G2.addAttribute("T.ia");
		G2.addAttribute("T.ib");
		G2.addAttribute("T.va");
		G2.addAttribute("T.vb");
		G2.addAttribute("Exc.AVR.initType");
		G2.addAttribute("Exc.AVR.na");
		G2.addAttribute("Exc.AVR.nb");
		G2.addAttribute("Exc.AVR.nx");
		G2.addAttribute("online");
		G2.addAttribute("Exc.Limiter.limitsAtInit");
		G2.addAttribute("Exc.Limiter.strict");
		G2.addAttribute("Gov.Limiter.limitsAtInit");
		G2.addAttribute("Gov.Limiter.strict");
		G2.addAttribute("isSlack");
		
		G2.setName("G2");
		physicalNodes.add(G2);

		PhysicalNode G3 =  new PhysicalNode();
		G3.setName("G3");

		G3.addAttribute("Eqp");
		G3.addAttribute("Exc.AVR.x[1]");
		G3.addAttribute("delta");
		G3.addAttribute("w");
		G3.addAttribute("Efd");
		G3.addAttribute("Exc.AVR.u");
		G3.addAttribute("Exc.AVR.x_scaled[1]");
		G3.addAttribute("Exc.AVR.y");
		G3.addAttribute("Exc.u");
		G3.addAttribute("Gov.u");
		G3.addAttribute("Gov.werror.y");
		G3.addAttribute("Iarm");
		G3.addAttribute("Pe");
		G3.addAttribute("Pg");
		G3.addAttribute("Pm");
		G3.addAttribute("Qg");
		G3.addAttribute("V");
		G3.addAttribute("id");
		G3.addAttribute("iq");
		G3.addAttribute("theta");
		G3.addAttribute("vd");
		G3.addAttribute("vq");
		G3.addAttribute("wrl.wr.Hsum");
		G3.addAttribute("wrl.wr.Hwsum");
		G3.addAttribute("D");
		G3.addAttribute("Exc.AVR.a[1]");
		G3.addAttribute("Exc.AVR.a[2]");
		G3.addAttribute("Exc.AVR.a_end");
		G3.addAttribute("Exc.AVR.b[1]");
		G3.addAttribute("Exc.AVR.bb[1]");
		G3.addAttribute("Exc.AVR.bb[2]");
		G3.addAttribute("Exc.AVR.d");
		G3.addAttribute("Exc.AVR.x_start[1]");
		G3.addAttribute("Exc.AVR.y_start");
		G3.addAttribute("Exc.Ef0");
		G3.addAttribute("Exc.Efmax");
		G3.addAttribute("Exc.Efmin");
		G3.addAttribute("Exc.K");
		G3.addAttribute("Exc.Limiter.uMax");
		G3.addAttribute("Exc.Limiter.uMin");
		G3.addAttribute("Exc.T");
		G3.addAttribute("Exc.Verror.k1");
		G3.addAttribute("Exc.Verror.k2");
		G3.addAttribute("Exc.Vref");
		G3.addAttribute("Gov.Limiter.uMax");
		G3.addAttribute("Gov.Limiter.uMin");
		G3.addAttribute("Gov.Pm0");
		G3.addAttribute("Gov.Pmmax");
		G3.addAttribute("Gov.Pmmin");
		G3.addAttribute("Gov.werror.k1");
		G3.addAttribute("Gov.werror.k2");
		G3.addAttribute("Gov.wref");
		G3.addAttribute("H");
		G3.addAttribute("Pg0");
		G3.addAttribute("Sbase");
		G3.addAttribute("Td0p");
		G3.addAttribute("TripTime");
		G3.addAttribute("V0");
		G3.addAttribute("ra");
		G3.addAttribute("rt");
		G3.addAttribute("theta0");
		G3.addAttribute("xd");
		G3.addAttribute("xdp");
		G3.addAttribute("xq");
		G3.addAttribute("xt");
		G3.addAttribute("Exc.Limiter.u");
		G3.addAttribute("Exc.Limiter.y");
		G3.addAttribute("Exc.Verror.u1");
		G3.addAttribute("Exc.Verror.u2");
		G3.addAttribute("Exc.Verror.y");
		G3.addAttribute("Exc.y");
		G3.addAttribute("Gov.Limiter.u");
		G3.addAttribute("Gov.Limiter.y");
		G3.addAttribute("Gov.werror.u1");
		G3.addAttribute("Gov.werror.u2");
		G3.addAttribute("Gov.y");
		G3.addAttribute("T.ia");
		G3.addAttribute("T.ib");
		G3.addAttribute("T.va");
		G3.addAttribute("T.vb");
		G3.addAttribute("Exc.AVR.initType");
		G3.addAttribute("Exc.AVR.na");
		G3.addAttribute("Exc.AVR.nb");
		G3.addAttribute("Exc.AVR.nx");
		G3.addAttribute("online");
		G3.addAttribute("Exc.Limiter.limitsAtInit");
		G3.addAttribute("Exc.Limiter.strict");
		G3.addAttribute("Gov.Limiter.limitsAtInit");
		G3.addAttribute("Gov.Limiter.strict");
		G3.addAttribute("isSlack");

		physicalNodes.add(G3);

		PhysicalNode LoadA =  new PhysicalNode();
		LoadA.setName("LoadA");

		LoadA.addAttribute("xp");
		LoadA.addAttribute("xq");
		LoadA.addAttribute("Pl");
		LoadA.addAttribute("Ql");
		LoadA.addAttribute("T.ia");
		LoadA.addAttribute("T.ib");
		LoadA.addAttribute("V");
		LoadA.addAttribute("theta");
		LoadA.addAttribute("P0");
		LoadA.addAttribute("Q0");
		LoadA.addAttribute("Tp");
		LoadA.addAttribute("Tq");
		LoadA.addAttribute("V0");
		LoadA.addAttribute("as");
		LoadA.addAttribute("at");
		LoadA.addAttribute("bs");
		LoadA.addAttribute("bt");
		LoadA.addAttribute("T.va");
		LoadA.addAttribute("T.vb");

		physicalNodes.add(LoadA);

		PhysicalNode LoadB =  new PhysicalNode();
		LoadB.setName("LoadB");

		LoadB.addAttribute("xp");
		LoadB.addAttribute("xq");
		LoadB.addAttribute("Pl");
		LoadB.addAttribute("Ql");
		LoadB.addAttribute("T.ia");
		LoadB.addAttribute("T.ib");
		LoadB.addAttribute("V");
		LoadB.addAttribute("theta");
		LoadB.addAttribute("P0");
		LoadB.addAttribute("Q0");
		LoadB.addAttribute("Tp");
		LoadB.addAttribute("Tq");
		LoadB.addAttribute("V0");
		LoadB.addAttribute("as");
		LoadB.addAttribute("at");
		LoadB.addAttribute("bs");
		LoadB.addAttribute("bt");
		LoadB.addAttribute("T.va");
		LoadB.addAttribute("T.vb");

		physicalNodes.add(LoadB);

		PhysicalNode LoadC =  new PhysicalNode();
		LoadC.setName("LoadC");


		LoadC.addAttribute("xp");
		LoadC.addAttribute("xq");
		LoadC.addAttribute("Pl");
		LoadC.addAttribute("Ql");
		LoadC.addAttribute("T.ia");
		LoadC.addAttribute("T.ib");
		LoadC.addAttribute("V");
		LoadC.addAttribute("theta");
		LoadC.addAttribute("P0");
		LoadC.addAttribute("Q0");
		LoadC.addAttribute("Tp");
		LoadC.addAttribute("Tq");
		LoadC.addAttribute("V0");
		LoadC.addAttribute("as");
		LoadC.addAttribute("at");
		LoadC.addAttribute("bs");
		LoadC.addAttribute("bt");
		LoadC.addAttribute("T.va");
		LoadC.addAttribute("T.vb");

		physicalNodes.add(LoadC);

		PhysicalNode Bus1 =  new PhysicalNode();
		Bus1.setName("Bus1");

		Bus1.addAttribute("T.ia");
		Bus1.addAttribute("T.ib");
		Bus1.addAttribute("T.va");
		Bus1.addAttribute("T.vb");
		Bus1.addAttribute("V");
		Bus1.addAttribute("theta");
		Bus1.addAttribute("thetadeg");

		physicalNodes.add(Bus1);

		PhysicalNode Bus2 =  new PhysicalNode();
		Bus2.setName("Bus2");

		Bus2.addAttribute("T.ia");
		Bus2.addAttribute("T.ib");
		Bus2.addAttribute("T.va");
		Bus2.addAttribute("T.vb");
		Bus2.addAttribute("V");
		Bus2.addAttribute("theta");
		Bus2.addAttribute("thetadeg");

		physicalNodes.add(Bus2);

		PhysicalNode Bus3 =  new PhysicalNode();
		Bus3.setName("Bus3");

		Bus3.addAttribute("T.ia");
		Bus3.addAttribute("T.ib");
		Bus3.addAttribute("T.va");
		Bus3.addAttribute("T.vb");
		Bus3.addAttribute("V");
		Bus3.addAttribute("theta");
		Bus3.addAttribute("thetadeg");

		physicalNodes.add(Bus3);

		PhysicalNode Bus4 =  new PhysicalNode();
		Bus4.setName("Bus4");

		Bus4.addAttribute("B1.T1.va");
		Bus4.addAttribute("B1.T1.vb");
		Bus4.addAttribute("G.T.va");
		Bus4.addAttribute("G.T.vb");
		Bus4.addAttribute("T.ia");
		Bus4.addAttribute("T.ib");
		Bus4.addAttribute("T.va");
		Bus4.addAttribute("T.vb");
		Bus4.addAttribute("V");
		Bus4.addAttribute("iFault");
		Bus4.addAttribute("theta");
		Bus4.addAttribute("thetadeg");
		Bus4.addAttribute("B1.CloseTime");
		Bus4.addAttribute("B1.OpenTime");
		Bus4.addAttribute("B1.small");
		Bus4.addAttribute("FaultDuration");
		Bus4.addAttribute("FaultR");
		Bus4.addAttribute("FaultTime");
		Bus4.addAttribute("FaultX");
		Bus4.addAttribute("Imp.R");
		Bus4.addAttribute("Imp.X");
		Bus4.addAttribute("B1.T1.ia");
		Bus4.addAttribute("B1.T1.ib");
		Bus4.addAttribute("B1.T2.ia");
		Bus4.addAttribute("B1.T2.ib");
		Bus4.addAttribute("B1.T2.va");
		Bus4.addAttribute("B1.T2.vb");
		Bus4.addAttribute("G.T.ia");
		Bus4.addAttribute("G.T.ib");
		Bus4.addAttribute("Imp.T1.ia");
		Bus4.addAttribute("Imp.T1.ib");
		Bus4.addAttribute("Imp.T1.va");
		Bus4.addAttribute("Imp.T1.vb");
		Bus4.addAttribute("Imp.T2.ia");
		Bus4.addAttribute("Imp.T2.ib");
		Bus4.addAttribute("Imp.T2.va");
		Bus4.addAttribute("Imp.T2.vb");
		Bus4.addAttribute("B1.closed");

		physicalNodes.add(Bus4);

		PhysicalNode Bus5 =  new PhysicalNode();
		Bus5.setName("Bus5");

		Bus5.addAttribute("T.ia");
		Bus5.addAttribute("T.ib");
		Bus5.addAttribute("T.va");
		Bus5.addAttribute("T.vb");
		Bus5.addAttribute("V");
		Bus5.addAttribute("theta");
		Bus5.addAttribute("thetadeg");

		physicalNodes.add(Bus5);

		PhysicalNode Bus6 =  new PhysicalNode();
		Bus6.setName("Bus6");

		Bus6.addAttribute("T.ia");
		Bus6.addAttribute("T.ib");
		Bus6.addAttribute("T.va");
		Bus6.addAttribute("T.vb");
		Bus6.addAttribute("V");
		Bus6.addAttribute("theta");
		Bus6.addAttribute("thetadeg");

		physicalNodes.add(Bus6);

		PhysicalNode Bus7 =  new PhysicalNode();
		Bus7.setName("Bus7");
		Bus7.addAttribute("T.ia");
		Bus7.addAttribute("T.ib");
		Bus7.addAttribute("T.va");
		Bus7.addAttribute("T.vb");
		Bus7.addAttribute("V");
		Bus7.addAttribute("theta");
		Bus7.addAttribute("thetadeg");

		physicalNodes.add(Bus7);

		PhysicalNode Bus8 =  new PhysicalNode();
		Bus8.setName("Bus8");


		Bus8.addAttribute("T.ia");
		Bus8.addAttribute("T.ib");
		Bus8.addAttribute("T.va");
		Bus8.addAttribute("T.vb");
		Bus8.addAttribute("V");
		Bus8.addAttribute("theta");
		Bus8.addAttribute("thetadeg");

		physicalNodes.add(Bus8);

		PhysicalNode Bus9 =  new PhysicalNode();
		Bus9.setName("Bus9");

		Bus9.addAttribute("T.ia");
		Bus9.addAttribute("T.ib");
		Bus9.addAttribute("T.va");
		Bus9.addAttribute("T.vb");
		Bus9.addAttribute("V");
		Bus9.addAttribute("theta");
		Bus9.addAttribute("thetadeg");

		physicalNodes.add(Bus9);

		PhysicalNode G1 =  new PhysicalNode();
		G1.setName("G1");

		G1.addAttribute("Pg");
		G1.addAttribute("Qg");
		G1.addAttribute("V");
		G1.addAttribute("theta");
		G1.addAttribute("wrl.wr.Hsum");
		G1.addAttribute("Pg0");
		G1.addAttribute("TripTime");
		G1.addAttribute("V0");
		G1.addAttribute("theta0");
		G1.addAttribute("T.ia");
		G1.addAttribute("T.ib");
		G1.addAttribute("T.va");
		G1.addAttribute("T.vb");
		G1.addAttribute("wrl.wr.Hwsum");
		G1.addAttribute("online");
		G1.addAttribute("isSlack");

		physicalNodes.add(G1);

		PhysicalNode L45 =  new PhysicalNode();
		L45.setName("L45");


		L45.addAttribute("T1.ia");
		L45.addAttribute("T1.ib");
		L45.addAttribute("T2.ia");
		L45.addAttribute("T2.ib");
		L45.addAttribute("B");
		L45.addAttribute("G");
		L45.addAttribute("R");
		L45.addAttribute("X");
		L45.addAttribute("T1.va");
		L45.addAttribute("T1.vb");
		L45.addAttribute("T2.va");
		L45.addAttribute("T2.vb");

		physicalNodes.add(L45);

		PhysicalNode L46 =  new PhysicalNode();
		L46.setName("L46");

		L46.addAttribute("T1.ia");
		L46.addAttribute("T1.ib");
		L46.addAttribute("T2.ia");
		L46.addAttribute("T2.ib");
		L46.addAttribute("B");
		L46.addAttribute("G");
		L46.addAttribute("R");
		L46.addAttribute("X");
		L46.addAttribute("T1.va");
		L46.addAttribute("T1.vb");
		L46.addAttribute("T2.va");
		L46.addAttribute("T2.vb");

		physicalNodes.add(L46);

		PhysicalNode L57 =  new PhysicalNode();
		L57.setName("L57");

		L57.addAttribute("T1.ia");
		L57.addAttribute("T1.ib");
		L57.addAttribute("T2.ia");
		L57.addAttribute("T2.ib");
		L57.addAttribute("B");
		L57.addAttribute("G");
		L57.addAttribute("R");
		L57.addAttribute("X");
		L57.addAttribute("T1.va");
		L57.addAttribute("T1.vb");
		L57.addAttribute("T2.va");
		L57.addAttribute("T2.vb");

		physicalNodes.add(L57);

		PhysicalNode L69 =  new PhysicalNode();
		L69.setName("L69");

		L69.addAttribute("T1.ia");
		L69.addAttribute("T1.ib");
		L69.addAttribute("T2.ia");
		L69.addAttribute("T2.ib");
		L69.addAttribute("B");
		L69.addAttribute("G");
		L69.addAttribute("R");
		L69.addAttribute("X");
		L69.addAttribute("T1.va");
		L69.addAttribute("T1.vb");
		L69.addAttribute("T2.va");
		L69.addAttribute("T2.vb");

		physicalNodes.add(L69);

		PhysicalNode L78 =  new PhysicalNode();
		L78.setName("L78");


		L78.addAttribute("T1.ia");
		L78.addAttribute("T1.ib");
		L78.addAttribute("T2.ia");
		L78.addAttribute("T2.ib");
		L78.addAttribute("B");
		L78.addAttribute("G");
		L78.addAttribute("R");
		L78.addAttribute("X");
		L78.addAttribute("T1.va");
		L78.addAttribute("T1.vb");
		L78.addAttribute("T2.va");
		L78.addAttribute("T2.vb");

		physicalNodes.add(L78);

		PhysicalNode L89 =  new PhysicalNode();
		L89.setName("L89");

		L89.addAttribute("T1.ia");
		L89.addAttribute("T1.ib");
		L89.addAttribute("T2.ia");
		L89.addAttribute("T2.ib");
		L89.addAttribute("B");
		L89.addAttribute("G");
		L89.addAttribute("R");
		L89.addAttribute("X");
		L89.addAttribute("T1.va");
		L89.addAttribute("T1.vb");
		L89.addAttribute("T2.va");
		L89.addAttribute("T2.vb");

		physicalNodes.add(L89);

		PhysicalNode T14 =  new PhysicalNode();
		T14.setName("T14");

		T14.addAttribute("Imp.T2.va");
		T14.addAttribute("Imp.T2.vb");
		T14.addAttribute("T1.ia");
		T14.addAttribute("T1.ib");
		T14.addAttribute("T2.ia");
		T14.addAttribute("T2.ib");
		T14.addAttribute("Imp.R");
		T14.addAttribute("Imp.X");
		T14.addAttribute("R");
		T14.addAttribute("Tr.eps");
		T14.addAttribute("X");
		T14.addAttribute("n");
		T14.addAttribute("Imp.T1.ia");
		T14.addAttribute("Imp.T1.ib");
		T14.addAttribute("Imp.T1.va");
		T14.addAttribute("Imp.T1.vb");
		T14.addAttribute("Imp.T2.ia");
		T14.addAttribute("Imp.T2.ib");
		T14.addAttribute("T1.va");
		T14.addAttribute("T1.vb");
		T14.addAttribute("T2.va");
		T14.addAttribute("T2.vb");
		T14.addAttribute("Tr.T1.ia");
		T14.addAttribute("Tr.T1.ib");
		T14.addAttribute("Tr.T1.va");
		T14.addAttribute("Tr.T1.vb");
		T14.addAttribute("Tr.T2.ia");
		T14.addAttribute("Tr.T2.ib");
		T14.addAttribute("Tr.T2.va");
		T14.addAttribute("Tr.T2.vb");
		T14.addAttribute("Tr.inPort");
		T14.addAttribute("Tr.n");

		physicalNodes.add(T14);

		PhysicalNode T27 =  new PhysicalNode();
		T27.setName("T27");

		T27.addAttribute("Imp.T2.va");
		T27.addAttribute("Imp.T2.vb");
		T27.addAttribute("T1.ia");
		T27.addAttribute("T1.ib");
		T27.addAttribute("T1.va");
		T27.addAttribute("T1.vb");
		T27.addAttribute("T2.ia");
		T27.addAttribute("T2.ib");
		T27.addAttribute("Imp.R");
		T27.addAttribute("Imp.X");
		T27.addAttribute("R");
		T27.addAttribute("Tr.eps");
		T27.addAttribute("X");
		T27.addAttribute("n");
		T27.addAttribute("Imp.T1.ia");
		T27.addAttribute("Imp.T1.ib");
		T27.addAttribute("Imp.T1.va");
		T27.addAttribute("Imp.T1.vb");
		T27.addAttribute("Imp.T2.ia");
		T27.addAttribute("Imp.T2.ib");
		T27.addAttribute("T2.va");
		T27.addAttribute("T2.vb");
		T27.addAttribute("Tr.T1.ia");
		T27.addAttribute("Tr.T1.ib");
		T27.addAttribute("Tr.T1.va");
		T27.addAttribute("Tr.T1.vb");
		T27.addAttribute("Tr.T2.ia");
		T27.addAttribute("Tr.T2.ib");
		T27.addAttribute("Tr.T2.va");
		T27.addAttribute("Tr.T2.vb");
		T27.addAttribute("Tr.inPort");
		T27.addAttribute("Tr.n");

		physicalNodes.add(T27);

		PhysicalNode T39 =  new PhysicalNode();
		T39.setName("T39");


		T39.addAttribute("Imp.T2.va");
		T39.addAttribute("Imp.T2.vb");
		T39.addAttribute("T1.ia");
		T39.addAttribute("T1.ib");
		T39.addAttribute("T2.ia");
		T39.addAttribute("T2.ib");
		T39.addAttribute("Imp.R");
		T39.addAttribute("Imp.X");
		T39.addAttribute("R");
		T39.addAttribute("Tr.eps");
		T39.addAttribute("X");
		T39.addAttribute("n");
		T39.addAttribute("Imp.T1.ia");
		T39.addAttribute("Imp.T1.ib");
		T39.addAttribute("Imp.T1.va");
		T39.addAttribute("Imp.T1.vb");
		T39.addAttribute("Imp.T2.ia");
		T39.addAttribute("Imp.T2.ib");
		T39.addAttribute("T1.va");
		T39.addAttribute("T1.vb");
		T39.addAttribute("T2.va");
		T39.addAttribute("T2.vb");
		T39.addAttribute("Tr.T1.ia");
		T39.addAttribute("Tr.T1.ib");
		T39.addAttribute("Tr.T1.va");
		T39.addAttribute("Tr.T1.vb");
		T39.addAttribute("Tr.T2.ia");
		T39.addAttribute("Tr.T2.ib");
		T39.addAttribute("Tr.T2.va");
		T39.addAttribute("Tr.T2.vb");
		T39.addAttribute("Tr.inPort");
		T39.addAttribute("Tr.n");

		physicalNodes.add(T39);

		PhysicalNode breaker1 =  new PhysicalNode();
		breaker1.setName("breaker1");

		breaker1.addAttribute("CloseTime");
		breaker1.addAttribute("OpenTime");
		breaker1.addAttribute("small");
		breaker1.addAttribute("closed");
		breaker1.addAttribute("T1.ia");
		breaker1.addAttribute("T1.ib");
		breaker1.addAttribute("T1.va");
		breaker1.addAttribute("T1.vb");
		breaker1.addAttribute("T2.ia");
		breaker1.addAttribute("T2.ib");
		breaker1.addAttribute("T2.va");
		breaker1.addAttribute("T2.vb");
		

		physicalNodes.add(breaker1);
	
		nonSelectedNodes.addAll(physicalNodes);
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
