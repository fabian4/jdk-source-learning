package org.omg.PortableServer.POAManagerPackage;


/**
* org/omg/PortableServer/POAManagerPackage/AdapterInactive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/cygwin64/tmp/build/source/java-1.8.0-openjdk/tmp/jdk8u/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, January 11, 2021 12:19:00 PM PST
*/

public final class AdapterInactive extends org.omg.CORBA.UserException
{

  public AdapterInactive ()
  {
    super(AdapterInactiveHelper.id());
  } // ctor


  public AdapterInactive (String $reason)
  {
    super(AdapterInactiveHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterInactive
