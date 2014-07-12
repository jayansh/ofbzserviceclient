/*
 * XML Type:  col-Collection
 * Namespace: http://ofbiz.apache.org/service/
 * Java type: org.apache.ofbiz.service.ColCollection
 *
 * Automatically generated - do not modify.
 */
package org.apache.ofbiz.service;


/**
 * An XML col-Collection(@http://ofbiz.apache.org/service/).
 *
 * This is a complex type.
 */
public interface ColCollection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2D58E30B30747263FFF7BF74FCC60359").resolveHandle("colcollectiona78dtype");
    
    /**
     * Gets array of all "null" elements
     */
    org.apache.ofbiz.service.NullDocument.Null[] getNullArray();
    
    /**
     * Gets ith "null" element
     */
    org.apache.ofbiz.service.NullDocument.Null getNullArray(int i);
    
    /**
     * Tests for nil ith "null" element
     */
    boolean isNilNullArray(int i);
    
    /**
     * Returns number of "null" element
     */
    int sizeOfNullArray();
    
    /**
     * Sets array of all "null" element
     */
    void setNullArray(org.apache.ofbiz.service.NullDocument.Null[] xnullArray);
    
    /**
     * Sets ith "null" element
     */
    void setNullArray(int i, org.apache.ofbiz.service.NullDocument.Null xnull);
    
    /**
     * Nils the ith "null" element
     */
    void setNilNullArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "null" element
     */
    org.apache.ofbiz.service.NullDocument.Null insertNewNull(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "null" element
     */
    org.apache.ofbiz.service.NullDocument.Null addNewNull();
    
    /**
     * Removes the ith "null" element
     */
    void removeNull(int i);
    
    /**
     * Gets array of all "std-String" elements
     */
    org.apache.ofbiz.service.StdStringDocument.StdString[] getStdStringArray();
    
    /**
     * Gets ith "std-String" element
     */
    org.apache.ofbiz.service.StdStringDocument.StdString getStdStringArray(int i);
    
    /**
     * Returns number of "std-String" element
     */
    int sizeOfStdStringArray();
    
    /**
     * Sets array of all "std-String" element
     */
    void setStdStringArray(org.apache.ofbiz.service.StdStringDocument.StdString[] stdStringArray);
    
    /**
     * Sets ith "std-String" element
     */
    void setStdStringArray(int i, org.apache.ofbiz.service.StdStringDocument.StdString stdString);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-String" element
     */
    org.apache.ofbiz.service.StdStringDocument.StdString insertNewStdString(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-String" element
     */
    org.apache.ofbiz.service.StdStringDocument.StdString addNewStdString();
    
    /**
     * Removes the ith "std-String" element
     */
    void removeStdString(int i);
    
    /**
     * Gets array of all "std-Integer" elements
     */
    org.apache.ofbiz.service.StdIntegerDocument.StdInteger[] getStdIntegerArray();
    
    /**
     * Gets ith "std-Integer" element
     */
    org.apache.ofbiz.service.StdIntegerDocument.StdInteger getStdIntegerArray(int i);
    
    /**
     * Returns number of "std-Integer" element
     */
    int sizeOfStdIntegerArray();
    
    /**
     * Sets array of all "std-Integer" element
     */
    void setStdIntegerArray(org.apache.ofbiz.service.StdIntegerDocument.StdInteger[] stdIntegerArray);
    
    /**
     * Sets ith "std-Integer" element
     */
    void setStdIntegerArray(int i, org.apache.ofbiz.service.StdIntegerDocument.StdInteger stdInteger);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Integer" element
     */
    org.apache.ofbiz.service.StdIntegerDocument.StdInteger insertNewStdInteger(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Integer" element
     */
    org.apache.ofbiz.service.StdIntegerDocument.StdInteger addNewStdInteger();
    
    /**
     * Removes the ith "std-Integer" element
     */
    void removeStdInteger(int i);
    
    /**
     * Gets array of all "std-Long" elements
     */
    org.apache.ofbiz.service.StdLongDocument.StdLong[] getStdLongArray();
    
    /**
     * Gets ith "std-Long" element
     */
    org.apache.ofbiz.service.StdLongDocument.StdLong getStdLongArray(int i);
    
    /**
     * Returns number of "std-Long" element
     */
    int sizeOfStdLongArray();
    
    /**
     * Sets array of all "std-Long" element
     */
    void setStdLongArray(org.apache.ofbiz.service.StdLongDocument.StdLong[] stdLongArray);
    
    /**
     * Sets ith "std-Long" element
     */
    void setStdLongArray(int i, org.apache.ofbiz.service.StdLongDocument.StdLong stdLong);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Long" element
     */
    org.apache.ofbiz.service.StdLongDocument.StdLong insertNewStdLong(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Long" element
     */
    org.apache.ofbiz.service.StdLongDocument.StdLong addNewStdLong();
    
    /**
     * Removes the ith "std-Long" element
     */
    void removeStdLong(int i);
    
    /**
     * Gets array of all "std-Float" elements
     */
    org.apache.ofbiz.service.StdFloatDocument.StdFloat[] getStdFloatArray();
    
    /**
     * Gets ith "std-Float" element
     */
    org.apache.ofbiz.service.StdFloatDocument.StdFloat getStdFloatArray(int i);
    
    /**
     * Returns number of "std-Float" element
     */
    int sizeOfStdFloatArray();
    
    /**
     * Sets array of all "std-Float" element
     */
    void setStdFloatArray(org.apache.ofbiz.service.StdFloatDocument.StdFloat[] stdFloatArray);
    
    /**
     * Sets ith "std-Float" element
     */
    void setStdFloatArray(int i, org.apache.ofbiz.service.StdFloatDocument.StdFloat stdFloat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Float" element
     */
    org.apache.ofbiz.service.StdFloatDocument.StdFloat insertNewStdFloat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Float" element
     */
    org.apache.ofbiz.service.StdFloatDocument.StdFloat addNewStdFloat();
    
    /**
     * Removes the ith "std-Float" element
     */
    void removeStdFloat(int i);
    
    /**
     * Gets array of all "std-Double" elements
     */
    org.apache.ofbiz.service.StdDoubleDocument.StdDouble[] getStdDoubleArray();
    
    /**
     * Gets ith "std-Double" element
     */
    org.apache.ofbiz.service.StdDoubleDocument.StdDouble getStdDoubleArray(int i);
    
    /**
     * Returns number of "std-Double" element
     */
    int sizeOfStdDoubleArray();
    
    /**
     * Sets array of all "std-Double" element
     */
    void setStdDoubleArray(org.apache.ofbiz.service.StdDoubleDocument.StdDouble[] stdDoubleArray);
    
    /**
     * Sets ith "std-Double" element
     */
    void setStdDoubleArray(int i, org.apache.ofbiz.service.StdDoubleDocument.StdDouble stdDouble);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Double" element
     */
    org.apache.ofbiz.service.StdDoubleDocument.StdDouble insertNewStdDouble(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Double" element
     */
    org.apache.ofbiz.service.StdDoubleDocument.StdDouble addNewStdDouble();
    
    /**
     * Removes the ith "std-Double" element
     */
    void removeStdDouble(int i);
    
    /**
     * Gets array of all "std-Boolean" elements
     */
    org.apache.ofbiz.service.StdBooleanDocument.StdBoolean[] getStdBooleanArray();
    
    /**
     * Gets ith "std-Boolean" element
     */
    org.apache.ofbiz.service.StdBooleanDocument.StdBoolean getStdBooleanArray(int i);
    
    /**
     * Returns number of "std-Boolean" element
     */
    int sizeOfStdBooleanArray();
    
    /**
     * Sets array of all "std-Boolean" element
     */
    void setStdBooleanArray(org.apache.ofbiz.service.StdBooleanDocument.StdBoolean[] stdBooleanArray);
    
    /**
     * Sets ith "std-Boolean" element
     */
    void setStdBooleanArray(int i, org.apache.ofbiz.service.StdBooleanDocument.StdBoolean stdBoolean);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Boolean" element
     */
    org.apache.ofbiz.service.StdBooleanDocument.StdBoolean insertNewStdBoolean(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Boolean" element
     */
    org.apache.ofbiz.service.StdBooleanDocument.StdBoolean addNewStdBoolean();
    
    /**
     * Removes the ith "std-Boolean" element
     */
    void removeStdBoolean(int i);
    
    /**
     * Gets array of all "std-Locale" elements
     */
    org.apache.ofbiz.service.StdLocaleDocument.StdLocale[] getStdLocaleArray();
    
    /**
     * Gets ith "std-Locale" element
     */
    org.apache.ofbiz.service.StdLocaleDocument.StdLocale getStdLocaleArray(int i);
    
    /**
     * Returns number of "std-Locale" element
     */
    int sizeOfStdLocaleArray();
    
    /**
     * Sets array of all "std-Locale" element
     */
    void setStdLocaleArray(org.apache.ofbiz.service.StdLocaleDocument.StdLocale[] stdLocaleArray);
    
    /**
     * Sets ith "std-Locale" element
     */
    void setStdLocaleArray(int i, org.apache.ofbiz.service.StdLocaleDocument.StdLocale stdLocale);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-Locale" element
     */
    org.apache.ofbiz.service.StdLocaleDocument.StdLocale insertNewStdLocale(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-Locale" element
     */
    org.apache.ofbiz.service.StdLocaleDocument.StdLocale addNewStdLocale();
    
    /**
     * Removes the ith "std-Locale" element
     */
    void removeStdLocale(int i);
    
    /**
     * Gets array of all "sql-Timestamp" elements
     */
    org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp[] getSqlTimestampArray();
    
    /**
     * Gets ith "sql-Timestamp" element
     */
    org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp getSqlTimestampArray(int i);
    
    /**
     * Returns number of "sql-Timestamp" element
     */
    int sizeOfSqlTimestampArray();
    
    /**
     * Sets array of all "sql-Timestamp" element
     */
    void setSqlTimestampArray(org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp[] sqlTimestampArray);
    
    /**
     * Sets ith "sql-Timestamp" element
     */
    void setSqlTimestampArray(int i, org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp sqlTimestamp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sql-Timestamp" element
     */
    org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp insertNewSqlTimestamp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sql-Timestamp" element
     */
    org.apache.ofbiz.service.SqlTimestampDocument.SqlTimestamp addNewSqlTimestamp();
    
    /**
     * Removes the ith "sql-Timestamp" element
     */
    void removeSqlTimestamp(int i);
    
    /**
     * Gets array of all "sql-Date" elements
     */
    org.apache.ofbiz.service.SqlDateDocument.SqlDate[] getSqlDateArray();
    
    /**
     * Gets ith "sql-Date" element
     */
    org.apache.ofbiz.service.SqlDateDocument.SqlDate getSqlDateArray(int i);
    
    /**
     * Returns number of "sql-Date" element
     */
    int sizeOfSqlDateArray();
    
    /**
     * Sets array of all "sql-Date" element
     */
    void setSqlDateArray(org.apache.ofbiz.service.SqlDateDocument.SqlDate[] sqlDateArray);
    
    /**
     * Sets ith "sql-Date" element
     */
    void setSqlDateArray(int i, org.apache.ofbiz.service.SqlDateDocument.SqlDate sqlDate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sql-Date" element
     */
    org.apache.ofbiz.service.SqlDateDocument.SqlDate insertNewSqlDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sql-Date" element
     */
    org.apache.ofbiz.service.SqlDateDocument.SqlDate addNewSqlDate();
    
    /**
     * Removes the ith "sql-Date" element
     */
    void removeSqlDate(int i);
    
    /**
     * Gets array of all "sql-Time" elements
     */
    org.apache.ofbiz.service.SqlTimeDocument.SqlTime[] getSqlTimeArray();
    
    /**
     * Gets ith "sql-Time" element
     */
    org.apache.ofbiz.service.SqlTimeDocument.SqlTime getSqlTimeArray(int i);
    
    /**
     * Returns number of "sql-Time" element
     */
    int sizeOfSqlTimeArray();
    
    /**
     * Sets array of all "sql-Time" element
     */
    void setSqlTimeArray(org.apache.ofbiz.service.SqlTimeDocument.SqlTime[] sqlTimeArray);
    
    /**
     * Sets ith "sql-Time" element
     */
    void setSqlTimeArray(int i, org.apache.ofbiz.service.SqlTimeDocument.SqlTime sqlTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sql-Time" element
     */
    org.apache.ofbiz.service.SqlTimeDocument.SqlTime insertNewSqlTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sql-Time" element
     */
    org.apache.ofbiz.service.SqlTimeDocument.SqlTime addNewSqlTime();
    
    /**
     * Removes the ith "sql-Time" element
     */
    void removeSqlTime(int i);
    
    /**
     * Gets array of all "col-ArrayList" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColArrayListArray();
    
    /**
     * Gets ith "col-ArrayList" element
     */
    org.apache.ofbiz.service.ColCollection getColArrayListArray(int i);
    
    /**
     * Returns number of "col-ArrayList" element
     */
    int sizeOfColArrayListArray();
    
    /**
     * Sets array of all "col-ArrayList" element
     */
    void setColArrayListArray(org.apache.ofbiz.service.ColCollection[] colArrayListArray);
    
    /**
     * Sets ith "col-ArrayList" element
     */
    void setColArrayListArray(int i, org.apache.ofbiz.service.ColCollection colArrayList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-ArrayList" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColArrayList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-ArrayList" element
     */
    org.apache.ofbiz.service.ColCollection addNewColArrayList();
    
    /**
     * Removes the ith "col-ArrayList" element
     */
    void removeColArrayList(int i);
    
    /**
     * Gets array of all "col-LinkedList" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColLinkedListArray();
    
    /**
     * Gets ith "col-LinkedList" element
     */
    org.apache.ofbiz.service.ColCollection getColLinkedListArray(int i);
    
    /**
     * Returns number of "col-LinkedList" element
     */
    int sizeOfColLinkedListArray();
    
    /**
     * Sets array of all "col-LinkedList" element
     */
    void setColLinkedListArray(org.apache.ofbiz.service.ColCollection[] colLinkedListArray);
    
    /**
     * Sets ith "col-LinkedList" element
     */
    void setColLinkedListArray(int i, org.apache.ofbiz.service.ColCollection colLinkedList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-LinkedList" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColLinkedList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-LinkedList" element
     */
    org.apache.ofbiz.service.ColCollection addNewColLinkedList();
    
    /**
     * Removes the ith "col-LinkedList" element
     */
    void removeColLinkedList(int i);
    
    /**
     * Gets array of all "col-Stack" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColStackArray();
    
    /**
     * Gets ith "col-Stack" element
     */
    org.apache.ofbiz.service.ColCollection getColStackArray(int i);
    
    /**
     * Returns number of "col-Stack" element
     */
    int sizeOfColStackArray();
    
    /**
     * Sets array of all "col-Stack" element
     */
    void setColStackArray(org.apache.ofbiz.service.ColCollection[] colStackArray);
    
    /**
     * Sets ith "col-Stack" element
     */
    void setColStackArray(int i, org.apache.ofbiz.service.ColCollection colStack);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-Stack" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColStack(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-Stack" element
     */
    org.apache.ofbiz.service.ColCollection addNewColStack();
    
    /**
     * Removes the ith "col-Stack" element
     */
    void removeColStack(int i);
    
    /**
     * Gets array of all "col-Vector" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColVectorArray();
    
    /**
     * Gets ith "col-Vector" element
     */
    org.apache.ofbiz.service.ColCollection getColVectorArray(int i);
    
    /**
     * Returns number of "col-Vector" element
     */
    int sizeOfColVectorArray();
    
    /**
     * Sets array of all "col-Vector" element
     */
    void setColVectorArray(org.apache.ofbiz.service.ColCollection[] colVectorArray);
    
    /**
     * Sets ith "col-Vector" element
     */
    void setColVectorArray(int i, org.apache.ofbiz.service.ColCollection colVector);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-Vector" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColVector(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-Vector" element
     */
    org.apache.ofbiz.service.ColCollection addNewColVector();
    
    /**
     * Removes the ith "col-Vector" element
     */
    void removeColVector(int i);
    
    /**
     * Gets array of all "col-TreeSet" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColTreeSetArray();
    
    /**
     * Gets ith "col-TreeSet" element
     */
    org.apache.ofbiz.service.ColCollection getColTreeSetArray(int i);
    
    /**
     * Returns number of "col-TreeSet" element
     */
    int sizeOfColTreeSetArray();
    
    /**
     * Sets array of all "col-TreeSet" element
     */
    void setColTreeSetArray(org.apache.ofbiz.service.ColCollection[] colTreeSetArray);
    
    /**
     * Sets ith "col-TreeSet" element
     */
    void setColTreeSetArray(int i, org.apache.ofbiz.service.ColCollection colTreeSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-TreeSet" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColTreeSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-TreeSet" element
     */
    org.apache.ofbiz.service.ColCollection addNewColTreeSet();
    
    /**
     * Removes the ith "col-TreeSet" element
     */
    void removeColTreeSet(int i);
    
    /**
     * Gets array of all "col-HashSet" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColHashSetArray();
    
    /**
     * Gets ith "col-HashSet" element
     */
    org.apache.ofbiz.service.ColCollection getColHashSetArray(int i);
    
    /**
     * Returns number of "col-HashSet" element
     */
    int sizeOfColHashSetArray();
    
    /**
     * Sets array of all "col-HashSet" element
     */
    void setColHashSetArray(org.apache.ofbiz.service.ColCollection[] colHashSetArray);
    
    /**
     * Sets ith "col-HashSet" element
     */
    void setColHashSetArray(int i, org.apache.ofbiz.service.ColCollection colHashSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-HashSet" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColHashSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-HashSet" element
     */
    org.apache.ofbiz.service.ColCollection addNewColHashSet();
    
    /**
     * Removes the ith "col-HashSet" element
     */
    void removeColHashSet(int i);
    
    /**
     * Gets array of all "col-Collection" elements
     */
    org.apache.ofbiz.service.ColCollection[] getColCollectionArray();
    
    /**
     * Gets ith "col-Collection" element
     */
    org.apache.ofbiz.service.ColCollection getColCollectionArray(int i);
    
    /**
     * Returns number of "col-Collection" element
     */
    int sizeOfColCollectionArray();
    
    /**
     * Sets array of all "col-Collection" element
     */
    void setColCollectionArray(org.apache.ofbiz.service.ColCollection[] colCollectionArray);
    
    /**
     * Sets ith "col-Collection" element
     */
    void setColCollectionArray(int i, org.apache.ofbiz.service.ColCollection colCollection);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col-Collection" element
     */
    org.apache.ofbiz.service.ColCollection insertNewColCollection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col-Collection" element
     */
    org.apache.ofbiz.service.ColCollection addNewColCollection();
    
    /**
     * Removes the ith "col-Collection" element
     */
    void removeColCollection(int i);
    
    /**
     * Gets array of all "map-HashMap" elements
     */
    org.apache.ofbiz.service.MapMap[] getMapHashMapArray();
    
    /**
     * Gets ith "map-HashMap" element
     */
    org.apache.ofbiz.service.MapMap getMapHashMapArray(int i);
    
    /**
     * Returns number of "map-HashMap" element
     */
    int sizeOfMapHashMapArray();
    
    /**
     * Sets array of all "map-HashMap" element
     */
    void setMapHashMapArray(org.apache.ofbiz.service.MapMap[] mapHashMapArray);
    
    /**
     * Sets ith "map-HashMap" element
     */
    void setMapHashMapArray(int i, org.apache.ofbiz.service.MapMap mapHashMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-HashMap" element
     */
    org.apache.ofbiz.service.MapMap insertNewMapHashMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-HashMap" element
     */
    org.apache.ofbiz.service.MapMap addNewMapHashMap();
    
    /**
     * Removes the ith "map-HashMap" element
     */
    void removeMapHashMap(int i);
    
    /**
     * Gets array of all "map-Properties" elements
     */
    org.apache.ofbiz.service.MapMap[] getMapPropertiesArray();
    
    /**
     * Gets ith "map-Properties" element
     */
    org.apache.ofbiz.service.MapMap getMapPropertiesArray(int i);
    
    /**
     * Returns number of "map-Properties" element
     */
    int sizeOfMapPropertiesArray();
    
    /**
     * Sets array of all "map-Properties" element
     */
    void setMapPropertiesArray(org.apache.ofbiz.service.MapMap[] mapPropertiesArray);
    
    /**
     * Sets ith "map-Properties" element
     */
    void setMapPropertiesArray(int i, org.apache.ofbiz.service.MapMap mapProperties);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Properties" element
     */
    org.apache.ofbiz.service.MapMap insertNewMapProperties(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Properties" element
     */
    org.apache.ofbiz.service.MapMap addNewMapProperties();
    
    /**
     * Removes the ith "map-Properties" element
     */
    void removeMapProperties(int i);
    
    /**
     * Gets array of all "map-Hashtable" elements
     */
    org.apache.ofbiz.service.MapMap[] getMapHashtableArray();
    
    /**
     * Gets ith "map-Hashtable" element
     */
    org.apache.ofbiz.service.MapMap getMapHashtableArray(int i);
    
    /**
     * Returns number of "map-Hashtable" element
     */
    int sizeOfMapHashtableArray();
    
    /**
     * Sets array of all "map-Hashtable" element
     */
    void setMapHashtableArray(org.apache.ofbiz.service.MapMap[] mapHashtableArray);
    
    /**
     * Sets ith "map-Hashtable" element
     */
    void setMapHashtableArray(int i, org.apache.ofbiz.service.MapMap mapHashtable);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Hashtable" element
     */
    org.apache.ofbiz.service.MapMap insertNewMapHashtable(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Hashtable" element
     */
    org.apache.ofbiz.service.MapMap addNewMapHashtable();
    
    /**
     * Removes the ith "map-Hashtable" element
     */
    void removeMapHashtable(int i);
    
    /**
     * Gets array of all "map-WeakHashMap" elements
     */
    org.apache.ofbiz.service.MapMap[] getMapWeakHashMapArray();
    
    /**
     * Gets ith "map-WeakHashMap" element
     */
    org.apache.ofbiz.service.MapMap getMapWeakHashMapArray(int i);
    
    /**
     * Returns number of "map-WeakHashMap" element
     */
    int sizeOfMapWeakHashMapArray();
    
    /**
     * Sets array of all "map-WeakHashMap" element
     */
    void setMapWeakHashMapArray(org.apache.ofbiz.service.MapMap[] mapWeakHashMapArray);
    
    /**
     * Sets ith "map-WeakHashMap" element
     */
    void setMapWeakHashMapArray(int i, org.apache.ofbiz.service.MapMap mapWeakHashMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-WeakHashMap" element
     */
    org.apache.ofbiz.service.MapMap insertNewMapWeakHashMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-WeakHashMap" element
     */
    org.apache.ofbiz.service.MapMap addNewMapWeakHashMap();
    
    /**
     * Removes the ith "map-WeakHashMap" element
     */
    void removeMapWeakHashMap(int i);
    
    /**
     * Gets array of all "map-TreeMap" elements
     */
    org.apache.ofbiz.service.MapMap[] getMapTreeMapArray();
    
    /**
     * Gets ith "map-TreeMap" element
     */
    org.apache.ofbiz.service.MapMap getMapTreeMapArray(int i);
    
    /**
     * Returns number of "map-TreeMap" element
     */
    int sizeOfMapTreeMapArray();
    
    /**
     * Sets array of all "map-TreeMap" element
     */
    void setMapTreeMapArray(org.apache.ofbiz.service.MapMap[] mapTreeMapArray);
    
    /**
     * Sets ith "map-TreeMap" element
     */
    void setMapTreeMapArray(int i, org.apache.ofbiz.service.MapMap mapTreeMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-TreeMap" element
     */
    org.apache.ofbiz.service.MapMap insertNewMapTreeMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-TreeMap" element
     */
    org.apache.ofbiz.service.MapMap addNewMapTreeMap();
    
    /**
     * Removes the ith "map-TreeMap" element
     */
    void removeMapTreeMap(int i);
    
    /**
     * Gets array of all "map-Map" elements
     */
    org.apache.ofbiz.service.MapMap[] getMapMapArray();
    
    /**
     * Gets ith "map-Map" element
     */
    org.apache.ofbiz.service.MapMap getMapMapArray(int i);
    
    /**
     * Returns number of "map-Map" element
     */
    int sizeOfMapMapArray();
    
    /**
     * Sets array of all "map-Map" element
     */
    void setMapMapArray(org.apache.ofbiz.service.MapMap[] mapMapArray);
    
    /**
     * Sets ith "map-Map" element
     */
    void setMapMapArray(int i, org.apache.ofbiz.service.MapMap mapMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map-Map" element
     */
    org.apache.ofbiz.service.MapMap insertNewMapMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map-Map" element
     */
    org.apache.ofbiz.service.MapMap addNewMapMap();
    
    /**
     * Removes the ith "map-Map" element
     */
    void removeMapMap(int i);
    
    /**
     * Gets array of all "eepk-" elements
     */
    org.apache.ofbiz.service.MapMap[] getEepkArray();
    
    /**
     * Gets ith "eepk-" element
     */
    org.apache.ofbiz.service.MapMap getEepkArray(int i);
    
    /**
     * Returns number of "eepk-" element
     */
    int sizeOfEepkArray();
    
    /**
     * Sets array of all "eepk-" element
     */
    void setEepkArray(org.apache.ofbiz.service.MapMap[] eepkArray);
    
    /**
     * Sets ith "eepk-" element
     */
    void setEepkArray(int i, org.apache.ofbiz.service.MapMap eepk);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eepk-" element
     */
    org.apache.ofbiz.service.MapMap insertNewEepk(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eepk-" element
     */
    org.apache.ofbiz.service.MapMap addNewEepk();
    
    /**
     * Removes the ith "eepk-" element
     */
    void removeEepk(int i);
    
    /**
     * Gets array of all "eeval-" elements
     */
    org.apache.ofbiz.service.MapMap[] getEevalArray();
    
    /**
     * Gets ith "eeval-" element
     */
    org.apache.ofbiz.service.MapMap getEevalArray(int i);
    
    /**
     * Returns number of "eeval-" element
     */
    int sizeOfEevalArray();
    
    /**
     * Sets array of all "eeval-" element
     */
    void setEevalArray(org.apache.ofbiz.service.MapMap[] eevalArray);
    
    /**
     * Sets ith "eeval-" element
     */
    void setEevalArray(int i, org.apache.ofbiz.service.MapMap eeval);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eeval-" element
     */
    org.apache.ofbiz.service.MapMap insertNewEeval(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eeval-" element
     */
    org.apache.ofbiz.service.MapMap addNewEeval();
    
    /**
     * Removes the ith "eeval-" element
     */
    void removeEeval(int i);
    
    /**
     * Gets array of all "std-BigDecimal" elements
     */
    org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal[] getStdBigDecimalArray();
    
    /**
     * Gets ith "std-BigDecimal" element
     */
    org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal getStdBigDecimalArray(int i);
    
    /**
     * Returns number of "std-BigDecimal" element
     */
    int sizeOfStdBigDecimalArray();
    
    /**
     * Sets array of all "std-BigDecimal" element
     */
    void setStdBigDecimalArray(org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal[] stdBigDecimalArray);
    
    /**
     * Sets ith "std-BigDecimal" element
     */
    void setStdBigDecimalArray(int i, org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal stdBigDecimal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "std-BigDecimal" element
     */
    org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal insertNewStdBigDecimal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "std-BigDecimal" element
     */
    org.apache.ofbiz.service.StdBigDecimalDocument.StdBigDecimal addNewStdBigDecimal();
    
    /**
     * Removes the ith "std-BigDecimal" element
     */
    void removeStdBigDecimal(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ofbiz.service.ColCollection newInstance() {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ofbiz.service.ColCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ofbiz.service.ColCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ofbiz.service.ColCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ofbiz.service.ColCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ofbiz.service.ColCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ofbiz.service.ColCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
