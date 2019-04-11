package org.infinispan.protostream.tests.annotated_package;

import org.infinispan.protostream.annotations.ProtoField;

/**
 * @author anistor@redhat.com
 * @since 4.3
 */
public class TestMessage {

   @ProtoField(number = 1, required = true)
   boolean flag;
}
