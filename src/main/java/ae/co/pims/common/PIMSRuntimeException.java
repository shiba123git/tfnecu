/**
 * 
 */
package ae.co.pims.common;

/**
 * @author Babu
 *
 */
public class PIMSRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 5998165373248494993L;

	public PIMSRuntimeException(String errorMesage) {
		super(errorMesage);
	}

}
