package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/cygwin64/tmp/build/source/java-1.8.0-openjdk/tmp/jdk8u/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Monday, January 11, 2021 12:18:58 PM PST
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
        * The name associated with the DynAny.
        */
  public String id = null;

  /**
        * The DynAny value associated with the name.
        */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair
