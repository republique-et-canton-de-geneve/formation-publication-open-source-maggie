/*
 * Formation a la publication sur GitHub
 *
 * Copyright (C) 2023 Republique et canton de Geneve
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.ge.formation;

public class Publication {

	public static void main(String[] args) {
		// pour creer une faille Sonar
		Integer i = 18;
		
		// pour creer deux autres failles Sonar
		String s = null;
		boolean c = false;
		if (c) {
			s.length();
		}

		System.out.println("Bonjour camarade");
	}

}
