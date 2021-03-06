/*
 * Copyright 2021 Marceau Dewilde <m@ceau.be>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package be.ceau.nace.translate;

import java.util.ResourceBundle;

import be.ceau.nace.NaceCode;

/**
 * {@link NaceTranslator} implementation that relies on loalized properties files embedded with this library.
 */
public class ResourceBundleNaceTranslator implements NaceTranslator {

	private static final String BASE_NAME = "nace";

	private final ResourceBundle bundle;

	/**
	 * Constructor
	 * 
	 * @param naceLanguage {@link NaceLanguage}, can not be {@code null}
	 */
	public ResourceBundleNaceTranslator(NaceLanguage naceLanguage) {
		this.bundle = ResourceBundle.getBundle(BASE_NAME, naceLanguage.getLocale());
	}

	public String translate(NaceCode naceCode) {
		return bundle.getString(naceCode.getCode());
	}

}
