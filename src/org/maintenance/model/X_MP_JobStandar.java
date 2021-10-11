/**
 * Licensed under the KARMA v.1 Law of Sharing. As others have shared freely to you, so shall you share freely back to us.
 * If you shall try to cheat and find a loophole in this license, then KARMA will exact your share.
 * and your worldly gain shall come to naught and those who share shall gain eventually above you.
 * In compliance with previous GPLv2.0 works of ComPiere USA, OFBConsulting CHILE, Redhuan D. Oon (www.red1.org) and other contributors 
 * THIS ASSET MAINTENANCE module is contribution of Ramiro Vergara, OFB Consulting, CHILE.
*/
/** Generated Model - DO NOT CHANGE */
package org.maintenance.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.I_A_Asset;
import org.compiere.model.I_A_Asset_Group;
import org.compiere.model.I_Persistent;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.POInfo;
import org.compiere.util.KeyNamePair;

/** Generated Model for MP_JobStandar
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_MP_JobStandar extends PO implements I_MP_JobStandar, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20110102L;

    /** Standard Constructor */
    public X_MP_JobStandar (Properties ctx, int MP_JobStandar_ID, String trxName)
    {
      super (ctx, MP_JobStandar_ID, trxName);
      /** if (MP_JobStandar_ID == 0)
        {
			setJobStandarType (null);
			setMP_JobStandar_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MP_JobStandar (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_MP_JobStandar[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_A_Asset_Group getA_Asset_Group() throws RuntimeException
    {
		return (I_A_Asset_Group)MTable.get(getCtx(), I_A_Asset_Group.Table_Name)
			.getPO(getA_Asset_Group_ID(), get_TrxName());	}

	/** Set Asset Group.
		@param A_Asset_Group_ID 
		Group of Assets
	  */
	public void setA_Asset_Group_ID (int A_Asset_Group_ID)
	{
		if (A_Asset_Group_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_Group_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
	}

	/** Get Asset Group.
		@return Group of Assets
	  */
	public int getA_Asset_Group_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_A_Asset getA_Asset() throws RuntimeException
    {
		return (I_A_Asset)MTable.get(getCtx(), I_A_Asset.Table_Name)
			.getPO(getA_Asset_ID(), get_TrxName());	}

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** JobStandarType AD_Reference_ID=1000011 */
	public static final int JOBSTANDARTYPE_AD_Reference_ID=1000011;
	/** Type A = AA */
	public static final String JOBSTANDARTYPE_TypeA = "AA";
	/** Type B = BB */
	public static final String JOBSTANDARTYPE_TypeB = "BB";
	/** Set JobStandarType.
		@param JobStandarType JobStandarType	  */
	public void setJobStandarType (String JobStandarType)
	{

		set_Value (COLUMNNAME_JobStandarType, JobStandarType);
	}

	/** Get JobStandarType.
		@return JobStandarType	  */
	public String getJobStandarType () 
	{
		return (String)get_Value(COLUMNNAME_JobStandarType);
	}

	/** MaintainArea AD_Reference_ID=1000012 */
	public static final int MAINTAINAREA_AD_Reference_ID=1000012;
	/** Set MaintainArea.
		@param MaintainArea MaintainArea	  */
	public void setMaintainArea (String MaintainArea)
	{

		set_Value (COLUMNNAME_MaintainArea, MaintainArea);
	}

	/** Get MaintainArea.
		@return MaintainArea	  */
	public String getMaintainArea () 
	{
		return (String)get_Value(COLUMNNAME_MaintainArea);
	}

	/** Set MP_JobStandard.
		@param MP_JobStandar_ID MP_JobStandard	  */
	public void setMP_JobStandar_ID (int MP_JobStandar_ID)
	{
		if (MP_JobStandar_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_MP_JobStandar_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_MP_JobStandar_ID, Integer.valueOf(MP_JobStandar_ID));
	}

	/** Get MP_JobStandard.
		@return MP_JobStandard	  */
	public int getMP_JobStandar_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MP_JobStandar_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }
}