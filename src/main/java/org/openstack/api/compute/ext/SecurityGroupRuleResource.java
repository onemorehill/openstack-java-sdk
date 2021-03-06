package org.openstack.api.compute.ext;

import java.util.Properties;

import javax.ws.rs.client.Target;
import javax.ws.rs.core.MediaType;

import org.openstack.api.common.Resource;

public class SecurityGroupRuleResource extends Resource {

	public SecurityGroupRuleResource(Target target, Properties properties) {
		super(target, properties);
	}

	public void delete() {
		 target.request(MediaType.WILDCARD).delete();
	}

	// This function is "missing" from the OpenStack API
	// public SecurityGroupRule fetch() {
	// return resource().get(SecurityGroupRule.class);
	// }

}
