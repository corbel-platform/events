package io.corbel.event;

import io.corbel.eventbus.EventWithSpecificDomain;

/**
 * @author Alberto J. Rubio
 */
public class DomainPublicScopesNotPublishedEvent extends EventWithSpecificDomain {

    public DomainPublicScopesNotPublishedEvent() {}

    public DomainPublicScopesNotPublishedEvent(String domain) { super(domain); }

}
