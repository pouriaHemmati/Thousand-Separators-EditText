# Thousand-Separators-EditText [![](https://jitpack.io/v/pouriaHemmati/Thousand-Separators-EditText.svg)](https://jitpack.io/#pouriaHemmati/Thousand-Separators-EditText)

This project provides allows decimal input and adds the thousand separators.

## Installing

**1.You can import in build.gradle like this**

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
dependencies {
	    implementation 'com.github.pouriaHemmati:Thousand-Separators-EditText:1.0.0'
	}
  ```
  
  **2. in your class**
  
  
```
        yourEditText.addTextChangedListener(new NumberTextWatcher(yourEditText));

```


**Enjoy it!**


## Authors

[pouriaHemmati](https://github.com/pouriaHemmati)


## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/pouriaHemmati/Thousand-Separators-EditText/blob/master/LICENSE) file for details.
