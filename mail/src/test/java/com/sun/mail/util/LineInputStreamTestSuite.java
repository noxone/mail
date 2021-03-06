/*
 * Copyright (c) 2009, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.mail.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.sun.mail.test.ClassLoaderSuite;
import com.sun.mail.test.ClassLoaderSuite.TestClass;

/**
 * Suite of LineInputStream tests that need to be run
 * in a separate class loader.
 */
@RunWith(ClassLoaderSuite.class)
@TestClass(LineInputStream.class)
@SuiteClasses( {
    LineInputStreamUtf8.class,
    LineInputStreamUtf8Fail.class
})
public class LineInputStreamTestSuite {
}
