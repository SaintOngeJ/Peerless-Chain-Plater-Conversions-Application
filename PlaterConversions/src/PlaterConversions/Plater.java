/**
 * Class: Plater
 * Author: Wyatt St. Onge
 * Date: 7/21/2024
 * Purpose: This class contains all of the static data and formulas for the
 * 			plater conversions.
 * Attributes:
 * 		- double fillHt
 * 		- double naOHPlat
 * 		- double naOHGen
 * 		- double broCo
 * 		- double hCl
 * 		- double triBlue
 * Inputs:
 * 		- double fillHt
 * 		- double naOHPlat
 * 		- double naOHGen
 * 		- double broCo
 * 		- double hCl
 * 		- double triBlue
 * Public methods:
 * 		+ constructor Plater(double fillHt, double naOHGen, double broCo,
 *			double hCl, double triBlue)
 *		+ double getFillHt()
 *		+ void setFillHt(double fillHt)
 *		+ double getNaOHPlat()
 *		+ void setNaOHPlat(double naOHPlat)
 *		+ double getNaOHGen()
 *		+ voidsetNaOHGen(double naOHGen)
 *		+ doublegetBroCo()
 *		+ void setBroCo(double broCo)
 *		+ double getHCl()
 *		+ void setHCl(double hCl)
 *		+ double getTriBlue()
 *		+ void setTriBlue(double triBlue)
 */

package PlaterConversions;

public class Plater {
								// units
	private double fillHt;		// inches
	
	// Titration values
	private double naOHPlat;	// oz/gal
	private double naOHGen;		// oz/gal
	private double broCo;		// %
	private double hCl;			// %
	private double triBlue;		// %
	
	/**
	 * Constructor
	 * @param fillHt
	 * @param naOHPlat
	 * @param naOHGen
	 * @param broCo
	 * @param hCl
	 * @param triBlue
	 */
	public Plater(double fillHt, double naOHPlat, double naOHGen, double broCo,
			double hCl, double triBlue) {
		this.fillHt = fillHt;
		this.naOHPlat = naOHPlat;
		this.naOHGen = naOHGen;
		this.broCo = broCo;
		this.hCl = hCl;
		this.triBlue = triBlue;
	}

	// Fill Height (in)
	
	/**
	 * Get method to call the value of Fill Height in inches
	 * @return fillHt
	 */
	public double getFillHt() {
		return fillHt;
	}
	
	/**
	 * Set method that sets the value of fillHeight in inches
	 * @param fillHt
	 */
	public void setFillHt(double fillHt) {
		this.fillHt = fillHt;
	}
	
	// NaOH - Plating Titration Value (oz/gal)
	
	/**
	 * Get method to call the value of naOHPlating in oz/gal
	 * @return naOHPlat
	 */
	public double getNaOHPlat() {
		return naOHPlat;
	}
	
	/**
	 * Set method that sets the value of naOHPlating in oz/gal
	 * @param naOHPlat
	 */
	public void setNaOHPlat(double naOHPlat) {
		this.naOHPlat = naOHPlat;
	}
	
	// NaOH - Generator Titration Value (oz/gal)
	
	/**
	 * Get method to call the value of naOHGenerator in oz/gal
	 * @return naOHGen
	 */
	public double getNaOHGen() {
		return naOHGen;
	}
	/**
	 * Set method that sets the value of naOHGenerator in oz/gal
	 * @param naOHGen
	 */
	public void setNaOHGen(double naOHGen) {
		this.naOHGen = naOHGen;
	}
	
	// BroCo Titration Value (%)
	
	/**
	 * Get method to call the value of broCo as a %
	 * @return broCo
	 */
	public double getBroCo() {
		return broCo;
	}
	
	/**
	 * Set method that sets the value of broCo as a %
	 * @param broCo
	 */
	public void setBroCo(double broCo) {
		this.broCo = broCo;
	}

	// HCl  Value (%)
	
	/**
	 * Get method to call the value of hCl as a %
	 * @return hCl
	 */
	public double getHCl() {
		return hCl;
	}
	
	/**
	 * Set method that sets the value of hCl as a %
	 * @param hCl
	 */
	public void setHCl(double hCl) {
		this.hCl = hCl;
	}
	
	// TriBlue Titration Value (%)
	
	/**
	 * Get method to call the value of triBlue as a %
	 * @return triBlue
	 */
	public double getTriBlue() {
		return triBlue;
	}
	
	/**
	 * Set method that sets the value of triBlue as a %
	 * @param triBlue
	 */
	public void setTriBlue(double triBlue) {
		this.triBlue = triBlue;
	}
	
}
