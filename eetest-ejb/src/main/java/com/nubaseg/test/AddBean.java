/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubaseg.test;

import javax.ejb.Stateless;

/**
 *
 * @author Roman Kostyrko <nubaseg@gmail.com>
 */
@Stateless
public class AddBean implements AddBeanLocal {
	private int d=0;

	@Override
	public int addDigits() {
		d+=10;
		return d;
	}

	// Add business logic below. (Right-click in editor and choose
	// "Insert Code > Add Business Method")

}
