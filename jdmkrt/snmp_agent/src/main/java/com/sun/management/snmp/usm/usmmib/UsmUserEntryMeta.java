/*
 * @(#)UsmUserEntryMeta.java	1.14
 *
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU General
 * Public License Version 2 only ("GPL") or the Common Development and
 * Distribution License("CDDL")(collectively, the "License"). You may not use
 * this file except in compliance with the License. You can obtain a copy of the
 * License at http://opendmk.dev.java.net/legal_notices/licenses.txt or in the 
 * LEGAL_NOTICES folder that accompanied this code. See the License for the 
 * specific language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file found at
 *     http://opendmk.dev.java.net/legal_notices/licenses.txt
 * or in the LEGAL_NOTICES folder that accompanied this code.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.
 * 
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * 
 *       "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding
 * 
 *       "[Contributor] elects to include this software in this distribution
 *        under the [CDDL or GPL Version 2] license."
 * 
 * If you don't indicate a single choice of license, a recipient has the option
 * to distribute your version of this file under either the CDDL or the GPL
 * Version 2, or to extend the choice of license to its licensees as provided
 * above. However, if you add GPL Version 2 code and therefore, elected the
 * GPL Version 2 license, then the option applies only if the new code is made
 * subject to such option by the copyright holder.
 * 
 *
 */
package com.sun.management.snmp.usm.usmmib;

//
// Generated by mibgen version 5.0 (09/06/01) when compiling SNMP-USER-BASED-SM-MIB in standard metadata mode.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpCounter;
import com.sun.management.snmp.SnmpCounter64;
import com.sun.management.snmp.SnmpGauge;
import com.sun.management.snmp.SnmpInt;
import com.sun.management.snmp.SnmpUnsignedInt;
import com.sun.management.snmp.SnmpIpAddress;
import com.sun.management.snmp.SnmpTimeticks;
import com.sun.management.snmp.SnmpOpaque;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStringFixed;
import com.sun.management.snmp.SnmpOid;
import com.sun.management.snmp.SnmpNull;
import com.sun.management.snmp.SnmpValue;
import com.sun.management.snmp.SnmpVarBind;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMibNode;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibEntry;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;
import com.sun.management.snmp.agent.SnmpStandardMetaServer;
import com.sun.management.snmp.agent.SnmpMibSubRequest;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.EnumRowStatus;

/**
 * The class is used for representing SNMP metadata for the "UsmUserEntry" group.
 * The group is defined with the following oid: 1.3.6.1.6.3.15.1.2.2.1.
 *
 * @since Java DMK 5.1
 */
public class UsmUserEntryMeta extends SnmpMibEntry implements Serializable, SnmpStandardMetaServer {
    private static final long serialVersionUID = 353173372738958004L;

    /**
     * Constructor for the metadata associated to "UsmUserEntry".
     */
    public UsmUserEntryMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        objectserver = objserv;
        varList = new int[11];
        varList[0] = 9;
        varList[1] = 8;
        varList[2] = 7;
        varList[3] = 6;
        varList[4] = 5;
        varList[5] = 4;
        varList[6] = 13;
        varList[7] = 12;
        varList[8] = 3;
        varList[9] = 11;
        varList[10] = 10;
        SnmpMibNode.sort(varList);
    }

    /**
     * Get the value of a scalar variable
     */
    public SnmpValue get(long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 9:
                return new SnmpString(node.getUsmUserPrivKeyChange());

            case 8:
                return new SnmpOid(node.getUsmUserPrivProtocol());

            case 7:
                return new SnmpString(node.getUsmUserOwnAuthKeyChange());

            case 6:
                return new SnmpString(node.getUsmUserAuthKeyChange());

            case 5:
                return new SnmpOid(node.getUsmUserAuthProtocol());

            case 4:
                return new SnmpOid(node.getUsmUserCloneFrom());

            case 13:
                return new SnmpInt(node.getUsmUserStatus());

            case 12:
                return new SnmpInt(node.getUsmUserStorageType());

            case 3:
                return new SnmpString(node.getUsmUserSecurityName());

            case 2:
                throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
            case 11:
                return new SnmpString(node.getUsmUserPublic());

            case 1:
                throw new SnmpStatusException(SnmpStatusException.noSuchInstance);
            case 10:
                return new SnmpString(node.getUsmUserOwnPrivKeyChange());

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Set the value of a scalar variable
     */
    public SnmpValue set(SnmpValue x, long var, Object data)
        throws SnmpStatusException {
        switch((int)var) {
            case 9:
                if (x instanceof SnmpString) {
                    node.setUsmUserPrivKeyChange(((SnmpString)x).toByte());
                    return new SnmpString(node.getUsmUserPrivKeyChange());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 8:
                if (x instanceof SnmpOid) {
                    node.setUsmUserPrivProtocol(((SnmpOid)x).toString());
                    return new SnmpOid(node.getUsmUserPrivProtocol());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 7:
                if (x instanceof SnmpString) {
                    node.setUsmUserOwnAuthKeyChange(((SnmpString)x).toByte());
                    return new SnmpString(node.getUsmUserOwnAuthKeyChange());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 6:
                if (x instanceof SnmpString) {
                    node.setUsmUserAuthKeyChange(((SnmpString)x).toByte());
                    return new SnmpString(node.getUsmUserAuthKeyChange());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 5:
                if (x instanceof SnmpOid) {
                    node.setUsmUserAuthProtocol(((SnmpOid)x).toString());
                    return new SnmpOid(node.getUsmUserAuthProtocol());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 4:
                if (x instanceof SnmpOid) {
                    node.setUsmUserCloneFrom(((SnmpOid)x).toString());
                    return new SnmpOid(node.getUsmUserCloneFrom());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 13:
                if (x instanceof SnmpInt) {
                    try  {
                        node.setUsmUserStatus( new EnumUsmUserStatus (((SnmpInt)x).toInteger()));
                    } catch(IllegalArgumentException e)  {
                        throw new SnmpStatusException(SnmpStatusException.snmpRspWrongValue);
                    }
                    return new SnmpInt(node.getUsmUserStatus());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 12:
                if (x instanceof SnmpInt) {
                    try  {
                        node.setUsmUserStorageType( new EnumUsmUserStorageType (((SnmpInt)x).toInteger()));
                    } catch(IllegalArgumentException e)  {
                        throw new SnmpStatusException(SnmpStatusException.snmpRspWrongValue);
                    }
                    return new SnmpInt(node.getUsmUserStorageType());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 3:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 2:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 11:
                if (x instanceof SnmpString) {
                    node.setUsmUserPublic(((SnmpString)x).toByte());
                    return new SnmpString(node.getUsmUserPublic());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            case 1:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 10:
                if (x instanceof SnmpString) {
                    node.setUsmUserOwnPrivKeyChange(((SnmpString)x).toByte());
                    return new SnmpString(node.getUsmUserOwnPrivKeyChange());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
    }

    /**
     * Check the value of a scalar variable
     */
    public void check(SnmpValue x, long var, Object data)
        throws SnmpStatusException {
        switch((int) var) {
            case 9:
                if (x instanceof SnmpString) {
                    node.checkUsmUserPrivKeyChange(((SnmpString)x).toByte());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 8:
                if (x instanceof SnmpOid) {
                    node.checkUsmUserPrivProtocol(((SnmpOid)x).toString());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 7:
                if (x instanceof SnmpString) {
                    node.checkUsmUserOwnAuthKeyChange(((SnmpString)x).toByte());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 6:
                if (x instanceof SnmpString) {
                    node.checkUsmUserAuthKeyChange(((SnmpString)x).toByte());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 5:
                if (x instanceof SnmpOid) {
                    node.checkUsmUserAuthProtocol(((SnmpOid)x).toString());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 4:
                if (x instanceof SnmpOid) {
                    node.checkUsmUserCloneFrom(((SnmpOid)x).toString());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 13:
                if (x instanceof SnmpInt) {
                    try  {
                        node.checkUsmUserStatus( new EnumUsmUserStatus (((SnmpInt)x).toInteger()));
                    } catch(IllegalArgumentException e)  {
                        throw new SnmpStatusException(SnmpStatusException.snmpRspWrongValue);
                    }
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 12:
                if (x instanceof SnmpInt) {
                    try  {
                        node.checkUsmUserStorageType( new EnumUsmUserStorageType (((SnmpInt)x).toInteger()));
                    } catch(IllegalArgumentException e)  {
                        throw new SnmpStatusException(SnmpStatusException.snmpRspWrongValue);
                    }
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 3:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 2:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 11:
                if (x instanceof SnmpString) {
                    node.checkUsmUserPublic(((SnmpString)x).toByte());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            case 1:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);

            case 10:
                if (x instanceof SnmpString) {
                    node.checkUsmUserOwnPrivKeyChange(((SnmpString)x).toByte());
                } else {
                    throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
                }
                break;

            default:
                throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
        }
    }

    /**
     * Allow to bind the metadata description to a specific object.
     */
    protected void setInstance(UsmUserEntryMBean var) {
        node = var;
    }


    // ------------------------------------------------------------
    // 
    // Implements the "get" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    // 
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.get(this,req,depth);
    }


    // ------------------------------------------------------------
    // 
    // Implements the "set" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    // 
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.set(this,req,depth);
    }


    // ------------------------------------------------------------
    // 
    // Implements the "check" method defined in "SnmpMibEntry".
    // See the "SnmpMibEntry" Javadoc API for more details.
    // 
    // ------------------------------------------------------------

    public void check(SnmpMibSubRequest req, int depth)
        throws SnmpStatusException {
        objectserver.check(this,req,depth);
    }

    /**
     * Returns true if "arc" identifies a scalar object.
     */
    public boolean isVariable(long arc) {

        switch((int)arc) {
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 13:
            case 12:
            case 3:
            case 2:
            case 11:
            case 1:
            case 10:
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * Returns true if "arc" identifies a readable scalar object.
     */
    public boolean isReadable(long arc) {

        switch((int)arc) {
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 13:
            case 12:
            case 3:
            case 11:
            case 10:
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * Return the name of the attribute corresponding to the SNMP variable identified by "id".
     */
    public String getAttributeName(long id)
        throws SnmpStatusException {
        switch((int)id) {
            case 9:
                return "UsmUserPrivKeyChange";

            case 8:
                return "UsmUserPrivProtocol";

            case 7:
                return "UsmUserOwnAuthKeyChange";

            case 6:
                return "UsmUserAuthKeyChange";

            case 5:
                return "UsmUserAuthProtocol";

            case 4:
                return "UsmUserCloneFrom";

            case 13:
                return "UsmUserStatus";

            case 12:
                return "UsmUserStorageType";

            case 3:
                return "UsmUserSecurityName";

            case 2:
                return "UsmUserName";

            case 11:
                return "UsmUserPublic";

            case 1:
                return "UsmUserEngineID";

            case 10:
                return "UsmUserOwnPrivKeyChange";

            default:
                break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }


    public  long getRowStatusId()  {
        return 13;
    }


    public  String getRowStatusName()  {
        return new String ("UsmUserStatus");
    }


    protected  int mapRowStatus(SnmpVarBind var, Object userData)
            throws SnmpStatusException {
        final SnmpValue value = var.getSnmpValue();
        if (value == null)
            throw new SnmpStatusException(
                SnmpStatusException.snmpRspInconsistentValue);
        if (!(value instanceof SnmpInt))
            throw new SnmpStatusException(
                SnmpStatusException.snmpRspWrongType);
        final int code = ((SnmpInt)value).intValue();
        if (!(EnumRowStatus.isValidValue(code)))
            throw new SnmpStatusException(
                SnmpStatusException.snmpRspInconsistentValue);
        return  code;
    }


    public  int getRowStatus(Object userData)
            throws SnmpStatusException {
        final  SnmpValue x = get(13, userData);
        final  SnmpVarBind vb = new SnmpVarBind();

        // We know we won't need the OID.
        //
        // vb.oid = new SnmpOid("1.3.6.1.6.3.15.1.2.2.1.13");

        vb.setSnmpValue(x);
        return mapRowStatus(vb, userData);
    }


    public  SnmpValue setRowStatus(int status, Object userData)
            throws SnmpStatusException {
        final  SnmpInt x = new SnmpInt(status);
        return  set(x, 13, userData);
    }


    public  boolean isRowReady(Object userData)
            throws SnmpStatusException {
        
        // A default implementation could be for instance:
        // return 	(getRowStatus(userData) != EnumRowStatus.notReady);
        
        return true;
    }

    protected UsmUserEntryMBean node;
    protected SnmpStandardObjectServer objectserver = null;
}