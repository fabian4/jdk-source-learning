package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/AlreadyBoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/cygwin64/tmp/build/source/java-1.8.0-openjdk/tmp/jdk8u/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, January 11, 2021 12:18:58 PM PST
*/

public final class AlreadyBoundHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.AlreadyBound value = null;

  public AlreadyBoundHolder ()
  {
  }

  public AlreadyBoundHolder (org.omg.CosNaming.NamingContextPackage.AlreadyBound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.type ();
  }

}