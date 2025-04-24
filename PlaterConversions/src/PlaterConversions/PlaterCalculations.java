/**
 * Class: PlaterCalculations
 * Author: Wyatt St. Onge
 * Date: 8/5/2024
 * Purpose: This class contains the formulas and performs the calculations for
 * 			the tank filling operations.
 * Attributes:
 *  	+ static double naOHPlatLen
 * 		+ static double naOHPlatWid
 * 		+ static double naOHGenLen
 * 		+ static double naOHGenWid
 * 		+ static double broCoLen
 * 		+ static double broCoWid
 * 		+ static double hClLen
 * 		+ static double hClWid
 * 		+ static double triBlueLen
 * 		+ static double triBlueWid
 * Public Methods:
 *  	+ double naOHPlatFillGal()
 *		+ double naOHPlatFillMil()
 *		+ double naOHPlatFillIn()
 *		+ double h2OPlatFillGal()
 *		+ double h2OPlatFillMil()
 *		+ double h2OPlatFillIn()
 *		+ double naOHGenFillGal()
 *		+ double naOHGenFillMil()
 *		+ double naOHGenFillIn()
 *		+ double h2OGenFillGal()
 *		+ double h2OGenFillMil()
 *		+ double h2OGenFillIn()
 *		+ double broCoFillGal()
 *		+ double broCoFillMil()
 *		+ double broCoFillIn()
 *		+ double h2OBroFillGal()
 *		+ double h2OBroFillMil()
 *		+ double h2OBroFillIn()
 *		+ double hClGal()
 *		+ double hClMil()
 *		+ double hClIn()
 *		+ double h2OHClGal()
 *		+ double h2OHClMil()
 *		+ double h2OHClIn()
 *		+ double triBlueGal()
 *		+ double triBlueMil()
 *		+ double triBluein()
 *		+ double h2OTriBlueGal()
 *		+ double h2OTriBlueMil()
 *		+ double h2OTriBlueIn()
 */

package PlaterConversions;

public class PlaterCalculations {

	private Plater plater;
	
	// Constructor method
	public PlaterCalculations(Plater plater) {
		this.plater = plater;
	} // PlaterCalculations()
	
	// Tank dimensions (inches) for each solution
	
	// NaOH Plating
	static double naOHPlatLen = 224.0;
	static double naOHPlatWid = 67.0;

	// NaOH Generator
	static double naOHGenLen = 120.0;
	static double naOHGenWid = 48.0;

	// BroCo
	static double broCoLen = 64.5;
	static double broCoWid = 60.0;

	// HCl
	static double hClLen = 64.5;
	static double hClWid = 60.0;

	// Tri-Blue
	static double triBlueLen = 40.0;
	static double triBlueWid = 36.0;
	
	// Tank calculations
	
	// NaOH - Plating
	
	/**
	 * This method returns the amount of NaOH plating fill in gallons
	 * @return naOHFillGal
	 */
	public double naOHPlatGal() {
		double naOHFillGal = (((naOHPlatLen * naOHPlatWid *
				plater.getFillHt()) / 231.0) * (21.0 / 128.0));
		return naOHFillGal;
	} // naOHPlatGal()
	
	/**
	 * This method converts naOHPlatFillGal to milliliters
	 * @return naOHFillMil
	 */
	public double naOHPlatmL() {
		double naOHFillMil = naOHPlatGal() * 3785.41;
		return naOHFillMil;
	} // naOHPlatmL()
	
	/**
	 * This method returns the amount of NaOh plating fill in inches
	 * @return naOHFillIn
	 */
	public double naOHPlatIn() {
		double naOHFillIn = ((naOHPlatGal() / (naOHPlatGal()
				+ h2OPlatGal())) * plater.getFillHt());
		return naOHFillIn;
	} // naOHPlatIn()
	
	/**
	 * This method returns the amount of H2O plating fill in gallons
	 * @return h2OFillGal
	 */
	public double h2OPlatGal() {
		double h2OFillGal = (((naOHPlatLen * naOHPlatWid *
				plater.getFillHt()) / 231.0) * (107.0 / 128.0));
		return h2OFillGal;
	} // h2OPlatGal()
	
	/**
	 * This method converts h2OPlatFillGal to milliliters
	 * @return h2OFillMil
	 */
	public double h2OPlatmL() {
		double h2OFillMil = h2OPlatGal() * 3785.41;
		return h2OFillMil;
	} // h2OPlatmL()
	
	/**
	 * This method returns the amount of H2O plating fill in inches
	 * @return h2OFillIn
	 */
	public double h2OPlatIn() {
		double h2OFillIn = ((h2OPlatGal() / (naOHPlatGal()
				+ h2OPlatGal())) * plater.getFillHt());
		return h2OFillIn;
	} // h2OPlatIn()
	
	//NaOH - Generator
	
	/**
	 * This method returns the amount of NaOH generator fill in gallons
	 * @return naOHGenFillGal
	 */
	public double naOHGenGal() {
		double naOHGenFillGal = (((naOHGenLen * naOHGenWid *
				plater.getFillHt()) / 231.0)* (21.0 / 128.0));
		return naOHGenFillGal;
	} // naOHGenGal()
	
	/**
	 * This method converts naOHGenFillGal to milliliters
	 * @return naOHGenFillMil
	 */
	public double naOHGenmL() {
		double naOHGenFillMil = naOHGenGal() * 3785.41;
		return naOHGenFillMil;
	} // naOHGenmL()
	
	/**
	 * This method returns the amount of NaOH generator fill in inches
	 * @return
	 */
	public double naOHGenIn() {
		double naOHGenFillIn = ((naOHGenGal() / (naOHGenGal() +
				h2OGenGal())) * plater.getFillHt());
		return naOHGenFillIn;
	} // naOHGenIn()
	
	/**
	 * This method returns the amount of H2O generator fill in gallons
	 * @return h2OGenFillGal
	 */
	public double h2OGenGal() {
		double h2OGenFillGal = (((naOHGenLen * naOHGenWid *
				plater.getFillHt()) / 231.0)* (107.0 / 128.0));
		return h2OGenFillGal;
	} // h2OGenGal()
	
	/**
	 * This method converts h2OGenFillGal to milliliters
	 * @return h2OGenFillMil
	 */
	public double h2OGenmL() {
		double h2OGenFillMil = h2OGenGal() * 3785.41;
		return h2OGenFillMil;
	} // h2OGenmL()
	
	/**
	 * This method returns the amount of H2O generator fill in inches
	 * @return  h2OGenFillIn
	 */
	public double h2OGenIn() {
		double h2OGenFillIn = ((h2OGenGal() / (naOHGenGal() +
				h2OGenGal())) * plater.getFillHt());
		return h2OGenFillIn;
	} // h2OGenIn()
	
	//BroCo
	
	/**
	 * This method returns the amount of BroCo fill in gallons
	 * @return broCoFillGal
	 */
	public double broCoGal() {
		double broCoFillGal = (((broCoLen * broCoWid *
				plater.getFillHt()) / 231.0) * (11.0 / 100.0));
		return broCoFillGal;
	} // broCoGal()
	
	/**
	 * This method converts broCoFillGal() to milliliters
	 * @return broCoFillMil
	 */
	public double broComL() {
		double broCoFillMil = broCoGal() * 3785.41;
		return broCoFillMil;
	} // broComL()
	
	/**
	 * This method returns the amount of BroCo fill in inches
	 * @return broCoFillIn
	 */
	public double broCoIn() {
		double broCoFillIn = ((broCoGal() / (broCoGal() +
				h2OBroGal())) * plater.getFillHt());
		return broCoFillIn;
	} // broCoIn()
	
	/**
	 * This method returns the amount of H2O BroCo fill in gallons
	 * @return h2OBroFillGal
	 */
	public double h2OBroGal() {
		double h2OBroFillGal = (((broCoLen * broCoWid *
				plater.getFillHt()) / 231.0) * (89.0 / 100.0));
		return h2OBroFillGal;
	} // h2OBroGal()
	
	/**
	 * This method converts h2OBroFillGal() to milliliters
	 * @return h2OBroFillMil
	 */
	public double h2OBromL() {
		double h2OBroFillMil = h2OBroGal() * 3785.41;
		return h2OBroFillMil;
	} // h2OBromL()
	
