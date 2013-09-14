/*
 *  $Id$
 *
 *  This file is part of the OpenLink Software Virtuoso Open-Source (VOS)
 *  project.
 *
 *  Copyright (C) 1998-2013 OpenLink Software
 *
 *  This project is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the
 *  Free Software Foundation; only version 2 of the License, dated June 1991.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 *
 */

package virtuoso.jena.driver;

public class Version {

	protected static String jena_v = "Jena:       VERSION: 2.7.2";
	protected static String jena_build = "Jena:       BUILD_DATE: 2012-06-28T14:39:01+0100";
	protected static String arq_v = "ARQ:        VERSION: 2.9.2";
	protected static String arq_build = "ARQ:        BUILD_DATE: 2012-06-28T14:39:01+0100";
	protected static String tdb_v = "TDB:        VERSION: 0.9.2";
	protected static String tdb_build = "TDB:        BUILD_DATE: 2012-06-28T14:39:01+0100";
	protected static String fuseki_v = "Fuseki:     VERSION: 0.2.3";
	protected static StringBuffer buffer = new StringBuffer();
	
	static{
		buffer.append("Build for fuseki: \n");
		buffer.append(jena_v+"\n");
		buffer.append(jena_build+"\n");
		buffer.append(arq_v+"\n");
		buffer.append(arq_build+"\n");
		buffer.append(tdb_v+"\n");
		buffer.append(tdb_build+"\n");
		buffer.append(fuseki_v);
		
	}


	public static void main(String args[]) {
		
		System.out.println(buffer.toString());
	}

}
