
package cyphef.generated.bus3;

import peersim.core.Node;
import peersim.edsim.EDProtocol;

public class Monitor
    implements EDProtocol
{

    final static Long serialVersionUID = 1L;

    /**
     * Creates a new Monitor.
     * 
     */
    public Monitor() {
    }

    @Override
    public void processEvent(Node node, int pid, Object event) {
    }

    @Override
    public Object clone() {
        return this;
    }

}
