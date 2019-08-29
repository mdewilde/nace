# Nace Rev.2

[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg)](https://opensource.org/licenses/MIT)

A Java representation of the [NACE Rev.2 classification system](https://ec.europa.eu/eurostat/web/nace-rev2)

The basic hierarchical structure is:

```
	Section	
	|  Division
		|  Group
			|  Class

```

Labels for each entry on each level are available in:

* Bulgarian
* Czech
* Danish
* German
* Est
* Greek
* English
* Spanish
* Finnish
* French
* Croatian
* Hungarian
* Italian
* Lithuanian
* Latvian
* Maltese
* Dutch
* Norwegian
* Polish
* Portuguese
* Romanian
* Russian
* Slovenian
* Slovak
* Swedish
* Turkish

To get labels, construct a `ResourceBundleNaceTranslator` with the `NaceLanguage` of your choice:

```
	import be.ceau.nace.NaceClass;
	import be.ceau.nace.translate.NaceLanguage;
	import be.ceau.nace.translate.NaceTranslator;
	import be.ceau.nace.translate.ResourceBundleNaceTranslator;
	



	NaceTranslator naceTranslator = new ResourceBundleNaceTranslator(NaceLanguage.ES);
	naceTranslator.translator(NaceClass._23_51);
```



### GnuPG public key
Verify signature files with my [GnuPG public key](https://www.ceau.be/pubkey.gpg).

### License
Nace is licensed under [the MIT license](https://opensource.org/licenses/MIT).