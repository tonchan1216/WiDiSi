/*
 * 
 */

package wifidirect.nodemovement;

import peersim.core.Protocol;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * This class does nothing. It is simply a container inside each node to collect
 * peer coordinates.
 * </p>
 * <p>
 * The actual "who knows whom" relation (the topology) container is decoupled
 * from other packages. It is maintained by any {@link peersim.core.Linkable} 
 * implementing
 * protocol declared in the config file.
 * </p>
 */
public class CoordinateKeeper implements Protocol {

    // ------------------------------------------------------------------------
    // Fields
    // ------------------------------------------------------------------------

    /** 2d coordinates components. */
    private double x, y;
    
    /** The mobile. */
    // If the node is mobile set this to true
    private boolean mobile = false;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------
    /**
     * Standard constructor that reads the configuration parameters. Invoked by
     * the simulation engine. By default, all the coordinates components are set
     * to -1 value. The {@link InetInitializer} class provides a coordinates
     * initialization.
     * 
     * @param prefix
     *            the configuration prefix for this class.
     */
    public CoordinateKeeper(String prefix) {
        /* Un-initialized coordinates defaults to -1. */
        x = y = -1;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    public Object clone() {
    	CoordinateKeeper inp = null;
        try {
            inp = (CoordinateKeeper) super.clone();
        } catch (CloneNotSupportedException e) {
        } // never happens
        return inp;
    }

    /**
     * Gets the x.
     *
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x.
     *
     * @param x the new x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the y.
     *
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y.
     *
     * @param y the new y
     */
    public void setY(double y) {
        this.y = y;
    }

	/**
	 * Checks if is mobile.
	 *
	 * @return true, if is mobile
	 */
	public boolean isMobile() {
		return mobile;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param Mobile the new mobile
	 */
	public void setMobile(boolean Mobile) {
		this.mobile = Mobile;
	}

}
