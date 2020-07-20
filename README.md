# Country List App

Country List is an app that displays a list of country around the globe. It displays the name, capital city, and flag of the country. This app is built by using Model-View-View Model ([MVVM](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)) architecture, Reactive Extension / [RxJava](https://github.com/ReactiveX/RxJava) for Java (master branch), [Coroutines](https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html) for Kotlin (coroutines branch), and [Retrofit](https://square.github.io/retrofit/).

## Feature List

 * Displays country flags
 * Displays country names
 * Displays country capital cities
 * Displays progress bar when loading the data from backend
 * Swipe down to refresh the list
 
## Dependencies

### General Dependencies

#### Retrofit

 * `def retrofitVersion = '2.3.0'`
 * `implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"`
 * `implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"`
 * `implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"`
 
#### Glide

 * `def glideVersion = '4.8.0'`
 * `implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"`

### RxJava Version
 
#### RxJava

 * `def rxJavaVersion = '2.0.1'`
 * `implementation "io.reactivex.rxjava2:rxjava:$rxJavaVersion"`
 * `implementation "io.reactivex.rxjava2:rxandroid:$rxJavaVersion"`

### Coroutines Version
 
#### Coroutines

 * `def coroutinesVersion = '1.3.2'`
 * `implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"`
 
#### LiveData Coroutines Scope

 * `def liveDataLifeCycleVersion = '2.2.0'`
 * `implementation "androidx.lifecycle:lifecycle-livedata-ktx:$liveDataLifeCycleVersion"`
 
## API

`https://raw.githubusercontent.com/hanselgunawan/countries-android-app/master/countries/countries.json`

## User Interface
<img src="https://i.imgur.com/MBZjc9w.png" width="400" height="700" />
<blockquote class="imgur-embed-pub" lang="en" data-id="a/jMB2UHJ"><a href="//imgur.com/a/jMB2UHJ"></a></blockquote><script async src="//s.imgur.com/min/embed.js" charset="utf-8"></script>
