package cyphef.translation;

public class CyberProtocol {
	
	private String name;
	private CyberNode nodeComm;
	private CyberProtocol protocolComm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CyberNode getNodeComm() {
		return nodeComm;
	}

	public void setNodeComm(CyberNode nodeComm) {
		this.nodeComm = nodeComm;
	}

	public CyberProtocol getProtocolComm() {
		return protocolComm;
	}

	public void setProtocolComm(CyberProtocol protocolComm) {
		this.protocolComm = protocolComm;
	}

}
