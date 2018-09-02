package com.github.dynamobee.utils;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Comparator;

import com.github.dynamobee.changeset.ChangeSet;


/**
 * Sort changesets by 'order' value
 */
public class ChangeSetComparator implements Comparator<Method>, Serializable {
	@Override
	public int compare(Method o1, Method o2) {
		ChangeSet c1 = o1.getAnnotation(ChangeSet.class);
		ChangeSet c2 = o2.getAnnotation(ChangeSet.class);
		return c1.order().compareTo(c2.order());
	}
}
