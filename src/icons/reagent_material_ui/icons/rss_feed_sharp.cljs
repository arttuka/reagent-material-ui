(ns reagent-material-ui.icons.rss-feed-sharp
  "Imports @material-ui/icons/RssFeedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def rss-feed-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17.82", "r" "2.18", "cx" "6.18"}) (e "path" #js {"d" "M4 10.1v2.83c3.9 0 7.07 3.17 7.07 7.07h2.83c0-5.47-4.43-9.9-9.9-9.9zm0-5.66v2.83c7.03 0 12.73 5.7 12.73 12.73h2.83c0-8.59-6.97-15.56-15.56-15.56z"}))
                                     "RssFeedSharp"))
