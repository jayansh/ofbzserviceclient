/*
 * XML Type:  col-Collection
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColCollection
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service.impl;
/**
 * An XML col-Collection(@http://ofbiz.apache.org/service/).
 *
 * This is a complex type.
 */
public class ColCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ofbiz.service.ColCollection
{
    
    public ColCollectionImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets array of all "null" elements
     */
    public org.apache.ofbiz.service.NullDocument.Null[] getNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NULL$0, targetList);
            org.apache.ofbiz.service.NullDocument.Null[] result = new org.apache.ofbiz.service.NullDocument.Null[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "null" element
     */
    public org.apache.ofbiz.service.NullDocument.Null getNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "null" element
     */
    public boolean isNilNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "null" element
     */
    public int sizeOfNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$0);
        }
    }
    
    /**
     * Sets array of all "null" element
     */
    public void setNullArray(org.apache.ofbiz.service.NullDocument.Null[] xnullArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xnullArray, NULL$0);
        }
    }
    
    /**
     * Sets ith "null" element
     */
    public void setNullArray(int i, org.apache.ofbiz.service.NullDocument.Null xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xnull);
        }
    }
    
    /**
     * Nils the ith "null" element
     */
    public void setNilNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().find_element_user(NULL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "null" element
     */
    public org.apache.ofbiz.service.NullDocument.Null insertNewNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.NullDocument.Null target = null;
            target = (org.apache.ofbiz.service.NullDocument.Null)get_store().insert_element_user(NULL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "null" element
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
     * Removes the ith "null" element
     */
    public void removeNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$0, i);
        }
    }
    
    /**
     * Gets array of all "std-String" elements
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString[] getStdStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDSTRING$2, targetList);
            org.apache.ofbiz.service.StdStringDocument.StdString[] result = new org.apache.ofbiz.service.StdStringDocument.StdString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString getStdStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-String" element
     */
    public int sizeOfStdStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDSTRING$2);
        }
    }
    
    /**
     * Sets array of all "std-String" element
     */
    public void setStdStringArray(org.apache.ofbiz.service.StdStringDocument.StdString[] stdStringArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdStringArray, STDSTRING$2);
        }
    }
    
    /**
     * Sets ith "std-String" element
     */
    public void setStdStringArray(int i, org.apache.ofbiz.service.StdStringDocument.StdString stdString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().find_element_user(STDSTRING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdString);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-String" element
     */
    public org.apache.ofbiz.service.StdStringDocument.StdString insertNewStdString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdStringDocument.StdString target = null;
            target = (org.apache.ofbiz.service.StdStringDocument.StdString)get_store().insert_element_user(STDSTRING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-String" element
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
     * Removes the ith "std-String" element
     */
    public void removeStdString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDSTRING$2, i);
        }
    }
    
    /**
     * Gets array of all "std-Integer" elements
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger[] getStdIntegerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDINTEGER$4, targetList);
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger[] result = new org.apache.ofbiz.service.StdIntegerDocument.StdInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-Integer" element
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger getStdIntegerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().find_element_user(STDINTEGER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-Integer" element
     */
    public int sizeOfStdIntegerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDINTEGER$4);
        }
    }
    
    /**
     * Sets array of all "std-Integer" element
     */
    public void setStdIntegerArray(org.apache.ofbiz.service.StdIntegerDocument.StdInteger[] stdIntegerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdIntegerArray, STDINTEGER$4);
        }
    }
    
    /**
     * Sets ith "std-Integer" element
     */
    public void setStdIntegerArray(int i, org.apache.ofbiz.service.StdIntegerDocument.StdInteger stdInteger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().find_element_user(STDINTEGER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdInteger);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Integer" element
     */
    public org.apache.ofbiz.service.StdIntegerDocument.StdInteger insertNewStdInteger(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdIntegerDocument.StdInteger target = null;
            target = (org.apache.ofbiz.service.StdIntegerDocument.StdInteger)get_store().insert_element_user(STDINTEGER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Integer" element
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
     * Removes the ith "std-Integer" element
     */
    public void removeStdInteger(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDINTEGER$4, i);
        }
    }
    
    /**
     * Gets array of all "std-Long" elements
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong[] getStdLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDLONG$6, targetList);
            org.apache.ofbiz.service.StdLongDocument.StdLong[] result = new org.apache.ofbiz.service.StdLongDocument.StdLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-Long" element
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong getStdLongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().find_element_user(STDLONG$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-Long" element
     */
    public int sizeOfStdLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDLONG$6);
        }
    }
    
    /**
     * Sets array of all "std-Long" element
     */
    public void setStdLongArray(org.apache.ofbiz.service.StdLongDocument.StdLong[] stdLongArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdLongArray, STDLONG$6);
        }
    }
    
    /**
     * Sets ith "std-Long" element
     */
    public void setStdLongArray(int i, org.apache.ofbiz.service.StdLongDocument.StdLong stdLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().find_element_user(STDLONG$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdLong);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Long" element
     */
    public org.apache.ofbiz.service.StdLongDocument.StdLong insertNewStdLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLongDocument.StdLong target = null;
            target = (org.apache.ofbiz.service.StdLongDocument.StdLong)get_store().insert_element_user(STDLONG$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Long" element
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
     * Removes the ith "std-Long" element
     */
    public void removeStdLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDLONG$6, i);
        }
    }
    
    /**
     * Gets array of all "std-Float" elements
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat[] getStdFloatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDFLOAT$8, targetList);
            org.apache.ofbiz.service.StdFloatDocument.StdFloat[] result = new org.apache.ofbiz.service.StdFloatDocument.StdFloat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-Float" element
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat getStdFloatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().find_element_user(STDFLOAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-Float" element
     */
    public int sizeOfStdFloatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDFLOAT$8);
        }
    }
    
    /**
     * Sets array of all "std-Float" element
     */
    public void setStdFloatArray(org.apache.ofbiz.service.StdFloatDocument.StdFloat[] stdFloatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdFloatArray, STDFLOAT$8);
        }
    }
    
    /**
     * Sets ith "std-Float" element
     */
    public void setStdFloatArray(int i, org.apache.ofbiz.service.StdFloatDocument.StdFloat stdFloat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().find_element_user(STDFLOAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdFloat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Float" element
     */
    public org.apache.ofbiz.service.StdFloatDocument.StdFloat insertNewStdFloat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdFloatDocument.StdFloat target = null;
            target = (org.apache.ofbiz.service.StdFloatDocument.StdFloat)get_store().insert_element_user(STDFLOAT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Float" element
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
     * Removes the ith "std-Float" element
     */
    public void removeStdFloat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDFLOAT$8, i);
        }
    }
    
    /**
     * Gets array of all "std-Double" elements
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble[] getStdDoubleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDDOUBLE$10, targetList);
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble[] result = new org.apache.ofbiz.service.StdDoubleDocument.StdDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-Double" element
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble getStdDoubleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().find_element_user(STDDOUBLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-Double" element
     */
    public int sizeOfStdDoubleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDDOUBLE$10);
        }
    }
    
    /**
     * Sets array of all "std-Double" element
     */
    public void setStdDoubleArray(org.apache.ofbiz.service.StdDoubleDocument.StdDouble[] stdDoubleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdDoubleArray, STDDOUBLE$10);
        }
    }
    
    /**
     * Sets ith "std-Double" element
     */
    public void setStdDoubleArray(int i, org.apache.ofbiz.service.StdDoubleDocument.StdDouble stdDouble)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().find_element_user(STDDOUBLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdDouble);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Double" element
     */
    public org.apache.ofbiz.service.StdDoubleDocument.StdDouble insertNewStdDouble(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdDoubleDocument.StdDouble target = null;
            target = (org.apache.ofbiz.service.StdDoubleDocument.StdDouble)get_store().insert_element_user(STDDOUBLE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Double" element
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
     * Removes the ith "std-Double" element
     */
    public void removeStdDouble(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDDOUBLE$10, i);
        }
    }
    
    /**
     * Gets array of all "std-Boolean" elements
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean[] getStdBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDBOOLEAN$12, targetList);
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean[] result = new org.apache.ofbiz.service.StdBooleanDocument.StdBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-Boolean" element
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean getStdBooleanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().find_element_user(STDBOOLEAN$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-Boolean" element
     */
    public int sizeOfStdBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDBOOLEAN$12);
        }
    }
    
    /**
     * Sets array of all "std-Boolean" element
     */
    public void setStdBooleanArray(org.apache.ofbiz.service.StdBooleanDocument.StdBoolean[] stdBooleanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdBooleanArray, STDBOOLEAN$12);
        }
    }
    
    /**
     * Sets ith "std-Boolean" element
     */
    public void setStdBooleanArray(int i, org.apache.ofbiz.service.StdBooleanDocument.StdBoolean stdBoolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().find_element_user(STDBOOLEAN$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdBoolean);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Boolean" element
     */
    public org.apache.ofbiz.service.StdBooleanDocument.StdBoolean insertNewStdBoolean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBooleanDocument.StdBoolean target = null;
            target = (org.apache.ofbiz.service.StdBooleanDocument.StdBoolean)get_store().insert_element_user(STDBOOLEAN$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Boolean" element
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
     * Removes the ith "std-Boolean" element
     */
    public void removeStdBoolean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDBOOLEAN$12, i);
        }
    }
    
    /**
     * Gets array of all "std-Locale" elements
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale[] getStdLocaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDLOCALE$14, targetList);
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale[] result = new org.apache.ofbiz.service.StdLocaleDocument.StdLocale[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-Locale" element
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale getStdLocaleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().find_element_user(STDLOCALE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-Locale" element
     */
    public int sizeOfStdLocaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDLOCALE$14);
        }
    }
    
    /**
     * Sets array of all "std-Locale" element
     */
    public void setStdLocaleArray(org.apache.ofbiz.service.StdLocaleDocument.StdLocale[] stdLocaleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdLocaleArray, STDLOCALE$14);
        }
    }
    
    /**
     * Sets ith "std-Locale" element
     */
    public void setStdLocaleArray(int i, org.apache.ofbiz.service.StdLocaleDocument.StdLocale stdLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().find_element_user(STDLOCALE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdLocale);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Locale" element
     */
    public org.apache.ofbiz.service.StdLocaleDocument.StdLocale insertNewStdLocale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdLocaleDocument.StdLocale target = null;
            target = (org.apache.ofbiz.service.StdLocaleDocument.StdLocale)get_store().insert_element_user(STDLOCALE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Locale" element
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
     * Removes the ith "std-Locale" element
     */
    public void removeStdLocale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDLOCALE$14, i);
        }
    }
    
    /**
     * Gets array of all "sql-Timestamp" elements
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp[] getSqlTimestampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SQLTIMESTAMP$16, targetList);
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp[] result = new org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sql-Timestamp" element
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp getSqlTimestampArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().find_element_user(SQLTIMESTAMP$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sql-Timestamp" element
     */
    public int sizeOfSqlTimestampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLTIMESTAMP$16);
        }
    }
    
    /**
     * Sets array of all "sql-Timestamp" element
     */
    public void setSqlTimestampArray(org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp[] sqlTimestampArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sqlTimestampArray, SQLTIMESTAMP$16);
        }
    }
    
    /**
     * Sets ith "sql-Timestamp" element
     */
    public void setSqlTimestampArray(int i, org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp sqlTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().find_element_user(SQLTIMESTAMP$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sqlTimestamp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sql-Timestamp" element
     */
    public org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp insertNewSqlTimestamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp target = null;
            target = (org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp)get_store().insert_element_user(SQLTIMESTAMP$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sql-Timestamp" element
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
     * Removes the ith "sql-Timestamp" element
     */
    public void removeSqlTimestamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLTIMESTAMP$16, i);
        }
    }
    
    /**
     * Gets array of all "sql-Date" elements
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate[] getSqlDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SQLDATE$18, targetList);
            org.apache.ofbiz.service.SqlDateDocument.SqlDate[] result = new org.apache.ofbiz.service.SqlDateDocument.SqlDate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sql-Date" element
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate getSqlDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().find_element_user(SQLDATE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sql-Date" element
     */
    public int sizeOfSqlDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLDATE$18);
        }
    }
    
    /**
     * Sets array of all "sql-Date" element
     */
    public void setSqlDateArray(org.apache.ofbiz.service.SqlDateDocument.SqlDate[] sqlDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sqlDateArray, SQLDATE$18);
        }
    }
    
    /**
     * Sets ith "sql-Date" element
     */
    public void setSqlDateArray(int i, org.apache.ofbiz.service.SqlDateDocument.SqlDate sqlDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().find_element_user(SQLDATE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sqlDate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sql-Date" element
     */
    public org.apache.ofbiz.service.SqlDateDocument.SqlDate insertNewSqlDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlDateDocument.SqlDate target = null;
            target = (org.apache.ofbiz.service.SqlDateDocument.SqlDate)get_store().insert_element_user(SQLDATE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sql-Date" element
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
     * Removes the ith "sql-Date" element
     */
    public void removeSqlDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLDATE$18, i);
        }
    }
    
    /**
     * Gets array of all "sql-Time" elements
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime[] getSqlTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SQLTIME$20, targetList);
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime[] result = new org.apache.ofbiz.service.SqlTimeDocument.SqlTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sql-Time" element
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime getSqlTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().find_element_user(SQLTIME$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sql-Time" element
     */
    public int sizeOfSqlTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLTIME$20);
        }
    }
    
    /**
     * Sets array of all "sql-Time" element
     */
    public void setSqlTimeArray(org.apache.ofbiz.service.SqlTimeDocument.SqlTime[] sqlTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sqlTimeArray, SQLTIME$20);
        }
    }
    
    /**
     * Sets ith "sql-Time" element
     */
    public void setSqlTimeArray(int i, org.apache.ofbiz.service.SqlTimeDocument.SqlTime sqlTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().find_element_user(SQLTIME$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sqlTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sql-Time" element
     */
    public org.apache.ofbiz.service.SqlTimeDocument.SqlTime insertNewSqlTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.SqlTimeDocument.SqlTime target = null;
            target = (org.apache.ofbiz.service.SqlTimeDocument.SqlTime)get_store().insert_element_user(SQLTIME$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sql-Time" element
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
     * Removes the ith "sql-Time" element
     */
    public void removeSqlTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLTIME$20, i);
        }
    }
    
    /**
     * Gets array of all "col-ArrayList" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColArrayListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLARRAYLIST$22, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-ArrayList" element
     */
    public org.apache.ofbiz.service.ColCollection getColArrayListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLARRAYLIST$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-ArrayList" element
     */
    public int sizeOfColArrayListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLARRAYLIST$22);
        }
    }
    
    /**
     * Sets array of all "col-ArrayList" element
     */
    public void setColArrayListArray(org.apache.ofbiz.service.ColCollection[] colArrayListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colArrayListArray, COLARRAYLIST$22);
        }
    }
    
    /**
     * Sets ith "col-ArrayList" element
     */
    public void setColArrayListArray(int i, org.apache.ofbiz.service.ColCollection colArrayList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLARRAYLIST$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colArrayList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-ArrayList" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColArrayList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLARRAYLIST$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-ArrayList" element
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
     * Removes the ith "col-ArrayList" element
     */
    public void removeColArrayList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLARRAYLIST$22, i);
        }
    }
    
    /**
     * Gets array of all "col-LinkedList" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColLinkedListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLLINKEDLIST$24, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-LinkedList" element
     */
    public org.apache.ofbiz.service.ColCollection getColLinkedListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLLINKEDLIST$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-LinkedList" element
     */
    public int sizeOfColLinkedListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLINKEDLIST$24);
        }
    }
    
    /**
     * Sets array of all "col-LinkedList" element
     */
    public void setColLinkedListArray(org.apache.ofbiz.service.ColCollection[] colLinkedListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colLinkedListArray, COLLINKEDLIST$24);
        }
    }
    
    /**
     * Sets ith "col-LinkedList" element
     */
    public void setColLinkedListArray(int i, org.apache.ofbiz.service.ColCollection colLinkedList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLLINKEDLIST$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colLinkedList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-LinkedList" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColLinkedList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLLINKEDLIST$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-LinkedList" element
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
     * Removes the ith "col-LinkedList" element
     */
    public void removeColLinkedList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLINKEDLIST$24, i);
        }
    }
    
    /**
     * Gets array of all "col-Stack" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColStackArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLSTACK$26, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-Stack" element
     */
    public org.apache.ofbiz.service.ColCollection getColStackArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLSTACK$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-Stack" element
     */
    public int sizeOfColStackArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLSTACK$26);
        }
    }
    
    /**
     * Sets array of all "col-Stack" element
     */
    public void setColStackArray(org.apache.ofbiz.service.ColCollection[] colStackArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colStackArray, COLSTACK$26);
        }
    }
    
    /**
     * Sets ith "col-Stack" element
     */
    public void setColStackArray(int i, org.apache.ofbiz.service.ColCollection colStack)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLSTACK$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colStack);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-Stack" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColStack(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLSTACK$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-Stack" element
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
     * Removes the ith "col-Stack" element
     */
    public void removeColStack(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLSTACK$26, i);
        }
    }
    
    /**
     * Gets array of all "col-Vector" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColVectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLVECTOR$28, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-Vector" element
     */
    public org.apache.ofbiz.service.ColCollection getColVectorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLVECTOR$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-Vector" element
     */
    public int sizeOfColVectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLVECTOR$28);
        }
    }
    
    /**
     * Sets array of all "col-Vector" element
     */
    public void setColVectorArray(org.apache.ofbiz.service.ColCollection[] colVectorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colVectorArray, COLVECTOR$28);
        }
    }
    
    /**
     * Sets ith "col-Vector" element
     */
    public void setColVectorArray(int i, org.apache.ofbiz.service.ColCollection colVector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLVECTOR$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colVector);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-Vector" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColVector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLVECTOR$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-Vector" element
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
     * Removes the ith "col-Vector" element
     */
    public void removeColVector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLVECTOR$28, i);
        }
    }
    
    /**
     * Gets array of all "col-TreeSet" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColTreeSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLTREESET$30, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-TreeSet" element
     */
    public org.apache.ofbiz.service.ColCollection getColTreeSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLTREESET$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-TreeSet" element
     */
    public int sizeOfColTreeSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLTREESET$30);
        }
    }
    
    /**
     * Sets array of all "col-TreeSet" element
     */
    public void setColTreeSetArray(org.apache.ofbiz.service.ColCollection[] colTreeSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colTreeSetArray, COLTREESET$30);
        }
    }
    
    /**
     * Sets ith "col-TreeSet" element
     */
    public void setColTreeSetArray(int i, org.apache.ofbiz.service.ColCollection colTreeSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLTREESET$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colTreeSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-TreeSet" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColTreeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLTREESET$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-TreeSet" element
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
     * Removes the ith "col-TreeSet" element
     */
    public void removeColTreeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLTREESET$30, i);
        }
    }
    
    /**
     * Gets array of all "col-HashSet" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColHashSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLHASHSET$32, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-HashSet" element
     */
    public org.apache.ofbiz.service.ColCollection getColHashSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLHASHSET$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-HashSet" element
     */
    public int sizeOfColHashSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLHASHSET$32);
        }
    }
    
    /**
     * Sets array of all "col-HashSet" element
     */
    public void setColHashSetArray(org.apache.ofbiz.service.ColCollection[] colHashSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colHashSetArray, COLHASHSET$32);
        }
    }
    
    /**
     * Sets ith "col-HashSet" element
     */
    public void setColHashSetArray(int i, org.apache.ofbiz.service.ColCollection colHashSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLHASHSET$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colHashSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-HashSet" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColHashSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLHASHSET$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-HashSet" element
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
     * Removes the ith "col-HashSet" element
     */
    public void removeColHashSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLHASHSET$32, i);
        }
    }
    
    /**
     * Gets array of all "col-Collection" elements
     */
    public org.apache.ofbiz.service.ColCollection[] getColCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLCOLLECTION$34, targetList);
            org.apache.ofbiz.service.ColCollection[] result = new org.apache.ofbiz.service.ColCollection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col-Collection" element
     */
    public org.apache.ofbiz.service.ColCollection getColCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLCOLLECTION$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col-Collection" element
     */
    public int sizeOfColCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLCOLLECTION$34);
        }
    }
    
    /**
     * Sets array of all "col-Collection" element
     */
    public void setColCollectionArray(org.apache.ofbiz.service.ColCollection[] colCollectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colCollectionArray, COLCOLLECTION$34);
        }
    }
    
    /**
     * Sets ith "col-Collection" element
     */
    public void setColCollectionArray(int i, org.apache.ofbiz.service.ColCollection colCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().find_element_user(COLCOLLECTION$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colCollection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-Collection" element
     */
    public org.apache.ofbiz.service.ColCollection insertNewColCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.ColCollection target = null;
            target = (org.apache.ofbiz.service.ColCollection)get_store().insert_element_user(COLCOLLECTION$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-Collection" element
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
     * Removes the ith "col-Collection" element
     */
    public void removeColCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLCOLLECTION$34, i);
        }
    }
    
    /**
     * Gets array of all "map-HashMap" elements
     */
    public org.apache.ofbiz.service.MapMap[] getMapHashMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPHASHMAP$36, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-HashMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapHashMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHMAP$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-HashMap" element
     */
    public int sizeOfMapHashMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPHASHMAP$36);
        }
    }
    
    /**
     * Sets array of all "map-HashMap" element
     */
    public void setMapHashMapArray(org.apache.ofbiz.service.MapMap[] mapHashMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapHashMapArray, MAPHASHMAP$36);
        }
    }
    
    /**
     * Sets ith "map-HashMap" element
     */
    public void setMapHashMapArray(int i, org.apache.ofbiz.service.MapMap mapHashMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHMAP$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapHashMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-HashMap" element
     */
    public org.apache.ofbiz.service.MapMap insertNewMapHashMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(MAPHASHMAP$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-HashMap" element
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
     * Removes the ith "map-HashMap" element
     */
    public void removeMapHashMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPHASHMAP$36, i);
        }
    }
    
    /**
     * Gets array of all "map-Properties" elements
     */
    public org.apache.ofbiz.service.MapMap[] getMapPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPPROPERTIES$38, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-Properties" element
     */
    public org.apache.ofbiz.service.MapMap getMapPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPPROPERTIES$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-Properties" element
     */
    public int sizeOfMapPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPROPERTIES$38);
        }
    }
    
    /**
     * Sets array of all "map-Properties" element
     */
    public void setMapPropertiesArray(org.apache.ofbiz.service.MapMap[] mapPropertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapPropertiesArray, MAPPROPERTIES$38);
        }
    }
    
    /**
     * Sets ith "map-Properties" element
     */
    public void setMapPropertiesArray(int i, org.apache.ofbiz.service.MapMap mapProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPPROPERTIES$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapProperties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Properties" element
     */
    public org.apache.ofbiz.service.MapMap insertNewMapProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(MAPPROPERTIES$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Properties" element
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
     * Removes the ith "map-Properties" element
     */
    public void removeMapProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPROPERTIES$38, i);
        }
    }
    
    /**
     * Gets array of all "map-Hashtable" elements
     */
    public org.apache.ofbiz.service.MapMap[] getMapHashtableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPHASHTABLE$40, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-Hashtable" element
     */
    public org.apache.ofbiz.service.MapMap getMapHashtableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHTABLE$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-Hashtable" element
     */
    public int sizeOfMapHashtableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPHASHTABLE$40);
        }
    }
    
    /**
     * Sets array of all "map-Hashtable" element
     */
    public void setMapHashtableArray(org.apache.ofbiz.service.MapMap[] mapHashtableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapHashtableArray, MAPHASHTABLE$40);
        }
    }
    
    /**
     * Sets ith "map-Hashtable" element
     */
    public void setMapHashtableArray(int i, org.apache.ofbiz.service.MapMap mapHashtable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPHASHTABLE$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapHashtable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Hashtable" element
     */
    public org.apache.ofbiz.service.MapMap insertNewMapHashtable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(MAPHASHTABLE$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Hashtable" element
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
     * Removes the ith "map-Hashtable" element
     */
    public void removeMapHashtable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPHASHTABLE$40, i);
        }
    }
    
    /**
     * Gets array of all "map-WeakHashMap" elements
     */
    public org.apache.ofbiz.service.MapMap[] getMapWeakHashMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPWEAKHASHMAP$42, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-WeakHashMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapWeakHashMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPWEAKHASHMAP$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-WeakHashMap" element
     */
    public int sizeOfMapWeakHashMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPWEAKHASHMAP$42);
        }
    }
    
    /**
     * Sets array of all "map-WeakHashMap" element
     */
    public void setMapWeakHashMapArray(org.apache.ofbiz.service.MapMap[] mapWeakHashMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapWeakHashMapArray, MAPWEAKHASHMAP$42);
        }
    }
    
    /**
     * Sets ith "map-WeakHashMap" element
     */
    public void setMapWeakHashMapArray(int i, org.apache.ofbiz.service.MapMap mapWeakHashMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPWEAKHASHMAP$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapWeakHashMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-WeakHashMap" element
     */
    public org.apache.ofbiz.service.MapMap insertNewMapWeakHashMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(MAPWEAKHASHMAP$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-WeakHashMap" element
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
     * Removes the ith "map-WeakHashMap" element
     */
    public void removeMapWeakHashMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPWEAKHASHMAP$42, i);
        }
    }
    
    /**
     * Gets array of all "map-TreeMap" elements
     */
    public org.apache.ofbiz.service.MapMap[] getMapTreeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPTREEMAP$44, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-TreeMap" element
     */
    public org.apache.ofbiz.service.MapMap getMapTreeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPTREEMAP$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-TreeMap" element
     */
    public int sizeOfMapTreeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPTREEMAP$44);
        }
    }
    
    /**
     * Sets array of all "map-TreeMap" element
     */
    public void setMapTreeMapArray(org.apache.ofbiz.service.MapMap[] mapTreeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapTreeMapArray, MAPTREEMAP$44);
        }
    }
    
    /**
     * Sets ith "map-TreeMap" element
     */
    public void setMapTreeMapArray(int i, org.apache.ofbiz.service.MapMap mapTreeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPTREEMAP$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapTreeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-TreeMap" element
     */
    public org.apache.ofbiz.service.MapMap insertNewMapTreeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(MAPTREEMAP$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-TreeMap" element
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
     * Removes the ith "map-TreeMap" element
     */
    public void removeMapTreeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPTREEMAP$44, i);
        }
    }
    
    /**
     * Gets array of all "map-Map" elements
     */
    public org.apache.ofbiz.service.MapMap[] getMapMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPMAP$46, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map-Map" element
     */
    public org.apache.ofbiz.service.MapMap getMapMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map-Map" element
     */
    public int sizeOfMapMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPMAP$46);
        }
    }
    
    /**
     * Sets array of all "map-Map" element
     */
    public void setMapMapArray(org.apache.ofbiz.service.MapMap[] mapMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mapMapArray, MAPMAP$46);
        }
    }
    
    /**
     * Sets ith "map-Map" element
     */
    public void setMapMapArray(int i, org.apache.ofbiz.service.MapMap mapMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(MAPMAP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Map" element
     */
    public org.apache.ofbiz.service.MapMap insertNewMapMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(MAPMAP$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Map" element
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
     * Removes the ith "map-Map" element
     */
    public void removeMapMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPMAP$46, i);
        }
    }
    
    /**
     * Gets array of all "eepk-" elements
     */
    public org.apache.ofbiz.service.MapMap[] getEepkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EEPK$48, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eepk-" element
     */
    public org.apache.ofbiz.service.MapMap getEepkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEPK$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eepk-" element
     */
    public int sizeOfEepkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EEPK$48);
        }
    }
    
    /**
     * Sets array of all "eepk-" element
     */
    public void setEepkArray(org.apache.ofbiz.service.MapMap[] eepkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eepkArray, EEPK$48);
        }
    }
    
    /**
     * Sets ith "eepk-" element
     */
    public void setEepkArray(int i, org.apache.ofbiz.service.MapMap eepk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEPK$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eepk);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eepk-" element
     */
    public org.apache.ofbiz.service.MapMap insertNewEepk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(EEPK$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eepk-" element
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
     * Removes the ith "eepk-" element
     */
    public void removeEepk(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EEPK$48, i);
        }
    }
    
    /**
     * Gets array of all "eeval-" elements
     */
    public org.apache.ofbiz.service.MapMap[] getEevalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EEVAL$50, targetList);
            org.apache.ofbiz.service.MapMap[] result = new org.apache.ofbiz.service.MapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eeval-" element
     */
    public org.apache.ofbiz.service.MapMap getEevalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEVAL$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eeval-" element
     */
    public int sizeOfEevalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EEVAL$50);
        }
    }
    
    /**
     * Sets array of all "eeval-" element
     */
    public void setEevalArray(org.apache.ofbiz.service.MapMap[] eevalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eevalArray, EEVAL$50);
        }
    }
    
    /**
     * Sets ith "eeval-" element
     */
    public void setEevalArray(int i, org.apache.ofbiz.service.MapMap eeval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().find_element_user(EEVAL$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eeval);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eeval-" element
     */
    public org.apache.ofbiz.service.MapMap insertNewEeval(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.MapMap target = null;
            target = (org.apache.ofbiz.service.MapMap)get_store().insert_element_user(EEVAL$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eeval-" element
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
     * Removes the ith "eeval-" element
     */
    public void removeEeval(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EEVAL$50, i);
        }
    }
    
    /**
     * Gets array of all "std-BigDecimal" elements
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal[] getStdBigDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDBIGDECIMAL$52, targetList);
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal[] result = new org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "std-BigDecimal" element
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal getStdBigDecimalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().find_element_user(STDBIGDECIMAL$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "std-BigDecimal" element
     */
    public int sizeOfStdBigDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDBIGDECIMAL$52);
        }
    }
    
    /**
     * Sets array of all "std-BigDecimal" element
     */
    public void setStdBigDecimalArray(org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal[] stdBigDecimalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdBigDecimalArray, STDBIGDECIMAL$52);
        }
    }
    
    /**
     * Sets ith "std-BigDecimal" element
     */
    public void setStdBigDecimalArray(int i, org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal stdBigDecimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().find_element_user(STDBIGDECIMAL$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdBigDecimal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-BigDecimal" element
     */
    public org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal insertNewStdBigDecimal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal target = null;
            target = (org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal)get_store().insert_element_user(STDBIGDECIMAL$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-BigDecimal" element
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
     * Removes the ith "std-BigDecimal" element
     */
    public void removeStdBigDecimal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDBIGDECIMAL$52, i);
        }
    }
}
