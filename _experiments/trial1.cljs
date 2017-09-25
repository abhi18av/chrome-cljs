https://github.com/anmonteiro/lumo/issues/28



cljs.user=> (def v8 (js/require "v8"))
#'cljs.user/v8
cljs.user=> (.setFlagsFromString v8 "--no-use_strict")
nil
cljs.user=> (def puppeteer (js/require "puppeteer"))
#'cljs.user/puppeteer
cljs.user=> 