	/**
	 * This method returns the amount of H2O BroCo fill in inches
	 * @return H2OBroFillIn
	 */
	public double h2OBroIn() {
		double h2OBroFillIn = ((h2OBroGal() / (broCoGal() +
				h2OBroGal())) * plater.getFillHt());
		return h2OBroFillIn;
	} // h2OBroIn()
		
	//HCl
	
	/**
	 * This method returns the amount of HCl in gallons
	 * @return hClGal
	 */
	public double hClGal() {
		double hClGal = (((hClLen * hClWid *
				plater.getFillHt()) / 231.0) * (75.0 / 100.0));
		return hClGal;
	} // hClGal()
	
	/**
	 * This method converts hClGal() to milliliters
	 * @return hClFillMil
	 */
	public double hClmL() {
		double hClMil = hClGal() * 3785.41;
		return hClMil;
	} // hClmL()
	
	/**
	 * This method returns the amount of HCl in inches
	 * @return hClIn
	 */
	public double hClIn() {
		double hClIn = ((hClGal() / (hClGal() +
				h2OHClGal())) * plater.getFillHt());
		return hClIn;
	} // hClIn()
	
	/**
	 * This method returns the amount of H2O for HCl in gallons
	 * @return h2OHClGal
	 */
	public double h2OHClGal() {
		double h2OHClGal = (((hClLen * hClWid *
				plater.getFillHt()) / 231.0) * (25.0 / 100.0));
		return h2OHClGal;
	} // h2OHClGal()
	
	/**
	 * This method converts h2OHClGal() to milliliters
	 * @return h2OHClMil
	 */
	public double h2OHClmL() {
		double h2OHClMil = h2OHClGal() * 3785.41;
		return h2OHClMil;
	} // h2OHClmL()
	
	/**
	 * This method returns the amount of H2O for HCl in inches
	 * @return h2OHClIn
	 */
	public double h2OHClIn() {
		double h2OHClIn = ((h2OHClGal() / (hClGal() +
				h2OHClGal())) * plater.getFillHt());
		return h2OHClIn;
	} // h2OHClIn()
	
	//Tri-Blue
	
	/**
	 * This method returns the amount of TriBlue in gallons
	 * @return triBlueGal
	 */
	public double triBlueGal() {
		double triBlueGal = ((triBlueLen * triBlueWid *
				plater.getFillHt() / 231.0) * (6.0 / 100.0));
		return triBlueGal;
	} // triBlueGal()
	
	/**
	 * This method converts triBlueGal() to milliliters
	 * @return triBlueMil
	 */
	public double triBluemL() {
		double triBlueMil = triBlueGal() * 3785.41;
		return triBlueMil;
	} // triBluemL()
	
	/**
	 * This method returns the amount of TriBlue in inches
	 * @return triBlueIn
	 */
	public double triBlueIn() {
		double triBlueIn = ((triBlueGal() / (triBlueGal() +
				h2OTriBlueGal())) * plater.getFillHt());
		return triBlueIn;
	} // triBlueIn()
	
	/**
	 * This method returns the amount of H2O for TriBlue in gallons
	 * @return h2OTriBlueGal
	 */
	public double h2OTriBlueGal() {
		double h2OTriBlueGal = ((triBlueLen * triBlueWid *
				plater.getFillHt() / 231.0) * (94.0 / 100.0));
		return h2OTriBlueGal;
	} // h2OTriBlueGal()
	
	/**
	 * This method converts h2OTriBlueGal() to milliliters
	 * @return h2OTriBlueMil
	 */
	public double h2OTriBluemL() {
		double h2OTriBlueMil = h2OTriBlueGal() * 3785.41;
		return h2OTriBlueMil;
	} // h2OTriBluemL()
	
	/**
	 * This method returns the amount of H2O for TriBlue in inches
	 * @return h2OTriBlueIn
	 */
	public double h2OTriBlueIn() {
		double h2OTriBlueIn = ((h2OTriBlueGal() / (triBlueGal() +
				h2OTriBlueGal())) * plater.getFillHt());
		return h2OTriBlueIn;
	} // h2OTriBlueIn()
	
}// end of PlaterCalculations Class
