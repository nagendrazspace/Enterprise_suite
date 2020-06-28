package com.quickmove.qa.util;

public class TestUtilnew {
	String sheetname="MasterPrefix";
	public void gettestdataexcel()
	{
	XLS_Reader reader=new XLS_Reader("C:\\Users\\Admin\\eclipse-workspace\\Enterprse_Suite\\src\\main\\java\\com\\quickmove\\TestData\\TestData.xlsx");

	String quote=reader.getCellData(sheetname, 0, 1);
	String quoteprefix=reader.getCellData(sheetname, 0, 2);
	String invoice=reader.getCellData(sheetname, 1, 1);
	String invoiceprefix=reader.getCellData(sheetname, 1, 2);
	String PO=reader.getCellData(sheetname, 2, 1);
	String POprefix=reader.getCellData(sheetname, 2, 2);
	String PR=reader.getCellData(sheetname, 3, 1);
	String PRprefix=reader.getCellData(sheetname, 3, 2);
	String WH=reader.getCellData(sheetname, 4, 1);
	String WHprefix=reader.getCellData(sheetname, 4, 2);
	
	String RR=reader.getCellData(sheetname, 5, 1);
	String RRprefix=reader.getCellData(sheetname, 5, 2);
	String GR=reader.getCellData(sheetname, 6, 1);
	String GRprefix=reader.getCellData(sheetname, 6, 2);
	String GRN=reader.getCellData(sheetname, 7, 1);
	String GRNprefix=reader.getCellData(sheetname, 7, 2);
	String CA=reader.getCellData(sheetname, 8, 1);
	String CAprefix=reader.getCellData(sheetname, 8, 2);
	String Mail=reader.getCellData(sheetname, 9, 1);
	String Mailprefix=reader.getCellData(sheetname, 9, 2);
	String CE=reader.getCellData(sheetname, 10, 1);
	String CEprefix=reader.getCellData(sheetname, 10, 2);
	String contract=reader.getCellData(sheetname, 11, 1);
	String contractprefix=reader.getCellData(sheetname, 11, 2);
	String joborder=reader.getCellData(sheetname, 12, 1);
	String joboderprefix=reader.getCellData(sheetname, 12, 2);
	String servicereceivied=reader.getCellData(sheetname, 13, 1);
	String servicereceivedprefix=reader.getCellData(sheetname, 13, 2);
	String vendorinvoice=reader.getCellData(sheetname, 14, 1);
	String vendorinvoiceprefix=reader.getCellData(sheetname, 14, 2);
	String SGR=reader.getCellData(sheetname, 15, 1);
	String SGRprefix=reader.getCellData(sheetname, 15, 2);
	String SGI=reader.getCellData(sheetname, 16, 1);
	String SGIprefix=reader.getCellData(sheetname, 16, 2);
	String FD=reader.getCellData(sheetname, 17, 1);
	String FDprefix=reader.getCellData(sheetname, 17, 2);
	String ASR=reader.getCellData(sheetname, 18, 1);
	String ASRprefix=reader.getCellData(sheetname, 18, 2);
	String DN=reader.getCellData(sheetname, 19, 1);
	String DNprefix=reader.getCellData(sheetname, 19, 2);
	String SH=reader.getCellData(sheetname, 20, 1);
	String SHprefix=reader.getCellData(sheetname, 20, 2);
	String SUR=reader.getCellData(sheetname, 21, 1);
	String SURprefix=reader.getCellData(sheetname, 21, 2);
	String cos=reader.getCellData(sheetname, 22, 1);
	String cosprefix=reader.getCellData(sheetname, 22, 2);
	String claim=reader.getCellData(sheetname, 23, 1);
	String claimprefix=reader.getCellData(sheetname, 23, 2);
	String RV=reader.getCellData(sheetname, 24, 1);
	String RVprefix=reader.getCellData(sheetname, 24, 2);
	String co=reader.getCellData(sheetname, 25, 1);
	String coprefix=reader.getCellData(sheetname, 25, 2);
	String CN=reader.getCellData(sheetname, 26, 1);
	String CNprefix=reader.getCellData(sheetname, 26, 2);
	String PRO=reader.getCellData(sheetname, 27, 1);
	String PROprefix=reader.getCellData(sheetname, 27, 2);
	String LE=reader.getCellData(sheetname, 28, 1);
	String LEprefix=reader.getCellData(sheetname, 28, 2);
	String PV=reader.getCellData(sheetname, 29, 1);
	String PVprefix=reader.getCellData(sheetname, 29, 2);
	String PKT=reader.getCellData(sheetname, 30, 1);
	String PKTprefix=reader.getCellData(sheetname, 30, 2);
	String CRT=reader.getCellData(sheetname, 31, 1);
	String CRTprefix=reader.getCellData(sheetname, 31, 2);
		String LFT=reader.getCellData(sheetname, 32, 1);
	String LFTprefix=reader.getCellData(sheetname, 32, 2);
	String CF=reader.getCellData(sheetname, 33, 1);
	String CFprefix=reader.getCellData(sheetname, 33, 2);
	String SP=reader.getCellData(sheetname, 34, 1);
	String SPprefix=reader.getCellData(sheetname, 34, 2);
	String DNa=reader.getCellData(sheetname, 35, 1);
	String DNaprefix=reader.getCellData(sheetname, 35, 2);
	String ENQUIRY=reader.getCellData(sheetname, 36, 1);
	String ENQprefix=reader.getCellData(sheetname, 36, 2);
	String DB=reader.getCellData(sheetname, 37, 1);
	String DBprefix=reader.getCellData(sheetname, 37, 2);
	String GL=reader.getCellData(sheetname, 38, 1);
	String GLprefix=reader.getCellData(sheetname, 38, 2);
	String SUBGL=reader.getCellData(sheetname, 39, 1);
	String SUBGLprefix=reader.getCellData(sheetname, 39, 2);
	String RVI=reader.getCellData(sheetname, 40, 1);
	String RVIprefix=reader.getCellData(sheetname, 40, 2);
	String PVI=reader.getCellData(sheetname, 41, 1);
	String PVIprefix=reader.getCellData(sheetname, 41, 2);
	String JVI=reader.getCellData(sheetname, 42, 1);
	String JVIprefix=reader.getCellData(sheetname, 42, 2);
	String JV=reader.getCellData(sheetname, 43, 1);
	String JVprefix=reader.getCellData(sheetname, 43, 2);
	String PB=reader.getCellData(sheetname, 44, 1);
	String PBprefix=reader.getCellData(sheetname, 44, 2);
	String AE=reader.getCellData(sheetname, 45, 1);
	String AEprefix=reader.getCellData(sheetname, 45, 2);
	String INS=reader.getCellData(sheetname, 46, 1);
	String INSprefix=reader.getCellData(sheetname, 46, 2);
	String LABEL=reader.getCellData(sheetname, 47, 1);
	String LABELprefix=reader.getCellData(sheetname, 47, 2);
	
	String LABELtext=reader.getCellData(sheetname, 48, 1);
	String LABELtextprefix=reader.getCellData(sheetname, 48, 2);
	
	String JE=reader.getCellData(sheetname, 49, 1);
	String JEprefix=reader.getCellData(sheetname, 49, 2);
	String EL=reader.getCellData(sheetname, 50, 1);
	String ELprefix=reader.getCellData(sheetname, 50, 2);
	String JOB=reader.getCellData(sheetname, 51, 1);
	String Jobprefix=reader.getCellData(sheetname, 51, 2);
	String OB=reader.getCellData(sheetname, 52, 1);
	String OBprefix=reader.getCellData(sheetname, 52, 2);
	String AS=reader.getCellData(sheetname, 53, 1);
	String ASprefix=reader.getCellData(sheetname, 53, 2);
	String SV=reader.getCellData(sheetname, 54, 1);
	String SVprefix=reader.getCellData(sheetname, 54, 2);
	String con=reader.getCellData(sheetname, 55, 1);
	String conprefix=reader.getCellData(sheetname, 55, 2);
	String AEa=reader.getCellData(sheetname, 56, 1);
	String AEaprefix=reader.getCellData(sheetname, 56, 2);
	String RVB=reader.getCellData(sheetname, 57, 1);
	String RVBprefix=reader.getCellData(sheetname, 57, 2);
	String PVB=reader.getCellData(sheetname, 58, 1);
	String PVBprefix=reader.getCellData(sheetname, 58, 2);
	String CC=reader.getCellData(sheetname, 59, 1);
	String CCprefix=reader.getCellData(sheetname, 59, 2);
	String CB=reader.getCellData(sheetname, 60, 1);
	String CBprefix=reader.getCellData(sheetname, 60, 2);
	
	
	String POA=reader.getCellData(sheetname, 61, 1);
	String POAprefix=reader.getCellData(sheetname, 61, 2);
	String POC=reader.getCellData(sheetname, 62, 1);
	String POCprefix=reader.getCellData(sheetname, 62, 2);
	
	String ASa=reader.getCellData(sheetname, 63, 1);
	String ASaprefix=reader.getCellData(sheetname, 63, 2);
	String PRC=reader.getCellData(sheetname, 64, 1);
	String PRCprefix=reader.getCellData(sheetname, 64, 2);
	String GRC=reader.getCellData(sheetname, 65, 1);
	String GRCprefix=reader.getCellData(sheetname, 65, 2);
	String GRNC=reader.getCellData(sheetname, 66, 1);
	String GRNCprefix=reader.getCellData(sheetname, 66, 2);
	String VCAS=reader.getCellData(sheetname, 67, 1);
	String VCASprefix=reader.getCellData(sheetname, 67, 2);
	String VCSV=reader.getCellData(sheetname, 68, 1);
	String VCSVprefix=reader.getCellData(sheetname, 68, 2);
	String VCCon=reader.getCellData(sheetname, 69, 1);
	String VCCONprefix=reader.getCellData(sheetname, 69, 2);
	
	String CHQ=reader.getCellData(sheetname, 70, 1);
	String CHQprefix=reader.getCellData(sheetname, 70, 2);
	String VCn=reader.getCellData(sheetname, 71, 1);
	String VCNprefix=reader.getCellData(sheetname, 71, 2);
	String Vdn=reader.getCellData(sheetname, 72, 1);
	String VdNprefix=reader.getCellData(sheetname, 72, 2);
	
	
	
	
	
	int colcount=reader.getColumnCount(sheetname);
	System.out.println(colcount);
	

	
}
	
}
