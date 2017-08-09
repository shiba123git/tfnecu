/**
 * 
 */
package ae.co.pims.common;

/**
 * @author shmi0516
 *
 */
public class PIMSRuntimeException extends RuntimeException{
	
	static final long serialVersionUID = -7034897190745766939L;
	public PIMSRuntimeException(String errorMessage)
	{
		super(errorMessage);
	}

}
