package jp.struts.rest;

public class ini {
	public static final String CName       = "com.mysql.jdbc.Driver";
	public static final String Url         = "jdbc:mysql://localhost:3306/test";
	public static final String LoginId     = "root";
	public static final String Password    = "root";

	public static final String indexUrl = "/rest/index.jsp";

	public static final String T_customer  = "customer";

	public static final String[] Comm = {"電話","メール","はがき"};

	static int m = 0;
	public static final int LogOff         = ++m;

	public static final int ReserveIn      = ++m;
	public static final int ShowMenu       = ++m;
	public static final int BbsIn          = ++m;

	public static final int AuthIn         = ++m;
	public static final int AuthDel        = ++m;
	public static final int AuthNew        = ++m;
	public static final int AuthUp         = ++m;
	public static final int AuthRetry      = ++m;
	public static final int AuthDelExecute = ++m;
	public static final int AuthNewExecute = ++m;
	public static final int AuthUpExecute  = ++m;

}