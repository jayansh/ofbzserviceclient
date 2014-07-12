/*
 * XML Type:  map-Value
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.MapValue
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * An XML map-Value(@http://ofbiz.apache.org/service/).
 *
 * This is a complex type.
 */
public class MapValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.MapValue
{
    
    public MapValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULL$0 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "null");
    private static final javax.xml.namespace.QName STDSTRING$2 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-String");
    private static final javax.xml.namespace.QName STDINTEGER$4 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Integer");
    private static final javax.xml.namespace.QName STDLONG$6 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Long");
    private static final javax.xml.namespace.QName STDFLOAT$8 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Float");
    private static final javax.xml.namespace.QName STDDOUBLE$10 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Double");
    private static final javax.xml.namespace.QName STDBOOLEAN$12 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Boolean");
    private static final javax.xml.namespace.QName STDLOCALE$14 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-Locale");
    private static final javax.xml.namespace.QName SQLTIMESTAMP$16 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "sql-Timestamp");
    private static final javax.xml.namespace.QName SQLDATE$18 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "sql-Date");
    private static final javax.xml.namespace.QName SQLTIME$20 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "sql-Time");
    private static final javax.xml.namespace.QName COLARRAYLIST$22 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-ArrayList");
    private static final javax.xml.namespace.QName COLLINKEDLIST$24 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-LinkedList");
    private static final javax.xml.namespace.QName COLSTACK$26 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-Stack");
    private static final javax.xml.namespace.QName COLVECTOR$28 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-Vector");
    private static final javax.xml.namespace.QName COLTREESET$30 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-TreeSet");
    private static final javax.xml.namespace.QName COLHASHSET$32 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-HashSet");
    private static final javax.xml.namespace.QName COLCOLLECTION$34 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "col-Collection");
    private static final javax.xml.namespace.QName MAPHASHMAP$36 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-HashMap");
    private static final javax.xml.namespace.QName MAPPROPERTIES$38 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Properties");
    private static final javax.xml.namespace.QName MAPHASHTABLE$40 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Hashtable");
    private static final javax.xml.namespace.QName MAPWEAKHASHMAP$42 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-WeakHashMap");
    private static final javax.xml.namespace.QName MAPTREEMAP$44 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-TreeMap");
    private static final javax.xml.namespace.QName MAPMAP$46 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "map-Map");
    private static final javax.xml.namespace.QName EEPK$48 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "eepk-");
    private static final javax.xml.namespace.QName EEVAL$50 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "eeval-");
    private static final javax.xml.namespace.QName STDBIGDECIMAL$52 = 
        new javax.xml.namespace.QName("http://ofbiz.apache.org/service/", "std-BigDecimal");
    
    
    /**
     * Gets the "null" element
     */
    public org.apache.ofbiz.service.NullDocument.Null getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "null" element
     */
    public boolean isNilNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "null" element
     */
    public boolean isSetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$0) != 0;
        }
    }
    
    /**
     * Sets the "null" element
     */
    public void setNull(org.apache.ofbiz.service.NullDocument.Null xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.NullDocument.Null)get_store().add_element_user(NULL$0);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Appends and returns a new empty "null" element
     */
    public org.apache.ofbiz.service.NullDocument.Null addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().add_element_user(NULL$0);
            return target;
        }
    }
    
    /**
     * Nils the "null" element
     */
    public void setNilNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.NullDocument.Null)get_store().add_element_user(NULL$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "null" element
     */
    public void unsetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$0, 0);
        }
    }
    
    /**
     * Gets the "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString getStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-String" element
     */
    public boolean isSetStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDSTRING$2) != 0;
        }
    }
    
    /**
     * Sets the "std-String" element
     */
    public void setStdString(org.apache.ofbiz.service.StdStringDocument.StdString stdString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().add_element_user(STDSTRING$2);
            }
            target.set(stdString);
        }
    }
    
    /**
     * Appends and returns a new empty "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString addNewStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().add_element_user(STDSTRING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "std-String" element
     */
    public void unsetStdString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDSTRING$2, 0);
        }
    }
    
    /**
     * Gets the "std-Integer" element
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger getStdInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().find_element_user(STDINTEGER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-Integer" element
     */
    public boolean isSetStdInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDINTEGER$4) != 0;
        }
    }
    
    /**
     * Sets the "std-Integer" element
     */
    public void setStdInteger(org.apache.ofbiz.service.StdIntegerDocument.StdInteger stdInteger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().find_element_user(STDINTEGER$4, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().add_element_user(STDINTEGER$4);
            }
            target.set(stdInteger);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Integer" element
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger addNewStdInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().add_element_user(STDINTEGER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "std-Integer" element
     */
    public void unsetStdInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDINTEGER$4, 0);
        }
    }
    
    /**
     * Gets the "std-Long" element
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong getStdLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().find_element_user(STDLONG$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-Long" element
     */
    public boolean isSetStdLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDLONG$6) != 0;
        }
    }
    
    /**
     * Sets the "std-Long" element
     */
    public void setStdLong(org.apache.ofbiz.service.StdLongDocument.StdLong stdLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().find_element_user(STDLONG$6, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().add_element_user(STDLONG$6);
            }
            target.set(stdLong);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Long" element
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong addNewStdLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().add_element_user(STDLONG$6);
            return target;
        }
    }
    
    /**
     * Unsets the "std-Long" element
     */
    public void unsetStdLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDLONG$6, 0);
        }
    }
    
    /**
     * Gets the "std-Float" element
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat getStdFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().find_element_user(STDFLOAT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-Float" element
     */
    public boolean isSetStdFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDFLOAT$8) != 0;
        }
    }
    
    /**
     * Sets the "std-Float" element
     */
    public void setStdFloat(org.apache.ofbiz.service.StdFloatDocument.StdFloat stdFloat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().find_element_user(STDFLOAT$8, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().add_element_user(STDFLOAT$8);
            }
            target.set(stdFloat);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Float" element
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat addNewStdFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().add_element_user(STDFLOAT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "std-Float" element
     */
    public void unsetStdFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDFLOAT$8, 0);
        }
    }
    
    /**
     * Gets the "std-Double" element
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble getStdDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().find_element_user(STDDOUBLE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-Double" element
     */
    public boolean isSetStdDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDDOUBLE$10) != 0;
        }
    }
    
    /**
     * Sets the "std-Double" element
     */
    public void setStdDouble(org.apache.ofbiz.service.StdDoubleDocument.StdDouble stdDouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().find_element_user(STDDOUBLE$10, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().add_element_user(STDDOUBLE$10);
            }
            target.set(stdDouble);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Double" element
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble addNewStdDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().add_element_user(STDDOUBLE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "std-Double" element
     */
    public void unsetStdDouble()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDDOUBLE$10, 0);
        }
    }
    
    /**
     * Gets the "std-Boolean" element
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean getStdBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().find_element_user(STDBOOLEAN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-Boolean" element
     */
    public boolean isSetStdBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDBOOLEAN$12) != 0;
        }
    }
    
    /**
     * Sets the "std-Boolean" element
     */
    public void setStdBoolean(org.apache.ofbiz.service.StdBooleanDocument.StdBoolean stdBoolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().find_element_user(STDBOOLEAN$12, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().add_element_user(STDBOOLEAN$12);
            }
            target.set(stdBoolean);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Boolean" element
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean addNewStdBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().add_element_user(STDBOOLEAN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "std-Boolean" element
     */
    public void unsetStdBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDBOOLEAN$12, 0);
        }
    }
    
    /**
     * Gets the "std-Locale" element
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale getStdLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().find_element_user(STDLOCALE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-Locale" element
     */
    public boolean isSetStdLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDLOCALE$14) != 0;
        }
    }
    
    /**
     * Sets the "std-Locale" element
     */
    public void setStdLocale(org.apache.ofbiz.service.StdLocaleDocument.StdLocale stdLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().find_element_user(STDLOCALE$14, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().add_element_user(STDLOCALE$14);
            }
            target.set(stdLocale);
        }
    }
    
    /**
     * Appends and returns a new empty "std-Locale" element
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale addNewStdLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().add_element_user(STDLOCALE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "std-Locale" element
     */
    public void unsetStdLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDLOCALE$14, 0);
        }
    }
    
    /**
     * Gets the "sql-Timestamp" element
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp getSqlTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().find_element_user(SQLTIMESTAMP$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sql-Timestamp" element
     */
    public boolean isSetSqlTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLTIMESTAMP$16) != 0;
        }
    }
    
    /**
     * Sets the "sql-Timestamp" element
     */
    public void setSqlTimestamp(org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp sqlTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().find_element_user(SQLTIMESTAMP$16, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().add_element_user(SQLTIMESTAMP$16);
            }
            target.set(sqlTimestamp);
        }
    }
    
    /**
     * Appends and returns a new empty "sql-Timestamp" element
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp addNewSqlTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().add_element_user(SQLTIMESTAMP$16);
            return target;
        }
    }
    
    /**
     * Unsets the "sql-Timestamp" element
     */
    public void unsetSqlTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLTIMESTAMP$16, 0);
        }
    }
    
    /**
     * Gets the "sql-Date" element
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate getSqlDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().find_element_user(SQLDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sql-Date" element
     */
    public boolean isSetSqlDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLDATE$18) != 0;
        }
    }
    
    /**
     * Sets the "sql-Date" element
     */
    public void setSqlDate(org.apache.ofbiz.service.SqlDateDocument.SqlDate sqlDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().find_element_user(SQLDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().add_element_user(SQLDATE$18);
            }
            target.set(sqlDate);
        }
    }
    
    /**
     * Appends and returns a new empty "sql-Date" element
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate addNewSqlDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().add_element_user(SQLDATE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "sql-Date" element
     */
    public void unsetSqlDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLDATE$18, 0);
        }
    }
    
    /**
     * Gets the "sql-Time" element
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime getSqlTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().find_element_user(SQLTIME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sql-Time" element
     */
    public boolean isSetSqlTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLTIME$20) != 0;
        }
    }
    
    /**
     * Sets the "sql-Time" element
     */
    public void setSqlTime(org.apache.ofbiz.service.SqlTimeDocument.SqlTime sqlTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().find_element_user(SQLTIME$20, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().add_element_user(SQLTIME$20);
            }
            target.set(sqlTime);
        }
    }
    
    /**
     * Appends and returns a new empty "sql-Time" element
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime addNewSqlTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().add_element_user(SQLTIME$20);
            return target;
        }
    }
    
    /**
     * Unsets the "sql-Time" element
     */
    public void unsetSqlTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLTIME$20, 0);
        }
    }
    
    /**
     * Gets the "col-ArrayList" element
     */
    public org.apache.ofbiz.service.ColCollection getColArrayList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLARRAYLIST$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-ArrayList" element
     */
    public boolean isSetColArrayList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLARRAYLIST$22) != 0;
        }
    }
    
    /**
     * Sets the "col-ArrayList" element
     */
    public void setColArrayList(org.apache.ofbiz.service.ColCollection colArrayList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLARRAYLIST$22, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLARRAYLIST$22);
            }
            target.set(colArrayList);
        }
    }
    
    /**
     * Appends and returns a new empty "col-ArrayList" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColArrayList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLARRAYLIST$22);
            return target;
        }
    }
    
    /**
     * Unsets the "col-ArrayList" element
     */
    public void unsetColArrayList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLARRAYLIST$22, 0);
        }
    }
    
    /**
     * Gets the "col-LinkedList" element
     */
    public org.apache.ofbiz.service.ColCollection getColLinkedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLLINKEDLIST$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-LinkedList" element
     */
    public boolean isSetColLinkedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLINKEDLIST$24) != 0;
        }
    }
    
    /**
     * Sets the "col-LinkedList" element
     */
    public void setColLinkedList(org.apache.ofbiz.service.ColCollection colLinkedList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLLINKEDLIST$24, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLLINKEDLIST$24);
            }
            target.set(colLinkedList);
        }
    }
    
    /**
     * Appends and returns a new empty "col-LinkedList" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColLinkedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLLINKEDLIST$24);
            return target;
        }
    }
    
    /**
     * Unsets the "col-LinkedList" element
     */
    public void unsetColLinkedList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLINKEDLIST$24, 0);
        }
    }
    
    /**
     * Gets the "col-Stack" element
     */
    public org.apache.ofbiz.service.ColCollection getColStack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLSTACK$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-Stack" element
     */
    public boolean isSetColStack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLSTACK$26) != 0;
        }
    }
    
    /**
     * Sets the "col-Stack" element
     */
    public void setColStack(org.apache.ofbiz.service.ColCollection colStack)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLSTACK$26, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLSTACK$26);
            }
            target.set(colStack);
        }
    }
    
    /**
     * Appends and returns a new empty "col-Stack" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColStack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLSTACK$26);
            return target;
        }
    }
    
    /**
     * Unsets the "col-Stack" element
     */
    public void unsetColStack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLSTACK$26, 0);
        }
    }
    
    /**
     * Gets the "col-Vector" element
     */
    public org.apache.ofbiz.service.ColCollection getColVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLVECTOR$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-Vector" element
     */
    public boolean isSetColVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLVECTOR$28) != 0;
        }
    }
    
    /**
     * Sets the "col-Vector" element
     */
    public void setColVector(org.apache.ofbiz.service.ColCollection colVector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLVECTOR$28, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLVECTOR$28);
            }
            target.set(colVector);
        }
    }
    
    /**
     * Appends and returns a new empty "col-Vector" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLVECTOR$28);
            return target;
        }
    }
    
    /**
     * Unsets the "col-Vector" element
     */
    public void unsetColVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLVECTOR$28, 0);
        }
    }
    
    /**
     * Gets the "col-TreeSet" element
     */
    public org.apache.ofbiz.service.ColCollection getColTreeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLTREESET$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-TreeSet" element
     */
    public boolean isSetColTreeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLTREESET$30) != 0;
        }
    }
    
    /**
     * Sets the "col-TreeSet" element
     */
    public void setColTreeSet(org.apache.ofbiz.service.ColCollection colTreeSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLTREESET$30, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLTREESET$30);
            }
            target.set(colTreeSet);
        }
    }
    
    /**
     * Appends and returns a new empty "col-TreeSet" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColTreeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLTREESET$30);
            return target;
        }
    }
    
    /**
     * Unsets the "col-TreeSet" element
     */
    public void unsetColTreeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLTREESET$30, 0);
        }
    }
    
    /**
     * Gets the "col-HashSet" element
     */
    public org.apache.ofbiz.service.ColCollection getColHashSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLHASHSET$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-HashSet" element
     */
    public boolean isSetColHashSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLHASHSET$32) != 0;
        }
    }
    
    /**
     * Sets the "col-HashSet" element
     */
    public void setColHashSet(org.apache.ofbiz.service.ColCollection colHashSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLHASHSET$32, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLHASHSET$32);
            }
            target.set(colHashSet);
        }
    }
    
    /**
     * Appends and returns a new empty "col-HashSet" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColHashSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLHASHSET$32);
            return target;
        }
    }
    
    /**
     * Unsets the "col-HashSet" element
     */
    public void unsetColHashSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLHASHSET$32, 0);
        }
    }
    
    /**
     * Gets the "col-Collection" element
     */
    public org.apache.ofbiz.service.ColCollection getColCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLCOLLECTION$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "col-Collection" element
     */
    public boolean isSetColCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLCOLLECTION$34) != 0;
        }
    }
    
    /**
     * Sets the "col-Collection" element
     */
    public void setColCollection(org.apache.ofbiz.service.ColCollection colCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLCOLLECTION$34, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLCOLLECTION$34);
            }
            target.set(colCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "col-Collection" element
     */
    public org.apache.ofbiz.service.ColCollection addNewColCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().add_element_user(COLCOLLECTION$34);
            return target;
        }
    }
    
    /**
     * Unsets the "col-Collection" element
     */
    public void unsetColCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLCOLLECTION$34, 0);
        }
    }
    
    /**
     * Gets the "map-HashMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHMAP$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map-HashMap" element
     */
    public boolean isSetMapHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPHASHMAP$36) != 0;
        }
    }
    
    /**
     * Sets the "map-HashMap" element
     */
    public void setMapHashMap(org.apache.ofbiz.service.MapMap mapHashMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHMAP$36, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHMAP$36);
            }
            target.set(mapHashMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-HashMap" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHMAP$36);
            return target;
        }
    }
    
    /**
     * Unsets the "map-HashMap" element
     */
    public void unsetMapHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPHASHMAP$36, 0);
        }
    }
    
    /**
     * Gets the "map-Properties" element
     */
    public org.apache.ofbiz.service.MapMap getMapProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPPROPERTIES$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map-Properties" element
     */
    public boolean isSetMapProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPROPERTIES$38) != 0;
        }
    }
    
    /**
     * Sets the "map-Properties" element
     */
    public void setMapProperties(org.apache.ofbiz.service.MapMap mapProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPPROPERTIES$38, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPPROPERTIES$38);
            }
            target.set(mapProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Properties" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPPROPERTIES$38);
            return target;
        }
    }
    
    /**
     * Unsets the "map-Properties" element
     */
    public void unsetMapProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPROPERTIES$38, 0);
        }
    }
    
    /**
     * Gets the "map-Hashtable" element
     */
    public org.apache.ofbiz.service.MapMap getMapHashtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHTABLE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map-Hashtable" element
     */
    public boolean isSetMapHashtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPHASHTABLE$40) != 0;
        }
    }
    
    /**
     * Sets the "map-Hashtable" element
     */
    public void setMapHashtable(org.apache.ofbiz.service.MapMap mapHashtable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHTABLE$40, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHTABLE$40);
            }
            target.set(mapHashtable);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Hashtable" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapHashtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPHASHTABLE$40);
            return target;
        }
    }
    
    /**
     * Unsets the "map-Hashtable" element
     */
    public void unsetMapHashtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPHASHTABLE$40, 0);
        }
    }
    
    /**
     * Gets the "map-WeakHashMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapWeakHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPWEAKHASHMAP$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map-WeakHashMap" element
     */
    public boolean isSetMapWeakHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPWEAKHASHMAP$42) != 0;
        }
    }
    
    /**
     * Sets the "map-WeakHashMap" element
     */
    public void setMapWeakHashMap(org.apache.ofbiz.service.MapMap mapWeakHashMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPWEAKHASHMAP$42, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPWEAKHASHMAP$42);
            }
            target.set(mapWeakHashMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-WeakHashMap" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapWeakHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPWEAKHASHMAP$42);
            return target;
        }
    }
    
    /**
     * Unsets the "map-WeakHashMap" element
     */
    public void unsetMapWeakHashMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPWEAKHASHMAP$42, 0);
        }
    }
    
    /**
     * Gets the "map-TreeMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapTreeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPTREEMAP$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map-TreeMap" element
     */
    public boolean isSetMapTreeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPTREEMAP$44) != 0;
        }
    }
    
    /**
     * Sets the "map-TreeMap" element
     */
    public void setMapTreeMap(org.apache.ofbiz.service.MapMap mapTreeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPTREEMAP$44, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPTREEMAP$44);
            }
            target.set(mapTreeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-TreeMap" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapTreeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPTREEMAP$44);
            return target;
        }
    }
    
    /**
     * Unsets the "map-TreeMap" element
     */
    public void unsetMapTreeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPTREEMAP$44, 0);
        }
    }
    
    /**
     * Gets the "map-Map" element
     */
    public org.apache.ofbiz.service.MapMap getMapMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "map-Map" element
     */
    public boolean isSetMapMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPMAP$46) != 0;
        }
    }
    
    /**
     * Sets the "map-Map" element
     */
    public void setMapMap(org.apache.ofbiz.service.MapMap mapMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$46, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$46);
            }
            target.set(mapMap);
        }
    }
    
    /**
     * Appends and returns a new empty "map-Map" element
     */
    public org.apache.ofbiz.service.MapMap addNewMapMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(MAPMAP$46);
            return target;
        }
    }
    
    /**
     * Unsets the "map-Map" element
     */
    public void unsetMapMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPMAP$46, 0);
        }
    }
    
    /**
     * Gets the "eepk-" element
     */
    public org.apache.ofbiz.service.MapMap getEepk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEPK$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "eepk-" element
     */
    public boolean isSetEepk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EEPK$48) != 0;
        }
    }
    
    /**
     * Sets the "eepk-" element
     */
    public void setEepk(org.apache.ofbiz.service.MapMap eepk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEPK$48, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEPK$48);
            }
            target.set(eepk);
        }
    }
    
    /**
     * Appends and returns a new empty "eepk-" element
     */
    public org.apache.ofbiz.service.MapMap addNewEepk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEPK$48);
            return target;
        }
    }
    
    /**
     * Unsets the "eepk-" element
     */
    public void unsetEepk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EEPK$48, 0);
        }
    }
    
    /**
     * Gets the "eeval-" element
     */
    public org.apache.ofbiz.service.MapMap getEeval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEVAL$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "eeval-" element
     */
    public boolean isSetEeval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EEVAL$50) != 0;
        }
    }
    
    /**
     * Sets the "eeval-" element
     */
    public void setEeval(org.apache.ofbiz.service.MapMap eeval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEVAL$50, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEVAL$50);
            }
            target.set(eeval);
        }
    }
    
    /**
     * Appends and returns a new empty "eeval-" element
     */
    public org.apache.ofbiz.service.MapMap addNewEeval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().add_element_user(EEVAL$50);
            return target;
        }
    }
    
    /**
     * Unsets the "eeval-" element
     */
    public void unsetEeval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EEVAL$50, 0);
        }
    }
    
    /**
     * Gets the "std-BigDecimal" element
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal getStdBigDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().find_element_user(STDBIGDECIMAL$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "std-BigDecimal" element
     */
    public boolean isSetStdBigDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDBIGDECIMAL$52) != 0;
        }
    }
    
    /**
     * Sets the "std-BigDecimal" element
     */
    public void setStdBigDecimal(org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal stdBigDecimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().find_element_user(STDBIGDECIMAL$52, 0);
            if (target == null)
            {
                target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().add_element_user(STDBIGDECIMAL$52);
            }
            target.set(stdBigDecimal);
        }
    }
    
    /**
     * Appends and returns a new empty "std-BigDecimal" element
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal addNewStdBigDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().add_element_user(STDBIGDECIMAL$52);
            return target;
        }
    }
    
    /**
     * Unsets the "std-BigDecimal" element
     */
    public void unsetStdBigDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDBIGDECIMAL$52, 0);
        }
    }
}
